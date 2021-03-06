import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cx")
@Implements("Frame")
public class Frame {
   @ObfuscatedName("h")
   static int[] field1338 = new int[500];
   @ObfuscatedName("i")
   static int[] field1339 = new int[500];
   @ObfuscatedName("u")
   static int[] field1340 = new int[500];
   @ObfuscatedName("l")
   int[] field1341;
   @ObfuscatedName("r")
   FrameMap field1342 = null;
   @ObfuscatedName("o")
   int field1343 = -1;
   @ObfuscatedName("f")
   static int[] field1344 = new int[500];
   @ObfuscatedName("n")
   @Export("translator_x")
   int[] translator_x;
   @ObfuscatedName("m")
   @Export("translator_y")
   int[] translator_y;
   @ObfuscatedName("w")
   @Export("translator_z")
   int[] translator_z;
   @ObfuscatedName("j")
   boolean field1348 = false;

   Frame(byte[] var1, FrameMap var2) {
      this.field1342 = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var3.offset + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if(var9 > 0) {
            if(this.field1342.field1489[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field1342.field1489[var10] == 0) {
                     field1344[var7] = var10;
                     field1339[var7] = 0;
                     field1340[var7] = 0;
                     field1338[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1344[var7] = var8;
            short var11 = 0;
            if(this.field1342.field1489[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field1339[var7] = var4.readShortSmart();
            } else {
               field1339[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field1340[var7] = var4.readShortSmart();
            } else {
               field1340[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field1338[var7] = var4.readShortSmart();
            } else {
               field1338[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field1342.field1489[var8] == 5) {
               this.field1348 = true;
            }
         }
      }

      if(var4.offset != var1.length) {
         throw new RuntimeException();
      } else {
         this.field1343 = var7;
         this.field1341 = new int[var7];
         this.translator_x = new int[var7];
         this.translator_y = new int[var7];
         this.translator_z = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1341[var8] = field1344[var8];
            this.translator_x[var8] = field1339[var8];
            this.translator_y[var8] = field1340[var8];
            this.translator_z[var8] = field1338[var8];
         }

      }
   }
}
