import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Region")
public class Region {
   @ObfuscatedName("v")
   static int field1497;
   @ObfuscatedName("i")
   int field1498;
   @ObfuscatedName("at")
   static int field1499 = 4;
   @ObfuscatedName("h")
   int field1500;
   @ObfuscatedName("r")
   int[][][] field1501;
   @ObfuscatedName("o")
   @Export("tiles")
   Tile[][][] tiles;
   @ObfuscatedName("t")
   static int field1503;
   @ObfuscatedName("n")
   int field1504 = 0;
   @ObfuscatedName("m")
   @Export("objects")
   GameObject[] objects = new GameObject[5000];
   @ObfuscatedName("w")
   int[][][] field1506;
   @ObfuscatedName("e")
   static int field1507;
   @ObfuscatedName("p")
   static int field1511 = 0;
   @ObfuscatedName("y")
   static int field1512 = 0;
   @ObfuscatedName("a")
   static int field1513;
   @ObfuscatedName("ae")
   static class94[] field1514;
   @ObfuscatedName("bq")
   static int field1515;
   @ObfuscatedName("ab")
   static boolean field1516 = false;
   @ObfuscatedName("g")
   static int field1517;
   @ObfuscatedName("b")
   static int field1518;
   @ObfuscatedName("k")
   static int field1519;
   @ObfuscatedName("f")
   public static boolean field1520 = true;
   @ObfuscatedName("x")
   static int field1521;
   @ObfuscatedName("ac")
   static final int[] field1522;
   @ObfuscatedName("am")
   static int field1523;
   @ObfuscatedName("an")
   static int field1524;
   @ObfuscatedName("bk")
   @Export("renderArea")
   static boolean[][] renderArea;
   @ObfuscatedName("ah")
   static int field1526;
   @ObfuscatedName("ag")
   static GameObject[] field1527 = new GameObject[100];
   @ObfuscatedName("bl")
   static int field1528;
   @ObfuscatedName("aw")
   static int field1529 = 0;
   @ObfuscatedName("ax")
   static int field1530 = 0;
   @ObfuscatedName("l")
   int field1531 = 0;
   @ObfuscatedName("ak")
   public static int field1532 = -1;
   @ObfuscatedName("ai")
   public static int field1533 = -1;
   @ObfuscatedName("u")
   int field1534;
   @ObfuscatedName("ay")
   static final int[] field1537;
   @ObfuscatedName("ap")
   static boolean field1538 = false;
   @ObfuscatedName("av")
   static class94[][] field1539;
   @ObfuscatedName("as")
   static final int[] field1540;
   @ObfuscatedName("aa")
   static Deque field1542;
   @ObfuscatedName("ad")
   static int[] field1543;
   @ObfuscatedName("z")
   static int field1544;
   @ObfuscatedName("al")
   static final int[] field1545;
   @ObfuscatedName("ar")
   static int field1546 = 0;
   @ObfuscatedName("ao")
   static int field1547;
   @ObfuscatedName("af")
   static final int[] field1548;
   @ObfuscatedName("bc")
   static final int[] field1549;
   @ObfuscatedName("bh")
   int[][] field1550 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   @ObfuscatedName("bj")
   int[][] field1551 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   @ObfuscatedName("br")
   static boolean[][][][] field1552;
   @ObfuscatedName("c")
   static int field1553;
   @ObfuscatedName("bu")
   static int field1554;
   @ObfuscatedName("by")
   static int field1555;
   @ObfuscatedName("aq")
   static int field1556;
   @ObfuscatedName("bv")
   static int field1557;
   @ObfuscatedName("bb")
   static int field1558;
   @ObfuscatedName("az")
   static final int[] field1559;

   @ObfuscatedName("f")
   public void method1736() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1498; ++var1) {
         for(var2 = 0; var2 < this.field1534; ++var2) {
            for(int var3 = 0; var3 < this.field1500; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field1499; ++var1) {
         for(var2 = 0; var2 < field1543[var1]; ++var2) {
            field1539[var1][var2] = null;
         }

         field1543[var1] = 0;
      }

      for(var1 = 0; var1 < this.field1504; ++var1) {
         this.objects[var1] = null;
      }

      this.field1504 = 0;

      for(var1 = 0; var1 < field1527.length; ++var1) {
         field1527[var1] = null;
      }

   }

   @ObfuscatedName("u")
   public void method1738(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.plane;

            for(int var6 = 0; var6 < var5.field1359; ++var6) {
               GameObject var7 = var5.objects[var6];
               if((var7.hash >> 29 & 3) == 2 && var7.relativeX == var1 && var7.relativeY == var2) {
                  --var7.plane;
               }
            }
         }
      }

      if(this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].field1363 = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ObfuscatedName("r")
   public static void method1739(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class94 var8 = new class94();
      var8.field1607 = var2 / 128;
      var8.field1598 = var3 / 128;
      var8.field1597 = var4 / 128;
      var8.field1609 = var5 / 128;
      var8.field1601 = var1;
      var8.field1602 = var2;
      var8.field1600 = var3;
      var8.field1599 = var4;
      var8.field1604 = var5;
      var8.field1606 = var6;
      var8.field1605 = var7;
      field1539[var0][field1543[var0]++] = var8;
   }

   @ObfuscatedName("o")
   public void method1740(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         this.tiles[var1][var2][var3].field1366 = var4;
      }

   }

   @ObfuscatedName("n")
   @Export("groundObjectSpawned")
   public void groundObjectSpawned(int var1, int var2, int var3, int var4, Renderable var5, int var6, int var7) {
      if(var5 != null) {
         GroundObject var8 = new GroundObject();
         var8.renderable = var5;
         var8.x = var2 * 128 + 64;
         var8.y = var3 * 128 + 64;
         var8.floor = var4;
         var8.hash = var6;
         var8.renderInfoBitPacked = var7;
         if(this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].groundObject = var8;
      }

   }

   @ObfuscatedName("m")
   public void method1743(int var1, int var2, int var3, int var4, Renderable var5, int var6, Renderable var7, Renderable var8) {
      ItemLayer var9 = new ItemLayer();
      var9.bottom = var5;
      var9.x = var2 * 128 + 64;
      var9.y = var3 * 128 + 64;
      var9.hash = var4;
      var9.flags = var6;
      var9.middle = var7;
      var9.top = var8;
      int var10 = 0;
      Tile var11 = this.tiles[var1][var2][var3];
      if(var11 != null) {
         for(int var12 = 0; var12 < var11.field1359; ++var12) {
            if((var11.objects[var12].flags & 256) == 256 && var11.objects[var12].renderable instanceof Model) {
               Model var13 = (Model)var11.objects[var12].renderable;
               var13.method1643();
               if(var13.modelHeight > var10) {
                  var10 = var13.modelHeight;
               }
            }
         }
      }

      var9.height = var10;
      if(this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].itemLayer = var9;
   }

   @ObfuscatedName("j")
   public void method1745(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if(var5 != null) {
         DecorativeObject var13 = new DecorativeObject();
         var13.hash = var11;
         var13.renderInfoBitPacked = var12;
         var13.x = var2 * 128 + 64;
         var13.y = var3 * 128 + 64;
         var13.floor = var4;
         var13.renderable1 = var5;
         var13.renderable2 = var6;
         var13.renderFlag = var7;
         var13.rotation = var8;
         var13.offsetX = var9;
         var13.offsetY = var10;

         for(int var14 = var1; var14 >= 0; --var14) {
            if(this.tiles[var14][var2][var3] == null) {
               this.tiles[var14][var2][var3] = new Tile(var14, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].decorativeObject = var13;
      }

   }

   @ObfuscatedName("l")
   public void method1746(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class85 var21;
      int var22;
      if(var4 == 0) {
         var21 = new class85(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1353 = var21;
      } else if(var4 != 1) {
         class77 var23 = new class77(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1354 = var23;
      } else {
         var21 = new class85(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].field1353 = var21;
      }

   }

   @ObfuscatedName("q")
   public boolean method1747(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int var8, boolean var9) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var2 - var5;
         int var11 = var3 - var5;
         int var12 = var2 + var5;
         int var13 = var3 + var5;
         if(var9) {
            if(var7 > 640 && var7 < 1408) {
               var13 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var12 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var11 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         return this.method1870(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("d")
   public boolean method1748(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      return var6 == null?true:this.method1870(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("s")
   public boolean method1749(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, int var9, int var10) {
      if(var7 == null) {
         return true;
      } else {
         int var11 = var2 * 128 + var5 * 64;
         int var12 = var3 * 128 + var6 * 64;
         return this.method1870(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-50"
   )
   public void method1750(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1498; ++var4) {
         for(int var5 = 0; var5 < this.field1534; ++var5) {
            for(int var6 = 0; var6 < this.field1500; ++var6) {
               Tile var7 = this.tiles[var4][var5][var6];
               if(var7 != null) {
                  WallObject var8 = var7.wallObject;
                  ModelData var9;
                  if(var8 != null && var8.renderable1 instanceof ModelData) {
                     ModelData var10 = (ModelData)var8.renderable1;
                     this.method1798(var10, var4, var5, var6, 1, 1);
                     if(var8.renderable2 instanceof ModelData) {
                        var9 = (ModelData)var8.renderable2;
                        this.method1798(var9, var4, var5, var6, 1, 1);
                        ModelData.method1516(var10, var9, 0, 0, 0, false);
                        var8.renderable2 = var9.method1524(var9.field1278, var9.field1267, var1, var2, var3);
                     }

                     var8.renderable1 = var10.method1524(var10.field1278, var10.field1267, var1, var2, var3);
                  }

                  for(int var13 = 0; var13 < var7.field1359; ++var13) {
                     GameObject var11 = var7.objects[var13];
                     if(var11 != null && var11.renderable instanceof ModelData) {
                        ModelData var12 = (ModelData)var11.renderable;
                        this.method1798(var12, var4, var5, var6, var11.offsetX - var11.relativeX + 1, var11.offsetY - var11.relativeY + 1);
                        var11.renderable = var12.method1524(var12.field1278, var12.field1267, var1, var2, var3);
                     }
                  }

                  GroundObject var14 = var7.groundObject;
                  if(var14 != null && var14.renderable instanceof ModelData) {
                     var9 = (ModelData)var14.renderable;
                     this.method1768(var9, var4, var5, var6);
                     var14.renderable = var9.method1524(var9.field1278, var9.field1267, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("a")
   void method1751(GameObject var1) {
      for(int var2 = var1.relativeX; var2 <= var1.offsetX; ++var2) {
         for(int var3 = var1.relativeY; var3 <= var1.offsetY; ++var3) {
            Tile var4 = this.tiles[var1.plane][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field1359; ++var5) {
                  if(var4.objects[var5] == var1) {
                     --var4.field1359;

                     for(int var6 = var5; var6 < var4.field1359; ++var6) {
                        var4.objects[var6] = var4.objects[var6 + 1];
                        var4.field1361[var6] = var4.field1361[var6 + 1];
                     }

                     var4.objects[var4.field1359] = null;
                     break;
                  }
               }

               var4.field1362 = 0;

               for(var5 = 0; var5 < var4.field1359; ++var5) {
                  var4.field1362 |= var4.field1361[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("v")
   public void method1752(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         DecorativeObject var6 = var5.decorativeObject;
         if(var6 != null) {
            var6.offsetX = var6.offsetX * var4 / 16;
            var6.offsetY = var6.offsetY * var4 / 16;
         }
      }

   }

   @ObfuscatedName("g")
   public void method1755(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field1359; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               this.method1751(var6);
               return;
            }
         }
      }

   }

   @ObfuscatedName("b")
   public void method1756(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.groundObject = null;
      }

   }

   @ObfuscatedName("k")
   public void method1757(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.itemLayer = null;
      }

   }

   @ObfuscatedName("c")
   public DecorativeObject method1759(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.decorativeObject;
   }

   @ObfuscatedName("e")
   public GameObject method1760(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field1359; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("am")
   public GroundObject method1761(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject:null;
   }

   @ObfuscatedName("an")
   public int method1762(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.wallObject != null?var4.wallObject.hash:0;
   }

   @ObfuscatedName("ab")
   public int method1766(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 == null) {
         return -1;
      } else if(var5.wallObject != null && var5.wallObject.hash == var4) {
         return var5.wallObject.field1572 & 255;
      } else if(var5.decorativeObject != null && var5.decorativeObject.hash == var4) {
         return var5.decorativeObject.renderInfoBitPacked & 255;
      } else if(var5.groundObject != null && var5.groundObject.hash == var4) {
         return var5.groundObject.renderInfoBitPacked & 255;
      } else {
         for(int var6 = 0; var6 < var5.field1359; ++var6) {
            if(var5.objects[var6].hash == var4) {
               return var5.objects[var6].flags & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("ax")
   void method1768(ModelData var1, int var2, int var3, int var4) {
      Tile var5;
      ModelData var6;
      if(var3 < this.field1534) {
         var5 = this.tiles[var2][var3 + 1][var4];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1516(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field1534) {
         var5 = this.tiles[var2][var3][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1516(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field1534 && var4 < this.field1500) {
         var5 = this.tiles[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1516(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field1534 && var4 > 0) {
         var5 = this.tiles[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.renderable;
            ModelData.method1516(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("ak")
   public void method1770(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if(var7 != null) {
         class85 var8 = var7.field1353;
         int var9;
         if(var8 != null) {
            int var10 = var8.field1483;
            if(var10 != 0) {
               for(var9 = 0; var9 < 4; ++var9) {
                  var1[var2] = var10;
                  var1[var2 + 1] = var10;
                  var1[var2 + 2] = var10;
                  var1[var2 + 3] = var10;
                  var2 += var3;
               }
            }
         } else {
            class77 var18 = var7.field1354;
            if(var18 != null) {
               var9 = var18.field1307;
               int var11 = var18.field1291;
               int var12 = var18.field1304;
               int var13 = var18.field1305;
               int[] var14 = this.field1550[var9];
               int[] var15 = this.field1551[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   static boolean method1772(int var0, int var1, int var2) {
      int var3 = var2 * field1556 + var0 * field1526 >> 16;
      int var4 = var2 * field1526 - var0 * field1556 >> 16;
      int var5 = var1 * field1523 + var4 * field1524 >> 16;
      int var6 = var1 * field1524 - var4 * field1523 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = field1554 + var3 * class84.field1461 / var5;
         int var8 = field1555 + var6 * class84.field1461 / var5;
         return var7 >= field1528 && var7 <= field1558 && var8 >= field1557 && var8 <= field1515;
      } else {
         return false;
      }
   }

   @ObfuscatedName("au")
   public void method1773(int var1, int var2, int var3, boolean var4) {
      if(!method1775() || var4) {
         field1516 = true;
         field1538 = var4;
         field1529 = var1;
         field1530 = var2;
         field1546 = var3;
         field1532 = -1;
         field1533 = -1;
      }

   }

   @ObfuscatedName("ah")
   public int method1774(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return 0;
      } else {
         for(int var5 = 0; var5 < var4.field1359; ++var5) {
            GameObject var6 = var4.objects[var5];
            if((var6.hash >> 29 & 3) == 2 && var6.relativeX == var2 && var6.relativeY == var3) {
               return var6.hash;
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("at")
   public static boolean method1775() {
      return field1538 && field1532 != -1;
   }

   @ObfuscatedName("ad")
   public static void method1776() {
      field1532 = -1;
      field1538 = false;
   }

   @ObfuscatedName("ae")
   void method1779(class85 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1503;
      int var11;
      int var12 = var11 = (var8 << 7) - field1507;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1501[var2][var7][var8] - field1553;
      int var18 = this.field1501[var2][var7 + 1][var8] - field1553;
      int var19 = this.field1501[var2][var7 + 1][var8 + 1] - field1553;
      int var20 = this.field1501[var2][var7][var8 + 1] - field1553;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if(var15 >= 50) {
                  int var22 = class84.field1456 + var10 * class84.field1461 / var12;
                  int var23 = class84.field1455 + var17 * class84.field1461 / var12;
                  int var24 = class84.field1456 + var14 * class84.field1461 / var11;
                  int var25 = class84.field1455 + var18 * class84.field1461 / var11;
                  int var26 = class84.field1456 + var13 * class84.field1461 / var16;
                  int var27 = class84.field1455 + var19 * class84.field1461 / var16;
                  int var28 = class84.field1456 + var9 * class84.field1461 / var15;
                  int var29 = class84.field1455 + var21 * class84.field1461 / var15;
                  class84.rasterAlpha = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class84.rasterClipEnable = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class84.rasterClipX || var28 > class84.rasterClipX || var24 > class84.rasterClipX) {
                        class84.rasterClipEnable = true;
                     }

                     if(field1516 && this.method1797(field1530, field1546, var27, var29, var25, var26, var28, var24)) {
                        field1532 = var7;
                        field1533 = var8;
                     }

                     if(var1.field1481 == -1) {
                        if(var1.field1477 != 12345678) {
                           class84.rasterGouraud(var27, var29, var25, var26, var28, var24, var1.field1477, var1.field1480, var1.field1485);
                        }
                     } else if(!field1520) {
                        if(var1.field1482) {
                           class84.rasterTexture(var27, var29, var25, var26, var28, var24, var1.field1477, var1.field1480, var1.field1485, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1481);
                        } else {
                           class84.rasterTexture(var27, var29, var25, var26, var28, var24, var1.field1477, var1.field1480, var1.field1485, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1481);
                        }
                     } else {
                        var30 = class84.field1472.vmethod1942(var1.field1481);
                        class84.rasterGouraud(var27, var29, var25, var26, var28, var24, method1781(var30, var1.field1477), method1781(var30, var1.field1480), method1781(var30, var1.field1485));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class84.rasterClipEnable = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class84.rasterClipX || var24 > class84.rasterClipX || var28 > class84.rasterClipX) {
                        class84.rasterClipEnable = true;
                     }

                     if(field1516 && this.method1797(field1530, field1546, var23, var25, var29, var22, var24, var28)) {
                        field1532 = var7;
                        field1533 = var8;
                     }

                     if(var1.field1481 == -1) {
                        if(var1.field1479 != 12345678) {
                           class84.rasterGouraud(var23, var25, var29, var22, var24, var28, var1.field1479, var1.field1485, var1.field1480);
                        }
                     } else if(!field1520) {
                        class84.rasterTexture(var23, var25, var29, var22, var24, var28, var1.field1479, var1.field1485, var1.field1480, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1481);
                     } else {
                        var30 = class84.field1472.vmethod1942(var1.field1481);
                        class84.rasterGouraud(var23, var25, var29, var22, var24, var28, method1781(var30, var1.field1479), method1781(var30, var1.field1485), method1781(var30, var1.field1480));
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aa")
   void method1780(class77 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field1302.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1302[var9] - field1503;
         var11 = var1.field1292[var9] - field1553;
         var12 = var1.field1293[var9] - field1507;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field1300 != null) {
            class77.field1294[var9] = var10;
            class77.field1309[var9] = var13;
            class77.field1310[var9] = var12;
         }

         class77.field1306[var9] = class84.field1456 + var10 * class84.field1461 / var12;
         class77.field1308[var9] = class84.field1455 + var13 * class84.field1461 / var12;
      }

      class84.rasterAlpha = 0;
      var8 = var1.field1297.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1297[var9];
         var11 = var1.field1298[var9];
         var12 = var1.field1299[var9];
         var13 = class77.field1306[var10];
         int var14 = class77.field1306[var11];
         int var15 = class77.field1306[var12];
         int var16 = class77.field1308[var10];
         int var17 = class77.field1308[var11];
         int var18 = class77.field1308[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class84.rasterClipEnable = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class84.rasterClipX || var14 > class84.rasterClipX || var15 > class84.rasterClipX) {
               class84.rasterClipEnable = true;
            }

            if(field1516 && this.method1797(field1530, field1546, var16, var17, var18, var13, var14, var15)) {
               field1532 = var6;
               field1533 = var7;
            }

            if(var1.field1300 != null && var1.field1300[var9] != -1) {
               if(!field1520) {
                  if(var1.field1303) {
                     class84.rasterTexture(var16, var17, var18, var13, var14, var15, var1.field1301[var9], var1.field1295[var9], var1.field1296[var9], class77.field1294[0], class77.field1294[1], class77.field1294[3], class77.field1309[0], class77.field1309[1], class77.field1309[3], class77.field1310[0], class77.field1310[1], class77.field1310[3], var1.field1300[var9]);
                  } else {
                     class84.rasterTexture(var16, var17, var18, var13, var14, var15, var1.field1301[var9], var1.field1295[var9], var1.field1296[var9], class77.field1294[var10], class77.field1294[var11], class77.field1294[var12], class77.field1309[var10], class77.field1309[var11], class77.field1309[var12], class77.field1310[var10], class77.field1310[var11], class77.field1310[var12], var1.field1300[var9]);
                  }
               } else {
                  int var19 = class84.field1472.vmethod1942(var1.field1300[var9]);
                  class84.rasterGouraud(var16, var17, var18, var13, var14, var15, method1781(var19, var1.field1301[var9]), method1781(var19, var1.field1295[var9]), method1781(var19, var1.field1296[var9]));
               }
            } else if(var1.field1301[var9] != 12345678) {
               class84.rasterGouraud(var16, var17, var18, var13, var14, var15, var1.field1301[var9], var1.field1295[var9], var1.field1296[var9]);
            }
         }
      }

   }

   @ObfuscatedName("as")
   static final int method1781(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("ay")
   boolean method1784(int var1, int var2, int var3) {
      int var4 = this.field1506[var1][var2][var3];
      if(var4 == -field1513) {
         return false;
      } else if(var4 == field1513) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method1788(var5 + 1, this.field1501[var1][var2][var3], var6 + 1) && this.method1788(var5 + 128 - 1, this.field1501[var1][var2 + 1][var3], var6 + 1) && this.method1788(var5 + 128 - 1, this.field1501[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1788(var5 + 1, this.field1501[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1506[var1][var2][var3] = field1513;
            return true;
         } else {
            this.field1506[var1][var2][var3] = -field1513;
            return false;
         }
      }
   }

   @ObfuscatedName("bc")
   boolean method1787(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method1784(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1788(var7 + 1, this.field1501[var1][var2][var4] - var6, var8 + 1) && this.method1788(var7 + 128 - 1, this.field1501[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1788(var7 + 128 - 1, this.field1501[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1788(var7 + 1, this.field1501[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field1506[var1][var7][var8] == -field1513) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1501[var1][var2][var4] - var6;
         if(!this.method1788(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method1788(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method1788(var7, var9, var11)) {
                  return false;
               } else if(!this.method1788(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("bh")
   boolean method1788(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1547; ++var4) {
         class94 var5 = field1514[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field1608 == 1) {
            var6 = var5.field1602 - var1;
            if(var6 > 0) {
               var7 = var5.field1599 + (var5.field1611 * var6 >> 8);
               var8 = var5.field1604 + (var5.field1612 * var6 >> 8);
               var9 = var5.field1606 + (var5.field1613 * var6 >> 8);
               var10 = var5.field1605 + (var5.field1614 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1608 == 2) {
            var6 = var1 - var5.field1602;
            if(var6 > 0) {
               var7 = var5.field1599 + (var5.field1611 * var6 >> 8);
               var8 = var5.field1604 + (var5.field1612 * var6 >> 8);
               var9 = var5.field1606 + (var5.field1613 * var6 >> 8);
               var10 = var5.field1605 + (var5.field1614 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1608 == 3) {
            var6 = var5.field1599 - var3;
            if(var6 > 0) {
               var7 = var5.field1602 + (var5.field1610 * var6 >> 8);
               var8 = var5.field1600 + (var5.field1603 * var6 >> 8);
               var9 = var5.field1606 + (var5.field1613 * var6 >> 8);
               var10 = var5.field1605 + (var5.field1614 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1608 == 4) {
            var6 = var3 - var5.field1599;
            if(var6 > 0) {
               var7 = var5.field1602 + (var5.field1610 * var6 >> 8);
               var8 = var5.field1600 + (var5.field1603 * var6 >> 8);
               var9 = var5.field1606 + (var5.field1613 * var6 >> 8);
               var10 = var5.field1605 + (var5.field1614 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field1608 == 5) {
            var6 = var2 - var5.field1606;
            if(var6 > 0) {
               var7 = var5.field1602 + (var5.field1610 * var6 >> 8);
               var8 = var5.field1600 + (var5.field1603 * var6 >> 8);
               var9 = var5.field1599 + (var5.field1611 * var6 >> 8);
               var10 = var5.field1604 + (var5.field1612 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("al")
   boolean method1797(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if(var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else if(var1 < var6 && var1 < var7 && var1 < var8) {
         return false;
      } else if(var1 > var6 && var1 > var7 && var1 > var8) {
         return false;
      } else {
         int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
         int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
         int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
         return var9 * var11 > 0 && var11 * var10 > 0;
      }
   }

   @ObfuscatedName("ar")
   void method1798(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field1498) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field1534) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field1500 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field1501[var12][var13][var14] + this.field1501[var12][var13 + 1][var14] + this.field1501[var12][var13][var14 + 1] + this.field1501[var12][var13 + 1][var14 + 1]) / 4 - (this.field1501[var2][var3][var4] + this.field1501[var2][var3 + 1][var4] + this.field1501[var2][var3][var4 + 1] + this.field1501[var2][var3 + 1][var4 + 1]) / 4;
                           WallObject var17 = var15.wallObject;
                           if(var17 != null) {
                              ModelData var18;
                              if(var17.renderable1 instanceof ModelData) {
                                 var18 = (ModelData)var17.renderable1;
                                 ModelData.method1516(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.renderable2 instanceof ModelData) {
                                 var18 = (ModelData)var17.renderable2;
                                 ModelData.method1516(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field1359; ++var23) {
                              GameObject var19 = var15.objects[var23];
                              if(var19 != null && var19.renderable instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.renderable;
                                 int var21 = var19.offsetX - var19.relativeX + 1;
                                 int var22 = var19.offsetY - var19.relativeY + 1;
                                 ModelData.method1516(var1, var20, (var19.relativeX - var3) * 128 + (var21 - var5) * 64, var16, (var19.relativeY - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("aj")
   public void method1806() {
      field1538 = true;
   }

   @ObfuscatedName("ai")
   public static void method1810(int[] var0, int var1, int var2, int var3, int var4) {
      field1528 = 0;
      field1557 = 0;
      field1558 = var3;
      field1515 = var4;
      field1554 = var3 / 2;
      field1555 = var4 / 2;
      boolean[][][][] var5 = new boolean[9][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var6 = 128; var6 <= 384; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field1523 = class84.field1475[var6];
            field1524 = class84.field1469[var6];
            field1556 = class84.field1475[var7];
            field1526 = class84.field1469[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var12 = -26; var12 <= 26; ++var12) {
               for(var10 = -26; var10 <= 26; ++var10) {
                  var11 = var12 * 128;
                  int var13 = var10 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if(method1772(var11, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var12 + 25 + 1][var10 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var10 = -1; var10 <= 1; ++var10) {
                     for(var11 = -1; var11 <= 1; ++var11) {
                        if(var5[var6][var7][var8 + var10 + 25 + 1][var9 + var11 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6][(var7 + 1) % 31][var8 + var10 + 25 + 1][var9 + var11 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][var7][var8 + var10 + 25 + 1][var9 + var11 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][(var7 + 1) % 31][var8 + var10 + 25 + 1][var9 + var11 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field1552[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   @ObfuscatedName("ao")
   void method1836(Tile var1, boolean var2) {
      field1542.method2459(var1);

      while(true) {
         Tile var3;
         int var4;
         int var5;
         int var6;
         int var7;
         Tile[][] var8;
         Tile var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              WallObject var16;
                              GameObject var17;
                              int var18;
                              int var19;
                              boolean var20;
                              int var21;
                              Tile var22;
                              while(true) {
                                 do {
                                    var3 = (Tile)field1542.method2487();
                                    if(var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field1371);

                                 var4 = var3.x;
                                 var5 = var3.y;
                                 var6 = var3.plane;
                                 var7 = var3.field1352;
                                 var8 = this.tiles[var6];
                                 if(!var3.field1350) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var6 > 0) {
                                       var9 = this.tiles[var6 - 1][var4][var5];
                                       if(var9 != null && var9.field1371) {
                                          continue;
                                       }
                                    }

                                    if(var4 <= field1518 && var4 > field1497) {
                                       var9 = var8[var4 - 1][var5];
                                       if(var9 != null && var9.field1371 && (var9.field1350 || (var3.field1362 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var4 >= field1518 && var4 < field1544 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if(var9 != null && var9.field1371 && (var9.field1350 || (var3.field1362 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 <= field1519 && var5 > field1521) {
                                       var9 = var8[var4][var5 - 1];
                                       if(var9 != null && var9.field1371 && (var9.field1350 || (var3.field1362 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 >= field1519 && var5 < field1517 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if(var9 != null && var9.field1371 && (var9.field1350 || (var3.field1362 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field1350 = false;
                                 if(var3.field1363 != null) {
                                    var9 = var3.field1363;
                                    if(var9.field1353 != null) {
                                       if(!this.method1784(0, var4, var5)) {
                                          this.method1779(var9.field1353, 0, field1523, field1524, field1556, field1526, var4, var5);
                                       }
                                    } else if(var9.field1354 != null && !this.method1784(0, var4, var5)) {
                                       this.method1780(var9.field1354, field1523, field1524, field1556, field1526, var4, var5);
                                    }

                                    var16 = var9.wallObject;
                                    if(var16 != null) {
                                       var16.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var16.x - field1503, var16.floor - field1553, var16.y - field1507, var16.hash);
                                    }

                                    for(var10 = 0; var10 < var9.field1359; ++var10) {
                                       var17 = var9.objects[var10];
                                       if(var17 != null) {
                                          var17.renderable.vmethod1925(var17.orientation, field1523, field1524, field1556, field1526, var17.x - field1503, var17.height - field1553, var17.y - field1507, var17.hash);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if(var3.field1353 != null) {
                                    if(!this.method1784(var7, var4, var5)) {
                                       var20 = true;
                                       if(var3.field1353.field1477 != 12345678 || field1516 && var6 <= field1529) {
                                          this.method1779(var3.field1353, var7, field1523, field1524, field1556, field1526, var4, var5);
                                       }
                                    }
                                 } else if(var3.field1354 != null && !this.method1784(var7, var4, var5)) {
                                    var20 = true;
                                    this.method1780(var3.field1354, field1523, field1524, field1556, field1526, var4, var5);
                                 }

                                 var21 = 0;
                                 var10 = 0;
                                 WallObject var23 = var3.wallObject;
                                 DecorativeObject var24 = var3.decorativeObject;
                                 if(var23 != null || var24 != null) {
                                    if(field1518 == var4) {
                                       ++var21;
                                    } else if(field1518 < var4) {
                                       var21 += 2;
                                    }

                                    if(field1519 == var5) {
                                       var21 += 3;
                                    } else if(field1519 > var5) {
                                       var21 += 6;
                                    }

                                    var10 = field1540[var21];
                                    var3.field1370 = field1559[var21];
                                 }

                                 if(var23 != null) {
                                    if((var23.field1567 & field1545[var21]) != 0) {
                                       if(var23.field1567 == 16) {
                                          var3.field1367 = 3;
                                          var3.field1349 = field1537[var21];
                                          var3.field1369 = 3 - var3.field1349;
                                       } else if(var23.field1567 == 32) {
                                          var3.field1367 = 6;
                                          var3.field1349 = field1522[var21];
                                          var3.field1369 = 6 - var3.field1349;
                                       } else if(var23.field1567 == 64) {
                                          var3.field1367 = 12;
                                          var3.field1349 = field1548[var21];
                                          var3.field1369 = 12 - var3.field1349;
                                       } else {
                                          var3.field1367 = 9;
                                          var3.field1349 = field1549[var21];
                                          var3.field1369 = 9 - var3.field1349;
                                       }
                                    } else {
                                       var3.field1367 = 0;
                                    }

                                    if((var23.field1567 & var10) != 0 && !this.method1878(var7, var4, var5, var23.field1567)) {
                                       var23.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var23.x - field1503, var23.floor - field1553, var23.y - field1507, var23.hash);
                                    }

                                    if((var23.field1568 & var10) != 0 && !this.method1878(var7, var4, var5, var23.field1568)) {
                                       var23.renderable2.vmethod1925(0, field1523, field1524, field1556, field1526, var23.x - field1503, var23.floor - field1553, var23.y - field1507, var23.hash);
                                    }
                                 }

                                 if(var24 != null && !this.method1861(var7, var4, var5, var24.renderable1.modelHeight)) {
                                    if((var24.renderFlag & var10) != 0) {
                                       var24.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var24.x - field1503 + var24.offsetX, var24.floor - field1553, var24.y - field1507 + var24.offsetY, var24.hash);
                                    } else if(var24.renderFlag == 256) {
                                       var11 = var24.x - field1503;
                                       var12 = var24.floor - field1553;
                                       var13 = var24.y - field1507;
                                       var18 = var24.rotation;
                                       if(var18 != 1 && var18 != 2) {
                                          var19 = var11;
                                       } else {
                                          var19 = -var11;
                                       }

                                       int var25;
                                       if(var18 != 2 && var18 != 3) {
                                          var25 = var13;
                                       } else {
                                          var25 = -var13;
                                       }

                                       if(var25 < var19) {
                                          var24.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var11 + var24.offsetX, var12, var13 + var24.offsetY, var24.hash);
                                       } else if(var24.renderable2 != null) {
                                          var24.renderable2.vmethod1925(0, field1523, field1524, field1556, field1526, var11, var12, var13, var24.hash);
                                       }
                                    }
                                 }

                                 if(var20) {
                                    GroundObject var34 = var3.groundObject;
                                    if(var34 != null) {
                                       var34.renderable.vmethod1925(0, field1523, field1524, field1556, field1526, var34.x - field1503, var34.floor - field1553, var34.y - field1507, var34.hash);
                                    }

                                    ItemLayer var26 = var3.itemLayer;
                                    if(var26 != null && var26.height == 0) {
                                       if(var26.middle != null) {
                                          var26.middle.vmethod1925(0, field1523, field1524, field1556, field1526, var26.x - field1503, var26.hash - field1553, var26.y - field1507, var26.flags);
                                       }

                                       if(var26.top != null) {
                                          var26.top.vmethod1925(0, field1523, field1524, field1556, field1526, var26.x - field1503, var26.hash - field1553, var26.y - field1507, var26.flags);
                                       }

                                       if(var26.bottom != null) {
                                          var26.bottom.vmethod1925(0, field1523, field1524, field1556, field1526, var26.x - field1503, var26.hash - field1553, var26.y - field1507, var26.flags);
                                       }
                                    }
                                 }

                                 var11 = var3.field1362;
                                 if(var11 != 0) {
                                    if(var4 < field1518 && (var11 & 4) != 0) {
                                       var22 = var8[var4 + 1][var5];
                                       if(var22 != null && var22.field1371) {
                                          field1542.method2459(var22);
                                       }
                                    }

                                    if(var5 < field1519 && (var11 & 2) != 0) {
                                       var22 = var8[var4][var5 + 1];
                                       if(var22 != null && var22.field1371) {
                                          field1542.method2459(var22);
                                       }
                                    }

                                    if(var4 > field1518 && (var11 & 1) != 0) {
                                       var22 = var8[var4 - 1][var5];
                                       if(var22 != null && var22.field1371) {
                                          field1542.method2459(var22);
                                       }
                                    }

                                    if(var5 > field1519 && (var11 & 8) != 0) {
                                       var22 = var8[var4][var5 - 1];
                                       if(var22 != null && var22.field1371) {
                                          field1542.method2459(var22);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if(var3.field1367 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.field1359; ++var21) {
                                    if(var3.objects[var21].field1641 != field1513 && (var3.field1361[var21] & var3.field1367) == var3.field1349) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if(var20) {
                                    var16 = var3.wallObject;
                                    if(!this.method1878(var7, var4, var5, var16.field1567)) {
                                       var16.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var16.x - field1503, var16.floor - field1553, var16.y - field1507, var16.hash);
                                    }

                                    var3.field1367 = 0;
                                 }
                              }

                              if(!var3.field1374) {
                                 break;
                              }

                              try {
                                 int var32 = var3.field1359;
                                 var3.field1374 = false;
                                 var21 = 0;

                                 label562:
                                 for(var10 = 0; var10 < var32; ++var10) {
                                    var17 = var3.objects[var10];
                                    if(var17.field1641 != field1513) {
                                       for(var14 = var17.relativeX; var14 <= var17.offsetX; ++var14) {
                                          for(var11 = var17.relativeY; var11 <= var17.offsetY; ++var11) {
                                             var22 = var8[var14][var11];
                                             if(var22.field1350) {
                                                var3.field1374 = true;
                                                continue label562;
                                             }

                                             if(var22.field1367 != 0) {
                                                var13 = 0;
                                                if(var14 > var17.relativeX) {
                                                   ++var13;
                                                }

                                                if(var14 < var17.offsetX) {
                                                   var13 += 4;
                                                }

                                                if(var11 > var17.relativeY) {
                                                   var13 += 8;
                                                }

                                                if(var11 < var17.offsetY) {
                                                   var13 += 2;
                                                }

                                                if((var13 & var22.field1367) == var3.field1369) {
                                                   var3.field1374 = true;
                                                   continue label562;
                                                }
                                             }
                                          }
                                       }

                                       field1527[var21++] = var17;
                                       var14 = field1518 - var17.relativeX;
                                       var11 = var17.offsetX - field1518;
                                       if(var11 > var14) {
                                          var14 = var11;
                                       }

                                       var12 = field1519 - var17.relativeY;
                                       var13 = var17.offsetY - field1519;
                                       if(var13 > var12) {
                                          var17.field1631 = var14 + var13;
                                       } else {
                                          var17.field1631 = var14 + var12;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var10 = -50;
                                    var15 = -1;

                                    GameObject var33;
                                    for(var14 = 0; var14 < var21; ++var14) {
                                       var33 = field1527[var14];
                                       if(var33.field1641 != field1513) {
                                          if(var33.field1631 > var10) {
                                             var10 = var33.field1631;
                                             var15 = var14;
                                          } else if(var33.field1631 == var10) {
                                             var12 = var33.x - field1503;
                                             var13 = var33.y - field1507;
                                             var18 = field1527[var15].x - field1503;
                                             var19 = field1527[var15].y - field1507;
                                             if(var12 * var12 + var13 * var13 > var18 * var18 + var19 * var19) {
                                                var15 = var14;
                                             }
                                          }
                                       }
                                    }

                                    if(var15 == -1) {
                                       break;
                                    }

                                    var33 = field1527[var15];
                                    var33.field1641 = field1513;
                                    if(!this.method1787(var7, var33.relativeX, var33.offsetX, var33.relativeY, var33.offsetY, var33.renderable.modelHeight)) {
                                       var33.renderable.vmethod1925(var33.orientation, field1523, field1524, field1556, field1526, var33.x - field1503, var33.height - field1553, var33.y - field1507, var33.hash);
                                    }

                                    for(var11 = var33.relativeX; var11 <= var33.offsetX; ++var11) {
                                       for(var12 = var33.relativeY; var12 <= var33.offsetY; ++var12) {
                                          Tile var35 = var8[var11][var12];
                                          if(var35.field1367 != 0) {
                                             field1542.method2459(var35);
                                          } else if((var11 != var4 || var12 != var5) && var35.field1371) {
                                             field1542.method2459(var35);
                                          }
                                       }
                                    }
                                 }

                                 if(!var3.field1374) {
                                    break;
                                 }
                              } catch (Exception var27) {
                                 var3.field1374 = false;
                                 break;
                              }
                           }
                        } while(!var3.field1371);
                     } while(var3.field1367 != 0);

                     if(var4 > field1518 || var4 <= field1497) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field1371);

                  if(var4 < field1518 || var4 >= field1544 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field1371);

               if(var5 > field1519 || var5 <= field1521) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field1371);

            if(var5 < field1519 || var5 >= field1517 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field1371);

         var3.field1371 = false;
         --field1511;
         ItemLayer var28 = var3.itemLayer;
         if(var28 != null && var28.height != 0) {
            if(var28.middle != null) {
               var28.middle.vmethod1925(0, field1523, field1524, field1556, field1526, var28.x - field1503, var28.hash - field1553 - var28.height, var28.y - field1507, var28.flags);
            }

            if(var28.top != null) {
               var28.top.vmethod1925(0, field1523, field1524, field1556, field1526, var28.x - field1503, var28.hash - field1553 - var28.height, var28.y - field1507, var28.flags);
            }

            if(var28.bottom != null) {
               var28.bottom.vmethod1925(0, field1523, field1524, field1556, field1526, var28.x - field1503, var28.hash - field1553 - var28.height, var28.y - field1507, var28.flags);
            }
         }

         if(var3.field1370 != 0) {
            DecorativeObject var29 = var3.decorativeObject;
            if(var29 != null && !this.method1861(var7, var4, var5, var29.renderable1.modelHeight)) {
               if((var29.renderFlag & var3.field1370) != 0) {
                  var29.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var29.x - field1503 + var29.offsetX, var29.floor - field1553, var29.y - field1507 + var29.offsetY, var29.hash);
               } else if(var29.renderFlag == 256) {
                  var10 = var29.x - field1503;
                  var15 = var29.floor - field1553;
                  var14 = var29.y - field1507;
                  var11 = var29.rotation;
                  if(var11 != 1 && var11 != 2) {
                     var12 = var10;
                  } else {
                     var12 = -var10;
                  }

                  if(var11 != 2 && var11 != 3) {
                     var13 = var14;
                  } else {
                     var13 = -var14;
                  }

                  if(var13 >= var12) {
                     var29.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var10 + var29.offsetX, var15, var14 + var29.offsetY, var29.hash);
                  } else if(var29.renderable2 != null) {
                     var29.renderable2.vmethod1925(0, field1523, field1524, field1556, field1526, var10, var15, var14, var29.hash);
                  }
               }
            }

            WallObject var31 = var3.wallObject;
            if(var31 != null) {
               if((var31.field1568 & var3.field1370) != 0 && !this.method1878(var7, var4, var5, var31.field1568)) {
                  var31.renderable2.vmethod1925(0, field1523, field1524, field1556, field1526, var31.x - field1503, var31.floor - field1553, var31.y - field1507, var31.hash);
               }

               if((var31.field1567 & var3.field1370) != 0 && !this.method1878(var7, var4, var5, var31.field1567)) {
                  var31.renderable1.vmethod1925(0, field1523, field1524, field1556, field1526, var31.x - field1503, var31.floor - field1553, var31.y - field1507, var31.hash);
               }
            }
         }

         Tile var30;
         if(var6 < this.field1498 - 1) {
            var30 = this.tiles[var6 + 1][var4][var5];
            if(var30 != null && var30.field1371) {
               field1542.method2459(var30);
            }
         }

         if(var4 < field1518) {
            var30 = var8[var4 + 1][var5];
            if(var30 != null && var30.field1371) {
               field1542.method2459(var30);
            }
         }

         if(var5 < field1519) {
            var30 = var8[var4][var5 + 1];
            if(var30 != null && var30.field1371) {
               field1542.method2459(var30);
            }
         }

         if(var4 > field1518) {
            var30 = var8[var4 - 1][var5];
            if(var30 != null && var30.field1371) {
               field1542.method2459(var30);
            }
         }

         if(var5 > field1519) {
            var30 = var8[var4][var5 - 1];
            if(var30 != null && var30.field1371) {
               field1542.method2459(var30);
            }
         }
      }
   }

   @ObfuscatedName("t")
   public WallObject method1837(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.wallObject;
   }

   @ObfuscatedName("i")
   public void method1840(int var1) {
      this.field1531 = var1;

      for(int var2 = 0; var2 < this.field1534; ++var2) {
         for(int var3 = 0; var3 < this.field1500; ++var3) {
            if(this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("aq")
   public int method1842(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.decorativeObject != null?var4.decorativeObject.hash:0;
   }

   @ObfuscatedName("ag")
   public int method1845(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject.hash:0;
   }

   public Region(int var1, int var2, int var3, int[][][] var4) {
      this.field1498 = var1;
      this.field1534 = var2;
      this.field1500 = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.field1506 = new int[var1][var2 + 1][var3 + 1];
      this.field1501 = var4;
      this.method1736();
   }

   @ObfuscatedName("af")
   boolean method1861(int var1, int var2, int var3, int var4) {
      if(!this.method1784(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1788(var5 + 1, this.field1501[var1][var2][var3] - var4, var6 + 1) && this.method1788(var5 + 128 - 1, this.field1501[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1788(var5 + 128 - 1, this.field1501[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1788(var5 + 1, this.field1501[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("p")
   boolean method1870(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, int var12, int var13) {
      int var14;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var14 = var3; var14 < var3 + var5; ++var14) {
            if(var15 < 0 || var14 < 0 || var15 >= this.field1534 || var14 >= this.field1500) {
               return false;
            }

            Tile var16 = this.tiles[var1][var15][var14];
            if(var16 != null && var16.field1359 >= 5) {
               return false;
            }
         }
      }

      GameObject var19 = new GameObject();
      var19.hash = var12;
      var19.flags = var13;
      var19.plane = var1;
      var19.x = var6;
      var19.y = var7;
      var19.height = var8;
      var19.renderable = var9;
      var19.orientation = var10;
      var19.relativeX = var2;
      var19.relativeY = var3;
      var19.offsetX = var2 + var4 - 1;
      var19.offsetY = var3 + var5 - 1;

      for(var14 = var2; var14 < var2 + var4; ++var14) {
         for(int var20 = var3; var20 < var3 + var5; ++var20) {
            int var17 = 0;
            if(var14 > var2) {
               ++var17;
            }

            if(var14 < var2 + var4 - 1) {
               var17 += 4;
            }

            if(var20 > var3) {
               var17 += 8;
            }

            if(var20 < var3 + var5 - 1) {
               var17 += 2;
            }

            for(int var18 = var1; var18 >= 0; --var18) {
               if(this.tiles[var18][var14][var20] == null) {
                  this.tiles[var18][var14][var20] = new Tile(var18, var14, var20);
               }
            }

            Tile var21 = this.tiles[var1][var14][var20];
            var21.objects[var21.field1359] = var19;
            var21.field1361[var21.field1359] = var17;
            var21.field1362 |= var17;
            ++var21.field1359;
         }
      }

      if(var11) {
         this.objects[this.field1504++] = var19;
      }

      return true;
   }

   @ObfuscatedName("w")
   public void method1876(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10) {
      if(var5 != null || var6 != null) {
         WallObject var11 = new WallObject();
         var11.hash = var9;
         var11.field1572 = var10;
         var11.x = var2 * 128 + 64;
         var11.y = var3 * 128 + 64;
         var11.floor = var4;
         var11.renderable1 = var5;
         var11.renderable2 = var6;
         var11.field1567 = var7;
         var11.field1568 = var8;

         for(int var12 = var1; var12 >= 0; --var12) {
            if(this.tiles[var12][var2][var3] == null) {
               this.tiles[var12][var2][var3] = new Tile(var12, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallObject = var11;
      }

   }

   @ObfuscatedName("x")
   public void method1877(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.decorativeObject = null;
      }

   }

   @ObfuscatedName("ac")
   boolean method1878(int var1, int var2, int var3, int var4) {
      if(!this.method1784(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1501[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field1503) {
                  if(!this.method1788(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1788(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1788(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1788(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field1507) {
                  if(!this.method1788(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1788(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1788(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method1788(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field1503) {
                  if(!this.method1788(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1788(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method1788(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method1788(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field1507) {
                  if(!this.method1788(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method1788(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method1788(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method1788(var5, var9, var6)) {
                  return false;
               }

               if(!this.method1788(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method1788(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method1788(var5, var9, var6 + 128):(var4 == 32?this.method1788(var5 + 128, var9, var6 + 128):(var4 == 64?this.method1788(var5 + 128, var9, var6):(var4 == 128?this.method1788(var5, var9, var6):true))));
      }
   }

   @ObfuscatedName("y")
   public void method1880() {
      for(int var1 = 0; var1 < this.field1504; ++var1) {
         GameObject var2 = this.objects[var1];
         this.method1751(var2);
         this.objects[var1] = null;
      }

      this.field1504 = 0;
   }

   @ObfuscatedName("av")
   public void method1893(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field1534 * 128) {
         var1 = this.field1534 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field1500 * 128) {
         var3 = this.field1500 * 128 - 1;
      }

      ++field1513;
      field1523 = class84.field1475[var4];
      field1524 = class84.field1469[var4];
      field1556 = class84.field1475[var5];
      field1526 = class84.field1469[var5];
      renderArea = field1552[(var4 - 128) / 32][var5 / 64];
      field1503 = var1;
      field1553 = var2;
      field1507 = var3;
      field1518 = var1 / 128;
      field1519 = var3 / 128;
      field1512 = var6;
      field1497 = field1518 - 25;
      if(field1497 < 0) {
         field1497 = 0;
      }

      field1521 = field1519 - 25;
      if(field1521 < 0) {
         field1521 = 0;
      }

      field1544 = field1518 + 25;
      if(field1544 > this.field1534) {
         field1544 = this.field1534;
      }

      field1517 = field1519 + 25;
      if(field1517 > this.field1500) {
         field1517 = this.field1500;
      }

      this.method1896();
      field1511 = 0;

      int var7;
      Tile[][] var8;
      int var9;
      int var10;
      for(var7 = this.field1531; var7 < this.field1498; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = field1497; var9 < field1544; ++var9) {
            for(var10 = field1521; var10 < field1517; ++var10) {
               Tile var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field1366 > var6 || !renderArea[var9 - field1518 + 25][var10 - field1519 + 25] && this.field1501[var7][var9][var10] - var2 < 2000) {
                     var11.field1350 = false;
                     var11.field1371 = false;
                     var11.field1367 = 0;
                  } else {
                     var11.field1350 = true;
                     var11.field1371 = true;
                     if(var11.field1359 > 0) {
                        var11.field1374 = true;
                     } else {
                        var11.field1374 = false;
                     }

                     ++field1511;
                  }
               }
            }
         }
      }

      int var12;
      Tile var13;
      int var14;
      int var15;
      int var16;
      for(var7 = this.field1531; var7 < this.field1498; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1518 + var9;
            var14 = field1518 - var9;
            if(var10 >= field1497 || var14 < field1544) {
               for(var15 = -25; var15 <= 0; ++var15) {
                  var16 = field1519 + var15;
                  var12 = field1519 - var15;
                  if(var10 >= field1497) {
                     if(var16 >= field1521) {
                        var13 = var8[var10][var16];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, true);
                        }
                     }

                     if(var12 < field1517) {
                        var13 = var8[var10][var12];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, true);
                        }
                     }
                  }

                  if(var14 < field1544) {
                     if(var16 >= field1521) {
                        var13 = var8[var14][var16];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, true);
                        }
                     }

                     if(var12 < field1517) {
                        var13 = var8[var14][var12];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, true);
                        }
                     }
                  }

                  if(field1511 == 0) {
                     field1516 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field1531; var7 < this.field1498; ++var7) {
         var8 = this.tiles[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1518 + var9;
            var14 = field1518 - var9;
            if(var10 >= field1497 || var14 < field1544) {
               for(var15 = -25; var15 <= 0; ++var15) {
                  var16 = field1519 + var15;
                  var12 = field1519 - var15;
                  if(var10 >= field1497) {
                     if(var16 >= field1521) {
                        var13 = var8[var10][var16];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, false);
                        }
                     }

                     if(var12 < field1517) {
                        var13 = var8[var10][var12];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, false);
                        }
                     }
                  }

                  if(var14 < field1544) {
                     if(var16 >= field1521) {
                        var13 = var8[var14][var16];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, false);
                        }
                     }

                     if(var12 < field1517) {
                        var13 = var8[var14][var12];
                        if(var13 != null && var13.field1350) {
                           this.method1836(var13, false);
                        }
                     }
                  }

                  if(field1511 == 0) {
                     field1516 = false;
                     return;
                  }
               }
            }
         }
      }

      field1516 = false;
   }

   @ObfuscatedName("az")
   void method1896() {
      int var1 = field1543[field1512];
      class94[] var2 = field1539[field1512];
      field1547 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class94 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var8;
         boolean var9;
         if(var4.field1601 == 1) {
            var5 = var4.field1607 - field1518 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1597 - field1519 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1609 - field1519 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while(var6 <= var7) {
                  if(renderArea[var5][var6++]) {
                     var9 = true;
                     break;
                  }
               }

               if(var9) {
                  var8 = field1503 - var4.field1602;
                  if(var8 > 32) {
                     var4.field1608 = 1;
                  } else {
                     if(var8 >= -32) {
                        continue;
                     }

                     var4.field1608 = 2;
                     var8 = -var8;
                  }

                  var4.field1611 = (var4.field1599 - field1507 << 8) / var8;
                  var4.field1612 = (var4.field1604 - field1507 << 8) / var8;
                  var4.field1613 = (var4.field1606 - field1553 << 8) / var8;
                  var4.field1614 = (var4.field1605 - field1553 << 8) / var8;
                  field1514[field1547++] = var4;
               }
            }
         } else if(var4.field1601 == 2) {
            var5 = var4.field1597 - field1519 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field1607 - field1518 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1598 - field1518 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while(var6 <= var7) {
                  if(renderArea[var6++][var5]) {
                     var9 = true;
                     break;
                  }
               }

               if(var9) {
                  var8 = field1507 - var4.field1599;
                  if(var8 > 32) {
                     var4.field1608 = 3;
                  } else {
                     if(var8 >= -32) {
                        continue;
                     }

                     var4.field1608 = 4;
                     var8 = -var8;
                  }

                  var4.field1610 = (var4.field1602 - field1503 << 8) / var8;
                  var4.field1603 = (var4.field1600 - field1503 << 8) / var8;
                  var4.field1613 = (var4.field1606 - field1553 << 8) / var8;
                  var4.field1614 = (var4.field1605 - field1553 << 8) / var8;
                  field1514[field1547++] = var4;
               }
            }
         } else if(var4.field1601 == 4) {
            var5 = var4.field1606 - field1553;
            if(var5 > 128) {
               var6 = var4.field1597 - field1519 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1609 - field1519 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var10 = var4.field1607 - field1518 + 25;
                  if(var10 < 0) {
                     var10 = 0;
                  }

                  var8 = var4.field1598 - field1518 + 25;
                  if(var8 > 50) {
                     var8 = 50;
                  }

                  boolean var11 = false;

                  label140:
                  for(int var12 = var10; var12 <= var8; ++var12) {
                     for(int var13 = var6; var13 <= var7; ++var13) {
                        if(renderArea[var12][var13]) {
                           var11 = true;
                           break label140;
                        }
                     }
                  }

                  if(var11) {
                     var4.field1608 = 5;
                     var4.field1610 = (var4.field1602 - field1503 << 8) / var5;
                     var4.field1603 = (var4.field1600 - field1503 << 8) / var5;
                     var4.field1611 = (var4.field1599 - field1507 << 8) / var5;
                     var4.field1612 = (var4.field1604 - field1507 << 8) / var5;
                     field1514[field1547++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("z")
   public void method1916(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.wallObject = null;
      }

   }

   static {
      field1543 = new int[field1499];
      field1539 = new class94[field1499][500];
      field1547 = 0;
      field1514 = new class94[500];
      field1542 = new Deque();
      field1540 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1545 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1559 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1537 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1522 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1548 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1549 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field1552 = new boolean[8][32][51][51];
   }
}
