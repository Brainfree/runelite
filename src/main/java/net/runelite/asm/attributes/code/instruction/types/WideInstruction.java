package net.runelite.asm.attributes.code.instruction.types;

import java.io.DataOutputStream;
import java.io.IOException;

public interface WideInstruction
{
	public void writeWide(DataOutputStream out) throws IOException;
}
