package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockregistry;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class foodblockitemregistry {
    
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
//==============================================================================================================================================================================================
//                                                                                         Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARS_ITEM = FOODBLOCKITEM.register("elderberry_bars_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BARS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DOOR_ITEM = FOODBLOCKITEM.register("elderberry_door_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_DOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("elderberry_button_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BUTTON.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FENCE_ITEM = FOODBLOCKITEM.register("elderberry_fence_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_FENCE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_GATE_ITEM = FOODBLOCKITEM.register("elderberry_gate_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_GATE.get(), new BlockItem.Properties()));
}
