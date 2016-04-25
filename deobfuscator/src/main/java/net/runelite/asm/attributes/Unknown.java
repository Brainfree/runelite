package net.runelite.asm.attributes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Unknown extends Attribute
{
	private byte[] data;

	public Unknown(Attributes attributes)
	{
		super(attributes, AttributeType.UNKNOWN);
	}
	
	@Override
	public void loadAttribute(DataInputStream is) throws IOException
	{
		int len = this.getLength();

		data = new byte[len];

		int read = 0;
		while (read < len)
		{
			int i = is.read(data, read, len - read);

			if (i < 0)
				throw new IOException("EOF");

			read += i;
		}

		assert read == len;
	}

	@Override
	public void writeAttr(DataOutputStream out) throws IOException
	{
		out.write(data);
	}
}
