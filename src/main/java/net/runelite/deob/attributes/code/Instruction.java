package net.runelite.deob.attributes.code;

import java.io.DataInputStream;
import net.runelite.deob.ConstantPool;
import net.runelite.deob.execution.Frame;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.runelite.deob.Method;

public abstract class Instruction implements Cloneable
{
	private Instructions instructions;
	private InstructionType type;

	private int pc; // offset into method this instructions resides at
	protected int length = 1; // length of this instruction

	public List<Instruction> jump = new ArrayList<>(), // instructions which this instruction jumps to
								from = new ArrayList<>(); // instructions which jump to this instruction

	public Instruction(Instructions instructions, InstructionType type, int pc)
	{
		this.instructions = instructions;
		this.type = type;
		this.pc = pc;
	}
	
	@Override
	public String toString()
	{
		Method m = this.getInstructions().getCode().getAttributes().getMethod();
		return super.toString() + " in " + m + " at pc 0x" + Integer.toHexString(this.getPc());
	}
	
	@Override
	public Instruction clone()
	{
		Instruction i;
		try
		{
			i = (Instruction) super.clone();
		}
		catch (CloneNotSupportedException ex)
		{
			throw new RuntimeException();
		}
		
		i.from = new ArrayList<>();
		i.jump = new ArrayList<>();
		
		return i;
	}
	
	public void load(DataInputStream is) throws IOException
	{
	}
	
	protected void remove()
	{
		for (Instruction i : jump)
			i.from.remove(this);
		jump.clear();
		
		Exceptions exceptions = instructions.getCode().getExceptions();
		for (Exception e : exceptions.getExceptions())
		{
			assert this != e.getStart();
			assert this != e.getEnd();
			assert this != e.getHandler();
		}
		
		assert from.isEmpty(); // because this is empty no jumping instructions point here
	}
	
	public void replace(Instruction other)
	{
		List<Instruction> ins = instructions.getInstructions();
		
		assert this != other;
		assert ins.contains(this);
		assert !ins.contains(other);
		
		// XXX instructions which hold references to instructions !
		for (Instruction i : ins)
		{
			i.replace(this, other);
		}
		
		// update instructions which jump here to jump to the new instruction
		for (Instruction i : from)
		{
			assert i.jump.contains(this);
			assert !i.jump.contains(other);
			
			i.jump.remove(this);
			i.jump.add(other);
		}
		from.clear();
		
		// move jumps over
		for (Instruction i : jump)
		{
			assert i.from.contains(this);
			assert !i.from.contains(other);
			
			i.from.remove(this);
			i.from.add(other);
		}
		other.jump = new ArrayList<>(this.jump);
		jump.clear();
		
		Exceptions exceptions = instructions.getCode().getExceptions();
		for (Exception e : exceptions.getExceptions())
		{
			e.replace(this, other);
		}
		
		// replace ins
		int index = ins.indexOf(this);
		ins.remove(this);
		ins.add(index, other);
		
		assert other.getInstructions() == this.instructions;
		this.instructions = null;
	}
	
	public boolean removeStack()
	{
		assert instructions != null;
		
		// update instructions which jump here to jump to the next instruction
		List<Instruction> ins = instructions.getInstructions();
		Instruction next = ins.get(ins.indexOf(this) + 1);
		assert next != null;
		
		for (Instruction i : ins)
		{
			i.replace(this, next);
		}
		
		for (Instruction i : from)
		{
			assert i.jump.contains(this);
			
			i.jump.remove(this);
			
			i.jump.add(next);
			next.from.add(i);
		}
		from.clear();
		
		for (Exception e : instructions.getCode().getExceptions().getExceptions())
			e.replace(this, next);
		
		this.getInstructions().remove(this); // calls remove()
		
		return true;
	}
	
	// resolve jumps
	public void resolve()
	{
	}
	
	// initialize constant pool to see if instruction u/g is required 
	public void prime()
	{
	}

	public void write(DataOutputStream out) throws IOException
	{
		out.writeByte(type.getCode());
	}

	public Instructions getInstructions()
	{
		return instructions;
	}
	
	public void setInstructions(Instructions instructions)
	{
		this.instructions = instructions;
	}
	
	public InstructionType getType()
	{
		return type;
	}
	
	protected void setType(InstructionType type)
	{
		this.type = type;
	}
	
	public ConstantPool getPool()
	{
		return instructions.getCode().getAttributes().getClassFile().getPool();
	}

	public int getPc()
	{
		return pc;
	}
	
	public void setPc(int pc)
	{
		this.pc = pc;
	}

	public int getLength()
	{
		return length;
	}
	
	public String getDesc(Frame frame)
	{
		return type.getName() + " at pc " + frame.getPc() + " in " + frame.getMethod().getName() + " " + frame.getMethod().getDescriptor() + " class " + frame.getMethod().getCode().getAttributes().getClassFile().getName();
	}

	protected void addJump(Instruction to)
	{
		assert to != null;
		assert to != this;
		
		assert this.jump.contains(to) == to.from.contains(this);
		if (this.jump.contains(to))
			return; // switch statements can jump to the same place multiple times

		this.jump.add(to);
		to.from.add(this);
	}

	public abstract void execute(Frame e);
	
	/* does this terminate a block? */
	public boolean isTerminal()
	{
		return false;
	}
	
	public void replace(Instruction oldi, Instruction newi)
	{
	}
	
	// look up symbols from pool
	public void lookup()
	{
	}
	
	// instructions keep resolved method/field/class names, this updates the pool value (if the underlying resolved object changes)
	public void regeneratePool()
	{
	}
	
	public Instruction makeGeneric()
	{
		return this;
	}
	
	public Instruction makeSpecific()
	{
		return this;
	}
}
