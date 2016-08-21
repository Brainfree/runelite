import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ModelData")
public class ModelData extends Renderable {
   @ObfuscatedName("am")
   int[][] field1761;
   @ObfuscatedName("g")
   int[] field1762;
   @ObfuscatedName("r")
   int[] field1763;
   @ObfuscatedName("e")
   int[] field1764;
   @ObfuscatedName("ao")
   int field1765;
   @ObfuscatedName("s")
   int[] field1766;
   @ObfuscatedName("k")
   int[] field1767;
   @ObfuscatedName("u")
   int[] field1768;
   @ObfuscatedName("n")
   byte[] field1769;
   @ObfuscatedName("b")
   byte[] field1770;
   @ObfuscatedName("m")
   byte[] field1771;
   @ObfuscatedName("ay")
   int field1772;
   @ObfuscatedName("p")
   short[] field1773;
   @ObfuscatedName("w")
   short[] field1774;
   @ObfuscatedName("o")
   byte field1775 = 0;
   @ObfuscatedName("av")
   static int[] field1776;
   @ObfuscatedName("af")
   public short field1777;
   @ObfuscatedName("z")
   short[] field1778;
   @ObfuscatedName("i")
   short[] field1779;
   @ObfuscatedName("v")
   short[] field1780;
   @ObfuscatedName("j")
   short[] field1781;
   @ObfuscatedName("x")
   short[] field1782;
   @ObfuscatedName("ac")
   int[] field1783;
   @ObfuscatedName("y")
   short[] field1784;
   @ObfuscatedName("ai")
   int field1785;
   @ObfuscatedName("h")
   int field1786 = 0;
   @ObfuscatedName("ad")
   byte[] field1787;
   @ObfuscatedName("as")
   int[] field1788;
   @ObfuscatedName("c")
   short[] field1789;
   @ObfuscatedName("ah")
   int[][] field1790;
   @ObfuscatedName("t")
   short[] field1791;
   @ObfuscatedName("aq")
   FaceNormal[] field1792;
   @ObfuscatedName("az")
   VertexNormal[] field1793;
   @ObfuscatedName("ak")
   VertexNormal[] field1794;
   @ObfuscatedName("ag")
   public short field1795;
   @ObfuscatedName("ar")
   static int[] field1796 = new int[10000];
   @ObfuscatedName("ab")
   boolean field1797 = false;
   @ObfuscatedName("f")
   byte[] field1798;
   @ObfuscatedName("d")
   int field1799;
   @ObfuscatedName("q")
   byte[] field1800;
   @ObfuscatedName("ap")
   int field1801;
   @ObfuscatedName("aj")
   int field1802;
   @ObfuscatedName("ae")
   static int[] field1803 = new int[10000];
   @ObfuscatedName("a")
   short[] field1804;
   @ObfuscatedName("at")
   static int field1805 = 0;
   @ObfuscatedName("l")
   int field1806 = 0;
   @ObfuscatedName("aw")
   static int[] field1807;

   @ObfuscatedName("i")
   public void method2294() {
      int var1;
      for(var1 = 0; var1 < this.field1806; ++var1) {
         this.field1764[var1] = -this.field1764[var1];
      }

      for(var1 = 0; var1 < this.field1786; ++var1) {
         int var2 = this.field1766[var1];
         this.field1766[var1] = this.field1768[var1];
         this.field1768[var1] = var2;
      }

      this.method2352();
   }

   @ObfuscatedName("g")
   void method2295(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = var1.length - 23;
      int var9 = var2.method2635();
      int var10 = var2.method2635();
      int var11 = var2.method2633();
      int var12 = var2.method2633();
      int var13 = var2.method2633();
      int var14 = var2.method2633();
      int var15 = var2.method2633();
      int var16 = var2.method2633();
      int var17 = var2.method2633();
      int var18 = var2.method2635();
      int var19 = var2.method2635();
      int var20 = var2.method2635();
      int var21 = var2.method2635();
      int var22 = var2.method2635();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field1798 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field1798[var26] = var2.method2634();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var56 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var28 = var26;
      var26 += var10;
      int var29 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var30 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var31 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var32 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var33 = var26;
      var26 += var21;
      int var34 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var35 = var26;
      var26 += var22;
      int var36 = var26;
      var26 += var10 * 2;
      int var37 = var26;
      var26 += var18;
      int var38 = var26;
      var26 += var19;
      int var39 = var26;
      var26 += var20;
      int var40 = var26;
      var26 += var23 * 6;
      int var41 = var26;
      var26 += var24 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 2;
      int var44 = var26;
      var26 += var24;
      int var45 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field1806 = var9;
      this.field1786 = var10;
      this.field1799 = var11;
      this.field1762 = new int[var9];
      this.field1763 = new int[var9];
      this.field1764 = new int[var9];
      this.field1766 = new int[var10];
      this.field1767 = new int[var10];
      this.field1768 = new int[var10];
      if(var17 == 1) {
         this.field1788 = new int[var9];
      }

      if(var12 == 1) {
         this.field1769 = new byte[var10];
      }

      if(var13 == 255) {
         this.field1770 = new byte[var10];
      } else {
         this.field1775 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1771 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1783 = new int[var10];
      }

      if(var16 == 1) {
         this.field1774 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field1800 = new byte[var10];
      }

      this.field1773 = new short[var10];
      if(var11 > 0) {
         this.field1778 = new short[var11];
         this.field1779 = new short[var11];
         this.field1780 = new short[var11];
         if(var24 > 0) {
            this.field1781 = new short[var24];
            this.field1782 = new short[var24];
            this.field1791 = new short[var24];
            this.field1784 = new short[var24];
            this.field1787 = new byte[var24];
            this.field1804 = new short[var24];
         }

         if(var25 > 0) {
            this.field1789 = new short[var25];
         }
      }

      var2.offset = var11;
      var3.offset = var37;
      var4.offset = var38;
      var5.offset = var39;
      var6.offset = var31;
      int var46 = 0;
      int var47 = 0;
      int var48 = 0;

      int var49;
      int var50;
      int var51;
      int var52;
      int var53;
      for(var49 = 0; var49 < var9; ++var49) {
         var50 = var2.method2633();
         var51 = 0;
         if((var50 & 1) != 0) {
            var51 = var3.method2645();
         }

         var52 = 0;
         if((var50 & 2) != 0) {
            var52 = var4.method2645();
         }

         var53 = 0;
         if((var50 & 4) != 0) {
            var53 = var5.method2645();
         }

         this.field1762[var49] = var46 + var51;
         this.field1763[var49] = var47 + var52;
         this.field1764[var49] = var48 + var53;
         var46 = this.field1762[var49];
         var47 = this.field1763[var49];
         var48 = this.field1764[var49];
         if(var17 == 1) {
            this.field1788[var49] = var6.method2633();
         }
      }

      var2.offset = var36;
      var3.offset = var56;
      var4.offset = var29;
      var5.offset = var32;
      var6.offset = var30;
      var7.offset = var34;
      var8.offset = var35;

      for(var49 = 0; var49 < var10; ++var49) {
         this.field1773[var49] = (short)var2.method2635();
         if(var12 == 1) {
            this.field1769[var49] = var3.method2634();
         }

         if(var13 == 255) {
            this.field1770[var49] = var4.method2634();
         }

         if(var14 == 1) {
            this.field1771[var49] = var5.method2634();
         }

         if(var15 == 1) {
            this.field1783[var49] = var6.method2633();
         }

         if(var16 == 1) {
            this.field1774[var49] = (short)(var7.method2635() - 1);
         }

         if(this.field1800 != null && this.field1774[var49] != -1) {
            this.field1800[var49] = (byte)(var8.method2633() - 1);
         }
      }

      var2.offset = var33;
      var3.offset = var28;
      var49 = 0;
      var50 = 0;
      var51 = 0;
      var52 = 0;

      int var54;
      for(var53 = 0; var53 < var10; ++var53) {
         var54 = var3.method2633();
         if(var54 == 1) {
            var49 = var2.method2645() + var52;
            var50 = var2.method2645() + var49;
            var51 = var2.method2645() + var50;
            var52 = var51;
            this.field1766[var53] = var49;
            this.field1767[var53] = var50;
            this.field1768[var53] = var51;
         }

         if(var54 == 2) {
            var50 = var51;
            var51 = var2.method2645() + var52;
            var52 = var51;
            this.field1766[var53] = var49;
            this.field1767[var53] = var50;
            this.field1768[var53] = var51;
         }

         if(var54 == 3) {
            var49 = var51;
            var51 = var2.method2645() + var52;
            var52 = var51;
            this.field1766[var53] = var49;
            this.field1767[var53] = var50;
            this.field1768[var53] = var51;
         }

         if(var54 == 4) {
            int var55 = var49;
            var49 = var50;
            var50 = var55;
            var51 = var2.method2645() + var52;
            var52 = var51;
            this.field1766[var53] = var49;
            this.field1767[var53] = var55;
            this.field1768[var53] = var51;
         }
      }

      var2.offset = var40;
      var3.offset = var41;
      var4.offset = var42;
      var5.offset = var43;
      var6.offset = var44;
      var7.offset = var45;

      for(var53 = 0; var53 < var11; ++var53) {
         var54 = this.field1798[var53] & 255;
         if(var54 == 0) {
            this.field1778[var53] = (short)var2.method2635();
            this.field1779[var53] = (short)var2.method2635();
            this.field1780[var53] = (short)var2.method2635();
         }

         if(var54 == 1) {
            this.field1778[var53] = (short)var3.method2635();
            this.field1779[var53] = (short)var3.method2635();
            this.field1780[var53] = (short)var3.method2635();
            this.field1781[var53] = (short)var4.method2635();
            this.field1782[var53] = (short)var4.method2635();
            this.field1791[var53] = (short)var4.method2635();
            this.field1784[var53] = (short)var5.method2635();
            this.field1787[var53] = var6.method2634();
            this.field1804[var53] = (short)var7.method2635();
         }

         if(var54 == 2) {
            this.field1778[var53] = (short)var3.method2635();
            this.field1779[var53] = (short)var3.method2635();
            this.field1780[var53] = (short)var3.method2635();
            this.field1781[var53] = (short)var4.method2635();
            this.field1782[var53] = (short)var4.method2635();
            this.field1791[var53] = (short)var4.method2635();
            this.field1784[var53] = (short)var5.method2635();
            this.field1787[var53] = var6.method2634();
            this.field1804[var53] = (short)var7.method2635();
            this.field1789[var53] = (short)var7.method2635();
         }

         if(var54 == 3) {
            this.field1778[var53] = (short)var3.method2635();
            this.field1779[var53] = (short)var3.method2635();
            this.field1780[var53] = (short)var3.method2635();
            this.field1781[var53] = (short)var4.method2635();
            this.field1782[var53] = (short)var4.method2635();
            this.field1791[var53] = (short)var4.method2635();
            this.field1784[var53] = (short)var5.method2635();
            this.field1787[var53] = var6.method2634();
            this.field1804[var53] = (short)var7.method2635();
         }
      }

      var2.offset = var26;
      var53 = var2.method2633();
      if(var53 != 0) {
         new class93();
         var2.method2635();
         var2.method2635();
         var2.method2635();
         var2.method2620();
      }

   }

   @ObfuscatedName("e")
   void method2296(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = var1.length - 18;
      int var9 = var4.method2635();
      int var10 = var4.method2635();
      int var11 = var4.method2633();
      int var12 = var4.method2633();
      int var13 = var4.method2633();
      int var14 = var4.method2633();
      int var15 = var4.method2633();
      int var16 = var4.method2633();
      int var17 = var4.method2635();
      int var18 = var4.method2635();
      int var19 = var4.method2635();
      int var20 = var4.method2635();
      byte var21 = 0;
      int var22 = var21 + var9;
      int var23 = var22;
      var22 += var10;
      int var24 = var22;
      if(var13 == 255) {
         var22 += var10;
      }

      int var25 = var22;
      if(var15 == 1) {
         var22 += var10;
      }

      int var26 = var22;
      if(var12 == 1) {
         var22 += var10;
      }

      int var27 = var22;
      if(var16 == 1) {
         var22 += var9;
      }

      int var28 = var22;
      if(var14 == 1) {
         var22 += var10;
      }

      int var29 = var22;
      var22 += var20;
      int var30 = var22;
      var22 += var10 * 2;
      int var31 = var22;
      var22 += var11 * 6;
      int var32 = var22;
      var22 += var17;
      int var33 = var22;
      var22 += var18;
      int var10000 = var22 + var19;
      this.field1806 = var9;
      this.field1786 = var10;
      this.field1799 = var11;
      this.field1762 = new int[var9];
      this.field1763 = new int[var9];
      this.field1764 = new int[var9];
      this.field1766 = new int[var10];
      this.field1767 = new int[var10];
      this.field1768 = new int[var10];
      if(var11 > 0) {
         this.field1798 = new byte[var11];
         this.field1778 = new short[var11];
         this.field1779 = new short[var11];
         this.field1780 = new short[var11];
      }

      if(var16 == 1) {
         this.field1788 = new int[var9];
      }

      if(var12 == 1) {
         this.field1769 = new byte[var10];
         this.field1800 = new byte[var10];
         this.field1774 = new short[var10];
      }

      if(var13 == 255) {
         this.field1770 = new byte[var10];
      } else {
         this.field1775 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1771 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1783 = new int[var10];
      }

      this.field1773 = new short[var10];
      var4.offset = var21;
      var5.offset = var32;
      var6.offset = var33;
      var7.offset = var22;
      var8.offset = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method2633();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method2645();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method2645();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method2645();
         }

         this.field1762[var38] = var35 + var40;
         this.field1763[var38] = var36 + var41;
         this.field1764[var38] = var37 + var42;
         var35 = this.field1762[var38];
         var36 = this.field1763[var38];
         var37 = this.field1764[var38];
         if(var16 == 1) {
            this.field1788[var38] = var8.method2633();
         }
      }

      var4.offset = var30;
      var5.offset = var26;
      var6.offset = var24;
      var7.offset = var28;
      var8.offset = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field1773[var38] = (short)var4.method2635();
         if(var12 == 1) {
            var39 = var5.method2633();
            if((var39 & 1) == 1) {
               this.field1769[var38] = 1;
               var2 = true;
            } else {
               this.field1769[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field1800[var38] = (byte)(var39 >> 2);
               this.field1774[var38] = this.field1773[var38];
               this.field1773[var38] = 127;
               if(this.field1774[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field1800[var38] = -1;
               this.field1774[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field1770[var38] = var6.method2634();
         }

         if(var14 == 1) {
            this.field1771[var38] = var7.method2634();
         }

         if(var15 == 1) {
            this.field1783[var38] = var8.method2633();
         }
      }

      var4.offset = var29;
      var5.offset = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method2633();
         if(var43 == 1) {
            var38 = var4.method2645() + var41;
            var39 = var4.method2645() + var38;
            var40 = var4.method2645() + var39;
            var41 = var40;
            this.field1766[var42] = var38;
            this.field1767[var42] = var39;
            this.field1768[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method2645() + var41;
            var41 = var40;
            this.field1766[var42] = var38;
            this.field1767[var42] = var39;
            this.field1768[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method2645() + var41;
            var41 = var40;
            this.field1766[var42] = var38;
            this.field1767[var42] = var39;
            this.field1768[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method2645() + var41;
            var41 = var40;
            this.field1766[var42] = var38;
            this.field1767[var42] = var44;
            this.field1768[var42] = var40;
         }
      }

      var4.offset = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field1798[var42] = 0;
         this.field1778[var42] = (short)var4.method2635();
         this.field1779[var42] = (short)var4.method2635();
         this.field1780[var42] = (short)var4.method2635();
      }

      if(this.field1800 != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field1800[var43] & 255;
            if(var44 != 255) {
               if((this.field1778[var44] & '\uffff') == this.field1766[var43] && (this.field1779[var44] & '\uffff') == this.field1767[var43] && (this.field1780[var44] & '\uffff') == this.field1768[var43]) {
                  this.field1800[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if(!var45) {
            this.field1800 = null;
         }
      }

      if(!var3) {
         this.field1774 = null;
      }

      if(!var2) {
         this.field1769 = null;
      }

   }

   public ModelData(ModelData[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field1806 = 0;
      this.field1786 = 0;
      this.field1799 = 0;
      this.field1775 = -1;

      int var9;
      ModelData var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field1806 += var10.field1806;
            this.field1786 += var10.field1786;
            this.field1799 += var10.field1799;
            if(var10.field1770 != null) {
               var4 = true;
            } else {
               if(this.field1775 == -1) {
                  this.field1775 = var10.field1775;
               }

               if(this.field1775 != var10.field1775) {
                  var4 = true;
               }
            }

            var3 |= var10.field1769 != null;
            var5 |= var10.field1771 != null;
            var6 |= var10.field1783 != null;
            var7 |= var10.field1774 != null;
            var8 |= var10.field1800 != null;
         }
      }

      this.field1762 = new int[this.field1806];
      this.field1763 = new int[this.field1806];
      this.field1764 = new int[this.field1806];
      this.field1788 = new int[this.field1806];
      this.field1766 = new int[this.field1786];
      this.field1767 = new int[this.field1786];
      this.field1768 = new int[this.field1786];
      if(var3) {
         this.field1769 = new byte[this.field1786];
      }

      if(var4) {
         this.field1770 = new byte[this.field1786];
      }

      if(var5) {
         this.field1771 = new byte[this.field1786];
      }

      if(var6) {
         this.field1783 = new int[this.field1786];
      }

      if(var7) {
         this.field1774 = new short[this.field1786];
      }

      if(var8) {
         this.field1800 = new byte[this.field1786];
      }

      this.field1773 = new short[this.field1786];
      if(this.field1799 > 0) {
         this.field1798 = new byte[this.field1799];
         this.field1778 = new short[this.field1799];
         this.field1779 = new short[this.field1799];
         this.field1780 = new short[this.field1799];
         this.field1781 = new short[this.field1799];
         this.field1782 = new short[this.field1799];
         this.field1791 = new short[this.field1799];
         this.field1784 = new short[this.field1799];
         this.field1787 = new byte[this.field1799];
         this.field1804 = new short[this.field1799];
         this.field1789 = new short[this.field1799];
      }

      this.field1806 = 0;
      this.field1786 = 0;
      this.field1799 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field1786; ++var11) {
               if(var3 && var10.field1769 != null) {
                  this.field1769[this.field1786] = var10.field1769[var11];
               }

               if(var4) {
                  if(var10.field1770 != null) {
                     this.field1770[this.field1786] = var10.field1770[var11];
                  } else {
                     this.field1770[this.field1786] = var10.field1775;
                  }
               }

               if(var5 && var10.field1771 != null) {
                  this.field1771[this.field1786] = var10.field1771[var11];
               }

               if(var6 && var10.field1783 != null) {
                  this.field1783[this.field1786] = var10.field1783[var11];
               }

               if(var7) {
                  if(var10.field1774 != null) {
                     this.field1774[this.field1786] = var10.field1774[var11];
                  } else {
                     this.field1774[this.field1786] = -1;
                  }
               }

               if(var8) {
                  if(var10.field1800 != null && var10.field1800[var11] != -1) {
                     this.field1800[this.field1786] = (byte)(var10.field1800[var11] + this.field1799);
                  } else {
                     this.field1800[this.field1786] = -1;
                  }
               }

               this.field1773[this.field1786] = var10.field1773[var11];
               this.field1766[this.field1786] = this.method2297(var10, var10.field1766[var11]);
               this.field1767[this.field1786] = this.method2297(var10, var10.field1767[var11]);
               this.field1768[this.field1786] = this.method2297(var10, var10.field1768[var11]);
               ++this.field1786;
            }

            for(var11 = 0; var11 < var10.field1799; ++var11) {
               byte var12 = this.field1798[this.field1799] = var10.field1798[var11];
               if(var12 == 0) {
                  this.field1778[this.field1799] = (short)this.method2297(var10, var10.field1778[var11]);
                  this.field1779[this.field1799] = (short)this.method2297(var10, var10.field1779[var11]);
                  this.field1780[this.field1799] = (short)this.method2297(var10, var10.field1780[var11]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.field1778[this.field1799] = var10.field1778[var11];
                  this.field1779[this.field1799] = var10.field1779[var11];
                  this.field1780[this.field1799] = var10.field1780[var11];
                  this.field1781[this.field1799] = var10.field1781[var11];
                  this.field1782[this.field1799] = var10.field1782[var11];
                  this.field1791[this.field1799] = var10.field1791[var11];
                  this.field1784[this.field1799] = var10.field1784[var11];
                  this.field1787[this.field1799] = var10.field1787[var11];
                  this.field1804[this.field1799] = var10.field1804[var11];
               }

               if(var12 == 2) {
                  this.field1789[this.field1799] = var10.field1789[var11];
               }

               ++this.field1799;
            }
         }
      }

   }

   @ObfuscatedName("h")
   final int method2297(ModelData var1, int var2) {
      int var3 = -1;
      int var4 = var1.field1762[var2];
      int var5 = var1.field1763[var2];
      int var6 = var1.field1764[var2];

      for(int var7 = 0; var7 < this.field1806; ++var7) {
         if(var4 == this.field1762[var7] && var5 == this.field1763[var7] && var6 == this.field1764[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field1762[this.field1806] = var4;
         this.field1763[this.field1806] = var5;
         this.field1764[this.field1806] = var6;
         if(var1.field1788 != null) {
            this.field1788[this.field1806] = var1.field1788[var2];
         }

         var3 = this.field1806++;
      }

      return var3;
   }

   @ObfuscatedName("s")
   public ModelData method2299() {
      ModelData var1 = new ModelData();
      if(this.field1769 != null) {
         var1.field1769 = new byte[this.field1786];

         for(int var2 = 0; var2 < this.field1786; ++var2) {
            var1.field1769[var2] = this.field1769[var2];
         }
      }

      var1.field1806 = this.field1806;
      var1.field1786 = this.field1786;
      var1.field1799 = this.field1799;
      var1.field1762 = this.field1762;
      var1.field1763 = this.field1763;
      var1.field1764 = this.field1764;
      var1.field1766 = this.field1766;
      var1.field1767 = this.field1767;
      var1.field1768 = this.field1768;
      var1.field1770 = this.field1770;
      var1.field1771 = this.field1771;
      var1.field1800 = this.field1800;
      var1.field1773 = this.field1773;
      var1.field1774 = this.field1774;
      var1.field1775 = this.field1775;
      var1.field1798 = this.field1798;
      var1.field1778 = this.field1778;
      var1.field1779 = this.field1779;
      var1.field1780 = this.field1780;
      var1.field1781 = this.field1781;
      var1.field1782 = this.field1782;
      var1.field1791 = this.field1791;
      var1.field1784 = this.field1784;
      var1.field1787 = this.field1787;
      var1.field1804 = this.field1804;
      var1.field1789 = this.field1789;
      var1.field1788 = this.field1788;
      var1.field1783 = this.field1783;
      var1.field1790 = this.field1790;
      var1.field1761 = this.field1761;
      var1.field1793 = this.field1793;
      var1.field1792 = this.field1792;
      var1.field1795 = this.field1795;
      var1.field1777 = this.field1777;
      return var1;
   }

   @ObfuscatedName("k")
   public ModelData method2300(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2311();
      int var7 = var2 + this.field1765;
      int var8 = var2 + this.field1772;
      int var9 = var4 + this.field1802;
      int var10 = var4 + this.field1785;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            ModelData var11 = new ModelData();
            var11.field1806 = this.field1806;
            var11.field1786 = this.field1786;
            var11.field1799 = this.field1799;
            var11.field1762 = this.field1762;
            var11.field1764 = this.field1764;
            var11.field1766 = this.field1766;
            var11.field1767 = this.field1767;
            var11.field1768 = this.field1768;
            var11.field1769 = this.field1769;
            var11.field1770 = this.field1770;
            var11.field1771 = this.field1771;
            var11.field1800 = this.field1800;
            var11.field1773 = this.field1773;
            var11.field1774 = this.field1774;
            var11.field1775 = this.field1775;
            var11.field1798 = this.field1798;
            var11.field1778 = this.field1778;
            var11.field1779 = this.field1779;
            var11.field1780 = this.field1780;
            var11.field1781 = this.field1781;
            var11.field1782 = this.field1782;
            var11.field1791 = this.field1791;
            var11.field1784 = this.field1784;
            var11.field1787 = this.field1787;
            var11.field1804 = this.field1804;
            var11.field1789 = this.field1789;
            var11.field1788 = this.field1788;
            var11.field1783 = this.field1783;
            var11.field1790 = this.field1790;
            var11.field1761 = this.field1761;
            var11.field1795 = this.field1795;
            var11.field1777 = this.field1777;
            var11.field1763 = new int[var11.field1806];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field1806; ++var12) {
                  var13 = this.field1762[var12] + var2;
                  var14 = this.field1764[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1763[var12] = this.field1763[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1806; ++var12) {
                  var13 = (-this.field1763[var12] << 16) / super.modelHeight;
                  if(var13 < var6) {
                     var14 = this.field1762[var12] + var2;
                     var15 = this.field1764[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1763[var12] = this.field1763[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method2352();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedSignature(
      signature = "(LModelData;ZZZZ)V",
      garbageValue = "1"
   )
   public ModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1806 = var1.field1806;
      this.field1786 = var1.field1786;
      this.field1799 = var1.field1799;
      int var6;
      if(var2) {
         this.field1762 = var1.field1762;
         this.field1763 = var1.field1763;
         this.field1764 = var1.field1764;
      } else {
         this.field1762 = new int[this.field1806];
         this.field1763 = new int[this.field1806];
         this.field1764 = new int[this.field1806];

         for(var6 = 0; var6 < this.field1806; ++var6) {
            this.field1762[var6] = var1.field1762[var6];
            this.field1763[var6] = var1.field1763[var6];
            this.field1764[var6] = var1.field1764[var6];
         }
      }

      if(var3) {
         this.field1773 = var1.field1773;
      } else {
         this.field1773 = new short[this.field1786];

         for(var6 = 0; var6 < this.field1786; ++var6) {
            this.field1773[var6] = var1.field1773[var6];
         }
      }

      if(!var4 && var1.field1774 != null) {
         this.field1774 = new short[this.field1786];

         for(var6 = 0; var6 < this.field1786; ++var6) {
            this.field1774[var6] = var1.field1774[var6];
         }
      } else {
         this.field1774 = var1.field1774;
      }

      this.field1771 = var1.field1771;
      this.field1766 = var1.field1766;
      this.field1767 = var1.field1767;
      this.field1768 = var1.field1768;
      this.field1769 = var1.field1769;
      this.field1770 = var1.field1770;
      this.field1800 = var1.field1800;
      this.field1775 = var1.field1775;
      this.field1798 = var1.field1798;
      this.field1778 = var1.field1778;
      this.field1779 = var1.field1779;
      this.field1780 = var1.field1780;
      this.field1781 = var1.field1781;
      this.field1782 = var1.field1782;
      this.field1791 = var1.field1791;
      this.field1784 = var1.field1784;
      this.field1787 = var1.field1787;
      this.field1804 = var1.field1804;
      this.field1789 = var1.field1789;
      this.field1788 = var1.field1788;
      this.field1783 = var1.field1783;
      this.field1790 = var1.field1790;
      this.field1761 = var1.field1761;
      this.field1793 = var1.field1793;
      this.field1792 = var1.field1792;
      this.field1794 = var1.field1794;
      this.field1795 = var1.field1795;
      this.field1777 = var1.field1777;
   }

   @ObfuscatedName("n")
   public void method2301() {
      for(int var1 = 0; var1 < this.field1806; ++var1) {
         int var2 = this.field1762[var1];
         this.field1762[var1] = this.field1764[var1];
         this.field1764[var1] = -var2;
      }

      this.method2352();
   }

   @ObfuscatedName("b")
   public void method2302() {
      for(int var1 = 0; var1 < this.field1806; ++var1) {
         this.field1762[var1] = -this.field1762[var1];
         this.field1764[var1] = -this.field1764[var1];
      }

      this.method2352();
   }

   ModelData() {
   }

   @ObfuscatedName("d")
   public void method2304(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1806; ++var4) {
         this.field1762[var4] += var1;
         this.field1763[var4] += var2;
         this.field1764[var4] += var3;
      }

      this.method2352();
   }

   @ObfuscatedName("f")
   public void method2305(short var1, short var2) {
      for(int var3 = 0; var3 < this.field1786; ++var3) {
         if(this.field1773[var3] == var1) {
            this.field1773[var3] = var2;
         }
      }

   }

   @ObfuscatedName("z")
   public void method2306(short var1, short var2) {
      if(this.field1774 != null) {
         for(int var3 = 0; var3 < this.field1786; ++var3) {
            if(this.field1774[var3] == var1) {
               this.field1774[var3] = var2;
            }
         }
      }

   }

   @ObfuscatedName("ad")
   static final int method2307(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedName("t")
   void method2311() {
      if(!this.field1797) {
         super.modelHeight = 0;
         this.field1801 = 0;
         this.field1765 = 999999;
         this.field1772 = -999999;
         this.field1785 = -99999;
         this.field1802 = 99999;

         for(int var1 = 0; var1 < this.field1806; ++var1) {
            int var2 = this.field1762[var1];
            int var3 = this.field1763[var1];
            int var4 = this.field1764[var1];
            if(var2 < this.field1765) {
               this.field1765 = var2;
            }

            if(var2 > this.field1772) {
               this.field1772 = var2;
            }

            if(var4 < this.field1802) {
               this.field1802 = var4;
            }

            if(var4 > this.field1785) {
               this.field1785 = var4;
            }

            if(-var3 > super.modelHeight) {
               super.modelHeight = -var3;
            }

            if(var3 > this.field1801) {
               this.field1801 = var3;
            }
         }

         this.field1797 = true;
      }

   }

   @ObfuscatedName("c")
   static final int method2314(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("a")
   public final Model method2321(int var1, int var2, int var3, int var4, int var5) {
      this.computeNormals();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      Model var8 = new Model();
      var8.field1881 = new int[this.field1786];
      var8.field1882 = new int[this.field1786];
      var8.field1883 = new int[this.field1786];
      if(this.field1799 > 0 && this.field1800 != null) {
         int[] var9 = new int[this.field1799];

         int var10;
         for(var10 = 0; var10 < this.field1786; ++var10) {
            if(this.field1800[var10] != -1) {
               ++var9[this.field1800[var10] & 255];
            }
         }

         var8.field1908 = 0;

         for(var10 = 0; var10 < this.field1799; ++var10) {
            if(var9[var10] > 0 && this.field1798[var10] == 0) {
               ++var8.field1908;
            }
         }

         var8.field1872 = new int[var8.field1908];
         var8.field1889 = new int[var8.field1908];
         var8.field1930 = new int[var8.field1908];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field1799; ++var11) {
            if(var9[var11] > 0 && this.field1798[var11] == 0) {
               var8.field1872[var10] = this.field1778[var11] & '\uffff';
               var8.field1889[var10] = this.field1779[var11] & '\uffff';
               var8.field1930[var10] = this.field1780[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1886 = new byte[this.field1786];

         for(var11 = 0; var11 < this.field1786; ++var11) {
            if(this.field1800[var11] != -1) {
               var8.field1886[var11] = (byte)var9[this.field1800[var11] & 255];
            } else {
               var8.field1886[var11] = -1;
            }
         }
      }

      for(int var17 = 0; var17 < this.field1786; ++var17) {
         byte var18;
         if(this.field1769 == null) {
            var18 = 0;
         } else {
            var18 = this.field1769[var17];
         }

         byte var19;
         if(this.field1771 == null) {
            var19 = 0;
         } else {
            var19 = this.field1771[var17];
         }

         short var12;
         if(this.field1774 == null) {
            var12 = -1;
         } else {
            var12 = this.field1774[var17];
         }

         if(var19 == -2) {
            var18 = 3;
         }

         if(var19 == -1) {
            var18 = 2;
         }

         VertexNormal var13;
         int var14;
         FaceNormal var15;
         if(var12 == -1) {
            if(var18 != 0) {
               if(var18 == 1) {
                  var15 = this.field1792[var17];
                  var14 = var1 + (var3 * var15.field1533 + var4 * var15.field1534 + var5 * var15.field1535) / (var7 + var7 / 2);
                  var8.field1881[var17] = method2314(this.field1773[var17] & '\uffff', var14);
                  var8.field1883[var17] = -1;
               } else if(var18 == 3) {
                  var8.field1881[var17] = 128;
                  var8.field1883[var17] = -1;
               } else {
                  var8.field1883[var17] = -2;
               }
            } else {
               int var16 = this.field1773[var17] & '\uffff';
               if(this.field1794 != null && this.field1794[this.field1766[var17]] != null) {
                  var13 = this.field1794[this.field1766[var17]];
               } else {
                  var13 = this.field1793[this.field1766[var17]];
               }

               var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
               var8.field1881[var17] = method2314(var16, var14);
               if(this.field1794 != null && this.field1794[this.field1767[var17]] != null) {
                  var13 = this.field1794[this.field1767[var17]];
               } else {
                  var13 = this.field1793[this.field1767[var17]];
               }

               var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
               var8.field1882[var17] = method2314(var16, var14);
               if(this.field1794 != null && this.field1794[this.field1768[var17]] != null) {
                  var13 = this.field1794[this.field1768[var17]];
               } else {
                  var13 = this.field1793[this.field1768[var17]];
               }

               var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
               var8.field1883[var17] = method2314(var16, var14);
            }
         } else if(var18 != 0) {
            if(var18 == 1) {
               var15 = this.field1792[var17];
               var14 = var1 + (var3 * var15.field1533 + var4 * var15.field1534 + var5 * var15.field1535) / (var7 + var7 / 2);
               var8.field1881[var17] = method2307(var14);
               var8.field1883[var17] = -1;
            } else {
               var8.field1883[var17] = -2;
            }
         } else {
            if(this.field1794 != null && this.field1794[this.field1766[var17]] != null) {
               var13 = this.field1794[this.field1766[var17]];
            } else {
               var13 = this.field1793[this.field1766[var17]];
            }

            var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
            var8.field1881[var17] = method2307(var14);
            if(this.field1794 != null && this.field1794[this.field1767[var17]] != null) {
               var13 = this.field1794[this.field1767[var17]];
            } else {
               var13 = this.field1793[this.field1767[var17]];
            }

            var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
            var8.field1882[var17] = method2307(var14);
            if(this.field1794 != null && this.field1794[this.field1768[var17]] != null) {
               var13 = this.field1794[this.field1768[var17]];
            } else {
               var13 = this.field1793[this.field1768[var17]];
            }

            var14 = var1 + (var3 * var13.field1703 + var4 * var13.field1699 + var5 * var13.field1700) / (var7 * var13.field1698);
            var8.field1883[var17] = method2307(var14);
         }
      }

      this.computeAnimationTables();
      var8.field1873 = this.field1806;
      var8.verticesX = this.field1762;
      var8.verticesY = this.field1763;
      var8.verticesZ = this.field1764;
      var8.field1877 = this.field1786;
      var8.indices1 = this.field1766;
      var8.indices2 = this.field1767;
      var8.indices3 = this.field1768;
      var8.field1934 = this.field1770;
      var8.field1885 = this.field1771;
      var8.field1888 = this.field1775;
      var8.field1895 = this.field1790;
      var8.field1894 = this.field1761;
      var8.field1887 = this.field1774;
      return var8;
   }

   @ObfuscatedName("j")
   @Export("computeNormals")
   public void computeNormals() {
      if(this.field1793 == null) {
         this.field1793 = new VertexNormal[this.field1806];

         int var1;
         for(var1 = 0; var1 < this.field1806; ++var1) {
            this.field1793[var1] = new VertexNormal();
         }

         for(var1 = 0; var1 < this.field1786; ++var1) {
            int var2 = this.field1766[var1];
            int var3 = this.field1767[var1];
            int var4 = this.field1768[var1];
            int var5 = this.field1762[var3] - this.field1762[var2];
            int var6 = this.field1763[var3] - this.field1763[var2];
            int var7 = this.field1764[var3] - this.field1764[var2];
            int var8 = this.field1762[var4] - this.field1762[var2];
            int var9 = this.field1763[var4] - this.field1763[var2];
            int var10 = this.field1764[var4] - this.field1764[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field1769 == null) {
               var15 = 0;
            } else {
               var15 = this.field1769[var1];
            }

            if(var15 == 0) {
               VertexNormal var16 = this.field1793[var2];
               var16.field1703 += var11;
               var16.field1699 += var12;
               var16.field1700 += var13;
               ++var16.field1698;
               var16 = this.field1793[var3];
               var16.field1703 += var11;
               var16.field1699 += var12;
               var16.field1700 += var13;
               ++var16.field1698;
               var16 = this.field1793[var4];
               var16.field1703 += var11;
               var16.field1699 += var12;
               var16.field1700 += var13;
               ++var16.field1698;
            } else if(var15 == 1) {
               if(this.field1792 == null) {
                  this.field1792 = new FaceNormal[this.field1786];
               }

               FaceNormal var17 = this.field1792[var1] = new FaceNormal();
               var17.field1533 = var11;
               var17.field1534 = var12;
               var17.field1535 = var13;
            }
         }
      }

   }

   @ObfuscatedName("u")
   @Export("computeAnimationTables")
   void computeAnimationTables() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field1788 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1806; ++var3) {
            var4 = this.field1788[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1790 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1790[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1806; this.field1790[var4][var1[var4]++] = var3++) {
            var4 = this.field1788[var3];
         }

         this.field1788 = null;
      }

      if(this.field1783 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1786; ++var3) {
            var4 = this.field1783[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1761 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1761[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1786; this.field1761[var4][var1[var4]++] = var3++) {
            var4 = this.field1783[var3];
         }

         this.field1783 = null;
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "256"
   )
   public void method2348(int var1) {
      int var2 = field1776[var1];
      int var3 = field1807[var1];

      for(int var4 = 0; var4 < this.field1806; ++var4) {
         int var5 = this.field1764[var4] * var2 + this.field1762[var4] * var3 >> 16;
         this.field1764[var4] = this.field1764[var4] * var3 - this.field1762[var4] * var2 >> 16;
         this.field1762[var4] = var5;
      }

      this.method2352();
   }

   ModelData(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2295(var1);
      } else {
         this.method2296(var1);
      }

   }

   @ObfuscatedName("x")
   void method2352() {
      this.field1793 = null;
      this.field1794 = null;
      this.field1792 = null;
      this.field1797 = false;
   }

   @ObfuscatedName("y")
   static void method2360(ModelData var0, ModelData var1, int var2, int var3, int var4, boolean var5) {
      var0.method2311();
      var0.computeNormals();
      var1.method2311();
      var1.computeNormals();
      ++field1805;
      int var6 = 0;
      int[] var7 = var1.field1762;
      int var8 = var1.field1806;

      int var9;
      for(var9 = 0; var9 < var0.field1806; ++var9) {
         VertexNormal var10 = var0.field1793[var9];
         if(var10.field1698 != 0) {
            int var11 = var0.field1763[var9] - var3;
            if(var11 <= var1.field1801) {
               int var12 = var0.field1762[var9] - var2;
               if(var12 >= var1.field1765 && var12 <= var1.field1772) {
                  int var13 = var0.field1764[var9] - var4;
                  if(var13 >= var1.field1802 && var13 <= var1.field1785) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        VertexNormal var15 = var1.field1793[var14];
                        if(var12 == var7[var14] && var13 == var1.field1764[var14] && var11 == var1.field1763[var14] && var15.field1698 != 0) {
                           if(var0.field1794 == null) {
                              var0.field1794 = new VertexNormal[var0.field1806];
                           }

                           if(var1.field1794 == null) {
                              var1.field1794 = new VertexNormal[var8];
                           }

                           VertexNormal var16 = var0.field1794[var9];
                           if(var16 == null) {
                              var16 = var0.field1794[var9] = new VertexNormal(var10);
                           }

                           VertexNormal var17 = var1.field1794[var14];
                           if(var17 == null) {
                              var17 = var1.field1794[var14] = new VertexNormal(var15);
                           }

                           var16.field1703 += var15.field1703;
                           var16.field1699 += var15.field1699;
                           var16.field1700 += var15.field1700;
                           var16.field1698 += var15.field1698;
                           var17.field1703 += var10.field1703;
                           var17.field1699 += var10.field1699;
                           var17.field1700 += var10.field1700;
                           var17.field1698 += var10.field1698;
                           ++var6;
                           field1803[var9] = field1805;
                           field1796[var14] = field1805;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field1786; ++var9) {
            if(field1803[var0.field1766[var9]] == field1805 && field1803[var0.field1767[var9]] == field1805 && field1803[var0.field1768[var9]] == field1805) {
               if(var0.field1769 == null) {
                  var0.field1769 = new byte[var0.field1786];
               }

               var0.field1769[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field1786; ++var9) {
            if(field1796[var1.field1766[var9]] == field1805 && field1796[var1.field1767[var9]] == field1805 && field1796[var1.field1768[var9]] == field1805) {
               if(var1.field1769 == null) {
                  var1.field1769 = new byte[var1.field1786];
               }

               var1.field1769[var9] = 2;
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lclass170;II)LModelData;",
      garbageValue = "0"
   )
   public static ModelData method2369(class170 var0, int var1, int var2) {
      byte[] var3 = var0.method3411(var1, var2);
      return var3 == null?null:new ModelData(var3);
   }

   @ObfuscatedName("m")
   public void method2371() {
      for(int var1 = 0; var1 < this.field1806; ++var1) {
         int var2 = this.field1764[var1];
         this.field1764[var1] = this.field1762[var1];
         this.field1762[var1] = -var2;
      }

      this.method2352();
   }

   @ObfuscatedName("v")
   public void method2375(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1806; ++var4) {
         this.field1762[var4] = this.field1762[var4] * var1 / 128;
         this.field1763[var4] = this.field1763[var4] * var2 / 128;
         this.field1764[var4] = this.field1764[var4] * var3 / 128;
      }

      this.method2352();
   }

   static {
      field1776 = class94.field1661;
      field1807 = class94.field1662;
   }
}