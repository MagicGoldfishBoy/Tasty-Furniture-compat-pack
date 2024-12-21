package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod02tastyfurniture.block.foodBarrel;
import com.goldfish.goldfishmod02tastyfurniture.block.foodBed;
import com.goldfish.goldfishmod02tastyfurniture.block.foodChairBlock;
import com.goldfish.goldfishmod02tastyfurniture.block.foodpathtypeminislab;
import com.goldfish.goldfishmod02tastyfurniture.block.foodtable;
import com.goldfish.goldfishmod02tastyfurniture.block.mediumFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.smallFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.bedEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.foodBarrelEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.mediumFoodContainerEntity;
import com.goldfish.goldfishmod02tastyfurniture.block.entity.smallFoodContainerEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.almondFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.almondSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.almondWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherryWallSign;
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
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.almondFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.almondSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackcherryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackcherrySignEntity;
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
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.lemonFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.lemonSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.limeFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.limeSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pecanFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pecanSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.tomatoFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.tomatoSignEntity;

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
 //--------------------------------------------------------------------------------------Blackcherry--------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> BLACKCHERRY_BLOCK = FOODBLOCK.register("blackcherry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> BLACKCHERRY_BRICKS_BLOCK = FOODBLOCK.register("blackcherry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> BLACKCHERRY_CHISELED_BLOCK = FOODBLOCK.register("blackcherry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> BLACKCHERRY_TILES_BLOCK = FOODBLOCK.register("blackcherry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //-----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> LEMON_BLOCK = FOODBLOCK.register("lemon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> LEMON_BRICKS_BLOCK = FOODBLOCK.register("lemon_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> LEMON_CHISELED_BLOCK = FOODBLOCK.register("lemon_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> LEMON_TILES_BLOCK = FOODBLOCK.register("lemon_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> LIME_BLOCK = FOODBLOCK.register("lime_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> LIME_BRICKS_BLOCK = FOODBLOCK.register("lime_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> LIME_CHISELED_BLOCK = FOODBLOCK.register("lime_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> LIME_TILES_BLOCK = FOODBLOCK.register("lime_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> TOMATO_BLOCK = FOODBLOCK.register("tomato_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> TOMATO_BRICKS_BLOCK = FOODBLOCK.register("tomato_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> TOMATO_CHISELED_BLOCK = FOODBLOCK.register("tomato_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> TOMATO_TILES_BLOCK = FOODBLOCK.register("tomato_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> ALMOND_BLOCK = FOODBLOCK.register("almond_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> ALMOND_BRICKS_BLOCK = FOODBLOCK.register("almond_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> ALMOND_CHISELED_BLOCK = FOODBLOCK.register("almond_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> ALMOND_TILES_BLOCK = FOODBLOCK.register("almond_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
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
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> BLACKCHERRY_SLAB = FOODBLOCK.register("blackcherry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> BLACKCHERRY_BRICKS_SLAB = FOODBLOCK.register("blackcherry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> LEMON_SLAB = FOODBLOCK.register("lemon_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> LEMON_BRICKS_SLAB = FOODBLOCK.register("lemon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> LIME_SLAB = FOODBLOCK.register("lime_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> LIME_BRICKS_SLAB = FOODBLOCK.register("lime_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> TOMATO_SLAB = FOODBLOCK.register("tomato_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> TOMATO_BRICKS_SLAB = FOODBLOCK.register("tomato_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> ALMOND_SLAB = FOODBLOCK.register("almond_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> ALMOND_BRICKS_SLAB = FOODBLOCK.register("almond_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
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
 //--------------------------------------------------------------------------------------Blackcherry--------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> BLACKCHERRY_STAIRS = FOODBLOCK.register("blackcherry_stairs", 
     () -> new StairBlock(BLACKCHERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> BLACKCHERRY_BRICKS_STAIRS = FOODBLOCK.register("blackcherry_bricks_stairs", 
     () -> new StairBlock(BLACKCHERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> LEMON_STAIRS = FOODBLOCK.register("lemon_stairs", 
     () -> new StairBlock(LEMON_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> LEMON_BRICKS_STAIRS = FOODBLOCK.register("lemon_bricks_stairs", 
     () -> new StairBlock(LEMON_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> LIME_STAIRS = FOODBLOCK.register("lime_stairs", 
     () -> new StairBlock(LIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> LIME_BRICKS_STAIRS = FOODBLOCK.register("lime_bricks_stairs", 
     () -> new StairBlock(LIME_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> TOMATO_STAIRS = FOODBLOCK.register("tomato_stairs", 
     () -> new StairBlock(TOMATO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> TOMATO_BRICKS_STAIRS = FOODBLOCK.register("tomato_bricks_stairs", 
     () -> new StairBlock(TOMATO_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
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
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> ALMOND_STAIRS = FOODBLOCK.register("almond_stairs", 
     () -> new StairBlock(ALMOND_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> ALMOND_BRICKS_STAIRS = FOODBLOCK.register("almond_bricks_stairs", 
     () -> new StairBlock(ALMOND_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> JUNIPER_BARS = FOODBLOCK.register("juniper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CHERRY_BARS = FOODBLOCK.register("cherry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> BLACKCHERRY_BARS = FOODBLOCK.register("blackcherry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> COCONUT_BARS = FOODBLOCK.register("coconut_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ORANGE_BARS = FOODBLOCK.register("orange_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> LEMON_BARS = FOODBLOCK.register("lemon_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Lime-------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> LIME_BARS = FOODBLOCK.register("lime_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CORN_BARS = FOODBLOCK.register("corn_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ONION_BARS = FOODBLOCK.register("onion_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> TOMATO_BARS = FOODBLOCK.register("tomato_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> PECAN_BARS = FOODBLOCK.register("pecan_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> ALMOND_BARS = FOODBLOCK.register("almond_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> JUNIPER_DOOR = FOODBLOCK.register("juniper_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CHERRY_DOOR = FOODBLOCK.register("cherry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> BLACKCHERRY_DOOR = FOODBLOCK.register("blackcherry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> COCONUT_DOOR = FOODBLOCK.register("coconut_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ORANGE_DOOR = FOODBLOCK.register("orange_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> LEMON_DOOR = FOODBLOCK.register("lemon_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Lime-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> LIME_DOOR = FOODBLOCK.register("lime_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CORN_DOOR = FOODBLOCK.register("corn_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ONION_DOOR = FOODBLOCK.register("onion_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> TOMATO_DOOR = FOODBLOCK.register("tomato_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> PECAN_DOOR = FOODBLOCK.register("pecan_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ALMOND_DOOR = FOODBLOCK.register("almond_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> BLACKCHERRY_BUTTON = FOODBLOCK.register("blackcherry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> LEMON_BUTTON = FOODBLOCK.register("lemon_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> LIME_BUTTON = FOODBLOCK.register("lime_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> TOMATO_BUTTON = FOODBLOCK.register("tomato_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> PECAN_BUTTON = FOODBLOCK.register("pecan_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> ALMOND_BUTTON = FOODBLOCK.register("almond_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> BLACKCHERRY_FENCE = FOODBLOCK.register("blackcherry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> LEMON_FENCE = FOODBLOCK.register("lemon_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> LIME_FENCE = FOODBLOCK.register("lime_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> TOMATO_FENCE = FOODBLOCK.register("tomato_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> ALMOND_FENCE = FOODBLOCK.register("almond_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> BLACKCHERRY_GATE = FOODBLOCK.register("blackcherry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.BLACKCHERRYWOODMAT, 
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> LEMON_GATE = FOODBLOCK.register("lemon_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.LEMONWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> LIME_GATE = FOODBLOCK.register("lime_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.LIMEWOODMAT, 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> TOMATO_GATE = FOODBLOCK.register("tomato_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.TOMATOWOODMAT, 
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> ALMOND_GATE = FOODBLOCK.register("almond_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.ALMONDWOODMAT, 
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> BLACKCHERRY_PRESSURE_PLATE = FOODBLOCK.register("blackcherry_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> LEMON_PRESSURE_PLATE = FOODBLOCK.register("lemon_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> LIME_PRESSURE_PLATE = FOODBLOCK.register("lime_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> TOMATO_PRESSURE_PLATE = FOODBLOCK.register("tomato_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> ALMOND_PRESSURE_PLATE = FOODBLOCK.register("almond_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, blackcherrySign> BLACKCHERRY_SIGN = FOODBLOCK.register("blackcherry_sign",
   () -> new blackcherrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.BLACKCHERRYWOODMAT
   ));
      public static final DeferredHolder<Block, blackcherryWallSign> BLACKCHERRY_WALL_SIGN = FOODBLOCK.register("blackcherry_wall_sign",
   () -> new blackcherryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BLACKCHERRYWOODMAT
   ));
   public static final DeferredHolder<Block, blackcherrySign> BLACKCHERRY_STANDING_SIGN = FOODBLOCK.register("blackcherry_standing_sign",
   () -> new blackcherrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BLACKCHERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<blackcherrySignEntity>> BLACKCHERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "blackcherry_sign_entity",
     () -> BlockEntityType.Builder.of(
         blackcherrySignEntity::new,
         foodblockcompatregistry.BLACKCHERRY_SIGN.get(),
         foodblockcompatregistry.BLACKCHERRY_WALL_SIGN.get(),
         foodblockcompatregistry.BLACKCHERRY_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, lemonSign> LEMON_SIGN = FOODBLOCK.register("lemon_sign",
   () -> new lemonSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.LEMONWOODMAT
   ));
      public static final DeferredHolder<Block, lemonWallSign> LEMON_WALL_SIGN = FOODBLOCK.register("lemon_wall_sign",
   () -> new lemonWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.LEMONWOODMAT
   ));
   public static final DeferredHolder<Block, lemonSign> LEMON_STANDING_SIGN = FOODBLOCK.register("lemon_standing_sign",
   () -> new lemonSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.LEMONWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<lemonSignEntity>> LEMON_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "lemon_sign_entity",
     () -> BlockEntityType.Builder.of(
         lemonSignEntity::new,
         foodblockcompatregistry.LEMON_SIGN.get(),
         foodblockcompatregistry.LEMON_WALL_SIGN.get(),
         foodblockcompatregistry.LEMON_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, limeSign> LIME_SIGN = FOODBLOCK.register("lime_sign",
   () -> new limeSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.LIMEWOODMAT
   ));
      public static final DeferredHolder<Block, limeWallSign> LIME_WALL_SIGN = FOODBLOCK.register("lime_wall_sign",
   () -> new limeWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.LIMEWOODMAT
   ));
   public static final DeferredHolder<Block, limeSign> LIME_STANDING_SIGN = FOODBLOCK.register("lime_standing_sign",
   () -> new limeSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.LIMEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<limeSignEntity>> LIME_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "lime_sign_entity",
     () -> BlockEntityType.Builder.of(
         limeSignEntity::new,
         foodblockcompatregistry.LIME_SIGN.get(),
         foodblockcompatregistry.LIME_WALL_SIGN.get(),
         foodblockcompatregistry.LIME_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, tomatoSign> TOMATO_SIGN = FOODBLOCK.register("tomato_sign",
   () -> new tomatoSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.TOMATOWOODMAT
   ));
      public static final DeferredHolder<Block, tomatoWallSign> TOMATO_WALL_SIGN = FOODBLOCK.register("tomato_wall_sign",
   () -> new tomatoWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.TOMATOWOODMAT
   ));
   public static final DeferredHolder<Block, tomatoSign> TOMATO_STANDING_SIGN = FOODBLOCK.register("tomato_standing_sign",
   () -> new tomatoSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.TOMATOWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<tomatoSignEntity>> TOMATO_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "tomato_sign_entity",
     () -> BlockEntityType.Builder.of(
         tomatoSignEntity::new,
         foodblockcompatregistry.TOMATO_SIGN.get(),
         foodblockcompatregistry.TOMATO_WALL_SIGN.get(),
         foodblockcompatregistry.TOMATO_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, almondSign> ALMOND_SIGN = FOODBLOCK.register("almond_sign",
   () -> new almondSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.ALMONDWOODMAT
   ));
      public static final DeferredHolder<Block, almondWallSign> ALMOND_WALL_SIGN = FOODBLOCK.register("almond_wall_sign",
   () -> new almondWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ALMONDWOODMAT
   ));
   public static final DeferredHolder<Block, almondSign> ALMOND_STANDING_SIGN = FOODBLOCK.register("almond_standing_sign",
   () -> new almondSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.ALMONDWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<almondSignEntity>> ALMOND_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "almond_sign_entity",
     () -> BlockEntityType.Builder.of(
         almondSignEntity::new,
         foodblockcompatregistry.ALMOND_SIGN.get(),
         foodblockcompatregistry.ALMOND_WALL_SIGN.get(),
         foodblockcompatregistry.ALMOND_STANDING_SIGN.get()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> JUNIPER_TRAPDOOR = FOODBLOCK.register("juniper_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> CHERRY_TRAPDOOR = FOODBLOCK.register("cherry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> BLACKCHERRY_TRAPDOOR = FOODBLOCK.register("blackcherry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> COCONUT_TRAPDOOR = FOODBLOCK.register("coconut_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ORANGE_TRAPDOOR = FOODBLOCK.register("orange_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> LEMON_TRAPDOOR = FOODBLOCK.register("lemon_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> LIME_TRAPDOOR = FOODBLOCK.register("lime_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> TOMATO_TRAPDOOR = FOODBLOCK.register("tomato_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ALMOND_TRAPDOOR = FOODBLOCK.register("almond_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> JUNIPER_LAMP = FOODBLOCK.register("juniper_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> CHERRY_LAMP = FOODBLOCK.register("cherry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> BLACKCHERRY_LAMP = FOODBLOCK.register("blackcherry_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> COCONUT_LAMP = FOODBLOCK.register("coconut_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ORANGE_LAMP = FOODBLOCK.register("orange_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> LEMON_LAMP = FOODBLOCK.register("lemon_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> LIME_LAMP = FOODBLOCK.register("lime_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> CORN_LAMP = FOODBLOCK.register("corn_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ONION_LAMP = FOODBLOCK.register("onion_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> TOMATO_LAMP = FOODBLOCK.register("tomato_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> PECAN_LAMP = FOODBLOCK.register("pecan_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> ALMOND_LAMP = FOODBLOCK.register("almond_lamp", () -> new Block(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> BLACKCHERRY_CARPET = FOODBLOCK.register("blackcherry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> LEMON_CARPET = FOODBLOCK.register("lemon_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> LIME_CARPET = FOODBLOCK.register("lime_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> TOMATO_CARPET = FOODBLOCK.register("tomato_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> ALMOND_CARPET = FOODBLOCK.register("almond_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> BLACKCHERRY_LANTERN = FOODBLOCK.register("blackcherry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BLACKCHERRY_SOUL_LANTERN = FOODBLOCK.register("blackcherry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> LEMON_LANTERN = FOODBLOCK.register("lemon_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> LEMON_SOUL_LANTERN = FOODBLOCK.register("lemon_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> LIME_LANTERN = FOODBLOCK.register("lime_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> LIME_SOUL_LANTERN = FOODBLOCK.register("lime_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> TOMATO_LANTERN = FOODBLOCK.register("tomato_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> TOMATO_SOUL_LANTERN = FOODBLOCK.register("tomato_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> ALMOND_LANTERN = FOODBLOCK.register("almond_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> ALMOND_SOUL_LANTERN = FOODBLOCK.register("almond_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> BLACKCHERRY_CHAIN = FOODBLOCK.register("blackcherry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> LEMON_CHAIN = FOODBLOCK.register("lemon_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> LIME_CHAIN = FOODBLOCK.register("lime_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> TOMATO_CHAIN = FOODBLOCK.register("tomato_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> ALMOND_CHAIN = FOODBLOCK.register("almond_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> JUNIPER_LADDER = FOODBLOCK.register("juniper_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> CHERRY_LADDER = FOODBLOCK.register("cherry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> BLACKCHERRY_LADDER = FOODBLOCK.register("blackcherry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> COCONUT_LADDER = FOODBLOCK.register("coconut_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ORANGE_LADDER = FOODBLOCK.register("orange_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> LEMON_LADDER = FOODBLOCK.register("lemon_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> LIME_LADDER = FOODBLOCK.register("lime_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> CORN_LADDER = FOODBLOCK.register("corn_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ONION_LADDER = FOODBLOCK.register("onion_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> TOMATO_LADDER = FOODBLOCK.register("tomato_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> PECAN_LADDER = FOODBLOCK.register("pecan_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> ALMOND_LADDER = FOODBLOCK.register("almond_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> JUNIPER_TABLE = FOODBLOCK.register("juniper_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CHERRY_TABLE = FOODBLOCK.register("cherry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BLACKCHERRY_TABLE = FOODBLOCK.register("blackcherry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> COCONUT_TABLE = FOODBLOCK.register("coconut_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ORANGE_TABLE = FOODBLOCK.register("orange_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> LEMON_TABLE = FOODBLOCK.register("lemon_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> LIME_TABLE = FOODBLOCK.register("lime_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CORN_TABLE = FOODBLOCK.register("corn_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ONION_TABLE = FOODBLOCK.register("onion_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> TOMATO_TABLE = FOODBLOCK.register("tomato_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PECAN_TABLE = FOODBLOCK.register("pecan_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> ALMOND_TABLE = FOODBLOCK.register("almond_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> BLACKCHERRY_TORCH = FOODBLOCK.register("blackcherry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BLACKCHERRY_WALL_TORCH = FOODBLOCK.register("blackcherry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BLACKCHERRY_REDSTONE_TORCH = FOODBLOCK.register("blackcherry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BLACKCHERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("blackcherry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BLACKCHERRY_SOUL_TORCH = FOODBLOCK.register("blackcherry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BLACKCHERRY_SOUL_WALL_TORCH = FOODBLOCK.register("blackcherry_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> LEMON_TORCH = FOODBLOCK.register("lemon_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> LEMON_WALL_TORCH = FOODBLOCK.register("lemon_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> LEMON_REDSTONE_TORCH = FOODBLOCK.register("lemon_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> LEMON_REDSTONE_WALL_TORCH = FOODBLOCK.register("lemon_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> LEMON_SOUL_TORCH = FOODBLOCK.register("lemon_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> LEMON_SOUL_WALL_TORCH = FOODBLOCK.register("lemon_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> LIME_TORCH = FOODBLOCK.register("lime_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> LIME_WALL_TORCH = FOODBLOCK.register("lime_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> LIME_REDSTONE_TORCH = FOODBLOCK.register("lime_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> LIME_REDSTONE_WALL_TORCH = FOODBLOCK.register("lime_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> LIME_SOUL_TORCH = FOODBLOCK.register("lime_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> LIME_SOUL_WALL_TORCH = FOODBLOCK.register("lime_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> TOMATO_TORCH = FOODBLOCK.register("tomato_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TOMATO_WALL_TORCH = FOODBLOCK.register("tomato_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> TOMATO_REDSTONE_TORCH = FOODBLOCK.register("tomato_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> TOMATO_REDSTONE_WALL_TORCH = FOODBLOCK.register("tomato_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> TOMATO_SOUL_TORCH = FOODBLOCK.register("tomato_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TOMATO_SOUL_WALL_TORCH = FOODBLOCK.register("tomato_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> PECAN_TORCH = FOODBLOCK.register("pecan_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PECAN_WALL_TORCH = FOODBLOCK.register("pecan_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> PECAN_REDSTONE_TORCH = FOODBLOCK.register("pecan_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> PECAN_REDSTONE_WALL_TORCH = FOODBLOCK.register("pecan_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> PECAN_SOUL_TORCH = FOODBLOCK.register("pecan_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PECAN_SOUL_WALL_TORCH = FOODBLOCK.register("pecan_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> ALMOND_TORCH = FOODBLOCK.register("almond_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ALMOND_WALL_TORCH = FOODBLOCK.register("almond_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> ALMOND_REDSTONE_TORCH = FOODBLOCK.register("almond_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> ALMOND_REDSTONE_WALL_TORCH = FOODBLOCK.register("almond_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> ALMOND_SOUL_TORCH = FOODBLOCK.register("almond_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> ALMOND_SOUL_WALL_TORCH = FOODBLOCK.register("almond_soul_wall_torch", 
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
 //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, blackcherryFurnace> BLACKCHERRY_FURNACE = FOODBLOCK.register("blackcherry_furnace", 
    () -> new blackcherryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<blackcherryFurnaceEntity>> BLACKCHERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("blackcherry_furnace", 
    () -> BlockEntityType.Builder.of(blackcherryFurnaceEntity::new, BLACKCHERRY_FURNACE.get()).build(null));
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
 //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, lemonFurnace> LEMON_FURNACE = FOODBLOCK.register("lemon_furnace", 
    () -> new lemonFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<lemonFurnaceEntity>> LEMON_FURNACE_ENTITY = FOODBLOCKENTITY.register("lemon_furnace", 
    () -> BlockEntityType.Builder.of(lemonFurnaceEntity::new, LEMON_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, limeFurnace> LIME_FURNACE = FOODBLOCK.register("lime_furnace", 
    () -> new limeFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<limeFurnaceEntity>> LIME_FURNACE_ENTITY = FOODBLOCKENTITY.register("lime_furnace", 
    () -> BlockEntityType.Builder.of(limeFurnaceEntity::new, LIME_FURNACE.get()).build(null));
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
 //----------------------------------------------------------------------------------------Tomato-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, tomatoFurnace> TOMATO_FURNACE = FOODBLOCK.register("tomato_furnace", 
    () -> new tomatoFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<tomatoFurnaceEntity>> TOMATO_FURNACE_ENTITY = FOODBLOCKENTITY.register("tomato_furnace", 
    () -> BlockEntityType.Builder.of(tomatoFurnaceEntity::new, TOMATO_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, pecanFurnace> PECAN_FURNACE = FOODBLOCK.register("pecan_furnace", 
    () -> new pecanFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<pecanFurnaceEntity>> PECAN_FURNACE_ENTITY = FOODBLOCKENTITY.register("pecan_furnace", 
    () -> BlockEntityType.Builder.of(pecanFurnaceEntity::new, PECAN_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, almondFurnace> ALMOND_FURNACE = FOODBLOCK.register("almond_furnace", 
    () -> new almondFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<almondFurnaceEntity>> ALMOND_FURNACE_ENTITY = FOODBLOCKENTITY.register("almond_furnace", 
    () -> BlockEntityType.Builder.of(almondFurnaceEntity::new, ALMOND_FURNACE.get()).build(null));
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> BLACKCHERRY_STONE_PATH = FOODBLOCK.register("blackcherry_stone_path", 
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> LEMON_STONE_PATH = FOODBLOCK.register("lemon_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> LIME_STONE_PATH = FOODBLOCK.register("lime_stone_path", 
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> PECAN_STONE_PATH = FOODBLOCK.register("pecan_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> ALMOND_STONE_PATH = FOODBLOCK.register("almond_stone_path", 
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> BLACKCHERRY_BARREL = FOODBLOCK.register("blackcherry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> LEMON_BARREL = FOODBLOCK.register("lemon_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> LIME_BARREL = FOODBLOCK.register("lime_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> PECAN_BARREL = FOODBLOCK.register("pecan_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> ALMOND_BARREL = FOODBLOCK.register("almond_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));

 //------entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<foodBarrelEntity>> FOOD_BARREL_ENTITY = FOODBLOCKENTITY.register("food_barrel_entity", 
     () -> BlockEntityType.Builder.of(foodBarrelEntity::new, foodblockcompatregistry.ELDERBERRY_BARREL.get(), foodblockcompatregistry.JUNIPER_BARREL.get(), foodblockcompatregistry.CHERRY_BARREL.get(), 
     foodblockcompatregistry.BLACKCHERRY_BARREL.get(),foodblockcompatregistry.COCONUT_BARREL.get(),foodblockcompatregistry.ORANGE_BARREL.get(),foodblockcompatregistry.LEMON_BARREL.get(),
     foodblockcompatregistry.LIME_BARREL.get(),foodblockcompatregistry.CORN_BARREL.get(),foodblockcompatregistry.ONION_BARREL.get(),foodblockcompatregistry.PECAN_BARREL.get(),
     foodblockcompatregistry.ALMOND_BARREL.get()).build(null));
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> BLACKCHERRY_CHAIR = FOODBLOCK.register("blackcherry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> LEMON_CHAIR = FOODBLOCK.register("lemon_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> LIME_CHAIR = FOODBLOCK.register("lime_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> PECAN_CHAIR = FOODBLOCK.register("pecan_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> ALMOND_CHAIR = FOODBLOCK.register("almond_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> BLACKCHERRY_BED = FOODBLOCK.register("blackcherry_bed", () -> new foodBed(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> LEMON_BED = FOODBLOCK.register("lemon_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> LIME_BED = FOODBLOCK.register("lime_bed", () -> new foodBed(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> PECAN_BED = FOODBLOCK.register("pecan_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> ALMOND_BED = FOODBLOCK.register("almond_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));

 //.........entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<bedEntity>> FOOD_BED_ENTITY = FOODBLOCKENTITY.register("food_bed_entity",
     () -> BlockEntityType.Builder.of(bedEntity::new, ELDERBERRY_BED.get(), JUNIPER_BED.get(), CHERRY_BED.get(), COCONUT_BED.get(), ORANGE_BED.get(), LEMON_BED.get(), LIME_BED.get(), 
     CORN_BED.get(), ONION_BED.get(), PECAN_BED.get(), ALMOND_BED.get()).build(null));
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
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_BLACKCHERRY_CABINET = FOODBLOCK.register("small_blackcherry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_BLACKCHERRY_CABINET = FOODBLOCK.register("medium_blackcherry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_LEMON_CABINET = FOODBLOCK.register("small_lemon_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_LEMON_CABINET = FOODBLOCK.register("medium_lemon_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_LIME_CABINET = FOODBLOCK.register("small_lime_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_LIME_CABINET = FOODBLOCK.register("medium_lime_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_PECAN_CABINET = FOODBLOCK.register("small_pecan_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_PECAN_CABINET = FOODBLOCK.register("medium_pecan_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_ALMOND_CABINET = FOODBLOCK.register("small_almond_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_ALMOND_CABINET = FOODBLOCK.register("medium_almond_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //-------------------------------------------------------------------------------------Entity---------------------------------------------------------------------------------------------
    //small
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<smallFoodContainerEntity>> SMALL_CABINET_ENTITY = FOODBLOCKENTITY.register("small_cabinet_entity",
     () -> BlockEntityType.Builder.of(smallFoodContainerEntity::new, SMALL_ELDERBERRY_CABINET.get(), SMALL_JUNIPER_CABINET.get(), SMALL_CHERRY_CABINET.get(), SMALL_BLACKCHERRY_CABINET.get(),
     SMALL_COCONUT_CABINET.get(), SMALL_ORANGE_CABINET.get(), SMALL_LEMON_CABINET.get(), SMALL_LIME_CABINET.get(), SMALL_CORN_CABINET.get(), SMALL_ONION_CABINET.get(), SMALL_PECAN_CABINET.get(), 
     SMALL_ALMOND_CABINET.get()).build(null));
    //medium
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mediumFoodContainerEntity>> MEDIUM_CABINET_ENTITY = FOODBLOCKENTITY.register("medium_cabinet_entity",
     () -> BlockEntityType.Builder.of(mediumFoodContainerEntity::new, MEDIUM_ELDERBERRY_CABINET.get(), MEDIUM_JUNIPER_CABINET.get(), MEDIUM_CHERRY_CABINET.get(), MEDIUM_BLACKCHERRY_CABINET.get(), 
     MEDIUM_COCONUT_CABINET.get(), MEDIUM_ORANGE_CABINET.get(), MEDIUM_LEMON_CABINET.get(), MEDIUM_LIME_CABINET.get(), MEDIUM_CORN_CABINET.get(), MEDIUM_ONION_CABINET.get(), MEDIUM_PECAN_CABINET.get(), 
     MEDIUM_ALMOND_CABINET.get()).build(null));

}
