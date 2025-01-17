package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod02tastyfurniture.block.foodBarrel;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.compatBed;
   import com.goldfish.goldfishmod02tastyfurniture.block.foodChairBlock;
import com.goldfish.goldfishmod02tastyfurniture.block.foodlamp;
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
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackberryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackberrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackberryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherryFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherrySign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.blackcherryWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.buddhashandFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.buddhashandSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.buddhashandWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherryFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherrySign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cherryWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.citronFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.citronSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.citronWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.coconutWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.cornWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberrySign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.elderberryWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.fingerlimeFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.fingerlimeSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.fingerlimeWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.grapefruitFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.grapefruitSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.grapefruitWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.keylimeFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.keylimeSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.keylimeWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.kumquatFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.kumquatSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.kumquatWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.lemonWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.limeWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.mandarinFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.mandarinSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.mandarinWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.onionWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.orangeWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.peachFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.peachSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.peachWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pecanWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.persimmonFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.persimmonSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.persimmonWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pomeloFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pomeloSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.pomeloWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.raspberryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.raspberrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.raspberryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.satsumaFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.satsumaSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.satsumaWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.strawberryFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.strawberrySign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.strawberryWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.sugarappleFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.sugarappleSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.sugarappleWallSign;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tangerineFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tangerineSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tangerineWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoFurnace;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.tomatoWallSign;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.almondFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.almondSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackberryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackcherryFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.blackcherrySignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.buddhashandFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.buddhashandSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherryFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cherrySignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.citronFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.citronSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.coconutFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.coconutSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.compatBedEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cornFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cornSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberryFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.elderberrySignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.fingerlimeFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.fingerlimeSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.grapefruitFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.grapefruitSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.juniperFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.juniperSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.keylimeFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.keylimeSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.kumquatFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.kumquatSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.lemonFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.lemonSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.limeFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.limeSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.mandarinFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.mandarinSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.onionSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.orangeSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.peachFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.peachSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pecanFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pecanSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.persimmonFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.persimmonSignEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pomeloFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.pomeloSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.raspberryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.raspberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.satsumaFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.satsumaSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.strawberryFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.strawberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.sugarappleFurnaceEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.sugarappleSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.tangerineFurnaceEntity;
   import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.tangerineSignEntity;
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> BLACKBERRY_BLOCK = FOODBLOCK.register("blackberry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> BLACKBERRY_BRICKS_BLOCK = FOODBLOCK.register("blackberry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> BLACKBERRY_CHISELED_BLOCK = FOODBLOCK.register("blackberry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> BLACKBERRY_TILES_BLOCK = FOODBLOCK.register("blackberry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> RASPBERRY_BLOCK = FOODBLOCK.register("raspberry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> RASPBERRY_BRICKS_BLOCK = FOODBLOCK.register("raspberry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> RASPBERRY_CHISELED_BLOCK = FOODBLOCK.register("raspberry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> RASPBERRY_TILES_BLOCK = FOODBLOCK.register("raspberry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> STRAWBERRY_BLOCK = FOODBLOCK.register("strawberry_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> STRAWBERRY_BRICKS_BLOCK = FOODBLOCK.register("strawberry_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> STRAWBERRY_CHISELED_BLOCK = FOODBLOCK.register("strawberry_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> STRAWBERRY_TILES_BLOCK = FOODBLOCK.register("strawberry_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> SUGARAPPLE_BLOCK = FOODBLOCK.register("sugarapple_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> SUGARAPPLE_BRICKS_BLOCK = FOODBLOCK.register("sugarapple_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> SUGARAPPLE_CHISELED_BLOCK = FOODBLOCK.register("sugarapple_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> SUGARAPPLE_TILES_BLOCK = FOODBLOCK.register("sugarapple_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach--------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> PEACH_BLOCK = FOODBLOCK.register("peach_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> PEACH_BRICKS_BLOCK = FOODBLOCK.register("peach_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> PEACH_CHISELED_BLOCK = FOODBLOCK.register("peach_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> PEACH_TILES_BLOCK = FOODBLOCK.register("peach_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> TANGERINE_BLOCK = FOODBLOCK.register("tangerine_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> TANGERINE_BRICKS_BLOCK = FOODBLOCK.register("tangerine_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> TANGERINE_CHISELED_BLOCK = FOODBLOCK.register("tangerine_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> TANGERINE_TILES_BLOCK = FOODBLOCK.register("tangerine_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> KUMQUAT_BLOCK = FOODBLOCK.register("kumquat_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> KUMQUAT_BRICKS_BLOCK = FOODBLOCK.register("kumquat_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> KUMQUAT_CHISELED_BLOCK = FOODBLOCK.register("kumquat_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> KUMQUAT_TILES_BLOCK = FOODBLOCK.register("kumquat_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> PERSIMMON_BLOCK = FOODBLOCK.register("persimmon_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> PERSIMMON_BRICKS_BLOCK = FOODBLOCK.register("persimmon_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> PERSIMMON_CHISELED_BLOCK = FOODBLOCK.register("persimmon_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> PERSIMMON_TILES_BLOCK = FOODBLOCK.register("persimmon_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> SATSUMA_BLOCK = FOODBLOCK.register("satsuma_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> SATSUMA_BRICKS_BLOCK = FOODBLOCK.register("satsuma_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> SATSUMA_CHISELED_BLOCK = FOODBLOCK.register("satsuma_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> SATSUMA_TILES_BLOCK = FOODBLOCK.register("satsuma_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> MANDARIN_BLOCK = FOODBLOCK.register("mandarin_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> MANDARIN_BRICKS_BLOCK = FOODBLOCK.register("mandarin_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> MANDARIN_CHISELED_BLOCK = FOODBLOCK.register("mandarin_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> MANDARIN_TILES_BLOCK = FOODBLOCK.register("mandarin_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //-----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> CITRON_BLOCK = FOODBLOCK.register("citron_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> CITRON_BRICKS_BLOCK = FOODBLOCK.register("citron_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> CITRON_CHISELED_BLOCK = FOODBLOCK.register("citron_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> CITRON_TILES_BLOCK = FOODBLOCK.register("citron_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //-----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> BUDDHASHAND_BLOCK = FOODBLOCK.register("buddhashand_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> BUDDHASHAND_BRICKS_BLOCK = FOODBLOCK.register("buddhashand_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> BUDDHASHAND_CHISELED_BLOCK = FOODBLOCK.register("buddhashand_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> BUDDHASHAND_TILES_BLOCK = FOODBLOCK.register("buddhashand_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> KEYLIME_BLOCK = FOODBLOCK.register("keylime_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> KEYLIME_BRICKS_BLOCK = FOODBLOCK.register("keylime_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> KEYLIME_CHISELED_BLOCK = FOODBLOCK.register("keylime_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> KEYLIME_TILES_BLOCK = FOODBLOCK.register("keylime_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //---------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> FINGERLIME_BLOCK = FOODBLOCK.register("fingerlime_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> FINGERLIME_BRICKS_BLOCK = FOODBLOCK.register("fingerlime_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> FINGERLIME_CHISELED_BLOCK = FOODBLOCK.register("fingerlime_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> FINGERLIME_TILES_BLOCK = FOODBLOCK.register("fingerlime_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> GRAPEFRUIT_BLOCK = FOODBLOCK.register("grapefruit_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> GRAPEFRUIT_BRICKS_BLOCK = FOODBLOCK.register("grapefruit_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> GRAPEFRUIT_CHISELED_BLOCK = FOODBLOCK.register("grapefruit_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> GRAPEFRUIT_TILES_BLOCK = FOODBLOCK.register("grapefruit_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
    public static final DeferredHolder<Block, Block> POMELO_BLOCK = FOODBLOCK.register("pomelo_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........bricks
    public static final DeferredHolder<Block, Block> POMELO_BRICKS_BLOCK = FOODBLOCK.register("pomelo_bricks_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........chiseled
    public static final DeferredHolder<Block, Block> POMELO_CHISELED_BLOCK = FOODBLOCK.register("pomelo_chiseled_block", () -> new Block(BlockBehaviour.Properties.of()
         .destroyTime(2.0f)
         .explosionResistance(10.0f)
         .sound(SoundType.MUD_BRICKS)
         ));
  //.........tiles
    public static final DeferredHolder<Block, Block> POMELO_TILES_BLOCK = FOODBLOCK.register("pomelo_tiles_block", () -> new Block(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
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
 //---------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> BLACKBERRY_SLAB = FOODBLOCK.register("blackberry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> BLACKBERRY_BRICKS_SLAB = FOODBLOCK.register("blackberry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> RASPBERRY_SLAB = FOODBLOCK.register("raspberry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> RASPBERRY_BRICKS_SLAB = FOODBLOCK.register("raspberry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> STRAWBERRY_SLAB = FOODBLOCK.register("strawberry_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> STRAWBERRY_BRICKS_SLAB = FOODBLOCK.register("strawberry_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> SUGARAPPLE_SLAB = FOODBLOCK.register("sugarapple_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> SUGARAPPLE_BRICKS_SLAB = FOODBLOCK.register("sugarapple_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> PEACH_SLAB = FOODBLOCK.register("peach_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> PEACH_BRICKS_SLAB = FOODBLOCK.register("peach_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> TANGERINE_SLAB = FOODBLOCK.register("tangerine_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> TANGERINE_BRICKS_SLAB = FOODBLOCK.register("tangerine_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> KUMQUAT_SLAB = FOODBLOCK.register("kumquat_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> KUMQUAT_BRICKS_SLAB = FOODBLOCK.register("kumquat_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> PERSIMMON_SLAB = FOODBLOCK.register("persimmon_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> PERSIMMON_BRICKS_SLAB = FOODBLOCK.register("persimmon_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> SATSUMA_SLAB = FOODBLOCK.register("satsuma_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> SATSUMA_BRICKS_SLAB = FOODBLOCK.register("satsuma_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> MANDARIN_SLAB = FOODBLOCK.register("mandarin_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> MANDARIN_BRICKS_SLAB = FOODBLOCK.register("mandarin_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> CITRON_SLAB = FOODBLOCK.register("citron_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> CITRON_BRICKS_SLAB = FOODBLOCK.register("citron_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> BUDDHASHAND_SLAB = FOODBLOCK.register("buddhashand_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> BUDDHASHAND_BRICKS_SLAB = FOODBLOCK.register("buddhashand_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> KEYLIME_SLAB = FOODBLOCK.register("keylime_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> KEYLIME_BRICKS_SLAB = FOODBLOCK.register("keylime_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> FINGERLIME_SLAB = FOODBLOCK.register("fingerlime_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> FINGERLIME_BRICKS_SLAB = FOODBLOCK.register("fingerlime_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> GRAPEFRUIT_SLAB = FOODBLOCK.register("grapefruit_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> GRAPEFRUIT_BRICKS_SLAB = FOODBLOCK.register("grapefruit_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, SlabBlock> POMELO_SLAB = FOODBLOCK.register("pomelo_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
  //.........bricks
     public static final DeferredHolder<Block, SlabBlock> POMELO_BRICKS_SLAB = FOODBLOCK.register("pomelo_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
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
 //---------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> BLACKBERRY_STAIRS = FOODBLOCK.register("blackberry_stairs", 
     () -> new StairBlock(BLACKBERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> BLACKBERRY_BRICKS_STAIRS = FOODBLOCK.register("blackberry_bricks_stairs", 
     () -> new StairBlock(BLACKBERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> RASPBERRY_STAIRS = FOODBLOCK.register("raspberry_stairs", 
     () -> new StairBlock(RASPBERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> RASPBERRY_BRICKS_STAIRS = FOODBLOCK.register("raspberry_bricks_stairs", 
     () -> new StairBlock(RASPBERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> STRAWBERRY_STAIRS = FOODBLOCK.register("strawberry_stairs", 
     () -> new StairBlock(STRAWBERRY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> STRAWBERRY_BRICKS_STAIRS = FOODBLOCK.register("strawberry_bricks_stairs", 
     () -> new StairBlock(STRAWBERRY_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> SUGARAPPLE_STAIRS = FOODBLOCK.register("sugarapple_stairs", 
     () -> new StairBlock(SUGARAPPLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> SUGARAPPLE_BRICKS_STAIRS = FOODBLOCK.register("sugarapple_bricks_stairs", 
     () -> new StairBlock(SUGARAPPLE_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach--------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> PEACH_STAIRS = FOODBLOCK.register("peach_stairs", 
     () -> new StairBlock(PEACH_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> PEACH_BRICKS_STAIRS = FOODBLOCK.register("peach_bricks_stairs", 
     () -> new StairBlock(PEACH_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> TANGERINE_STAIRS = FOODBLOCK.register("tangerine_stairs", 
     () -> new StairBlock(TANGERINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> TANGERINE_BRICKS_STAIRS = FOODBLOCK.register("tangerine_bricks_stairs", 
     () -> new StairBlock(TANGERINE_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> KUMQUAT_STAIRS = FOODBLOCK.register("kumquat_stairs", 
     () -> new StairBlock(KUMQUAT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> KUMQUAT_BRICKS_STAIRS = FOODBLOCK.register("kumquat_bricks_stairs", 
     () -> new StairBlock(KUMQUAT_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> PERSIMMON_STAIRS = FOODBLOCK.register("persimmon_stairs", 
     () -> new StairBlock(PERSIMMON_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> PERSIMMON_BRICKS_STAIRS = FOODBLOCK.register("persimmon_bricks_stairs", 
     () -> new StairBlock(PERSIMMON_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> SATSUMA_STAIRS = FOODBLOCK.register("satsuma_stairs", 
     () -> new StairBlock(SATSUMA_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> SATSUMA_BRICKS_STAIRS = FOODBLOCK.register("satsuma_bricks_stairs", 
     () -> new StairBlock(SATSUMA_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> MANDARIN_STAIRS = FOODBLOCK.register("mandarin_stairs", 
     () -> new StairBlock(MANDARIN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> MANDARIN_BRICKS_STAIRS = FOODBLOCK.register("mandarin_bricks_stairs", 
     () -> new StairBlock(MANDARIN_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> CITRON_STAIRS = FOODBLOCK.register("citron_stairs", 
     () -> new StairBlock(CITRON_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> CITRON_BRICKS_STAIRS = FOODBLOCK.register("citron_bricks_stairs", 
     () -> new StairBlock(CITRON_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> BUDDHASHAND_STAIRS = FOODBLOCK.register("buddhashand_stairs", 
     () -> new StairBlock(BUDDHASHAND_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> BUDDHASHAND_BRICKS_STAIRS = FOODBLOCK.register("buddhashand_bricks_stairs", 
     () -> new StairBlock(BUDDHASHAND_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> KEYLIME_STAIRS = FOODBLOCK.register("keylime_stairs", 
     () -> new StairBlock(KEYLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> KEYLIME_BRICKS_STAIRS = FOODBLOCK.register("keylime_bricks_stairs", 
     () -> new StairBlock(KEYLIME_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //---------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> FINGERLIME_STAIRS = FOODBLOCK.register("fingerlime_stairs", 
     () -> new StairBlock(FINGERLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> FINGERLIME_BRICKS_STAIRS = FOODBLOCK.register("fingerlime_bricks_stairs", 
     () -> new StairBlock(FINGERLIME_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> GRAPEFRUIT_STAIRS = FOODBLOCK.register("grapefruit_stairs", 
     () -> new StairBlock(GRAPEFRUIT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> GRAPEFRUIT_BRICKS_STAIRS = FOODBLOCK.register("grapefruit_bricks_stairs", 
     () -> new StairBlock(GRAPEFRUIT_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Block, StairBlock> POMELO_STAIRS = FOODBLOCK.register("pomelo_stairs", 
     () -> new StairBlock(POMELO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     )); 
  //.........bricks
     public static final DeferredHolder<Block, StairBlock> POMELO_BRICKS_STAIRS = FOODBLOCK.register("pomelo_bricks_stairs", 
     () -> new StairBlock(POMELO_BRICKS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> BLACKBERRY_BARS = FOODBLOCK.register("blackberry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> RASPBERRY_BARS = FOODBLOCK.register("raspberry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> STRAWBERRY_BARS = FOODBLOCK.register("strawberry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> SUGARAPPLE_BARS = FOODBLOCK.register("sugarapple_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CHERRY_BARS = FOODBLOCK.register("cherry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> BLACKCHERRY_BARS = FOODBLOCK.register("blackcherry_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> PEACH_BARS = FOODBLOCK.register("peach_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> TANGERINE_BARS = FOODBLOCK.register("tangerine_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> KUMQUAT_BARS = FOODBLOCK.register("kumquat_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> PERSIMMON_BARS = FOODBLOCK.register("persimmon_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> SATSUMA_BARS = FOODBLOCK.register("satsuma_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> MANDARIN_BARS = FOODBLOCK.register("mandarin_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> LEMON_BARS = FOODBLOCK.register("lemon_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> CITRON_BARS = FOODBLOCK.register("citron_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> BUDDHASHAND_BARS = FOODBLOCK.register("buddhashand_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Lime-------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> LIME_BARS = FOODBLOCK.register("lime_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Keylime------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> KEYLIME_BARS = FOODBLOCK.register("keylime_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //--------------------------------------------------------------------------------------Fingerlime------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> FINGERLIME_BARS = FOODBLOCK.register("fingerlime_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //-------------------------------------------------------------------------------------Grapefruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> GRAPEFRUIT_BARS = FOODBLOCK.register("grapefruit_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //-------------------------------------------------------------------------------------Pomelo----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> POMELO_BARS = FOODBLOCK.register("pomelo_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Tomato------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> TOMATO_BARS = FOODBLOCK.register("tomato_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, IronBarsBlock> PECAN_BARS = FOODBLOCK.register("pecan_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of()
   .strength(0.25F, 0.25F)
   .sound(SoundType.MUD_BRICKS)
   .noOcclusion()));
 //---------------------------------------------------------------------------------------Almond------------------------------------------------------------------------------------------------
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> BLACKBERRY_DOOR = FOODBLOCK.register("blackberry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> RASPBERRY_DOOR = FOODBLOCK.register("raspberry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> STRAWBERRY_DOOR = FOODBLOCK.register("strawberry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> SUGARAPPLE_DOOR = FOODBLOCK.register("sugarapple_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CHERRY_DOOR = FOODBLOCK.register("cherry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> BLACKCHERRY_DOOR = FOODBLOCK.register("blackcherry_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> PEACH_DOOR = FOODBLOCK.register("peach_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> TANGERINE_DOOR = FOODBLOCK.register("tangerine_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> KUMQUAT_DOOR = FOODBLOCK.register("kumquat_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> PERSIMMON_DOOR = FOODBLOCK.register("persimmon_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> SATSUMA_DOOR = FOODBLOCK.register("satsuma_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> MANDARIN_DOOR = FOODBLOCK.register("mandarin_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> LEMON_DOOR = FOODBLOCK.register("lemon_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> CITRON_DOOR = FOODBLOCK.register("citron_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> BUDDHASHAND_DOOR = FOODBLOCK.register("buddhashand_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Lime-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> LIME_DOOR = FOODBLOCK.register("lime_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Keylime-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> KEYLIME_DOOR = FOODBLOCK.register("keylime_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Fingerlime-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> FINGERLIME_DOOR = FOODBLOCK.register("fingerlime_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Grapefruit-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> GRAPEFRUIT_DOOR = FOODBLOCK.register("grapefruit_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
  .strength(0.25F, 0.25F)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()));
 //----------------------------------------------------------------------------------------Pomelo-------------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, DoorBlock> POMELO_DOOR = FOODBLOCK.register("pomelo_door", () -> new DoorBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> BLACKBERRY_BUTTON = FOODBLOCK.register("blackberry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> RASPBERRY_BUTTON = FOODBLOCK.register("raspberry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> STRAWBERRY_BUTTON = FOODBLOCK.register("strawberry_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> SUGARAPPLE_BUTTON = FOODBLOCK.register("sugarapple_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> PEACH_BUTTON = FOODBLOCK.register("peach_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> TANGERINE_BUTTON = FOODBLOCK.register("tangerine_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> KUMQUAT_BUTTON = FOODBLOCK.register("kumquat_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> PERSIMMON_BUTTON = FOODBLOCK.register("persimmon_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> SATSUMA_BUTTON = FOODBLOCK.register("satsuma_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> MANDARIN_BUTTON = FOODBLOCK.register("mandarin_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> LEMON_BUTTON = FOODBLOCK.register("lemon_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> CITRON_BUTTON = FOODBLOCK.register("citron_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> BUDDHASHAND_BUTTON = FOODBLOCK.register("buddhashand_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> LIME_BUTTON = FOODBLOCK.register("lime_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> KEYLIME_BUTTON = FOODBLOCK.register("keylime_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> FINGERLIME_BUTTON = FOODBLOCK.register("fingerlime_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> GRAPEFRUIT_BUTTON = FOODBLOCK.register("grapefruit_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
  BlockBehaviour.Properties.of()
  .sound(SoundType.MUD_BRICKS)));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, ButtonBlock> POMELO_BUTTON = FOODBLOCK.register("pomelo_button", () -> new ButtonBlock(BlockSetType.CRIMSON, 20, 
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> BLACKBERRY_FENCE = FOODBLOCK.register("blackberry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> RASPBERRY_FENCE = FOODBLOCK.register("raspberry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> STRAWBERRY_FENCE = FOODBLOCK.register("strawberry_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> SUGARAPPLE_FENCE = FOODBLOCK.register("sugarapple_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> PEACH_FENCE = FOODBLOCK.register("peach_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> TANGERINE_FENCE = FOODBLOCK.register("tangerine_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> KUMQUAT_FENCE = FOODBLOCK.register("kumquat_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> PERSIMMON_FENCE = FOODBLOCK.register("persimmon_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> SATSUMA_FENCE = FOODBLOCK.register("satsuma_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> MANDARIN_FENCE = FOODBLOCK.register("mandarin_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> CITRON_FENCE = FOODBLOCK.register("citron_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> BUDDHASHAND_FENCE = FOODBLOCK.register("buddhashand_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> KEYLIME_FENCE = FOODBLOCK.register("keylime_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> FINGERLIME_FENCE = FOODBLOCK.register("fingerlime_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> GRAPEFRUIT_FENCE = FOODBLOCK.register("grapefruit_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
  .destroyTime(1.75f)
  .explosionResistance(9.0f)
  .sound(SoundType.MUD_BRICKS)
  .noOcclusion()
  ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  public static final DeferredHolder<Block, FenceBlock> POMELO_FENCE = FOODBLOCK.register("pomelo_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> BLACKBERRY_GATE = FOODBLOCK.register("blackberry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.BLACKBERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> RASPBERRY_GATE = FOODBLOCK.register("raspberry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.RASPBERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> STRAWBERRY_GATE = FOODBLOCK.register("strawberry_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.STRAWBERRYWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> SUGARAPPLE_GATE = FOODBLOCK.register("sugarapple_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.SUGARAPPLEWOODMAT, 
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> PEACH_GATE = FOODBLOCK.register("peach_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.PEACHWOODMAT, 
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> TANGERINE_GATE = FOODBLOCK.register("tangerine_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.TANGERINEWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> KUMQUAT_GATE = FOODBLOCK.register("kumquat_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.KUMQUATWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> PERSIMMON_GATE = FOODBLOCK.register("persimmon_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.PERSIMMONWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> SATSUMA_GATE = FOODBLOCK.register("satsuma_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.SATSUMAWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> MANDARIN_GATE = FOODBLOCK.register("mandarin_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.MANDARINWOODMAT, 
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> CITRON_GATE = FOODBLOCK.register("citron_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.CITRONWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> BUDDHASHAND_GATE = FOODBLOCK.register("buddhashand_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.BUDDHASHANDWOODMAT, 
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> KEYLIME_GATE = FOODBLOCK.register("keylime_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.KEYLIMEWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> FINGERLIME_GATE = FOODBLOCK.register("fingerlime_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.FINGERLIMEWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> GRAPEFRUIT_GATE = FOODBLOCK.register("grapefruit_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.GRAPEFRUITWOODMAT, 
            BlockBehaviour.Properties.of()
            .sound(SoundType.ROOTED_DIRT)
            .destroyTime(1.5f)
            .explosionResistance(8.0f)
    ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, FenceGateBlock> POMELO_GATE = FOODBLOCK.register("pomelo_gate", 
    () -> new FenceGateBlock(
            foodmaterialtypecompatregistry.POMELOWOODMAT, 
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> BLACKBERRY_PRESSURE_PLATE = FOODBLOCK.register("blackberry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> RASPBERRY_PRESSURE_PLATE = FOODBLOCK.register("raspberry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> STRAWBERRY_PRESSURE_PLATE = FOODBLOCK.register("strawberry_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> SUGARAPPLE_PRESSURE_PLATE = FOODBLOCK.register("sugarapple_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> PEACH_PRESSURE_PLATE = FOODBLOCK.register("peach_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> TANGERINE_PRESSURE_PLATE = FOODBLOCK.register("tangerine_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> KUMQUAT_PRESSURE_PLATE = FOODBLOCK.register("kumquat_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> PERSIMMON_PRESSURE_PLATE = FOODBLOCK.register("persimmon_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> SATSUMA_PRESSURE_PLATE = FOODBLOCK.register("satsuma_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> MANDARIN_PRESSURE_PLATE = FOODBLOCK.register("mandarin_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> CITRON_PRESSURE_PLATE = FOODBLOCK.register("citron_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> BUDDHASHAND_PRESSURE_PLATE = FOODBLOCK.register("buddhashand_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> KEYLIME_PRESSURE_PLATE = FOODBLOCK.register("keylime_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> FINGERLIME_PRESSURE_PLATE = FOODBLOCK.register("fingerlime_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> GRAPEFRUIT_PRESSURE_PLATE = FOODBLOCK.register("grapefruit_pressure_plate", 
    () -> new PressurePlateBlock(foodmaterialtypecompatregistry.PLANT, BlockBehaviour.Properties.of()
    .sound(SoundType.ROOTED_DIRT)
    .destroyTime(0.5f)
    .explosionResistance(4.0f)
    ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, PressurePlateBlock> POMELO_PRESSURE_PLATE = FOODBLOCK.register("pomelo_pressure_plate", 
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, blackberrySign> BLACKBERRY_SIGN = FOODBLOCK.register("blackberry_sign",
   () -> new blackberrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.BLACKBERRYWOODMAT
   ));
      public static final DeferredHolder<Block, blackberryWallSign> BLACKBERRY_WALL_SIGN = FOODBLOCK.register("blackberry_wall_sign",
   () -> new blackberryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BLACKBERRYWOODMAT
   ));
   public static final DeferredHolder<Block, blackberrySign> BLACKBERRY_STANDING_SIGN = FOODBLOCK.register("blackberry_standing_sign",
   () -> new blackberrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BLACKBERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<blackberrySignEntity>> BLACKBERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "blackberry_sign_entity",
     () -> BlockEntityType.Builder.of(
         blackberrySignEntity::new,
         foodblockcompatregistry.BLACKBERRY_SIGN.get(),
         foodblockcompatregistry.BLACKBERRY_WALL_SIGN.get(),
         foodblockcompatregistry.BLACKBERRY_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, raspberrySign> RASPBERRY_SIGN = FOODBLOCK.register("raspberry_sign",
   () -> new raspberrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.RASPBERRYWOODMAT
   ));
      public static final DeferredHolder<Block, raspberryWallSign> RASPBERRY_WALL_SIGN = FOODBLOCK.register("raspberry_wall_sign",
   () -> new raspberryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.RASPBERRYWOODMAT
   ));
   public static final DeferredHolder<Block, raspberrySign> RASPBERRY_STANDING_SIGN = FOODBLOCK.register("raspberry_standing_sign",
   () -> new raspberrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.RASPBERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<raspberrySignEntity>> RASPBERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "raspberry_sign_entity",
     () -> BlockEntityType.Builder.of(
         raspberrySignEntity::new,
         foodblockcompatregistry.RASPBERRY_SIGN.get(),
         foodblockcompatregistry.RASPBERRY_WALL_SIGN.get(),
         foodblockcompatregistry.RASPBERRY_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, strawberrySign> STRAWBERRY_SIGN = FOODBLOCK.register("strawberry_sign",
   () -> new strawberrySign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.STRAWBERRYWOODMAT
   ));
      public static final DeferredHolder<Block, strawberryWallSign> STRAWBERRY_WALL_SIGN = FOODBLOCK.register("strawberry_wall_sign",
   () -> new strawberryWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.STRAWBERRYWOODMAT
   ));
   public static final DeferredHolder<Block, strawberrySign> STRAWBERRY_STANDING_SIGN = FOODBLOCK.register("strawberry_standing_sign",
   () -> new strawberrySign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.STRAWBERRYWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<strawberrySignEntity>> STRAWBERRY_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "strawberry_sign_entity",
     () -> BlockEntityType.Builder.of(
         strawberrySignEntity::new,
         foodblockcompatregistry.STRAWBERRY_SIGN.get(),
         foodblockcompatregistry.STRAWBERRY_WALL_SIGN.get(),
         foodblockcompatregistry.STRAWBERRY_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, sugarappleSign> SUGARAPPLE_SIGN = FOODBLOCK.register("sugarapple_sign",
   () -> new sugarappleSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.SUGARAPPLEWOODMAT
   ));
      public static final DeferredHolder<Block, sugarappleWallSign> SUGARAPPLE_WALL_SIGN = FOODBLOCK.register("sugarapple_wall_sign",
   () -> new sugarappleWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.SUGARAPPLEWOODMAT
   ));
   public static final DeferredHolder<Block, sugarappleSign> SUGARAPPLE_STANDING_SIGN = FOODBLOCK.register("sugarapple_standing_sign",
   () -> new sugarappleSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.SUGARAPPLEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<sugarappleSignEntity>> SUGARAPPLE_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "sugarapple_sign_entity",
     () -> BlockEntityType.Builder.of(
         sugarappleSignEntity::new,
         foodblockcompatregistry.SUGARAPPLE_SIGN.get(),
         foodblockcompatregistry.SUGARAPPLE_WALL_SIGN.get(),
         foodblockcompatregistry.SUGARAPPLE_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, peachSign> PEACH_SIGN = FOODBLOCK.register("peach_sign",
   () -> new peachSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.PEACHWOODMAT
   ));
      public static final DeferredHolder<Block, peachWallSign> PEACH_WALL_SIGN = FOODBLOCK.register("peach_wall_sign",
   () -> new peachWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PEACHWOODMAT
   ));
   public static final DeferredHolder<Block, peachSign> PEACH_STANDING_SIGN = FOODBLOCK.register("peach_standing_sign",
   () -> new peachSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PEACHWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<peachSignEntity>> PEACH_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "peach_sign_entity",
     () -> BlockEntityType.Builder.of(
         peachSignEntity::new,
         foodblockcompatregistry.PEACH_SIGN.get(),
         foodblockcompatregistry.PEACH_WALL_SIGN.get(),
         foodblockcompatregistry.PEACH_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, tangerineSign> TANGERINE_SIGN = FOODBLOCK.register("tangerine_sign",
   () -> new tangerineSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.TANGERINEWOODMAT
   ));
      public static final DeferredHolder<Block, tangerineWallSign> TANGERINE_WALL_SIGN = FOODBLOCK.register("tangerine_wall_sign",
   () -> new tangerineWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.TANGERINEWOODMAT
   ));
   public static final DeferredHolder<Block, tangerineSign> TANGERINE_STANDING_SIGN = FOODBLOCK.register("tangerine_standing_sign",
   () -> new tangerineSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.TANGERINEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<tangerineSignEntity>> TANGERINE_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "tangerine_sign_entity",
     () -> BlockEntityType.Builder.of(
         tangerineSignEntity::new,
         foodblockcompatregistry.TANGERINE_SIGN.get(),
         foodblockcompatregistry.TANGERINE_WALL_SIGN.get(),
         foodblockcompatregistry.TANGERINE_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, kumquatSign> KUMQUAT_SIGN = FOODBLOCK.register("kumquat_sign",
   () -> new kumquatSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.KUMQUATWOODMAT
   ));
      public static final DeferredHolder<Block, kumquatWallSign> KUMQUAT_WALL_SIGN = FOODBLOCK.register("kumquat_wall_sign",
   () -> new kumquatWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.KUMQUATWOODMAT
   ));
   public static final DeferredHolder<Block, kumquatSign> KUMQUAT_STANDING_SIGN = FOODBLOCK.register("kumquat_standing_sign",
   () -> new kumquatSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.KUMQUATWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<kumquatSignEntity>> KUMQUAT_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "kumquat_sign_entity",
     () -> BlockEntityType.Builder.of(
         kumquatSignEntity::new,
         foodblockcompatregistry.KUMQUAT_SIGN.get(),
         foodblockcompatregistry.KUMQUAT_WALL_SIGN.get(),
         foodblockcompatregistry.KUMQUAT_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, persimmonSign> PERSIMMON_SIGN = FOODBLOCK.register("persimmon_sign",
   () -> new persimmonSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.PERSIMMONWOODMAT
   ));
      public static final DeferredHolder<Block, persimmonWallSign> PERSIMMON_WALL_SIGN = FOODBLOCK.register("persimmon_wall_sign",
   () -> new persimmonWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PERSIMMONWOODMAT
   ));
   public static final DeferredHolder<Block, persimmonSign> PERSIMMON_STANDING_SIGN = FOODBLOCK.register("persimmon_standing_sign",
   () -> new persimmonSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.PERSIMMONWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<persimmonSignEntity>> PERSIMMON_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "persimmon_sign_entity",
     () -> BlockEntityType.Builder.of(
         persimmonSignEntity::new,
         foodblockcompatregistry.PERSIMMON_SIGN.get(),
         foodblockcompatregistry.PERSIMMON_WALL_SIGN.get(),
         foodblockcompatregistry.PERSIMMON_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, satsumaSign> SATSUMA_SIGN = FOODBLOCK.register("satsuma_sign",
   () -> new satsumaSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.SATSUMAWOODMAT
   ));
      public static final DeferredHolder<Block, satsumaWallSign> SATSUMA_WALL_SIGN = FOODBLOCK.register("satsuma_wall_sign",
   () -> new satsumaWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.SATSUMAWOODMAT
   ));
   public static final DeferredHolder<Block, satsumaSign> SATSUMA_STANDING_SIGN = FOODBLOCK.register("satsuma_standing_sign",
   () -> new satsumaSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.SATSUMAWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<satsumaSignEntity>> SATSUMA_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "satsuma_sign_entity",
     () -> BlockEntityType.Builder.of(
         satsumaSignEntity::new,
         foodblockcompatregistry.SATSUMA_SIGN.get(),
         foodblockcompatregistry.SATSUMA_WALL_SIGN.get(),
         foodblockcompatregistry.SATSUMA_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, mandarinSign> MANDARIN_SIGN = FOODBLOCK.register("mandarin_sign",
   () -> new mandarinSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.MANDARINWOODMAT
   ));
      public static final DeferredHolder<Block, mandarinWallSign> MANDARIN_WALL_SIGN = FOODBLOCK.register("mandarin_wall_sign",
   () -> new mandarinWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.MANDARINWOODMAT
   ));
   public static final DeferredHolder<Block, mandarinSign> MANDARIN_STANDING_SIGN = FOODBLOCK.register("mandarin_standing_sign",
   () -> new mandarinSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.MANDARINWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mandarinSignEntity>> MANDARIN_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "mandarin_sign_entity",
     () -> BlockEntityType.Builder.of(
         mandarinSignEntity::new,
         foodblockcompatregistry.MANDARIN_SIGN.get(),
         foodblockcompatregistry.MANDARIN_WALL_SIGN.get(),
         foodblockcompatregistry.MANDARIN_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, citronSign> CITRON_SIGN = FOODBLOCK.register("citron_sign",
   () -> new citronSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.CITRONWOODMAT
   ));
      public static final DeferredHolder<Block, citronWallSign> CITRON_WALL_SIGN = FOODBLOCK.register("citron_wall_sign",
   () -> new citronWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CITRONWOODMAT
   ));
   public static final DeferredHolder<Block, citronSign> CITRON_STANDING_SIGN = FOODBLOCK.register("citron_standing_sign",
   () -> new citronSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.CITRONWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<citronSignEntity>> CITRON_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "citron_sign_entity",
     () -> BlockEntityType.Builder.of(
         citronSignEntity::new,
         foodblockcompatregistry.CITRON_SIGN.get(),
         foodblockcompatregistry.CITRON_WALL_SIGN.get(),
         foodblockcompatregistry.CITRON_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, buddhashandSign> BUDDHASHAND_SIGN = FOODBLOCK.register("buddhashand_sign",
   () -> new buddhashandSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.BUDDHASHANDWOODMAT
   ));
      public static final DeferredHolder<Block, buddhashandWallSign> BUDDHASHAND_WALL_SIGN = FOODBLOCK.register("buddhashand_wall_sign",
   () -> new buddhashandWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BUDDHASHANDWOODMAT
   ));
   public static final DeferredHolder<Block, buddhashandSign> BUDDHASHAND_STANDING_SIGN = FOODBLOCK.register("buddhashand_standing_sign",
   () -> new buddhashandSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.BUDDHASHANDWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<buddhashandSignEntity>> BUDDHASHAND_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "buddhashand_sign_entity",
     () -> BlockEntityType.Builder.of(
         buddhashandSignEntity::new,
         foodblockcompatregistry.BUDDHASHAND_SIGN.get(),
         foodblockcompatregistry.BUDDHASHAND_WALL_SIGN.get(),
         foodblockcompatregistry.BUDDHASHAND_STANDING_SIGN.get()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, keylimeSign> KEYLIME_SIGN = FOODBLOCK.register("keylime_sign",
   () -> new keylimeSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.KEYLIMEWOODMAT
   ));
      public static final DeferredHolder<Block, keylimeWallSign> KEYLIME_WALL_SIGN = FOODBLOCK.register("keylime_wall_sign",
   () -> new keylimeWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.KEYLIMEWOODMAT
   ));
   public static final DeferredHolder<Block, keylimeSign> KEYLIME_STANDING_SIGN = FOODBLOCK.register("keylime_standing_sign",
   () -> new keylimeSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.KEYLIMEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<keylimeSignEntity>> KEYLIME_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "keylime_sign_entity",
     () -> BlockEntityType.Builder.of(
         keylimeSignEntity::new,
         foodblockcompatregistry.KEYLIME_SIGN.get(),
         foodblockcompatregistry.KEYLIME_WALL_SIGN.get(),
         foodblockcompatregistry.KEYLIME_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, fingerlimeSign> FINGERLIME_SIGN = FOODBLOCK.register("fingerlime_sign",
   () -> new fingerlimeSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.FINGERLIMEWOODMAT
   ));
      public static final DeferredHolder<Block, fingerlimeWallSign> FINGERLIME_WALL_SIGN = FOODBLOCK.register("fingerlime_wall_sign",
   () -> new fingerlimeWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.FINGERLIMEWOODMAT
   ));
   public static final DeferredHolder<Block, fingerlimeSign> FINGERLIME_STANDING_SIGN = FOODBLOCK.register("fingerlime_standing_sign",
   () -> new fingerlimeSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.FINGERLIMEWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<fingerlimeSignEntity>> FINGERLIME_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "fingerlime_sign_entity",
     () -> BlockEntityType.Builder.of(
         fingerlimeSignEntity::new,
         foodblockcompatregistry.FINGERLIME_SIGN.get(),
         foodblockcompatregistry.FINGERLIME_WALL_SIGN.get(),
         foodblockcompatregistry.FINGERLIME_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, grapefruitSign> GRAPEFRUIT_SIGN = FOODBLOCK.register("grapefruit_sign",
   () -> new grapefruitSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.GRAPEFRUITWOODMAT
   ));
      public static final DeferredHolder<Block, grapefruitWallSign> GRAPEFRUIT_WALL_SIGN = FOODBLOCK.register("grapefruit_wall_sign",
   () -> new grapefruitWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.GRAPEFRUITWOODMAT
   ));
   public static final DeferredHolder<Block, grapefruitSign> GRAPEFRUIT_STANDING_SIGN = FOODBLOCK.register("grapefruit_standing_sign",
   () -> new grapefruitSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.GRAPEFRUITWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<grapefruitSignEntity>> GRAPEFRUIT_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "grapefruit_sign_entity",
     () -> BlockEntityType.Builder.of(
         grapefruitSignEntity::new,
         foodblockcompatregistry.GRAPEFRUIT_SIGN.get(),
         foodblockcompatregistry.GRAPEFRUIT_WALL_SIGN.get(),
         foodblockcompatregistry.GRAPEFRUIT_STANDING_SIGN.get()
     ).build(null)
   );
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Block, pomeloSign> POMELO_SIGN = FOODBLOCK.register("pomelo_sign",
   () -> new pomeloSign(
     BlockBehaviour.Properties.of()
         .mapColor(MapColor.WOOD)
         .forceSolidOn()
         .instrument(NoteBlockInstrument.BASS)
         .noCollission()
         .strength(1.0F)
         .ignitedByLava(),
         foodmaterialtypecompatregistry.POMELOWOODMAT
   ));
      public static final DeferredHolder<Block, pomeloWallSign> POMELO_WALL_SIGN = FOODBLOCK.register("pomelo_wall_sign",
   () -> new pomeloWallSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.POMELOWOODMAT
   ));
   public static final DeferredHolder<Block, pomeloSign> POMELO_STANDING_SIGN = FOODBLOCK.register("pomelo_standing_sign",
   () -> new pomeloSign(
       BlockBehaviour.Properties.of()
       .mapColor(MapColor.WOOD)
       .forceSolidOn()
       .instrument(NoteBlockInstrument.BASS)
       .noCollission()
       .strength(1.0F)
       .ignitedByLava()
       .randomTicks(),
       foodmaterialtypecompatregistry.POMELOWOODMAT
   ));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<pomeloSignEntity>> POMELO_SIGN_ENTITY = FOODBLOCKENTITY.register(
     "pomelo_sign_entity",
     () -> BlockEntityType.Builder.of(
         pomeloSignEntity::new,
         foodblockcompatregistry.POMELO_SIGN.get(),
         foodblockcompatregistry.POMELO_WALL_SIGN.get(),
         foodblockcompatregistry.POMELO_STANDING_SIGN.get()
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> BLACKBERRY_TRAPDOOR = FOODBLOCK.register("blackberry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> RASPBERRY_TRAPDOOR = FOODBLOCK.register("raspberry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> STRAWBERRY_TRAPDOOR = FOODBLOCK.register("strawberry_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> SUGARAPPLE_TRAPDOOR = FOODBLOCK.register("sugarapple_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> PEACH_TRAPDOOR = FOODBLOCK.register("peach_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> TANGERINE_TRAPDOOR = FOODBLOCK.register("tangerine_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> KUMQUAT_TRAPDOOR = FOODBLOCK.register("kumquat_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> PERSIMMON_TRAPDOOR = FOODBLOCK.register("persimmon_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> SATSUMA_TRAPDOOR = FOODBLOCK.register("satsuma_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> MANDARIN_TRAPDOOR = FOODBLOCK.register("mandarin_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> CITRON_TRAPDOOR = FOODBLOCK.register("citron_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> BUDDHASHAND_TRAPDOOR = FOODBLOCK.register("buddhashand_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> KEYLIME_TRAPDOOR = FOODBLOCK.register("keylime_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> FINGERLIME_TRAPDOOR = FOODBLOCK.register("fingerlime_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> GRAPEFRUIT_TRAPDOOR = FOODBLOCK.register("grapefruit_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
     BlockBehaviour.Properties.of()
     .destroyTime(1.75f)
     .explosionResistance(9.5f)
     .sound(SoundType.MUD_BRICKS)
     ));
 //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, TrapDoorBlock> POMELO_TRAPDOOR = FOODBLOCK.register("pomelo_trapdoor", () -> new TrapDoorBlock(foodmaterialtypecompatregistry.PLANT, 
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> BLACKBERRY_LAMP = FOODBLOCK.register("blackberry_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> RASPBERRY_LAMP = FOODBLOCK.register("raspberry_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> STRAWBERRY_LAMP = FOODBLOCK.register("strawberry_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> SUGARAPPLE_LAMP = FOODBLOCK.register("sugarapple_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, HorizontalDirectionalBlock> PEACH_LAMP = FOODBLOCK.register("peach_lamp", () -> new foodlamp(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> TANGERINE_LAMP = FOODBLOCK.register("tangerine_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> KUMQUAT_LAMP = FOODBLOCK.register("kumquat_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> PERSIMMON_LAMP = FOODBLOCK.register("persimmon_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> SATSUMA_LAMP = FOODBLOCK.register("satsuma_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> MANDARIN_LAMP = FOODBLOCK.register("mandarin_lamp", () -> new Block(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> CITRON_LAMP = FOODBLOCK.register("citron_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> BUDDHASHAND_LAMP = FOODBLOCK.register("buddhashand_lamp", () -> new Block(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Keylime------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> KEYLIME_LAMP = FOODBLOCK.register("keylime_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Fingerlime------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> FINGERLIME_LAMP = FOODBLOCK.register("fingerlime_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Grapefruit------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> GRAPEFRUIT_LAMP = FOODBLOCK.register("grapefruit_lamp", () -> new Block(BlockBehaviour.Properties.of()
     .destroyTime(1.5f)
     .explosionResistance(10.0f)
     .sound(SoundType.FROGLIGHT)
     .lightLevel(state -> 15)
     ));
 //----------------------------------------------------------------------------------------Pomelo------------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, Block> POMELO_LAMP = FOODBLOCK.register("pomelo_lamp", () -> new Block(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> BLACKBERRY_CARPET = FOODBLOCK.register("blackberry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> RASPBERRY_CARPET = FOODBLOCK.register("raspberry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> STRAWBERRY_CARPET = FOODBLOCK.register("strawberry_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> SUGARAPPLE_CARPET = FOODBLOCK.register("sugarapple_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> PEACH_CARPET = FOODBLOCK.register("peach_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> TANGERINE_CARPET = FOODBLOCK.register("tangerine_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> KUMQUAT_CARPET = FOODBLOCK.register("kumquat_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> PERSIMMON_CARPET = FOODBLOCK.register("persimmon_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> SATSUMA_CARPET = FOODBLOCK.register("satsuma_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> MANDARIN_CARPET = FOODBLOCK.register("mandarin_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> CITRON_CARPET = FOODBLOCK.register("citron_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> BUDDHASHAND_CARPET = FOODBLOCK.register("buddhashand_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> KEYLIME_CARPET = FOODBLOCK.register("keylime_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> FINGERLIME_CARPET = FOODBLOCK.register("fingerlime_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> GRAPEFRUIT_CARPET = FOODBLOCK.register("grapefruit_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.MOSS_CARPET)
      .friction(0.3f)
      .ignitedByLava()
      ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, CarpetBlock> POMELO_CARPET = FOODBLOCK.register("pomelo_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> BLACKBERRY_LANTERN = FOODBLOCK.register("blackberry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BLACKBERRY_SOUL_LANTERN = FOODBLOCK.register("blackberry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> RASPBERRY_LANTERN = FOODBLOCK.register("raspberry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> RASPBERRY_SOUL_LANTERN = FOODBLOCK.register("raspberry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> STRAWBERRY_LANTERN = FOODBLOCK.register("strawberry_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> STRAWBERRY_SOUL_LANTERN = FOODBLOCK.register("strawberry_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> SUGARAPPLE_LANTERN = FOODBLOCK.register("sugarapple_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> SUGARAPPLE_SOUL_LANTERN = FOODBLOCK.register("sugarapple_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> PEACH_LANTERN = FOODBLOCK.register("peach_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> PEACH_SOUL_LANTERN = FOODBLOCK.register("peach_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> TANGERINE_LANTERN = FOODBLOCK.register("tangerine_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> TANGERINE_SOUL_LANTERN = FOODBLOCK.register("tangerine_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> KUMQUAT_LANTERN = FOODBLOCK.register("kumquat_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> KUMQUAT_SOUL_LANTERN = FOODBLOCK.register("kumquat_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> PERSIMMON_LANTERN = FOODBLOCK.register("persimmon_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> PERSIMMON_SOUL_LANTERN = FOODBLOCK.register("persimmon_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> SATSUMA_LANTERN = FOODBLOCK.register("satsuma_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> SATSUMA_SOUL_LANTERN = FOODBLOCK.register("satsuma_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> MANDARIN_LANTERN = FOODBLOCK.register("mandarin_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> MANDARIN_SOUL_LANTERN = FOODBLOCK.register("mandarin_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> CITRON_LANTERN = FOODBLOCK.register("citron_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> CITRON_SOUL_LANTERN = FOODBLOCK.register("citron_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> BUDDHASHAND_LANTERN = FOODBLOCK.register("buddhashand_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> BUDDHASHAND_SOUL_LANTERN = FOODBLOCK.register("buddhashand_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> KEYLIME_LANTERN = FOODBLOCK.register("keylime_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> KEYLIME_SOUL_LANTERN = FOODBLOCK.register("keylime_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> FINGERLIME_LANTERN = FOODBLOCK.register("fingerlime_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> FINGERLIME_SOUL_LANTERN = FOODBLOCK.register("fingerlime_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> GRAPEFRUIT_LANTERN = FOODBLOCK.register("grapefruit_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> GRAPEFRUIT_SOUL_LANTERN = FOODBLOCK.register("grapefruit_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 10)
      .noOcclusion()
      ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Block, LanternBlock> POMELO_LANTERN = FOODBLOCK.register("pomelo_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
      .destroyTime(0.5f)
      .explosionResistance(0.5f)
      .sound(SoundType.SHROOMLIGHT)
      .lightLevel(state  -> 15)
      .noOcclusion()
      ));
    //soul
      public static final DeferredHolder<Block, LanternBlock> POMELO_SOUL_LANTERN = FOODBLOCK.register("pomelo_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> BLACKBERRY_CHAIN = FOODBLOCK.register("blackberry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> RASPBERRY_CHAIN = FOODBLOCK.register("raspberry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> STRAWBERRY_CHAIN = FOODBLOCK.register("strawberry_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> SUGARAPPLE_CHAIN = FOODBLOCK.register("sugarapple_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> PEACH_CHAIN = FOODBLOCK.register("peach_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> TANGERINE_CHAIN = FOODBLOCK.register("tangerine_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> KUMQUAT_CHAIN = FOODBLOCK.register("kumquat_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> PERSIMMON_CHAIN = FOODBLOCK.register("persimmon_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> SATSUMA_CHAIN = FOODBLOCK.register("satsuma_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> MANDARIN_CHAIN = FOODBLOCK.register("mandarin_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> CITRON_CHAIN = FOODBLOCK.register("citron_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> BUDDHASHAND_CHAIN = FOODBLOCK.register("buddhashand_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> KEYLIME_CHAIN = FOODBLOCK.register("keylime_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> FINGERLIME_CHAIN = FOODBLOCK.register("fingerlime_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> GRAPEFRUIT_CHAIN = FOODBLOCK.register("grapefruit_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
    .destroyTime(0.5f)
    .explosionResistance(0.5f)
    .sound(SoundType.CHAIN)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, ChainBlock> POMELO_CHAIN = FOODBLOCK.register("pomelo_chain", () -> new ChainBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> BLACKBERRY_LADDER = FOODBLOCK.register("blackberry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> RASPBERRY_LADDER = FOODBLOCK.register("raspberry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> STRAWBERRY_LADDER = FOODBLOCK.register("strawberry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> SUGARAPPLE_LADDER = FOODBLOCK.register("sugarapple_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> PEACH_LADDER = FOODBLOCK.register("peach_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> TANGERINE_LADDER = FOODBLOCK.register("tangerine_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> KUMQUAT_LADDER = FOODBLOCK.register("kumquat_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> PERSIMMON_LADDER = FOODBLOCK.register("persimmon_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> SATSUMA_LADDER = FOODBLOCK.register("satsuma_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> MANDARIN_LADDER = FOODBLOCK.register("mandarin_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> CITRON_LADDER = FOODBLOCK.register("citron_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> BUDDHASHAND_LADDER = FOODBLOCK.register("buddhashand_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //-----------------------------------------------------------------------------------------Keylime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> KEYLIME_LADDER = FOODBLOCK.register("keylime_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-----------------------------------------------------------------------------------------Fingerlime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> FINGERLIME_LADDER = FOODBLOCK.register("fingerlime_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-----------------------------------------------------------------------------------------Grapefruit------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> GRAPEFRUIT_LADDER = FOODBLOCK.register("grapefruit_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
    .destroyTime(ladder_destroy_time)
    .explosionResistance(ladder_explosion_resistance)
    .sound(plant_ladder_sound)
    .noOcclusion()
   )); 
 //-----------------------------------------------------------------------------------------Pomelo------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, LadderBlock> POMELO_LADDER = FOODBLOCK.register("pomelo_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BLACKBERRY_TABLE = FOODBLOCK.register("blackberry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> RASPBERRY_TABLE = FOODBLOCK.register("raspberry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> STRAWBERRY_TABLE = FOODBLOCK.register("strawberry_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SUGARAPPLE_TABLE = FOODBLOCK.register("sugarapple_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PEACH_TABLE = FOODBLOCK.register("peach_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> TANGERINE_TABLE = FOODBLOCK.register("tangerine_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> KUMQUAT_TABLE = FOODBLOCK.register("kumquat_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> PERSIMMON_TABLE = FOODBLOCK.register("persimmon_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> SATSUMA_TABLE = FOODBLOCK.register("satsuma_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> MANDARIN_TABLE = FOODBLOCK.register("mandarin_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //----------------------------------------------------------------------------------------Citron------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> CITRON_TABLE = FOODBLOCK.register("citron_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //----------------------------------------------------------------------------------------Buddhashand------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> BUDDHASHAND_TABLE = FOODBLOCK.register("buddhashand_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //-----------------------------------------------------------------------------------------Keylime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> KEYLIME_TABLE = FOODBLOCK.register("keylime_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-----------------------------------------------------------------------------------------Fingerlime------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> FINGERLIME_TABLE = FOODBLOCK.register("fingerlime_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-----------------------------------------------------------------------------------------Grapefruit------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> GRAPEFRUIT_TABLE = FOODBLOCK.register("grapefruit_table", () -> new foodtable(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //-----------------------------------------------------------------------------------------Pomelo------------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, HorizontalDirectionalBlock> POMELO_TABLE = FOODBLOCK.register("pomelo_table", () -> new foodtable(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> BLACKBERRY_TORCH = FOODBLOCK.register("blackberry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BLACKBERRY_WALL_TORCH = FOODBLOCK.register("blackberry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BLACKBERRY_REDSTONE_TORCH = FOODBLOCK.register("blackberry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BLACKBERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("blackberry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BLACKBERRY_SOUL_TORCH = FOODBLOCK.register("blackberry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BLACKBERRY_SOUL_WALL_TORCH = FOODBLOCK.register("blackberry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> RASPBERRY_TORCH = FOODBLOCK.register("raspberry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> RASPBERRY_WALL_TORCH = FOODBLOCK.register("raspberry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> RASPBERRY_REDSTONE_TORCH = FOODBLOCK.register("raspberry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> RASPBERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("raspberry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> RASPBERRY_SOUL_TORCH = FOODBLOCK.register("raspberry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> RASPBERRY_SOUL_WALL_TORCH = FOODBLOCK.register("raspberry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> STRAWBERRY_TORCH = FOODBLOCK.register("strawberry_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> STRAWBERRY_WALL_TORCH = FOODBLOCK.register("strawberry_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> STRAWBERRY_REDSTONE_TORCH = FOODBLOCK.register("strawberry_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> STRAWBERRY_REDSTONE_WALL_TORCH = FOODBLOCK.register("strawberry_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> STRAWBERRY_SOUL_TORCH = FOODBLOCK.register("strawberry_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> STRAWBERRY_SOUL_WALL_TORCH = FOODBLOCK.register("strawberry_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> SUGARAPPLE_TORCH = FOODBLOCK.register("sugarapple_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SUGARAPPLE_WALL_TORCH = FOODBLOCK.register("sugarapple_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> SUGARAPPLE_REDSTONE_TORCH = FOODBLOCK.register("sugarapple_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> SUGARAPPLE_REDSTONE_WALL_TORCH = FOODBLOCK.register("sugarapple_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> SUGARAPPLE_SOUL_TORCH = FOODBLOCK.register("sugarapple_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SUGARAPPLE_SOUL_WALL_TORCH = FOODBLOCK.register("sugarapple_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> PEACH_TORCH = FOODBLOCK.register("peach_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PEACH_WALL_TORCH = FOODBLOCK.register("peach_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> PEACH_REDSTONE_TORCH = FOODBLOCK.register("peach_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> PEACH_REDSTONE_WALL_TORCH = FOODBLOCK.register("peach_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> PEACH_SOUL_TORCH = FOODBLOCK.register("peach_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PEACH_SOUL_WALL_TORCH = FOODBLOCK.register("peach_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> TANGERINE_TORCH = FOODBLOCK.register("tangerine_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TANGERINE_WALL_TORCH = FOODBLOCK.register("tangerine_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> TANGERINE_REDSTONE_TORCH = FOODBLOCK.register("tangerine_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> TANGERINE_REDSTONE_WALL_TORCH = FOODBLOCK.register("tangerine_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> TANGERINE_SOUL_TORCH = FOODBLOCK.register("tangerine_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> TANGERINE_SOUL_WALL_TORCH = FOODBLOCK.register("tangerine_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> KUMQUAT_TORCH = FOODBLOCK.register("kumquat_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> KUMQUAT_WALL_TORCH = FOODBLOCK.register("kumquat_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> KUMQUAT_REDSTONE_TORCH = FOODBLOCK.register("kumquat_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> KUMQUAT_REDSTONE_WALL_TORCH = FOODBLOCK.register("kumquat_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> KUMQUAT_SOUL_TORCH = FOODBLOCK.register("kumquat_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> KUMQUAT_SOUL_WALL_TORCH = FOODBLOCK.register("kumquat_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> PERSIMMON_TORCH = FOODBLOCK.register("persimmon_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PERSIMMON_WALL_TORCH = FOODBLOCK.register("persimmon_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> PERSIMMON_REDSTONE_TORCH = FOODBLOCK.register("persimmon_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> PERSIMMON_REDSTONE_WALL_TORCH = FOODBLOCK.register("persimmon_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> PERSIMMON_SOUL_TORCH = FOODBLOCK.register("persimmon_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> PERSIMMON_SOUL_WALL_TORCH = FOODBLOCK.register("persimmon_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> SATSUMA_TORCH = FOODBLOCK.register("satsuma_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SATSUMA_WALL_TORCH = FOODBLOCK.register("satsuma_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> SATSUMA_REDSTONE_TORCH = FOODBLOCK.register("satsuma_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> SATSUMA_REDSTONE_WALL_TORCH = FOODBLOCK.register("satsuma_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> SATSUMA_SOUL_TORCH = FOODBLOCK.register("satsuma_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> SATSUMA_SOUL_WALL_TORCH = FOODBLOCK.register("satsuma_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> MANDARIN_TORCH = FOODBLOCK.register("mandarin_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MANDARIN_WALL_TORCH = FOODBLOCK.register("mandarin_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> MANDARIN_REDSTONE_TORCH = FOODBLOCK.register("mandarin_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> MANDARIN_REDSTONE_WALL_TORCH = FOODBLOCK.register("mandarin_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> MANDARIN_SOUL_TORCH = FOODBLOCK.register("mandarin_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> MANDARIN_SOUL_WALL_TORCH = FOODBLOCK.register("mandarin_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> CITRON_TORCH = FOODBLOCK.register("citron_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CITRON_WALL_TORCH = FOODBLOCK.register("citron_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> CITRON_REDSTONE_TORCH = FOODBLOCK.register("citron_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> CITRON_REDSTONE_WALL_TORCH = FOODBLOCK.register("citron_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> CITRON_SOUL_TORCH = FOODBLOCK.register("citron_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> CITRON_SOUL_WALL_TORCH = FOODBLOCK.register("citron_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> BUDDHASHAND_TORCH = FOODBLOCK.register("buddhashand_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BUDDHASHAND_WALL_TORCH = FOODBLOCK.register("buddhashand_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> BUDDHASHAND_REDSTONE_TORCH = FOODBLOCK.register("buddhashand_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> BUDDHASHAND_REDSTONE_WALL_TORCH = FOODBLOCK.register("buddhashand_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> BUDDHASHAND_SOUL_TORCH = FOODBLOCK.register("buddhashand_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> BUDDHASHAND_SOUL_WALL_TORCH = FOODBLOCK.register("buddhashand_soul_wall_torch", 
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> KEYLIME_TORCH = FOODBLOCK.register("keylime_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> KEYLIME_WALL_TORCH = FOODBLOCK.register("keylime_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> KEYLIME_REDSTONE_TORCH = FOODBLOCK.register("keylime_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> KEYLIME_REDSTONE_WALL_TORCH = FOODBLOCK.register("keylime_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> KEYLIME_SOUL_TORCH = FOODBLOCK.register("keylime_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> KEYLIME_SOUL_WALL_TORCH = FOODBLOCK.register("keylime_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> FINGERLIME_TORCH = FOODBLOCK.register("fingerlime_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> FINGERLIME_WALL_TORCH = FOODBLOCK.register("fingerlime_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> FINGERLIME_REDSTONE_TORCH = FOODBLOCK.register("fingerlime_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> FINGERLIME_REDSTONE_WALL_TORCH = FOODBLOCK.register("fingerlime_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> FINGERLIME_SOUL_TORCH = FOODBLOCK.register("fingerlime_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> FINGERLIME_SOUL_WALL_TORCH = FOODBLOCK.register("fingerlime_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> GRAPEFRUIT_TORCH = FOODBLOCK.register("grapefruit_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> GRAPEFRUIT_WALL_TORCH = FOODBLOCK.register("grapefruit_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> GRAPEFRUIT_REDSTONE_TORCH = FOODBLOCK.register("grapefruit_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> GRAPEFRUIT_REDSTONE_WALL_TORCH = FOODBLOCK.register("grapefruit_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> GRAPEFRUIT_SOUL_TORCH = FOODBLOCK.register("grapefruit_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> GRAPEFRUIT_SOUL_WALL_TORCH = FOODBLOCK.register("grapefruit_soul_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH)));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    //regular
     public static final DeferredHolder<Block, TorchBlock> POMELO_TORCH = FOODBLOCK.register("pomelo_torch", 
     () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> POMELO_WALL_TORCH = FOODBLOCK.register("pomelo_wall_torch", 
     () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH)));

    //redstone
     public static final DeferredHolder<Block, RedstoneTorchBlock> POMELO_REDSTONE_TORCH = FOODBLOCK.register("pomelo_redstone_torch", 
     () -> new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));

     public static final DeferredHolder<Block, RedstoneWallTorchBlock> POMELO_REDSTONE_WALL_TORCH = FOODBLOCK.register("pomelo_redstone_wall_torch", 
     () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH)));

    //soul
     public static final DeferredHolder<Block, TorchBlock> POMELO_SOUL_TORCH = FOODBLOCK.register("pomelo_soul_torch", 
     () -> new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));

     public static final DeferredHolder<Block, WallTorchBlock> POMELO_SOUL_WALL_TORCH = FOODBLOCK.register("pomelo_soul_wall_torch", 
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
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, blackberryFurnace> BLACKBERRY_FURNACE = FOODBLOCK.register("blackberry_furnace", 
    () -> new blackberryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<blackberryFurnaceEntity>> BLACKBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("blackberry_furnace", 
    () -> BlockEntityType.Builder.of(blackberryFurnaceEntity::new, BLACKBERRY_FURNACE.get()).build(null));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, raspberryFurnace> RASPBERRY_FURNACE = FOODBLOCK.register("raspberry_furnace", 
    () -> new raspberryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<raspberryFurnaceEntity>> RASPBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("raspberry_furnace", 
    () -> BlockEntityType.Builder.of(raspberryFurnaceEntity::new, RASPBERRY_FURNACE.get()).build(null));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, strawberryFurnace> STRAWBERRY_FURNACE = FOODBLOCK.register("strawberry_furnace", 
    () -> new strawberryFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<strawberryFurnaceEntity>> STRAWBERRY_FURNACE_ENTITY = FOODBLOCKENTITY.register("strawberry_furnace", 
    () -> BlockEntityType.Builder.of(strawberryFurnaceEntity::new, STRAWBERRY_FURNACE.get()).build(null));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, sugarappleFurnace> SUGARAPPLE_FURNACE = FOODBLOCK.register("sugarapple_furnace", 
    () -> new sugarappleFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<sugarappleFurnaceEntity>> SUGARAPPLE_FURNACE_ENTITY = FOODBLOCKENTITY.register("sugarapple_furnace", 
    () -> BlockEntityType.Builder.of(sugarappleFurnaceEntity::new, SUGARAPPLE_FURNACE.get()).build(null));
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
 //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, peachFurnace> PEACH_FURNACE = FOODBLOCK.register("peach_furnace", 
    () -> new peachFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<peachFurnaceEntity>> PEACH_FURNACE_ENTITY = FOODBLOCKENTITY.register("peach_furnace", 
    () -> BlockEntityType.Builder.of(peachFurnaceEntity::new, PEACH_FURNACE.get()).build(null));
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
 //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, tangerineFurnace> TANGERINE_FURNACE = FOODBLOCK.register("tangerine_furnace", 
    () -> new tangerineFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<tangerineFurnaceEntity>> TANGERINE_FURNACE_ENTITY = FOODBLOCKENTITY.register("tangerine_furnace", 
    () -> BlockEntityType.Builder.of(tangerineFurnaceEntity::new, TANGERINE_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, kumquatFurnace> KUMQUAT_FURNACE = FOODBLOCK.register("kumquat_furnace", 
    () -> new kumquatFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<kumquatFurnaceEntity>> KUMQUAT_FURNACE_ENTITY = FOODBLOCKENTITY.register("kumquat_furnace", 
    () -> BlockEntityType.Builder.of(kumquatFurnaceEntity::new, KUMQUAT_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, persimmonFurnace> PERSIMMON_FURNACE = FOODBLOCK.register("persimmon_furnace", 
    () -> new persimmonFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<persimmonFurnaceEntity>> PERSIMMON_FURNACE_ENTITY = FOODBLOCKENTITY.register("persimmon_furnace", 
    () -> BlockEntityType.Builder.of(persimmonFurnaceEntity::new, PERSIMMON_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, satsumaFurnace> SATSUMA_FURNACE = FOODBLOCK.register("satsuma_furnace", 
    () -> new satsumaFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<satsumaFurnaceEntity>> SATSUMA_FURNACE_ENTITY = FOODBLOCKENTITY.register("satsuma_furnace", 
    () -> BlockEntityType.Builder.of(satsumaFurnaceEntity::new, SATSUMA_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, mandarinFurnace> MANDARIN_FURNACE = FOODBLOCK.register("mandarin_furnace", 
    () -> new mandarinFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mandarinFurnaceEntity>> MANDARIN_FURNACE_ENTITY = FOODBLOCKENTITY.register("mandarin_furnace", 
    () -> BlockEntityType.Builder.of(mandarinFurnaceEntity::new, MANDARIN_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, lemonFurnace> LEMON_FURNACE = FOODBLOCK.register("lemon_furnace", 
    () -> new lemonFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<lemonFurnaceEntity>> LEMON_FURNACE_ENTITY = FOODBLOCKENTITY.register("lemon_furnace", 
    () -> BlockEntityType.Builder.of(lemonFurnaceEntity::new, LEMON_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, citronFurnace> CITRON_FURNACE = FOODBLOCK.register("citron_furnace", 
    () -> new citronFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<citronFurnaceEntity>> CITRON_FURNACE_ENTITY = FOODBLOCKENTITY.register("citron_furnace", 
    () -> BlockEntityType.Builder.of(citronFurnaceEntity::new, CITRON_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, buddhashandFurnace> BUDDHASHAND_FURNACE = FOODBLOCK.register("buddhashand_furnace", 
    () -> new buddhashandFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<buddhashandFurnaceEntity>> BUDDHASHAND_FURNACE_ENTITY = FOODBLOCKENTITY.register("buddhashand_furnace", 
    () -> BlockEntityType.Builder.of(buddhashandFurnaceEntity::new, BUDDHASHAND_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, limeFurnace> LIME_FURNACE = FOODBLOCK.register("lime_furnace", 
    () -> new limeFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<limeFurnaceEntity>> LIME_FURNACE_ENTITY = FOODBLOCKENTITY.register("lime_furnace", 
    () -> BlockEntityType.Builder.of(limeFurnaceEntity::new, LIME_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, keylimeFurnace> KEYLIME_FURNACE = FOODBLOCK.register("keylime_furnace", 
    () -> new keylimeFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<keylimeFurnaceEntity>> KEYLIME_FURNACE_ENTITY = FOODBLOCKENTITY.register("keylime_furnace", 
    () -> BlockEntityType.Builder.of(keylimeFurnaceEntity::new, KEYLIME_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, fingerlimeFurnace> FINGERLIME_FURNACE = FOODBLOCK.register("fingerlime_furnace", 
    () -> new fingerlimeFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<fingerlimeFurnaceEntity>> FINGERLIME_FURNACE_ENTITY = FOODBLOCKENTITY.register("fingerlime_furnace", 
    () -> BlockEntityType.Builder.of(fingerlimeFurnaceEntity::new, FINGERLIME_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, grapefruitFurnace> GRAPEFRUIT_FURNACE = FOODBLOCK.register("grapefruit_furnace", 
    () -> new grapefruitFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<grapefruitFurnaceEntity>> GRAPEFRUIT_FURNACE_ENTITY = FOODBLOCKENTITY.register("grapefruit_furnace", 
    () -> BlockEntityType.Builder.of(grapefruitFurnaceEntity::new, GRAPEFRUIT_FURNACE.get()).build(null));
 //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, pomeloFurnace> POMELO_FURNACE = FOODBLOCK.register("pomelo_furnace", 
    () -> new pomeloFurnace(MapColor.DEEPSLATE, SoundType.MUD_BRICKS, 2.5f, "deepslate"));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<pomeloFurnaceEntity>> POMELO_FURNACE_ENTITY = FOODBLOCKENTITY.register("pomelo_furnace", 
    () -> BlockEntityType.Builder.of(pomeloFurnaceEntity::new, POMELO_FURNACE.get()).build(null));
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> BLACKBERRY_STONE_PATH = FOODBLOCK.register("blackberry_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> RASPBERRY_STONE_PATH = FOODBLOCK.register("raspberry_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> STRAWBERRY_STONE_PATH = FOODBLOCK.register("strawberry_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> SUGARAPPLE_STONE_PATH = FOODBLOCK.register("sugarapple_stone_path", 
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> PEACH_STONE_PATH = FOODBLOCK.register("peach_stone_path", 
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> TANGERINE_STONE_PATH = FOODBLOCK.register("tangerine_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> KUMQUAT_STONE_PATH = FOODBLOCK.register("kumquat_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> PERSIMMON_STONE_PATH = FOODBLOCK.register("persimmon_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> SATSUMA_STONE_PATH = FOODBLOCK.register("satsuma_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> MANDARIN_STONE_PATH = FOODBLOCK.register("mandarin_stone_path", 
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> CITRON_STONE_PATH = FOODBLOCK.register("citron_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> BUDDHASHAND_STONE_PATH = FOODBLOCK.register("buddhashand_stone_path", 
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> KEYLIME_STONE_PATH = FOODBLOCK.register("keylime_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> FINGERLIME_STONE_PATH = FOODBLOCK.register("fingerlime_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> GRAPEFRUIT_STONE_PATH = FOODBLOCK.register("grapefruit_stone_path", 
    () -> new foodpathtypeminislab(BlockBehaviour.Properties.of()
    .destroyTime(1.5f)
    .explosionResistance(1.5f)
    .sound(SoundType.MUD_BRICKS)
    .noOcclusion()
    ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> POMELO_STONE_PATH = FOODBLOCK.register("pomelo_stone_path", 
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Block, foodpathtypeminislab> TOMATO_STONE_PATH = FOODBLOCK.register("tomato_stone_path", 
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> BLACKBERRY_BARREL = FOODBLOCK.register("blackberry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> RASPBERRY_BARREL = FOODBLOCK.register("raspberry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> STRAWBERRY_BARREL = FOODBLOCK.register("strawberry_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> SUGARAPPLE_BARREL = FOODBLOCK.register("sugarapple_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> PEACH_BARREL = FOODBLOCK.register("peach_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> TANGERINE_BARREL = FOODBLOCK.register("tangerine_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> KUMQUAT_BARREL = FOODBLOCK.register("kumquat_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> PERSIMMON_BARREL = FOODBLOCK.register("persimmon_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> SATSUMA_BARREL = FOODBLOCK.register("satsuma_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> MANDARIN_BARREL = FOODBLOCK.register("mandarin_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> CITRON_BARREL = FOODBLOCK.register("citron_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> BUDDHASHAND_BARREL = FOODBLOCK.register("buddhashand_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> KEYLIME_BARREL = FOODBLOCK.register("keylime_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> FINGERLIME_BARREL = FOODBLOCK.register("fingerlime_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> GRAPEFRUIT_BARREL = FOODBLOCK.register("grapefruit_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
     .sound(plant_barrel_sound)
     .destroyTime(barrel_destroy_time)
     .explosionResistance(barrel_explosion_resistance)
     ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> POMELO_BARREL = FOODBLOCK.register("pomelo_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodBarrel> TOMATO_BARREL = FOODBLOCK.register("tomato_barrel", () -> new foodBarrel(BlockBehaviour.Properties.of()
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
     () -> BlockEntityType.Builder.of(foodBarrelEntity::new,foodblockcompatregistry.ELDERBERRY_BARREL.get(),foodblockcompatregistry.JUNIPER_BARREL.get(),
     foodblockcompatregistry.BLACKBERRY_BARREL.get(),foodblockcompatregistry.RASPBERRY_BARREL.get(),foodblockcompatregistry.STRAWBERRY_BARREL.get(),foodblockcompatregistry.SUGARAPPLE_BARREL.get(),
     foodblockcompatregistry.CHERRY_BARREL.get(), 
     foodblockcompatregistry.BLACKCHERRY_BARREL.get(),foodblockcompatregistry.PEACH_BARREL.get(),foodblockcompatregistry.COCONUT_BARREL.get(),foodblockcompatregistry.ORANGE_BARREL.get(),
     foodblockcompatregistry.TANGERINE_BARREL.get(),foodblockcompatregistry.KUMQUAT_BARREL.get(),foodblockcompatregistry.PERSIMMON_BARREL.get(),foodblockcompatregistry.SATSUMA_BARREL.get(),
     foodblockcompatregistry.MANDARIN_BARREL.get(),foodblockcompatregistry.LEMON_BARREL.get(),foodblockcompatregistry.CITRON_BARREL.get(),foodblockcompatregistry.BUDDHASHAND_BARREL.get(),
     foodblockcompatregistry.LIME_BARREL.get(),foodblockcompatregistry.KEYLIME_BARREL.get(),foodblockcompatregistry.FINGERLIME_BARREL.get(),foodblockcompatregistry.GRAPEFRUIT_BARREL.get(),
     foodblockcompatregistry.POMELO_BARREL.get(),foodblockcompatregistry.CORN_BARREL.get(),foodblockcompatregistry.ONION_BARREL.get(),foodblockcompatregistry.TOMATO_BARREL.get(),
     foodblockcompatregistry.PECAN_BARREL.get(),foodblockcompatregistry.ALMOND_BARREL.get()).build(null));
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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> BLACKBERRY_CHAIR = FOODBLOCK.register("blackberry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> RASPBERRY_CHAIR = FOODBLOCK.register("raspberry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> STRAWBERRY_CHAIR = FOODBLOCK.register("strawberry_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> SUGARAPPLE_CHAIR = FOODBLOCK.register("sugarapple_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> PEACH_CHAIR = FOODBLOCK.register("peach_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> TANGERINE_CHAIR = FOODBLOCK.register("tangerine_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> KUMQUAT_CHAIR = FOODBLOCK.register("kumquat_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> PERSIMMON_CHAIR = FOODBLOCK.register("persimmon_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> SATSUMA_CHAIR = FOODBLOCK.register("satsuma_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> MANDARIN_CHAIR = FOODBLOCK.register("mandarin_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> CITRON_CHAIR = FOODBLOCK.register("citron_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> BUDDHASHAND_CHAIR = FOODBLOCK.register("buddhashand_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> KEYLIME_CHAIR = FOODBLOCK.register("keylime_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> FINGERLIME_CHAIR = FOODBLOCK.register("fingerlime_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> GRAPEFRUIT_CHAIR = FOODBLOCK.register("grapefruit_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
     .sound(plant_chair_sound)
     .destroyTime(chair_destroy_time)
     .explosionResistance(chair_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> POMELO_CHAIR = FOODBLOCK.register("pomelo_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, foodChairBlock> TOMATO_CHAIR = FOODBLOCK.register("tomato_chair", () -> new foodChairBlock(BlockBehaviour.Properties.of()
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
     public static final DeferredHolder<Block, compatBed> ELDERBERRY_BED = FOODBLOCK.register("elderberry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> JUNIPER_BED = FOODBLOCK.register("juniper_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> BLACKBERRY_BED = FOODBLOCK.register("blackberry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> RASPBERRY_BED = FOODBLOCK.register("raspberry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> STRAWBERRY_BED = FOODBLOCK.register("strawberry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> SUGARAPPLE_BED = FOODBLOCK.register("sugarapple_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> CHERRY_BED = FOODBLOCK.register("cherry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> BLACKCHERRY_BED = FOODBLOCK.register("blackcherry_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> PEACH_BED = FOODBLOCK.register("peach_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> COCONUT_BED = FOODBLOCK.register("coconut_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> ORANGE_BED = FOODBLOCK.register("orange_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> TANGERINE_BED = FOODBLOCK.register("tangerine_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> KUMQUAT_BED = FOODBLOCK.register("kumquat_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> PERSIMMON_BED = FOODBLOCK.register("persimmon_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> SATSUMA_BED = FOODBLOCK.register("satsuma_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> MANDARIN_BED = FOODBLOCK.register("mandarin_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> LEMON_BED = FOODBLOCK.register("lemon_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> CITRON_BED = FOODBLOCK.register("citron_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> BUDDHASHAND_BED = FOODBLOCK.register("buddhashand_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> LIME_BED = FOODBLOCK.register("lime_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> KEYLIME_BED = FOODBLOCK.register("keylime_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> FINGERLIME_BED = FOODBLOCK.register("fingerlime_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> GRAPEFRUIT_BED = FOODBLOCK.register("grapefruit_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> POMELO_BED = FOODBLOCK.register("pomelo_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> CORN_BED = FOODBLOCK.register("corn_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> ONION_BED = FOODBLOCK.register("onion_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> TOMATO_BED = FOODBLOCK.register("tomato_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> PECAN_BED = FOODBLOCK.register("pecan_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, compatBed> ALMOND_BED = FOODBLOCK.register("almond_bed", () -> new compatBed(BlockBehaviour.Properties.of()
     .sound(plant_bed_sound)
     .destroyTime(bed_destroy_time)
     .explosionResistance(bed_explosion_resistance)
     .noOcclusion()
     ));

 //.........entity
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<compatBedEntity>> FOOD_BED_ENTITY = FOODBLOCKENTITY.register("food_bed_entity",
     () -> BlockEntityType.Builder.of(compatBedEntity::new,ELDERBERRY_BED.get(),JUNIPER_BED.get(),BLACKBERRY_BED.get(),RASPBERRY_BED.get(),STRAWBERRY_BED.get(),SUGARAPPLE_BED.get(),CHERRY_BED.get(),
     COCONUT_BED.get(),
     ORANGE_BED.get(),TANGERINE_BED.get(),KUMQUAT_BED.get(), PERSIMMON_BED.get(),LEMON_BED.get(),CITRON_BED.get(),LIME_BED.get(),KEYLIME_BED.get(),FINGERLIME_BED.get(),GRAPEFRUIT_BED.get(),
     POMELO_BED.get(),CORN_BED.get(),ONION_BED.get(),TOMATO_BED.get(),PECAN_BED.get(),SATSUMA_BED.get(),MANDARIN_BED.get(),ALMOND_BED.get()).build(null));

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
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_BLACKBERRY_CABINET = FOODBLOCK.register("small_blackberry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_BLACKBERRY_CABINET = FOODBLOCK.register("medium_blackberry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_RASPBERRY_CABINET = FOODBLOCK.register("small_raspberry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_RASPBERRY_CABINET = FOODBLOCK.register("medium_raspberry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_STRAWBERRY_CABINET = FOODBLOCK.register("small_strawberry_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_STRAWBERRY_CABINET = FOODBLOCK.register("medium_strawberry_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_SUGARAPPLE_CABINET = FOODBLOCK.register("small_sugarapple_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_SUGARAPPLE_CABINET = FOODBLOCK.register("medium_sugarapple_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_PEACH_CABINET = FOODBLOCK.register("small_peach_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_PEACH_CABINET = FOODBLOCK.register("medium_peach_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_TANGERINE_CABINET = FOODBLOCK.register("small_tangerine_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_TANGERINE_CABINET = FOODBLOCK.register("medium_tangerine_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_KUMQUAT_CABINET = FOODBLOCK.register("small_kumquat_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_KUMQUAT_CABINET = FOODBLOCK.register("medium_kumquat_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_PERSIMMON_CABINET = FOODBLOCK.register("small_persimmon_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_PERSIMMON_CABINET = FOODBLOCK.register("medium_persimmon_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_SATSUMA_CABINET = FOODBLOCK.register("small_satsuma_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_SATSUMA_CABINET = FOODBLOCK.register("medium_satsuma_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_MANDARIN_CABINET = FOODBLOCK.register("small_mandarin_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_MANDARIN_CABINET = FOODBLOCK.register("medium_mandarin_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_CITRON_CABINET = FOODBLOCK.register("small_citron_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_CITRON_CABINET = FOODBLOCK.register("medium_citron_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_BUDDHASHAND_CABINET = FOODBLOCK.register("small_buddhashand_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_BUDDHASHAND_CABINET = FOODBLOCK.register("medium_buddhashand_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_KEYLIME_CABINET = FOODBLOCK.register("small_keylime_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_KEYLIME_CABINET = FOODBLOCK.register("medium_keylime_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_FINGERLIME_CABINET = FOODBLOCK.register("small_fingerlime_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_FINGERLIME_CABINET = FOODBLOCK.register("medium_fingerlime_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_GRAPEFRUIT_CABINET = FOODBLOCK.register("small_grapefruit_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_GRAPEFRUIT_CABINET = FOODBLOCK.register("medium_grapefruit_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_POMELO_CABINET = FOODBLOCK.register("small_pomelo_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_POMELO_CABINET = FOODBLOCK.register("medium_pomelo_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Block, smallFoodCabinet> SMALL_TOMATO_CABINET = FOODBLOCK.register("small_tomato_cabinet", 
     () -> new smallFoodCabinet(BlockBehaviour.Properties.of()
     .sound(plant_cabinet_sound)
     .destroyTime(cabinet_destroy_time)
     .explosionResistance(cabinet_explosion_resistance)
     .noOcclusion()
     ));
    //medium
     public static final DeferredHolder<Block, mediumFoodCabinet> MEDIUM_TOMATO_CABINET = FOODBLOCK.register("medium_tomato_cabinet", () -> new mediumFoodCabinet(BlockBehaviour.Properties.of()
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
     () -> BlockEntityType.Builder.of(smallFoodContainerEntity::new,SMALL_ELDERBERRY_CABINET.get(),SMALL_JUNIPER_CABINET.get(),SMALL_BLACKBERRY_CABINET.get(),SMALL_RASPBERRY_CABINET.get(),
     SMALL_STRAWBERRY_CABINET.get(),SMALL_SUGARAPPLE_CABINET.get(),
     SMALL_CHERRY_CABINET.get(),SMALL_BLACKCHERRY_CABINET.get(),SMALL_PEACH_CABINET.get(),SMALL_COCONUT_CABINET.get(),SMALL_ORANGE_CABINET.get(),SMALL_TANGERINE_CABINET.get(),
     SMALL_KUMQUAT_CABINET.get(),SMALL_PERSIMMON_CABINET.get(),SMALL_SATSUMA_CABINET.get(),SMALL_MANDARIN_CABINET.get(),SMALL_LEMON_CABINET.get(),SMALL_CITRON_CABINET.get(),
     SMALL_BUDDHASHAND_CABINET.get(),SMALL_LIME_CABINET.get(),SMALL_KEYLIME_CABINET.get(),SMALL_FINGERLIME_CABINET.get(),SMALL_GRAPEFRUIT_CABINET.get(), SMALL_POMELO_CABINET.get(),
     SMALL_CORN_CABINET.get(),SMALL_ONION_CABINET.get(),SMALL_TOMATO_CABINET.get(),SMALL_PECAN_CABINET.get(),SMALL_ALMOND_CABINET.get()).build(null));
    //medium
     public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<mediumFoodContainerEntity>> MEDIUM_CABINET_ENTITY = FOODBLOCKENTITY.register("medium_cabinet_entity",
     () -> BlockEntityType.Builder.of(mediumFoodContainerEntity::new,MEDIUM_ELDERBERRY_CABINET.get(),MEDIUM_JUNIPER_CABINET.get(),MEDIUM_BLACKBERRY_CABINET.get(),MEDIUM_RASPBERRY_CABINET.get(),
     MEDIUM_STRAWBERRY_CABINET.get(),MEDIUM_SUGARAPPLE_CABINET.get(),
     MEDIUM_CHERRY_CABINET.get(),MEDIUM_BLACKCHERRY_CABINET.get(),MEDIUM_BLACKCHERRY_CABINET.get(),MEDIUM_COCONUT_CABINET.get(),MEDIUM_ORANGE_CABINET.get(),MEDIUM_TANGERINE_CABINET.get(),
     MEDIUM_KUMQUAT_CABINET.get(),MEDIUM_PERSIMMON_CABINET.get(),MEDIUM_SATSUMA_CABINET.get(),MEDIUM_MANDARIN_CABINET.get(),MEDIUM_LEMON_CABINET.get(),MEDIUM_CITRON_CABINET.get(),
     MEDIUM_BUDDHASHAND_CABINET.get(),MEDIUM_LIME_CABINET.get(),MEDIUM_KEYLIME_CABINET.get(),MEDIUM_FINGERLIME_CABINET.get(),MEDIUM_GRAPEFRUIT_CABINET.get(), MEDIUM_POMELO_CABINET.get(),
     MEDIUM_CORN_CABINET.get(),MEDIUM_ONION_CABINET.get(),MEDIUM_TOMATO_CABINET.get(),MEDIUM_PECAN_CABINET.get(),MEDIUM_ALMOND_CABINET.get()).build(null));

}
