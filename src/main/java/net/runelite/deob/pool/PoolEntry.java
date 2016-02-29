package net.runelite.deob.pool;

import java.io.DataOutputStream;
import java.io.IOException;

import net.runelite.deob.ConstantPool;
import net.runelite.deob.execution.Type;

public abstract class PoolEntry
{
	private ConstantType type;
	public int id;

	protected PoolEntry(ConstantType type)
	{
		this.type = type;
	}
	
	// read objects from indexes
	public void resolve(ConstantPool pool)
	{
	}
	
	// make objects and prime indexes
	public void prime(ConstantPool pool)
	{
	}
	
	@Override
	public abstract boolean equals(Object other);
	
	@Override
	public abstract int hashCode();

	public abstract PoolEntry copy();
	
	public abstract void write(DataOutputStream out) throws IOException;
	
	public ConstantType getType()
	{
		return type;
	}
	
	public Type getTypeClass()
	{
		throw new UnsupportedOperationException();
	}

	public int getSlots()
	{
		return 1;
	}
	
	public Object getObject()
	{
		return this;
	}
}
