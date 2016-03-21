package net.runelite.asm;

import net.runelite.asm.pool.NameAndType;
import net.runelite.asm.signature.Signature;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Methods
{
	ClassFile classFile;

	private List<Method> methods = new ArrayList<>();

	Methods(ClassFile cf, DataInputStream is) throws IOException
	{
		classFile = cf;

		int count = is.readUnsignedShort();

		for (int i = 0; i < count; ++i)
			methods.add(new Method(this, is));
	}
	
	Methods(ClassFile cf)
	{
		classFile = cf;
	}
	
	public void write(DataOutputStream out) throws IOException
	{
		out.writeShort(methods.size());
		for (Method m : methods)
			m.write(out);
	}
	
	public void addMethod(Method m)
	{
		methods.add(m);
	}
	
	public void removeMethod(Method m)
	{
		methods.remove(m);
	}

	public ClassFile getClassFile()
	{
		return classFile;
	}
	
	public List<Method> getMethods()
	{
		return methods;
	}
	
	public Method findMethod(NameAndType nat)
	{
		for (Method m : methods)
			if (m.getName().equals(nat.getName()) && m.getDescriptor().equals(nat.getDescriptor()))
				return m;
		return null;
	}
	
	public Method findMethod(String name, Signature type)
	{
		for (Method m : methods)
			if (m.getName().equals(name) && m.getDescriptor().equals(type))
				return m;
		return null;
	}
	
	public Method findMethod(String name)
	{
		for (Method m : methods)
			if (m.getName().equals(name))
				return m;
		return null;
	}
}
