package net.runelite.deob.pool;

import net.runelite.deob.ConstantPool;
import net.runelite.deob.signature.Signature;
import net.runelite.deob.signature.Type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class NameAndType extends PoolEntry
{
	private int nameIndex, descriptorIndex;
	private java.lang.String name;
	/* method signature */
	private Signature signature;
	/* type */
	private Type type;

	public NameAndType(ConstantPool pool, DataInputStream is) throws IOException
	{
		super(ConstantType.NAME_AND_TYPE);

		nameIndex = is.readUnsignedShort();
		descriptorIndex = is.readUnsignedShort();
	}
	
	public NameAndType(java.lang.String name, Signature sig)
	{
		super(ConstantType.NAME_AND_TYPE);
		
		this.name = name;
		this.signature = sig;
	}
	
	public NameAndType(java.lang.String name, Type type)
	{
		super(ConstantType.NAME_AND_TYPE);
		
		this.name = name;
		this.type = type;
	}

	@Override
	public NameAndType copy()
	{
		if (signature != null)
		{
			return new NameAndType(name, new Signature(signature));
		}
		else if (type != null)
		{
			return new NameAndType(name, new Type(type));
		}
		else
		{
			assert false;
			return null;
		}
	}
	
	@Override
	public void resolve(ConstantPool pool)
	{
		name = pool.getUTF8(nameIndex);
		
		java.lang.String sig = pool.getUTF8(descriptorIndex);
		if (sig.startsWith("("))
			signature = new Signature(sig);
		else
			type = new Type(sig);
	}
	
	@Override
	public void prime(ConstantPool pool)
	{
		nameIndex = pool.makeUTF8(name);
		if (signature != null)
			descriptorIndex = pool.makeUTF8(signature.toString());
		else
			descriptorIndex = pool.makeUTF8(type.getFullType());
	}

	@Override
	public java.lang.String toString()
	{
		if (type != null)
			return name + " " + type;
		else
			return name + signature;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof NameAndType))
			return false;
		
		NameAndType nat = (NameAndType) other;
		return name.equals(nat.name) && Objects.equals(signature, nat.signature) && Objects.equals(type, nat.type);
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}

	public java.lang.String getName()
	{
		return name;
	}

	public Signature getDescriptor()
	{
		return signature;
	}
	
	public Type getDescriptorType()
	{
		return type;
	}

	public Object getStackObject()
	{
		switch (type.getFullType())
		{
			case "B":
				return (byte) 0;
			case "C":
				return (char) 0;
			case "I":
				return 0;
			case "S":
				return null;
			case "Z":
				return false;
			case "D":
				return 0d;
			case "F":
				return 0f;
			case "J":
				return 0L;
			default:
				return null;
		}
	}

	public int getNumberOfArgs()
	{
		return signature.size();
	}
	
	public boolean isVoid()
	{
		if (this.getName().equals("<init>") || this.getName().equals("<clinit>"))
			return true;
		return signature.getReturnValue().getType().equals("V");
	}

	@Override
	public void write(DataOutputStream out) throws IOException
	{
		out.writeShort(nameIndex);
		out.writeShort(descriptorIndex);
	}
}
