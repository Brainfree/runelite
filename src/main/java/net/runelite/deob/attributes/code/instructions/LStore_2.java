package net.runelite.deob.attributes.code.instructions;

import net.runelite.deob.attributes.code.Instruction;
import net.runelite.deob.attributes.code.InstructionType;
import net.runelite.deob.attributes.code.Instructions;
import net.runelite.deob.attributes.code.instruction.types.LVTInstruction;
import net.runelite.deob.execution.Frame;
import net.runelite.deob.execution.InstructionContext;
import net.runelite.deob.execution.Stack;
import net.runelite.deob.execution.StackContext;
import net.runelite.deob.execution.Type;
import net.runelite.deob.execution.VariableContext;
import net.runelite.deob.execution.Variables;

import java.io.IOException;

public class LStore_2 extends Instruction implements LVTInstruction
{
	public LStore_2(Instructions instructions, InstructionType type, int pc) throws IOException
	{
		super(instructions, type, pc);
	}

	public LStore_2(Instructions instructions)
	{
		super(instructions, InstructionType.LSTORE_2, -1);
	}

	@Override
	public void execute(Frame frame)
	{
		InstructionContext ins = new InstructionContext(this, frame);
		Stack stack = frame.getStack();
		Variables variables = frame.getVariables();
		
		StackContext value = stack.pop();
		assert value.getType().equals(new Type(long.class.getName()));
		ins.pop(value);
		
		variables.set(2, new VariableContext(ins, value));
		
		frame.addInstructionContext(ins);
	}
	
	@Override
	public int getVariableIndex()
	{
		return 2;
	}
	
	@Override
	public Instruction setVariableIndex(int idx)
	{
		return new LStore(this.getInstructions(), idx);
	}

	@Override
	public boolean store()
	{
		return true;
	}
	
	@Override
	public Instruction makeGeneric()
	{
		return new LStore(this.getInstructions(), 2);
	}
}
