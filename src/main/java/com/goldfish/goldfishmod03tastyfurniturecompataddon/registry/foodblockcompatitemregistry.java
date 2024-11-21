package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class foodblockcompatitemregistry {
    
    public static DeferredRegister<Item> FOODBLOCKITEM = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);


//==============================================================================================================================================================================================
//                                                                                         Blocks
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_tiles_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> CHERRY_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> CHERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> CHERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_tiles_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Slabs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_slab_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_SLAB_ITEM = FOODBLOCKITEM.register("cherry_slab_item",
   () -> new BlockItem(foodblockregistry.CHERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("cherry_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Stairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_stairs_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_stairs_item",
   () -> new BlockItem(foodblockregistry.CHERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARS_ITEM = FOODBLOCKITEM.register("elderberry_bars_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BARS_ITEM = FOODBLOCKITEM.register("cherry_bars_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BARS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DOOR_ITEM = FOODBLOCKITEM.register("elderberry_door_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_DOOR_ITEM = FOODBLOCKITEM.register("cherry_door_item",
   () -> new BlockItem(foodblockregistry.CHERRY_DOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("elderberry_button_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BUTTON_ITEM = FOODBLOCKITEM.register("cherry_button_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BUTTON.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FENCE_ITEM = FOODBLOCKITEM.register("elderberry_fence_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_FENCE_ITEM = FOODBLOCKITEM.register("cherry_fence_item",
   () -> new BlockItem(foodblockregistry.CHERRY_FENCE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_GATE_ITEM = FOODBLOCKITEM.register("elderberry_gate_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_GATE_ITEM = FOODBLOCKITEM.register("cherry_gate_item",
   () -> new BlockItem(foodblockregistry.CHERRY_GATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                     Pressure Plates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("elderberry_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("cherry_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.CHERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ELDERBERRY_SIGN_ITEM = FOODBLOCKITEM.register("elderberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.ELDERBERRY_STANDING_SIGN.get(), foodblockregistry.ELDERBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CHERRY_SIGN_ITEM = FOODBLOCKITEM.register("cherry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.CHERRY_STANDING_SIGN.get(), foodblockregistry.CHERRY_WALL_SIGN.get()));
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("elderberry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CHERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("cherry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.CHERRY_TRAPDOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Lamps
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LAMP_ITEM = FOODBLOCKITEM.register("elderberry_lamp_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LAMP_ITEM = FOODBLOCKITEM.register("cherry_lamp_item",
    () -> new BlockItem(foodblockregistry.CHERRY_LAMP.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Carpets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CARPET_ITEM = FOODBLOCKITEM.register("elderberry_carpet_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CARPET_ITEM = FOODBLOCKITEM.register("cherry_carpet_item",
    () -> new BlockItem(foodblockregistry.CHERRY_CARPET.get(), new BlockItem.Properties())); 
//==============================================================================================================================================================================================
//                                                                                        Lanterns
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_lantern_item",
      () -> new BlockItem(foodblockregistry.ELDERBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.ELDERBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CHERRY_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_lantern_item",
      () -> new BlockItem(foodblockregistry.CHERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.CHERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chains
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("elderberry_chain_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIN_ITEM = FOODBLOCKITEM.register("cherry_chain_item",
    () -> new BlockItem(foodblockregistry.CHERRY_CHAIN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Ladders
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("elderberry_ladder_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_LADDER.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Tables
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("elderberry_table_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_TABLE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Torches
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_TORCH_ITEM = FOODBLOCKITEM.register("elderberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_TORCH.get(), foodblockregistry.ELDERBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_REDSTONE_TORCH.get(), foodblockregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_SOUL_TORCH.get(), foodblockregistry.ELDERBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("elderberry_furnace_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_FURNACE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("elderberry_stone_path_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_STONE_PATH.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Barrels
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARREL_ITEM = FOODBLOCKITEM.register("elderberry_barrel_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_BARREL.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("elderberry_chair_item", () -> new BlockItem(foodblockregistry.ELDERBERRY_CHAIR.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Beds
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BED_ITEM = FOODBLOCKITEM.register("elderberry_bed_item", () -> new BlockItem(foodblockregistry.ELDERBERRY_BED.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Cabinets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.SMALL_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.MEDIUM_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
}
