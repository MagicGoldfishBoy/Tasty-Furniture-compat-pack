package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod02tastyfurniture.block.applefurnace;
import com.goldfish.goldfishmod02tastyfurniture.block.foodBarrel;
import com.goldfish.goldfishmod02tastyfurniture.block.foodBed;
import com.goldfish.goldfishmod02tastyfurniture.block.foodChairBlock;
import com.goldfish.goldfishmod02tastyfurniture.block.foodpathtypeminislab;
import com.goldfish.goldfishmod02tastyfurniture.block.foodtable;
import com.goldfish.goldfishmod02tastyfurniture.block.mediumFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.smallFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.applefurnaceentity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.bedEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodBarrelEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.mediumFoodContainerEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.smallFoodContainerEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.coconutFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.coconutSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cornFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cornSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.juniperFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.juniperSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pecanSignEntity;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.RedstoneWallTorchBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;



public class foodblockcompatregistry {
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> JUNIPER_BLOCK = FOODBLOCK.register("juniper_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> JUNIPER_BRICKS_BLOCK = FOODBLOCK.register("juniper_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> JUNIPER_CHISELED_BLOCK = FOODBLOCK.register("juniper_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> JUNIPER_TILES_BLOCK = FOODBLOCK.register("juniper_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> CHERRY_BLOCK = FOODBLOCK.register("cherry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> CHERRY_BRICKS_BLOCK = FOODBLOCK.register("cherry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> CHERRY_CHISELED_BLOCK = FOODBLOCK.register("cherry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> CHERRY_TILES_BLOCK = FOODBLOCK.register("cherry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> COCONUT_BLOCK = FOODBLOCK.register("coconut_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> COCONUT_BRICKS_BLOCK = FOODBLOCK.register("coconut_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> COCONUT_CHISELED_BLOCK = FOODBLOCK.register("coconut_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> COCONUT_TILES_BLOCK = FOODBLOCK.register("coconut_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> ORANGE_BLOCK = FOODBLOCK.register("orange_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> ORANGE_BRICKS_BLOCK = FOODBLOCK.register("orange_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> ORANGE_CHISELED_BLOCK = FOODBLOCK.register("orange_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> ORANGE_TILES_BLOCK = FOODBLOCK.register("orange_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> CORN_BLOCK = FOODBLOCK.register("corn_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> CORN_BRICKS_BLOCK = FOODBLOCK.register("corn_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> CORN_CHISELED_BLOCK = FOODBLOCK.register("corn_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> CORN_TILES_BLOCK = FOODBLOCK.register("corn_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> ONION_BLOCK = FOODBLOCK.register("onion_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> ONION_BRICKS_BLOCK = FOODBLOCK.register("onion_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> ONION_CHISELED_BLOCK = FOODBLOCK.register("onion_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> ONION_TILES_BLOCK = FOODBLOCK.register("onion_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> PECAN_BLOCK = FOODBLOCK.register("pecan_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> PECAN_BRICKS_BLOCK = FOODBLOCK.register("pecan_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> PECAN_CHISELED_BLOCK = FOODBLOCK.register("pecan_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> PECAN_TILES_BLOCK = FOODBLOCK.register("pecan_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> JUNIPER_SLAB = FOODBLOCK.register("juniper_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> JUNIPER_BRICKS_SLAB = FOODBLOCK.register("juniper_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> CHERRY_SLAB = FOODBLOCK.register("cherry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> CHERRY_BRICKS_SLAB = FOODBLOCK.register("cherry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> COCONUT_SLAB = FOODBLOCK.register("coconut_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> COCONUT_BRICKS_SLAB = FOODBLOCK.register("coconut_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> ORANGE_SLAB = FOODBLOCK.register("orange_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> ORANGE_BRICKS_SLAB = FOODBLOCK.register("orange_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> CORN_SLAB = FOODBLOCK.register("corn_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> CORN_BRICKS_SLAB = FOODBLOCK.register("corn_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> ONION_SLAB = FOODBLOCK.register("onion_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> ONION_BRICKS_SLAB = FOODBLOCK.register("onion_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> PECAN_SLAB = FOODBLOCK.register("pecan_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> PECAN_BRICKS_SLAB = FOODBLOCK.register("pecan_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
//==============================================================================================================================================================================================
//                                                                                          Stairs
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> JUNIPER_STAIRS = FOODBLOCK.register("juniper_stairs", 
     () -> new StairBlock(JUNIPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> JUNIPER_BRICKS_STAIRS = FOODBLOCK.register("juniper_bricks_stairs", 
     () -> new StairBlock(JUNIPER_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> CHERRY_STAIRS = FOODBLOCK.register("cherry_stairs", 
     () -> new StairBlock(CHERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> CHERRY_BRICKS_STAIRS = FOODBLOCK.register("cherry_bricks_stairs", 
     () -> new StairBlock(CHERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> COCONUT_STAIRS = FOODBLOCK.register("coconut_stairs", 
     () -> new StairBlock(COCONUT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> COCONUT_BRICKS_STAIRS = FOODBLOCK.register("coconut_bricks_stairs", 
     () -> new StairBlock(COCONUT_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> ORANGE_STAIRS = FOODBLOCK.register("orange_stairs", 
     () -> new StairBlock(ORANGE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> ORANGE_BRICKS_STAIRS = FOODBLOCK.register("orange_bricks_stairs", 
     () -> new StairBlock(ORANGE_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> CORN_STAIRS = FOODBLOCK.register("corn_stairs", 
     () -> new StairBlock(CORN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> CORN_BRICKS_STAIRS = FOODBLOCK.register("corn_bricks_stairs", 
     () -> new StairBlock(CORN_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> ONION_STAIRS = FOODBLOCK.register("onion_stairs", 
     () -> new StairBlock(ONION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> ONION_BRICKS_STAIRS = FOODBLOCK.register("onion_bricks_stairs", 
     () -> new StairBlock(ONION_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> PECAN_STAIRS = FOODBLOCK.register("pecan_stairs", 
     () -> new StairBlock(PECAN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> PECAN_BRICKS_STAIRS = FOODBLOCK.register("pecan_bricks_stairs", 
     () -> new StairBlock(PECAN_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> JUNIPER_BARS = FOODBLOCK.register("juniper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CHERRY_BARS = FOODBLOCK.register("cherry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> COCONUT_BARS = FOODBLOCK.register("coconut_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ORANGE_BARS = FOODBLOCK.register("orange_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CORN_BARS = FOODBLOCK.register("corn_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ONION_BARS = FOODBLOCK.register("onion_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> PECAN_BARS = FOODBLOCK.register("pecan_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
//==============================================================================================================================================================================================
//                                                                                          Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ELDERBERRY_DOOR = FOODBLOCK.register("elderberry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> JUNIPER_DOOR = FOODBLOCK.register("juniper_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CHERRY_DOOR = FOODBLOCK.register("cherry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> COCONUT_DOOR = FOODBLOCK.register("coconut_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ORANGE_DOOR = FOODBLOCK.register("orange_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CORN_DOOR = FOODBLOCK.register("corn_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ONION_DOOR = FOODBLOCK.register("onion_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> PECAN_DOOR = FOODBLOCK.register("pecan_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> JUNIPER_BUTTON = FOODBLOCK.register("juniper_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> CHERRY_BUTTON = FOODBLOCK.register("cherry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> COCONUT_BUTTON = FOODBLOCK.register("coconut_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> ORANGE_BUTTON = FOODBLOCK.register("orange_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> CORN_BUTTON = FOODBLOCK.register("corn_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> ONION_BUTTON = FOODBLOCK.register("onion_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> PECAN_BUTTON = FOODBLOCK.register("pecan_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> JUNIPER_FENCE = FOODBLOCK.register("juniper_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> CHERRY_FENCE = FOODBLOCK.register("cherry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> COCONUT_FENCE = FOODBLOCK.register("coconut_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> ORANGE_FENCE = FOODBLOCK.register("orange_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> CORN_FENCE = FOODBLOCK.register("corn_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> ONION_FENCE = FOODBLOCK.register("onion_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> PECAN_FENCE = FOODBLOCK.register("pecan_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
            foodmaterialtypecompatregistry.ELDERBERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> JUNIPER_GATE = FOODBLOCK.register("juniper_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.JUNIPERWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> CHERRY_GATE = FOODBLOCK.register("cherry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.CHERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> COCONUT_GATE = FOODBLOCK.register("coconut_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.COCONUTWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> ORANGE_GATE = FOODBLOCK.register("orange_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.ORANGEWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> CORN_GATE = FOODBLOCK.register("corn_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.CORNWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> ONION_GATE = FOODBLOCK.register("onion_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.ONIONWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> PECAN_GATE = FOODBLOCK.register("pecan_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.PECANWOODMAT, 
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
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> JUNIPER_PRESSURE_PLATE = FOODBLOCK.register("juniper_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> CHERRY_PRESSURE_PLATE = FOODBLOCK.register("cherry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> COCONUT_PRESSURE_PLATE = FOODBLOCK.register("coconut_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> ORANGE_PRESSURE_PLATE = FOODBLOCK.register("orange_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> CORN_PRESSURE_PLATE = FOODBLOCK.register("corn_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> ONION_PRESSURE_PLATE = FOODBLOCK.register("onion_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> PECAN_PRESSURE_PLATE = FOODBLOCK.register("pecan_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
//==============================================================================================================================================================================================
//                                                                                         Signs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, elderberrySign> ELDERBERRY_SIGN = FOODBLOCK.register("elderberry_sign",
   () -> new elderberrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.ELDERBERRYWOODMAT
   ));
      public static final DeferredHolder<Block, elderberryWallSign> ELDERBERRY_WALL_SIGN = FOODBLOCK.register("elderberry_wall_sign",
   () -> new elderberryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ELDERBERRYWOODMAT
   ));
   public static final DeferredHolder<Block, elderberrySign> ELDERBERRY_STANDING_SIGN = FOODBLOCK.register("elderberry_standing_sign",
   () -> new elderberrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ELDERBERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<elderberrySignEntity>> ELDERBERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "elderberry_sign_entity",
     () -> BlockEntityType.Builder.of(
         elderberrySignEntity::new,
         foodblockcompatregistry.ELDERBERRY_SIGN.get(),
         foodblockcompatregistry.ELDERBERRY_WALL_SIGN.get(),
         foodblockcompatregistry.ELDERBERRY_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, juniperSign> JUNIPER_SIGN = FOODBLOCK.register("juniper_sign",
   () -> new juniperSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.JUNIPERWOODMAT
   ));
      public static final DeferredHolder<Block, juniperWallSign> JUNIPER_WALL_SIGN = FOODBLOCK.register("juniper_wall_sign",
   () -> new juniperWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.JUNIPERWOODMAT
   ));
   public static final DeferredHolder<Block, juniperSign> JUNIPER_STANDING_SIGN = FOODBLOCK.register("juniper_standing_sign",
   () -> new juniperSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.JUNIPERWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<juniperSignEntity>> JUNIPER_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "juniper_sign_entity",
     () -> BlockEntityType.Builder.of(
         juniperSignEntity::new,
         foodblockcompatregistry.JUNIPER_SIGN.get(),
         foodblockcompatregistry.JUNIPER_WALL_SIGN.get(),
         foodblockcompatregistry.JUNIPER_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, cherrySign> CHERRY_SIGN = FOODBLOCK.register("cherry_sign",
   () -> new cherrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.CHERRYWOODMAT
   ));
      public static final DeferredHolder<Block, cherryWallSign> CHERRY_WALL_SIGN = FOODBLOCK.register("cherry_wall_sign",
   () -> new cherryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CHERRYWOODMAT
   ));
   public static final DeferredHolder<Block, cherrySign> CHERRY_STANDING_SIGN = FOODBLOCK.register("cherry_standing_sign",
   () -> new cherrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CHERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cherrySignEntity>> CHERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "cherry_sign_entity",
     () -> BlockEntityType.Builder.of(
         cherrySignEntity::new,
         foodblockcompatregistry.CHERRY_SIGN.get(),
         foodblockcompatregistry.CHERRY_WALL_SIGN.get(),
         foodblockcompatregistry.CHERRY_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, coconutSign> COCONUT_SIGN = FOODBLOCK.register("coconut_sign",
   () -> new coconutSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.COCONUTWOODMAT
   ));
      public static final DeferredHolder<Block, coconutWallSign> COCONUT_WALL_SIGN = FOODBLOCK.register("coconut_wall_sign",
   () -> new coconutWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.COCONUTWOODMAT
   ));
   public static final DeferredHolder<Block, coconutSign> COCONUT_STANDING_SIGN = FOODBLOCK.register("coconut_standing_sign",
   () -> new coconutSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.COCONUTWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<coconutSignEntity>> COCONUT_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "coconut_sign_entity",
     () -> BlockEntityType.Builder.of(
         coconutSignEntity::new,
         foodblockcompatregistry.COCONUT_SIGN.get(),
         foodblockcompatregistry.COCONUT_WALL_SIGN.get(),
         foodblockcompatregistry.COCONUT_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, orangeSign> ORANGE_SIGN = FOODBLOCK.register("orange_sign",
   () -> new orangeSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.ORANGEWOODMAT
   ));
      public static final DeferredHolder<Block, orangeWallSign> ORANGE_WALL_SIGN = FOODBLOCK.register("orange_wall_sign",
   () -> new orangeWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ORANGEWOODMAT
   ));
   public static final DeferredHolder<Block, orangeSign> ORANGE_STANDING_SIGN = FOODBLOCK.register("orange_standing_sign",
   () -> new orangeSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ORANGEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<orangeSignEntity>> ORANGE_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "orange_sign_entity",
     () -> BlockEntityType.Builder.of(
         orangeSignEntity::new,
         foodblockcompatregistry.ORANGE_SIGN.get(),
         foodblockcompatregistry.ORANGE_WALL_SIGN.get(),
         foodblockcompatregistry.ORANGE_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, cornSign> CORN_SIGN = FOODBLOCK.register("corn_sign",
   () -> new cornSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.CORNWOODMAT
   ));
      public static final DeferredHolder<Block, cornWallSign> CORN_WALL_SIGN = FOODBLOCK.register("corn_wall_sign",
   () -> new cornWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CORNWOODMAT
   ));
   public static final DeferredHolder<Block, cornSign> CORN_STANDING_SIGN = FOODBLOCK.register("corn_standing_sign",
   () -> new cornSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CORNWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cornSignEntity>> CORN_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "corn_sign_entity",
     () -> BlockEntityType.Builder.of(
         cornSignEntity::new,
         foodblockcompatregistry.CORN_SIGN.get(),
         foodblockcompatregistry.CORN_WALL_SIGN.get(),
         foodblockcompatregistry.CORN_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, onionSign> ONION_SIGN = FOODBLOCK.register("onion_sign",
   () -> new onionSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.ONIONWOODMAT
   ));
      public static final DeferredHolder<Block, onionWallSign> ONION_WALL_SIGN = FOODBLOCK.register("onion_wall_sign",
   () -> new onionWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ONIONWOODMAT
   ));
   public static final DeferredHolder<Block, onionSign> ONION_STANDING_SIGN = FOODBLOCK.register("onion_standing_sign",
   () -> new onionSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ONIONWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<onionSignEntity>> ONION_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "onion_sign_entity",
     () -> BlockEntityType.Builder.of(
         onionSignEntity::new,
         foodblockcompatregistry.ONION_SIGN.get(),
         foodblockcompatregistry.ONION_WALL_SIGN.get(),
         foodblockcompatregistry.ONION_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, pecanSign> PECAN_SIGN = FOODBLOCK.register("pecan_sign",
   () -> new pecanSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.PECANWOODMAT
   ));
      public static final DeferredHolder<Block, pecanWallSign> PECAN_WALL_SIGN = FOODBLOCK.register("pecan_wall_sign",
   () -> new pecanWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PECANWOODMAT
   ));
   public static final DeferredHolder<Block, pecanSign> PECAN_STANDING_SIGN = FOODBLOCK.register("pecan_standing_sign",
   () -> new pecanSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PECANWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<pecanSignEntity>> PECAN_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "pecan_sign_entity",
     () -> BlockEntityType.Builder.of(
         pecanSignEntity::new,
         foodblockcompatregistry.PECAN_SIGN.get(),
         foodblockcompatregistry.PECAN_WALL_SIGN.get(),
         foodblockcompatregistry.PECAN_STANDING_SIGN.get()
     ).build(null)
   );
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ELDERBERRY_TRAPDOOR = FOODBLOCK.register("elderberry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> JUNIPER_TRAPDOOR = FOODBLOCK.register("juniper_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> CHERRY_TRAPDOOR = FOODBLOCK.register("cherry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> COCONUT_TRAPDOOR = FOODBLOCK.register("coconut_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ORANGE_TRAPDOOR = FOODBLOCK.register("orange_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> CORN_TRAPDOOR = FOODBLOCK.register("corn_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ONION_TRAPDOOR = FOODBLOCK.register("onion_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> PECAN_TRAPDOOR = FOODBLOCK.register("pecan_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
//==============================================================================================================================================================================================
//                                                                                         Lamps
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ELDERBERRY_LAMP = FOODBLOCK.register("elderberry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> JUNIPER_LAMP = FOODBLOCK.register("juniper_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> CHERRY_LAMP = FOODBLOCK.register("cherry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> COCONUT_LAMP = FOODBLOCK.register("coconut_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ORANGE_LAMP = FOODBLOCK.register("orange_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> CORN_LAMP = FOODBLOCK.register("corn_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ONION_LAMP = FOODBLOCK.register("onion_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> PECAN_LAMP = FOODBLOCK.register("pecan_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
//==============================================================================================================================================================================================
//                                                                                         Carpets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> ELDERBERRY_CARPET = FOODBLOCK.register("elderberry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> JUNIPER_CARPET = FOODBLOCK.register("juniper_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> CHERRY_CARPET = FOODBLOCK.register("cherry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> COCONUT_CARPET = FOODBLOCK.register("coconut_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> ORANGE_CARPET = FOODBLOCK.register("orange_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> CORN_CARPET = FOODBLOCK.register("corn_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> ONION_CARPET = FOODBLOCK.register("onion_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> PECAN_CARPET = FOODBLOCK.register("pecan_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
//==============================================================================================================================================================================================
//                                                                                        Lanterns
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> ELDERBERRY_LANTERN = FOODBLOCK.register("elderberry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> ELDERBERRY_SOUL_LANTERN = FOODBLOCK.register("elderberry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> JUNIPER_LANTERN = FOODBLOCK.register("juniper_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> JUNIPER_SOUL_LANTERN = FOODBLOCK.register("juniper_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> CHERRY_LANTERN = FOODBLOCK.register("cherry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CHERRY_SOUL_LANTERN = FOODBLOCK.register("cherry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> COCONUT_LANTERN = FOODBLOCK.register("coconut_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> COCONUT_SOUL_LANTERN = FOODBLOCK.register("coconut_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> ORANGE_LANTERN = FOODBLOCK.register("orange_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> ORANGE_SOUL_LANTERN = FOODBLOCK.register("orange_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> CORN_LANTERN = FOODBLOCK.register("corn_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CORN_SOUL_LANTERN = FOODBLOCK.register("corn_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> ONION_LANTERN = FOODBLOCK.register("onion_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> ONION_SOUL_LANTERN = FOODBLOCK.register("onion_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> PECAN_LANTERN = FOODBLOCK.register("pecan_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> PECAN_SOUL_LANTERN = FOODBLOCK.register("pecan_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
//==============================================================================================================================================================================================
//                                                                                        Chains
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> ELDERBERRY_CHAIN = FOODBLOCK.register("elderberry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> JUNIPER_CHAIN = FOODBLOCK.register("juniper_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> CHERRY_CHAIN = FOODBLOCK.register("cherry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> COCONUT_CHAIN = FOODBLOCK.register("coconut_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> ORANGE_CHAIN = FOODBLOCK.register("orange_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> CORN_CHAIN = FOODBLOCK.register("corn_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> ONION_CHAIN = FOODBLOCK.register("onion_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> PECAN_CHAIN = FOODBLOCK.register("pecan_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
       
//==============================================================================================================================================================================================
//                                                                                        Ladders
//==============================================================================================================================================================================================
         private static float ladder_destroy_time = 0.75f;
         static float ladder_explosion_resistance = 0.75f;
         static SoundType plant_ladder_sound = SoundType.VINE;
         static SoundType meat_ladder_sound = SoundType.MUD_BRICKS;
         static SoundType crystal_ladder_sound = SoundType.BASALT;
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ELDERBERRY_LADDER = FOODBLOCK.register("elderberry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> JUNIPER_LADDER = FOODBLOCK.register("juniper_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> CHERRY_LADDER = FOODBLOCK.register("cherry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> COCONUT_LADDER = FOODBLOCK.register("coconut_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ORANGE_LADDER = FOODBLOCK.register("orange_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> CORN_LADDER = FOODBLOCK.register("corn_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ONION_LADDER = FOODBLOCK.register("onion_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
//==============================================================================================================================================================================================
//                                                                                         Table
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ELDERBERRY_TABLE = FOODBLOCK.register("elderberry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> JUNIPER_TABLE = FOODBLOCK.register("juniper_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHERRY_TABLE = FOODBLOCK.register("cherry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> COCONUT_TABLE = FOODBLOCK.register("coconut_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ORANGE_TABLE = FOODBLOCK.register("orange_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CORN_TABLE = FOODBLOCK.register("corn_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ONION_TABLE = FOODBLOCK.register("onion_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
//==============================================================================================================================================================================================
//                                                                                         Torches
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> ELDERBERRY_TORCH = FOODBLOCK.register("elderberry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ELDERBERRY_WALL_TORCH = FOODBLOCK.register("elderberry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> ELDERBERRY_REDSTONE_TORCH = FOODBLOCK.register("elderberry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> ELDERBERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("elderberry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> ELDERBERRY_SOUL_TORCH = FOODBLOCK.register("elderberry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ELDERBERRY_SOUL_WALL_TORCH = FOODBLOCK.register("elderberry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> JUNIPER_TORCH = FOODBLOCK.register("juniper_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> JUNIPER_WALL_TORCH = FOODBLOCK.register("juniper_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> JUNIPER_REDSTONE_TORCH = FOODBLOCK.register("juniper_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> JUNIPER_REDSTONE_WALL_TORCH = FOODBLOCK.register("juniper_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> JUNIPER_SOUL_TORCH = FOODBLOCK.register("juniper_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> JUNIPER_SOUL_WALL_TORCH = FOODBLOCK.register("juniper_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> CHERRY_TORCH = FOODBLOCK.register("cherry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHERRY_WALL_TORCH = FOODBLOCK.register("cherry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CHERRY_REDSTONE_TORCH = FOODBLOCK.register("cherry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CHERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("cherry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CHERRY_SOUL_TORCH = FOODBLOCK.register("cherry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CHERRY_SOUL_WALL_TORCH = FOODBLOCK.register("cherry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> COCONUT_TORCH = FOODBLOCK.register("coconut_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> COCONUT_WALL_TORCH = FOODBLOCK.register("coconut_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> COCONUT_REDSTONE_TORCH = FOODBLOCK.register("coconut_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> COCONUT_REDSTONE_WALL_TORCH = FOODBLOCK.register("coconut_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> COCONUT_SOUL_TORCH = FOODBLOCK.register("coconut_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> COCONUT_SOUL_WALL_TORCH = FOODBLOCK.register("coconut_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> ORANGE_TORCH = FOODBLOCK.register("orange_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ORANGE_WALL_TORCH = FOODBLOCK.register("orange_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> ORANGE_REDSTONE_TORCH = FOODBLOCK.register("orange_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> ORANGE_REDSTONE_WALL_TORCH = FOODBLOCK.register("orange_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> ORANGE_SOUL_TORCH = FOODBLOCK.register("orange_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ORANGE_SOUL_WALL_TORCH = FOODBLOCK.register("orange_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> CORN_TORCH = FOODBLOCK.register("corn_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CORN_WALL_TORCH = FOODBLOCK.register("corn_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CORN_REDSTONE_TORCH = FOODBLOCK.register("corn_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CORN_REDSTONE_WALL_TORCH = FOODBLOCK.register("corn_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CORN_SOUL_TORCH = FOODBLOCK.register("corn_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CORN_SOUL_WALL_TORCH = FOODBLOCK.register("corn_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> ONION_TORCH = FOODBLOCK.register("onion_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ONION_WALL_TORCH = FOODBLOCK.register("onion_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> ONION_REDSTONE_TORCH = FOODBLOCK.register("onion_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> ONION_REDSTONE_WALL_TORCH = FOODBLOCK.register("onion_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> ONION_SOUL_TORCH = FOODBLOCK.register("onion_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ONION_SOUL_WALL_TORCH = FOODBLOCK.register("onion_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, elderberryFurnace> ELDERBERRY_FURNACE = FOODBLOCK.register("elderberry_furnace", 
    () -> new elderberryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<elderberryFurnaceEntity>> ELDERBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("elderberry_furnace", 
    () -> BlockEntityType.Builder.of(elderberryFurnaceEntity::new, ELDERBERRY_FURNACE.get()).build(null));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, juniperFurnace> JUNIPER_FURNACE = FOODBLOCK.register("juniper_furnace", 
    () -> new juniperFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<juniperFurnaceEntity>> JUNIPER_FURNACE_ENTITY = FOODBLOCKENTITY.register("juniper_furnace", 
    () -> BlockEntityType.Builder.of(juniperFurnaceEntity::new, JUNIPER_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, cherryFurnace> CHERRY_FURNACE = FOODBLOCK.register("cherry_furnace", 
    () -> new cherryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cherryFurnaceEntity>> CHERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("cherry_furnace", 
    () -> BlockEntityType.Builder.of(cherryFurnaceEntity::new, CHERRY_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, coconutFurnace> COCONUT_FURNACE = FOODBLOCK.register("coconut_furnace", 
    () -> new coconutFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<coconutFurnaceEntity>> COCONUT_FURNACE_ENTITY = FOODBLOCKENTITY.register("coconut_furnace", 
    () -> BlockEntityType.Builder.of(coconutFurnaceEntity::new, COCONUT_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, orangeFurnace> ORANGE_FURNACE = FOODBLOCK.register("orange_furnace", 
    () -> new orangeFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<orangeFurnaceEntity>> ORANGE_FURNACE_ENTITY = FOODBLOCKENTITY.register("orange_furnace", 
    () -> BlockEntityType.Builder.of(orangeFurnaceEntity::new, ORANGE_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, cornFurnace> CORN_FURNACE = FOODBLOCK.register("corn_furnace", 
    () -> new cornFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cornFurnaceEntity>> CORN_FURNACE_ENTITY = FOODBLOCKENTITY.register("corn_furnace", 
    () -> BlockEntityType.Builder.of(cornFurnaceEntity::new, CORN_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, onionFurnace> ONION_FURNACE = FOODBLOCK.register("onion_furnace", 
    () -> new onionFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<onionFurnaceEntity>> ONION_FURNACE_ENTITY = FOODBLOCKENTITY.register("onion_furnace", 
    () -> BlockEntityType.Builder.of(onionFurnaceEntity::new, ONION_FURNACE.get()).build(null));
//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> ELDERBERRY_STONE_PATH = FOODBLOCK.register("elderberry_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> JUNIPER_STONE_PATH = FOODBLOCK.register("juniper_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> CHERRY_STONE_PATH = FOODBLOCK.register("cherry_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> COCONUT_STONE_PATH = FOODBLOCK.register("coconut_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> ORANGE_STONE_PATH = FOODBLOCK.register("orange_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> CORN_STONE_PATH = FOODBLOCK.register("corn_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> ONION_STONE_PATH = FOODBLOCK.register("onion_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
//==============================================================================================================================================================================================
//                                                                                        Barrels
//==============================================================================================================================================================================================
   static float barrel_destroy_time = 1.25f;
   static float barrel_explosion_resistance = 0.75f;
   static SoundType plant_barrel_sound = SoundType.MUD_BRICKS;
   static SoundType meat_barrel_sound = SoundType.MUD;
   static SoundType crystal_barrel_sound = SoundType.BASALT;
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> ELDERBERRY_BARREL = FOODBLOCK.register("elderberry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> JUNIPER_BARREL = FOODBLOCK.register("juniper_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> CHERRY_BARREL = FOODBLOCK.register("cherry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> COCONUT_BARREL = FOODBLOCK.register("coconut_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> ORANGE_BARREL = FOODBLOCK.register("orange_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> CORN_BARREL = FOODBLOCK.register("corn_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> ONION_BARREL = FOODBLOCK.register("onion_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));

 //------entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<foodBarrelEntity>> FOOD_BARREL_ENTITY = FOODBLOCKENTITY.register("food_barrel_entity", 
     () -> BlockEntityType.Builder.of(foodBarrelEntity::new, foodblockcompatregistry.ELDERBERRY_BARREL.get(), foodblockcompatregistry.JUNIPER_BARREL.get(), foodblockcompatregistry.CHERRY_BARREL.get(), 
     foodblockcompatregistry.COCONUT_BARREL.get(),foodblockcompatregistry.ORANGE_BARREL.get(),foodblockcompatregistry.CORN_BARREL.get(),foodblockcompatregistry.ONION_BARREL.get()).build(null));
//==============================================================================================================================================================================================
//                                                                                         Chairs
//==============================================================================================================================================================================================
   static float chair_destroy_time = 1.25f;
   static float chair_explosion_resistance = 0.75f;
   static SoundType plant_chair_sound = SoundType.MUD_BRICKS;
   static SoundType meat_chair_sound = SoundType.MUD;
   static SoundType crystal_chair_sound = SoundType.BASALT;
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> ELDERBERRY_CHAIR = FOODBLOCK.register("elderberry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> JUNIPER_CHAIR = FOODBLOCK.register("juniper_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> CHERRY_CHAIR = FOODBLOCK.register("cherry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> COCONUT_CHAIR = FOODBLOCK.register("coconut_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> ORANGE_CHAIR = FOODBLOCK.register("orange_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> CORN_CHAIR = FOODBLOCK.register("corn_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> ONION_CHAIR = FOODBLOCK.register("onion_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
//==============================================================================================================================================================================================
//                                                                                          Beds
//==============================================================================================================================================================================================
   static float bed_destroy_time = 1.75f;
   static float bed_explosion_resistance = 1.25f;
   static SoundType plant_bed_sound = SoundType.MUD_BRICKS;
   static SoundType meat_bed_sound = SoundType.MUD;
   static SoundType crystal_bed_sound = SoundType.BASALT;
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> ELDERBERRY_BED = FOODBLOCK.register("elderberry_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> JUNIPER_BED = FOODBLOCK.register("juniper_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> CHERRY_BED = FOODBLOCK.register("cherry_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> COCONUT_BED = FOODBLOCK.register("coconut_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> ORANGE_BED = FOODBLOCK.register("orange_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> CORN_BED = FOODBLOCK.register("corn_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> ONION_BED = FOODBLOCK.register("onion_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));

   //.........entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<bedEntity>> FOOD_BED_ENTITY = FOODBLOCKENTITY.register("food_bed_entity",
     () -> BlockEntityType.Builder.of(bedEntity::new, ELDERBERRY_BED.get(), JUNIPER_BED.get(), CHERRY_BED.get(), COCONUT_BED.get(), ORANGE_BED.get(), CORN_BED.get(), 
     ONION_BED.get()).build(null));
   //^ I did not think this would actually work, but it does O.o

//==============================================================================================================================================================================================
//                                                                                        Cabinets
//==============================================================================================================================================================================================
   static float cabinet_destroy_time = 1.25f;
   static float cabinet_explosion_resistance = 0.75f;
   static SoundType plant_cabinet_sound = SoundType.MUD_BRICKS;
   static SoundType meat_cabinet_sound = SoundType.MUD;
   static SoundType crystal_cabinet_sound = SoundType.BASALT;
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_ELDERBERRY_CABINET = FOODBLOCK.register("small_elderberry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_ELDERBERRY_CABINET = FOODBLOCK.register("medium_elderberry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_JUNIPER_CABINET = FOODBLOCK.register("small_juniper_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_JUNIPER_CABINET = FOODBLOCK.register("medium_juniper_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_CHERRY_CABINET = FOODBLOCK.register("small_cherry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_CHERRY_CABINET = FOODBLOCK.register("medium_cherry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_COCONUT_CABINET = FOODBLOCK.register("small_coconut_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_COCONUT_CABINET = FOODBLOCK.register("medium_coconut_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_ORANGE_CABINET = FOODBLOCK.register("small_orange_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_ORANGE_CABINET = FOODBLOCK.register("medium_orange_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_CORN_CABINET = FOODBLOCK.register("small_corn_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_CORN_CABINET = FOODBLOCK.register("medium_corn_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_ONION_CABINET = FOODBLOCK.register("small_onion_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_ONION_CABINET = FOODBLOCK.register("medium_onion_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //----------------------------------------------------------------------------------------Entity-----------------------------------------------------------------------------------------------
    //small
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<smallFoodContainerEntity>> SMALL_CABINET_ENTITY = FOODBLOCKENTITY.register("small_cabinet_entity",
     () -> BlockEntityType.Builder.of(smallFoodContainerEntity::new, SMALL_ELDERBERRY_CABINET.get(), SMALL_JUNIPER_CABINET.get(), SMALL_CHERRY_CABINET.get(), 
     SMALL_COCONUT_CABINET.get(), SMALL_ORANGE_CABINET.get(), SMALL_CORN_CABINET.get(), SMALL_ONION_CABINET.get()).build(null));
    //medium
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mediumFoodContainerEntity>> MEDIUM_CABINET_ENTITY = FOODBLOCKENTITY.register("medium_cabinet_entity",
     () -> BlockEntityType.Builder.of(mediumFoodContainerEntity::new, MEDIUM_ELDERBERRY_CABINET.get(), MEDIUM_JUNIPER_CABINET.get(), MEDIUM_CHERRY_CABINET.get(), 
     MEDIUM_COCONUT_CABINET.get(), MEDIUM_ORANGE_CABINET.get(), MEDIUM_CORN_CABINET.get(), MEDIUM_ONION_CABINET.get()).build(null));

}
