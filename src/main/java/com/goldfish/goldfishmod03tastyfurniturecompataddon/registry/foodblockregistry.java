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
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.juniperSignEntity;

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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
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
//==============================================================================================================================================================================================
//                                                                                          Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> ELDERBERRY_DOOR = FOODBLOCK.register("elderberry_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> JUNIPER_DOOR = FOODBLOCK.register("juniper_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CHERRY_DOOR = FOODBLOCK.register("cherry_door", () -> new DoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> JUNIPER_GATE = FOODBLOCK.register("juniper_gate", 
    () -> new FenceGateBlock(
            foodmaterialtyperegistry.JUNIPERWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> CHERRY_GATE = FOODBLOCK.register("cherry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtyperegistry.CHERRYWOODMAT, 
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> JUNIPER_PRESSURE_PLATE = FOODBLOCK.register("juniper_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> CHERRY_PRESSURE_PLATE = FOODBLOCK.register("cherry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
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
         foodmaterialtyperegistry.ELDERBERRYWOODMAT
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
       foodmaterialtyperegistry.ELDERBERRYWOODMAT
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
       foodmaterialtyperegistry.ELDERBERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<elderberrySignEntity>> ELDERBERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "elderberry_sign_entity",
     () -> BlockEntityType.Builder.of(
         elderberrySignEntity::new,
         foodblockregistry.ELDERBERRY_SIGN.get(),
         foodblockregistry.ELDERBERRY_WALL_SIGN.get(),
         foodblockregistry.ELDERBERRY_STANDING_SIGN.get()
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
         foodmaterialtyperegistry.JUNIPERWOODMAT
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
       foodmaterialtyperegistry.JUNIPERWOODMAT
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
       foodmaterialtyperegistry.JUNIPERWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<juniperSignEntity>> JUNIPER_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "juniper_sign_entity",
     () -> BlockEntityType.Builder.of(
         juniperSignEntity::new,
         foodblockregistry.JUNIPER_SIGN.get(),
         foodblockregistry.JUNIPER_WALL_SIGN.get(),
         foodblockregistry.JUNIPER_STANDING_SIGN.get()
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
         foodmaterialtyperegistry.CHERRYWOODMAT
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
       foodmaterialtyperegistry.CHERRYWOODMAT
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
       foodmaterialtyperegistry.CHERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cherrySignEntity>> CHERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "cherry_sign_entity",
     () -> BlockEntityType.Builder.of(
         cherrySignEntity::new,
         foodblockregistry.CHERRY_SIGN.get(),
         foodblockregistry.CHERRY_WALL_SIGN.get(),
         foodblockregistry.CHERRY_STANDING_SIGN.get()
     ).build(null)
   );
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> ELDERBERRY_TRAPDOOR = FOODBLOCK.register("elderberry_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> JUNIPER_TRAPDOOR = FOODBLOCK.register("juniper_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> CHERRY_TRAPDOOR = FOODBLOCK.register("cherry_trapdoor", () -> new TrapDoorBlock(foodmaterialtyperegistry.PLANT, BlockBehaviour.Properties.of()
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
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, elderberryFurnace> ELDERBERRY_FURNACE = FOODBLOCK.register("elderberry_furnace", 
    () -> new elderberryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<elderberryFurnaceEntity>> ELDERBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("elderberry_furnace", 
    () -> BlockEntityType.Builder.of(elderberryFurnaceEntity::new, ELDERBERRY_FURNACE.get()).build(null));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, cherryFurnace> CHERRY_FURNACE = FOODBLOCK.register("cherry_furnace", 
    () -> new cherryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<cherryFurnaceEntity>> CHERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("cherry_furnace", 
    () -> BlockEntityType.Builder.of(cherryFurnaceEntity::new, CHERRY_FURNACE.get()).build(null));
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> CHERRY_STONE_PATH = FOODBLOCK.register("cherry_stone_path", 
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> CHERRY_BARREL = FOODBLOCK.register("cherry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));

 //------entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<foodBarrelEntity>> FOOD_BARREL_ENTITY = FOODBLOCKENTITY.register("food_barrel_entity", 
     () -> BlockEntityType.Builder.of(foodBarrelEntity::new, foodblockregistry.ELDERBERRY_BARREL.get(), foodblockregistry.CHERRY_BARREL.get()).build(null));
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> CHERRY_CHAIR = FOODBLOCK.register("cherry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBed> CHERRY_BED = FOODBLOCK.register("cherry_bed", () -> new foodBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));

   //.........entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<bedEntity>> FOOD_BED_ENTITY = FOODBLOCKENTITY.register("food_bed_entity",
     () -> BlockEntityType.Builder.of(bedEntity::new, ELDERBERRY_BED.get(), CHERRY_BED.get()).build(null));
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
 //----------------------------------------------------------------------------------------Entity-----------------------------------------------------------------------------------------------
    //small
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<smallFoodContainerEntity>> SMALL_CABINET_ENTITY = FOODBLOCKENTITY.register("small_cabinet_entity",
     () -> BlockEntityType.Builder.of(smallFoodContainerEntity::new, SMALL_ELDERBERRY_CABINET.get()).build(null));
    //medium
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mediumFoodContainerEntity>> MEDIUM_CABINET_ENTITY = FOODBLOCKENTITY.register("medium_cabinet_entity",
     () -> BlockEntityType.Builder.of(mediumFoodContainerEntity::new, MEDIUM_ELDERBERRY_CABINET.get(), MEDIUM_CHERRY_CABINET.get()).build(null));

}
