package net.runelite.deob.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.runelite.asm.pool.Field;
import net.runelite.asm.pool.Method;
import net.runelite.asm.pool.Class;

public class GsonFactory
{
	public static final Gson gson = new GsonBuilder()
		.registerTypeAdapter(Field.class, new FieldSerializer())
		.registerTypeAdapter(Method.class, new MethodSerializer())
		.registerTypeAdapter(Class.class, new ClassSerializer())
		.enableComplexMapKeySerialization()
		.setPrettyPrinting()
		.create();
}
