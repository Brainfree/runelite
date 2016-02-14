package net.runelite.deob.deobfuscators.arithmetic;

import net.runelite.deob.ClassGroup;
import net.runelite.deob.ClassGroupFactory;
import net.runelite.deob.Deobfuscator;
import net.runelite.deob.attributes.Code;
import net.runelite.deob.attributes.code.Instruction;
import net.runelite.deob.attributes.code.Instructions;
import net.runelite.deob.attributes.code.instructions.Goto;
import net.runelite.deob.attributes.code.instructions.IConst_1;
import net.runelite.deob.attributes.code.instructions.IConst_2;
import net.runelite.deob.attributes.code.instructions.IConst_3;
import net.runelite.deob.attributes.code.instructions.IConst_M1;
import net.runelite.deob.attributes.code.instructions.IDiv;
import net.runelite.deob.attributes.code.instructions.ILoad;
import net.runelite.deob.attributes.code.instructions.IMul;
import net.runelite.deob.attributes.code.instructions.IStore_0;
import net.runelite.deob.attributes.code.instructions.IStore_1;
import net.runelite.deob.attributes.code.instructions.IfEq;
import net.runelite.deob.attributes.code.instructions.IfICmpEq;
import net.runelite.deob.attributes.code.instructions.LDC_W;
import net.runelite.deob.attributes.code.instructions.NOP;
import net.runelite.deob.attributes.code.instructions.SiPush;
import net.runelite.deob.attributes.code.instructions.VReturn;
import net.runelite.deob.execution.Execution;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyOneDeobfuscatorTest
{
	@Test
	public void testDir()
	{
		ClassGroup group = ClassGroupFactory.generateGroup();
		Code code = group.findClass("test").findMethod("func").getCode();
		Instructions ins = code.getInstructions();
		
		code.setMaxStack(2);
		
		// vars[0] = 3
		Instruction[] prepareVariables = {
			new IConst_3(ins),
			new IStore_0(ins)
		};
		
		for (Instruction i : prepareVariables)
			ins.addInstruction(i);
		
		NOP label = new NOP(ins),
		    label2 = new NOP(ins);
		
		IConst_1 one = new IConst_1(ins);
		
		Instruction body[] = {
			new SiPush(ins, (short) 256),
			
			new ILoad(ins, 0),
			new IfEq(ins, label),
			
			new IConst_2(ins),
			new Goto(ins, label2),
			
			label,
			one,
			
			label2,
			new IMul(ins),
			
			new VReturn(ins)
		};
		
		for (Instruction i : body)
			ins.addInstruction(i);
		
		// check execution runs ok
		Execution e = new Execution(group);
		e.populateInitialMethods();
		e.run();
		
		Deobfuscator d = new MultiplyOneDeobfuscator();
		d.run(group);
		
		Assert.assertTrue(one.getInstructions() != null);
	}
	
	@Test
	public void test()
	{
		ClassGroup group = ClassGroupFactory.generateGroup();
		Code code = group.findClass("test").findMethod("func").getCode();
		Instructions ins = code.getInstructions();
		
		code.setMaxStack(2);
		
		// vars[0] = 3
		Instruction[] prepareVariables = {
			new IConst_3(ins),
			new IStore_0(ins)
		};
		
		for (Instruction i : prepareVariables)
			ins.addInstruction(i);
		
		NOP label = new NOP(ins),
		    label2 = new NOP(ins);
		
		IConst_1 one = new IConst_1(ins);
		IMul mul = new IMul(ins);
		
		Instruction body[] = {
			new SiPush(ins, (short) 256),
			
			new ILoad(ins, 0),
			new IfEq(ins, label),
			
			label,
			one,
			
			label2,
			mul,
			
			new VReturn(ins)
		};
		
		for (Instruction i : body)
			ins.addInstruction(i);
		
		// check execution runs ok
		Execution e = new Execution(group);
		e.populateInitialMethods();
		e.run();
		
		Deobfuscator d = new MultiplyOneDeobfuscator();
		d.run(group);
		
		Assert.assertTrue(one.getInstructions() == null);
		Assert.assertTrue(mul.getInstructions() == null);
	}
	
	//   iconst_1
	//   iconst_m1
	//   iload                 5
	//   if_icmpeq             LABEL0x56d1
	//   iload                 5
	//   iconst_1
	//   if_icmpne             LABEL0x56e8
	//   goto                  LABEL0x56d1
	//LABEL0x56d1:
	//   getstatic             class139/field2130 I
	//   ldc_w                 -1440517609
	//   imul
	//   goto                  LABEL0x5708
	//LABEL0x56e8:
	//   getstatic             class139/field2130 I
	//   ldc_w                 -1440517609
	//   imul
	//   getstatic             client/field377 I
	//   iadd
	//   iconst_2
	//   idiv
	//LABEL0x5708:
	//   imul
	//   putstatic             client/field377 I
	//
	// client.field377 = 1 * (-1 != var5 && var5 != 1?(class139.field2130 + client.field377) / 2:class139.field2130);
	@Test
	public void test2()
	{
		ClassGroup group = ClassGroupFactory.generateGroup();
		Code code = group.findClass("test").findMethod("func").getCode();
		Instructions ins = code.getInstructions();
		
		code.setMaxStack(2);
		
		// vars[0] = 3
		Instruction[] prepareVariables = {
			new IConst_3(ins),
			new IStore_0(ins),
			new IConst_2(ins),
			new IStore_1(ins)
		};
		
		for (Instruction i : prepareVariables)
			ins.addInstruction(i);
		
		NOP label = new NOP(ins),
		    label2 = new NOP(ins),
		    label3 = new NOP(ins);
		
		IConst_1 one = new IConst_1(ins);
		IMul mul = new IMul(ins);
		
		Instruction body[] = {
			one,
			
			new IConst_M1(ins),
			new ILoad(ins, 0),
			new IfICmpEq(ins, label),

			new Goto(ins, label2),
			
			label,
			new ILoad(ins, 1),
			new LDC_W(ins, -1440517609),
			new IDiv(ins),
			new Goto(ins, label3),
			
			label2,
			new ILoad(ins, 1),
			new LDC_W(ins, -1440517609),
			new IDiv(ins),
			
			label3,
			mul,
			
			new VReturn(ins)
		};
		
		for (Instruction i : body)
			ins.addInstruction(i);
		
		// check execution runs ok
		Execution e = new Execution(group);
		e.populateInitialMethods();
		e.run();
		
		Deobfuscator d = new MultiplyOneDeobfuscator();
		d.run(group);
		
		Assert.assertTrue(one.getInstructions() == null);
		Assert.assertTrue(mul.getInstructions() == null);
	}
}
