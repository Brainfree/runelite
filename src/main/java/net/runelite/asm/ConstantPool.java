package net.runelite.asm;

import net.runelite.asm.pool.ConstantType;
import net.runelite.asm.pool.InterfaceMethod;
import net.runelite.asm.pool.NameAndType;
import net.runelite.asm.pool.PoolEntry;
import net.runelite.asm.pool.UTF8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ConstantPool
{
	private ClassFile classFile;

	private List<PoolEntry> entries = new ArrayList<PoolEntry>();
	
	ConstantPool(ClassFile c)
	{
		classFile = c;
	}

	ConstantPool(ClassFile c, DataInputStream is) throws IOException
	{
		this(c);

		int count = is.readUnsignedShort();

		for (int i = 1; i < count; ++i)
		{
			byte typeCode = is.readByte();

			ConstantType type = ConstantType.findFromType(typeCode);

			try
			{
				Constructor<? extends PoolEntry> con = type.getPoolClass().getConstructor(new Class[] { ConstantPool.class, DataInputStream.class });
				PoolEntry entry = con.newInstance(this, is);
				entry.id = i;

				entries.add(entry);
				i += entry.getSlots() - 1;
			}
			catch (Exception e)
			{
				throw new IOException(e);
			}
		}
		
		for (PoolEntry entry : entries)
			entry.resolve(this);
	}
	
	public void reset()
	{
		for (PoolEntry entry : entries)
		{
			entry.id = 0;
		}
		
		entries.clear();
	}
	
	public void write(DataOutputStream out) throws IOException
	{
		/* this grows as it is iterated */
		for (int i = 0; i < entries.size(); ++i)
		{
			PoolEntry entry = entries.get(i);
			entry.prime(this);
		}
		
		int size = 0;
		for (PoolEntry entry : entries)
			size += entry.getSlots();
		
		out.writeShort(size + 1);
		int i = 1;
		for (PoolEntry entry : entries)
		{
			assert i == entry.id;
			i += entry.getSlots();
			
			out.writeByte(entry.getType().getType());
			entry.write(out);
		}
	}

	public ClassFile getClassFile()
	{
		return classFile;
	}

	public PoolEntry getEntry(int index)
	{
		for (PoolEntry entry : entries)
			if (entry.id == index)
				return entry;
		return null;
	}
	
	public String getUTF8(int index)
	{
		PoolEntry entry = getEntry(index);
		UTF8 u = (UTF8) entry;
		return u.getValue();
	}
	
	public net.runelite.asm.pool.Class getClass(int index)
	{
		return (net.runelite.asm.pool.Class) getEntry(index);
	}
	
	public net.runelite.asm.pool.Field getField(int index)
	{
		return (net.runelite.asm.pool.Field) getEntry(index);
	}
	
	public InterfaceMethod getInterfaceMethod(int index)
	{
		return (InterfaceMethod) getEntry(index);
	}
	
	public net.runelite.asm.pool.Method getMethod(int index)
	{
		return (net.runelite.asm.pool.Method) getEntry(index);
	}
	
	public NameAndType getNameAndType(int index)
	{
		return (NameAndType) getEntry(index);
	}
	
	public int make(PoolEntry entry)
	{
		int i = 1;
		
		for (PoolEntry e : entries)
		{
			if (e.equals(entry))
			{
				assert e.getClass() == entry.getClass();
				return i;
			}
			
			i += e.getSlots();
		}
		
		entries.add(entry);
		entry.id = i;
		return i;
	}
	
	public int makeUTF8(String str)
	{
		return make(new UTF8(str));
	}
	
	public int make(Object object)
	{
		if (object instanceof String)
			return make(new net.runelite.asm.pool.String((String) object));
		
		if (object instanceof Integer)
			return make(new net.runelite.asm.pool.Integer((int) object));
		
		if (object instanceof Float)
			return make(new net.runelite.asm.pool.Float((float) object));
		
		if (object instanceof Long)
			return make(new net.runelite.asm.pool.Long((long) object));
		
		if (object instanceof Double)
			return make(new net.runelite.asm.pool.Double((double) object));
		
		System.err.println("Constant pool make with unknown object " + object + " type " + object.getClass());
		
		return 0;
	}
}
