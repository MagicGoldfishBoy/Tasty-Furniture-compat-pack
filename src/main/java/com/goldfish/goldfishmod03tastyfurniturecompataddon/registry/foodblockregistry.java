package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.client.gui.components.Button;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;



public class foodblockregistry {
    public static final DeferredRegister<Block> FOODBLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, TastyFurnitureCompatAddon.MODID);
    public static final DeferredRegister<BlockEntityType<?>> FOODBLOCKENTITY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TastyFurnitureCompatAddon.MODID);
    
//==============================================================================================================================================================================================
//                                                                                          Blocks
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> ELDERBERRY_BLOCK = FOODBLOCK.register("elderberry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> ELDERBERRY_BRICKS_BLOCK = FOODBLOCK.register("elderberry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> ELDERBERRY_CHISELED_BLOCK = FOODBLOCK.register("elderberry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> ELDERBERRY_TILES_BLOCK = FOODBLOCK.register("elderberry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
//==============================================================================================================================================================================================
//                                                                                          Slabs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> ELDERBERRY_SLAB = FOODBLOCK.register("elderberry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> ELDERBERRY_BRICKS_SLAB = FOODBLOCK.register("elderberry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
//==============================================================================================================================================================================================
//                                                                                         Stairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> ELDERBERRY_STAIRS = FOODBLOCK.register("elderberry_stairs", 
     () -> new StairBlock(ELDERBERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> ELDERBERRY_BRICKS_STAIRS = FOODBLOCK.register("elderberry_bricks_stairs", 
     () -> new StairBlock(ELDERBERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
//==============================================================================================================================================================================================
//                                                                                          Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ELDERBERRY_BARS = FOODBLOCK.register("elderberry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
//==============================================================================================================================================================================================
//                                                                                          Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ELDERBERRY_DOOR = FOODBLOCK.register("elderberry_door", () -> new DoorBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> ELDERBERRY_BUTTON = FOODBLOCK.register("elderberry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> ELDERBERRY_FENCE = FOODBLOCK.register("elderberry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> ELDERBERRY_GATE = FOODBLOCK.register("elderberry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtyperegistry.ELDERBERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
//==============================================================================================================================================================================================
//                                                                                     Pressure Plates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> ELDERBERRY_PRESSURE_PLATE = FOODBLOCK.register("elderberry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
}
