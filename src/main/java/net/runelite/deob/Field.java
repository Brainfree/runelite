package net.runelite.deob;

import net.runelite.deob.attributes.Attributes;
import net.runelite.deob.signature.Type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.runelite.deob.pool.NameAndType;

public class Field
{
	public static int ACC_PUBLIC = 0x0001;
	public static int ACC_PRIVATE = 0x0002;
	public static int ACC_PROTECTED = 0x0004;
	public static int ACC_STATIC = 0x0008;
	public static int ACC_FINAL = 0x0010;
	public static int ACC_VOLATILE = 0x0040;
	public static int ACC_TRANSIENT = 0x0080;
	public static int ACC_SYNTHETIC = 0x1000;
	public static int ACC_ENUM = 0x4000;

	private Fields fields;

	private short accessFlags;
	private String name;
	private Type type;
	private Attributes attributes;
	public boolean packetHandler;

	Field(Fields fields, DataInputStream is) throws IOException
	{
		this.fields = fields;

		ConstantPool pool = fields.getClassFile().getPool();

		accessFlags = is.readShort();
		name = pool.getUTF8(is.readUnsignedShort());
		type = new Type(pool.getUTF8(is.readUnsignedShort()));
		attributes = new Attributes(this, is);
	}
	
	public Field(Fields fields, String name, Type type)
	{
		this.fields = fields;
		this.name = name;
		this.type = type;
		
		attributes = new Attributes(this);
	}
	
	public void write(DataOutputStream out) throws IOException
	{
		ConstantPool pool = fields.getClassFile().getPool();
		
		out.writeShort(accessFlags);
		out.writeShort(pool.makeUTF8(name));
		out.writeShort(pool.makeUTF8(type.getFullType()));
		attributes.write(out);
	}

	public Fields getFields()
	{
		return fields;
	}
	
	public void setFields(Fields fields)
	{
		this.fields = fields;
	}

	public short getAccessFlags()
	{
		return accessFlags;
	}
	
	public boolean isStatic()
	{
		return (accessFlags & ACC_STATIC) != 0;
	}
	
	public void setStatic()
	{
		accessFlags |= ACC_STATIC;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public Type getType()
	{
		return type;
	}
	
	public void setType(Type type)
	{
		this.type = type;
	}

	public Attributes getAttributes()
	{
		return attributes;
	}
	
	public net.runelite.deob.pool.Field getPoolField()
	{
		return new net.runelite.deob.pool.Field(
			new net.runelite.deob.pool.Class(this.getFields().getClassFile().getName()),
			new NameAndType(this.getName(), this.getType())
		);
	}
	
	@Override
	public String toString()
	{
		return (this.isStatic() ? "static " : "") + this.type + " " + this.getFields().getClassFile().getName() + "." + this.getName();
	}
}