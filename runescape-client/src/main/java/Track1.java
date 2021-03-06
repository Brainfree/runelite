import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ed")
@Implements("Track1")
public class Track1 extends Node {
   @ObfuscatedName("i")
   byte[] field2028;
   @ObfuscatedName("f")
   XHashTable field2029;
   static int count;

   @ObfuscatedName("i")
   void method2785() {
      if(this.field2029 == null) {
         this.field2029 = new XHashTable(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class141 var3 = new class141(this.field2028);
         int var4 = var3.method2725();

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            var3.method2728(var5);
            var3.method2694(var5);
            var3.method2692(var5);
         }

         label56:
         do {
            while(true) {
               var5 = var3.method2699();
               int var6 = var3.field1997[var5];

               while(var3.field1997[var5] == var6) {
                  var3.method2728(var5);
                  int var7 = var3.method2695(var5);
                  if(var7 == 1) {
                     var3.method2721();
                     var3.method2692(var5);
                     continue label56;
                  }

                  int var8 = var7 & 240;
                  int var9;
                  int var10;
                  int var11;
                  if(var8 == 176) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var11 = var7 >> 16 & 127;
                     if(var10 == 0) {
                        var1[var9] = (var1[var9] & -2080769) + (var11 << 14);
                     }

                     if(var10 == 32) {
                        var1[var9] = (var1[var9] & -16257) + (var11 << 7);
                     }
                  }

                  if(var8 == 192) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var2[var9] = var1[var9] + var10;
                  }

                  if(var8 == 144) {
                     var9 = var7 & 15;
                     var10 = var7 >> 8 & 127;
                     var11 = var7 >> 16 & 127;
                     if(var11 > 0) {
                        int var12 = var2[var9];
                        class134 var13 = (class134)this.field2029.method2417((long)var12);
                        if(var13 == null) {
                           var13 = new class134(new byte[128]);
                           this.field2029.method2418(var13, (long)var12);
                        }

                        var13.field1919[var10] = 1;
                     }
                  }

                  var3.method2694(var5);
                  var3.method2692(var5);
               }
            }
         } while(!var3.method2704());
      }

   }

   Track1(Buffer var1) {
      var1.offset = var1.payload.length - 3;
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      int var4 = var2 * 10 + 14;
      var1.offset = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            var15 = var1.readUnsignedByte();
            if(var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if(var15 == 7) {
               break;
            }

            if(var15 == 23) {
               ++var5;
            } else if(var14 == 0) {
               ++var7;
            } else if(var14 == 1) {
               ++var8;
            } else if(var14 == 2) {
               ++var6;
            } else if(var14 == 3) {
               ++var9;
            } else if(var14 == 4) {
               ++var10;
            } else if(var14 == 5) {
               ++var11;
            } else {
               if(var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += var5 * 5;
      var4 += (var7 + var8 + var6 + var9 + var11) * 2;
      var4 += var10 + var12;
      var13 = var1.offset;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.readVarInt();
      }

      var4 += var1.offset - var13;
      var15 = var1.offset;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.readUnsignedByte() & 127;
         if(var28 != 0 && var28 != 32) {
            if(var28 == 1) {
               ++var16;
            } else if(var28 == 33) {
               ++var17;
            } else if(var28 == 7) {
               ++var18;
            } else if(var28 == 39) {
               ++var19;
            } else if(var28 == 10) {
               ++var20;
            } else if(var28 == 42) {
               ++var21;
            } else if(var28 == 99) {
               ++var22;
            } else if(var28 == 98) {
               ++var23;
            } else if(var28 == 101) {
               ++var24;
            } else if(var28 == 100) {
               ++var25;
            } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.offset;
      var1.offset += var26;
      int var31 = var1.offset;
      var1.offset += var11;
      int var32 = var1.offset;
      var1.offset += var10;
      int var33 = var1.offset;
      var1.offset += var9;
      int var34 = var1.offset;
      var1.offset += var16;
      int var35 = var1.offset;
      var1.offset += var18;
      int var36 = var1.offset;
      var1.offset += var20;
      int var37 = var1.offset;
      var1.offset += var7 + var8 + var11;
      int var38 = var1.offset;
      var1.offset += var7;
      int var39 = var1.offset;
      var1.offset += var27;
      int var40 = var1.offset;
      var1.offset += var8;
      int var41 = var1.offset;
      var1.offset += var17;
      int var42 = var1.offset;
      var1.offset += var19;
      int var43 = var1.offset;
      var1.offset += var21;
      int var44 = var1.offset;
      var1.offset += var12;
      int var45 = var1.offset;
      var1.offset += var9;
      int var46 = var1.offset;
      var1.offset += var22;
      int var47 = var1.offset;
      var1.offset += var23;
      int var48 = var1.offset;
      var1.offset += var24;
      int var49 = var1.offset;
      var1.offset += var25;
      int var50 = var1.offset;
      var1.offset += var5 * 3;
      this.field2028 = new byte[var4];
      Buffer var51 = new Buffer(this.field2028);
      var51.putInt(1297377380);
      var51.putInt(6);
      var51.putShort(var2 > 1?1:0);
      var51.putShort(var2);
      var51.putShort(var3);
      var1.offset = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;

      label229:
      for(int var60 = 0; var60 < var2; ++var60) {
         var51.putInt(1297379947);
         var51.offset += 4;
         int var61 = var51.offset;
         int var62 = -1;

         while(true) {
            while(true) {
               int var63 = var1.readVarInt();
               var51.putVarInt(var63);
               int var64 = var1.payload[var29++] & 255;
               boolean var65 = var64 != var62;
               var62 = var64 & 15;
               if(var64 == 7) {
                  if(var65) {
                     var51.putByte(255);
                  }

                  var51.putByte(47);
                  var51.putByte(0);
                  var51.method3046(var51.offset - var61);
                  continue label229;
               }

               if(var64 == 23) {
                  if(var65) {
                     var51.putByte(255);
                  }

                  var51.putByte(81);
                  var51.putByte(3);
                  var51.putByte(var1.payload[var50++]);
                  var51.putByte(var1.payload[var50++]);
                  var51.putByte(var1.payload[var50++]);
               } else {
                  var52 ^= var64 >> 4;
                  if(var62 == 0) {
                     if(var65) {
                        var51.putByte(var52 + 144);
                     }

                     var53 += var1.payload[var37++];
                     var54 += var1.payload[var38++];
                     var51.putByte(var53 & 127);
                     var51.putByte(var54 & 127);
                  } else if(var62 == 1) {
                     if(var65) {
                        var51.putByte(var52 + 128);
                     }

                     var53 += var1.payload[var37++];
                     var55 += var1.payload[var40++];
                     var51.putByte(var53 & 127);
                     var51.putByte(var55 & 127);
                  } else if(var62 == 2) {
                     if(var65) {
                        var51.putByte(var52 + 176);
                     }

                     var28 = var28 + var1.payload[var15++] & 127;
                     var51.putByte(var28);
                     byte var66;
                     if(var28 != 0 && var28 != 32) {
                        if(var28 == 1) {
                           var66 = var1.payload[var34++];
                        } else if(var28 == 33) {
                           var66 = var1.payload[var41++];
                        } else if(var28 == 7) {
                           var66 = var1.payload[var35++];
                        } else if(var28 == 39) {
                           var66 = var1.payload[var42++];
                        } else if(var28 == 10) {
                           var66 = var1.payload[var36++];
                        } else if(var28 == 42) {
                           var66 = var1.payload[var43++];
                        } else if(var28 == 99) {
                           var66 = var1.payload[var46++];
                        } else if(var28 == 98) {
                           var66 = var1.payload[var47++];
                        } else if(var28 == 101) {
                           var66 = var1.payload[var48++];
                        } else if(var28 == 100) {
                           var66 = var1.payload[var49++];
                        } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                           var66 = var1.payload[var39++];
                        } else {
                           var66 = var1.payload[var30++];
                        }
                     } else {
                        var66 = var1.payload[var44++];
                     }

                     int var67 = var66 + var59[var28];
                     var59[var28] = var67;
                     var51.putByte(var67 & 127);
                  } else if(var62 == 3) {
                     if(var65) {
                        var51.putByte(var52 + 224);
                     }

                     var56 += var1.payload[var45++];
                     var56 += var1.payload[var33++] << 7;
                     var51.putByte(var56 & 127);
                     var51.putByte(var56 >> 7 & 127);
                  } else if(var62 == 4) {
                     if(var65) {
                        var51.putByte(var52 + 208);
                     }

                     var57 += var1.payload[var32++];
                     var51.putByte(var57 & 127);
                  } else if(var62 == 5) {
                     if(var65) {
                        var51.putByte(var52 + 160);
                     }

                     var53 += var1.payload[var37++];
                     var58 += var1.payload[var31++];
                     var51.putByte(var53 & 127);
                     var51.putByte(var58 & 127);
                  } else {
                     if(var62 != 6) {
                        throw new RuntimeException();
                     }

                     if(var65) {
                        var51.putByte(var52 + 192);
                     }

                     var51.putByte(var1.payload[var44++]);
                  }
               }
            }
         }
      }

      try {
         Files.write((new File("D:\\rs\\07\\cache\\track1\\LIVE", count++ + ".midi")).toPath(), this.field2028, new OpenOption[0]);
      } catch (IOException var68) {
         Logger.getLogger(Track1.class.getName()).log(Level.SEVERE, (String)null, var68);
      }

   }

   @ObfuscatedName("u")
   void method2789() {
      this.field2029 = null;
   }

   @ObfuscatedName("f")
   static Track1 method2790(IndexDataBase var0, int var1, int var2) {
      byte[] var3 = var0.getConfigData(var1, var2);
      return var3 == null?null:new Track1(new Buffer(var3));
   }
}
