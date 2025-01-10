package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import com.goldfish.goldfishmod02tastyfurniture.block.foodBarrel;
import com.goldfish.goldfishmod02tastyfurniture.block.foodBed;
import com.goldfish.goldfishmod02tastyfurniture.block.foodChairBlock;
import com.goldfish.goldfishmod02tastyfurniture.block.foodpathtypeminislab;
import com.goldfish.goldfishmod02tastyfurniture.block.mediumFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.smallFoodCabinet;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;

public class GM1BlockStateProvider extends BlockStateProvider 
{

     private final PackOutput output;
     private final ExistingFileHelper existingFileHelper;

     public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
         super(output, "goldfishmod03tastyfurniturecompataddon", existingFileHelper);
         this.output = output;
         this.existingFileHelper = existingFileHelper;
     }

     public PackOutput getOutput() {
      return output;
    }

     @Override
     public void registerStatesAndModels() {

    //==============================================================================================================================================
    //|                                                              Blocks                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block elderberry_block = foodblockcompatregistry.ELDERBERRY_BLOCK.get();
          simpleBlock(elderberry_block);
      //.........bricks
          net.minecraft.world.level.block.Block elderberry_bricks_block = foodblockcompatregistry.ELDERBERRY_BRICKS_BLOCK.get();
          simpleBlock(elderberry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block elderberry_chiseled_block = foodblockcompatregistry.ELDERBERRY_CHISELED_BLOCK.get();
          simpleBlock(elderberry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block elderberry_tiles_block = foodblockcompatregistry.ELDERBERRY_TILES_BLOCK.get();
          simpleBlock(elderberry_tiles_block);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block juniper_block = foodblockcompatregistry.JUNIPER_BLOCK.get();
          simpleBlock(juniper_block);
      //.........bricks
          net.minecraft.world.level.block.Block juniper_bricks_block = foodblockcompatregistry.JUNIPER_BRICKS_BLOCK.get();
          simpleBlock(juniper_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block juniper_chiseled_block = foodblockcompatregistry.JUNIPER_CHISELED_BLOCK.get();
          simpleBlock(juniper_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block juniper_tiles_block = foodblockcompatregistry.JUNIPER_TILES_BLOCK.get();
          simpleBlock(juniper_tiles_block);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block cherry_block = foodblockcompatregistry.CHERRY_BLOCK.get();
          simpleBlock(cherry_block);
      //.........bricks
          net.minecraft.world.level.block.Block cherry_bricks_block = foodblockcompatregistry.CHERRY_BRICKS_BLOCK.get();
          simpleBlock(cherry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block cherry_chiseled_block = foodblockcompatregistry.CHERRY_CHISELED_BLOCK.get();
          simpleBlock(cherry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block cherry_tiles_block = foodblockcompatregistry.CHERRY_TILES_BLOCK.get();
          simpleBlock(cherry_tiles_block);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block blackcherry_block = foodblockcompatregistry.BLACKCHERRY_BLOCK.get();
          simpleBlock(blackcherry_block);
      //.........bricks
          net.minecraft.world.level.block.Block blackcherry_bricks_block = foodblockcompatregistry.BLACKCHERRY_BRICKS_BLOCK.get();
          simpleBlock(blackcherry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block blackcherry_chiseled_block = foodblockcompatregistry.BLACKCHERRY_CHISELED_BLOCK.get();
          simpleBlock(blackcherry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block blackcherry_tiles_block = foodblockcompatregistry.BLACKCHERRY_TILES_BLOCK.get();
          simpleBlock(blackcherry_tiles_block);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block peach_block = foodblockcompatregistry.PEACH_BLOCK.get();
          simpleBlock(peach_block);
      //.........bricks
          net.minecraft.world.level.block.Block peach_bricks_block = foodblockcompatregistry.PEACH_BRICKS_BLOCK.get();
          simpleBlock(peach_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block peach_chiseled_block = foodblockcompatregistry.PEACH_CHISELED_BLOCK.get();
          simpleBlock(peach_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block peach_tiles_block = foodblockcompatregistry.PEACH_TILES_BLOCK.get();
          simpleBlock(peach_tiles_block);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block coconut_block = foodblockcompatregistry.COCONUT_BLOCK.get();
          simpleBlock(coconut_block);
      //.........bricks
          net.minecraft.world.level.block.Block coconut_bricks_block = foodblockcompatregistry.COCONUT_BRICKS_BLOCK.get();
          simpleBlock(coconut_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block coconut_chiseled_block = foodblockcompatregistry.COCONUT_CHISELED_BLOCK.get();
          simpleBlock(coconut_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block coconut_tiles_block = foodblockcompatregistry.COCONUT_TILES_BLOCK.get();
          simpleBlock(coconut_tiles_block);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block orange_block = foodblockcompatregistry.ORANGE_BLOCK.get();
          simpleBlock(orange_block);
      //.........bricks
          net.minecraft.world.level.block.Block orange_bricks_block = foodblockcompatregistry.ORANGE_BRICKS_BLOCK.get();
          simpleBlock(orange_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block orange_chiseled_block = foodblockcompatregistry.ORANGE_CHISELED_BLOCK.get();
          simpleBlock(orange_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block orange_tiles_block = foodblockcompatregistry.ORANGE_TILES_BLOCK.get();
          simpleBlock(orange_tiles_block);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block tangerine_block = foodblockcompatregistry.TANGERINE_BLOCK.get();
          simpleBlock(tangerine_block);
      //.........bricks
          net.minecraft.world.level.block.Block tangerine_bricks_block = foodblockcompatregistry.TANGERINE_BRICKS_BLOCK.get();
          simpleBlock(tangerine_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block tangerine_chiseled_block = foodblockcompatregistry.TANGERINE_CHISELED_BLOCK.get();
          simpleBlock(tangerine_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block tangerine_tiles_block = foodblockcompatregistry.TANGERINE_TILES_BLOCK.get();
          simpleBlock(tangerine_tiles_block);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block kumquat_block = foodblockcompatregistry.KUMQUAT_BLOCK.get();
          simpleBlock(kumquat_block);
      //.........bricks
          net.minecraft.world.level.block.Block kumquat_bricks_block = foodblockcompatregistry.KUMQUAT_BRICKS_BLOCK.get();
          simpleBlock(kumquat_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block kumquat_chiseled_block = foodblockcompatregistry.KUMQUAT_CHISELED_BLOCK.get();
          simpleBlock(kumquat_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block kumquat_tiles_block = foodblockcompatregistry.KUMQUAT_TILES_BLOCK.get();
          simpleBlock(kumquat_tiles_block);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block persimmon_block = foodblockcompatregistry.PERSIMMON_BLOCK.get();
          simpleBlock(persimmon_block);
      //.........bricks
          net.minecraft.world.level.block.Block persimmon_bricks_block = foodblockcompatregistry.PERSIMMON_BRICKS_BLOCK.get();
          simpleBlock(persimmon_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block persimmon_chiseled_block = foodblockcompatregistry.PERSIMMON_CHISELED_BLOCK.get();
          simpleBlock(persimmon_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block persimmon_tiles_block = foodblockcompatregistry.PERSIMMON_TILES_BLOCK.get();
          simpleBlock(persimmon_tiles_block);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block satsuma_block = foodblockcompatregistry.SATSUMA_BLOCK.get();
          simpleBlock(satsuma_block);
      //.........bricks
          net.minecraft.world.level.block.Block satsuma_bricks_block = foodblockcompatregistry.SATSUMA_BRICKS_BLOCK.get();
          simpleBlock(satsuma_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block satsuma_chiseled_block = foodblockcompatregistry.SATSUMA_CHISELED_BLOCK.get();
          simpleBlock(satsuma_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block satsuma_tiles_block = foodblockcompatregistry.SATSUMA_TILES_BLOCK.get();
          simpleBlock(satsuma_tiles_block);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block mandarin_block = foodblockcompatregistry.MANDARIN_BLOCK.get();
          simpleBlock(mandarin_block);
      //.........bricks
          net.minecraft.world.level.block.Block mandarin_bricks_block = foodblockcompatregistry.MANDARIN_BRICKS_BLOCK.get();
          simpleBlock(mandarin_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block mandarin_chiseled_block = foodblockcompatregistry.MANDARIN_CHISELED_BLOCK.get();
          simpleBlock(mandarin_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block mandarin_tiles_block = foodblockcompatregistry.MANDARIN_TILES_BLOCK.get();
          simpleBlock(mandarin_tiles_block);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block lemon_block = foodblockcompatregistry.LEMON_BLOCK.get();
          simpleBlock(lemon_block);
      //.........bricks
          net.minecraft.world.level.block.Block lemon_bricks_block = foodblockcompatregistry.LEMON_BRICKS_BLOCK.get();
          simpleBlock(lemon_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block lemon_chiseled_block = foodblockcompatregistry.LEMON_CHISELED_BLOCK.get();
          simpleBlock(lemon_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block lemon_tiles_block = foodblockcompatregistry.LEMON_TILES_BLOCK.get();
          simpleBlock(lemon_tiles_block);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block citron_block = foodblockcompatregistry.CITRON_BLOCK.get();
          simpleBlock(citron_block);
      //.........bricks
          net.minecraft.world.level.block.Block citron_bricks_block = foodblockcompatregistry.CITRON_BRICKS_BLOCK.get();
          simpleBlock(citron_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block citron_chiseled_block = foodblockcompatregistry.CITRON_CHISELED_BLOCK.get();
          simpleBlock(citron_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block citron_tiles_block = foodblockcompatregistry.CITRON_TILES_BLOCK.get();
          simpleBlock(citron_tiles_block);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block buddhashand_block = foodblockcompatregistry.BUDDHASHAND_BLOCK.get();
          simpleBlock(buddhashand_block);
      //.........bricks
          net.minecraft.world.level.block.Block buddhashand_bricks_block = foodblockcompatregistry.BUDDHASHAND_BRICKS_BLOCK.get();
          simpleBlock(buddhashand_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block buddhashand_chiseled_block = foodblockcompatregistry.BUDDHASHAND_CHISELED_BLOCK.get();
          simpleBlock(buddhashand_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block buddhashand_tiles_block = foodblockcompatregistry.BUDDHASHAND_TILES_BLOCK.get();
          simpleBlock(buddhashand_tiles_block);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block lime_block = foodblockcompatregistry.LIME_BLOCK.get();
          simpleBlock(lime_block);
      //.........bricks
          net.minecraft.world.level.block.Block lime_bricks_block = foodblockcompatregistry.LIME_BRICKS_BLOCK.get();
          simpleBlock(lime_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block lime_chiseled_block = foodblockcompatregistry.LIME_CHISELED_BLOCK.get();
          simpleBlock(lime_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block lime_tiles_block = foodblockcompatregistry.LIME_TILES_BLOCK.get();
          simpleBlock(lime_tiles_block);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block keylime_block = foodblockcompatregistry.KEYLIME_BLOCK.get();
          simpleBlock(keylime_block);
      //.........bricks
          net.minecraft.world.level.block.Block keylime_bricks_block = foodblockcompatregistry.KEYLIME_BRICKS_BLOCK.get();
          simpleBlock(keylime_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block keylime_chiseled_block = foodblockcompatregistry.KEYLIME_CHISELED_BLOCK.get();
          simpleBlock(keylime_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block keylime_tiles_block = foodblockcompatregistry.KEYLIME_TILES_BLOCK.get();
          simpleBlock(keylime_tiles_block);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block fingerlime_block = foodblockcompatregistry.FINGERLIME_BLOCK.get();
          simpleBlock(fingerlime_block);
      //.........bricks
          net.minecraft.world.level.block.Block fingerlime_bricks_block = foodblockcompatregistry.FINGERLIME_BRICKS_BLOCK.get();
          simpleBlock(fingerlime_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block fingerlime_chiseled_block = foodblockcompatregistry.FINGERLIME_CHISELED_BLOCK.get();
          simpleBlock(fingerlime_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block fingerlime_tiles_block = foodblockcompatregistry.FINGERLIME_TILES_BLOCK.get();
          simpleBlock(fingerlime_tiles_block);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block grapefruit_block = foodblockcompatregistry.GRAPEFRUIT_BLOCK.get();
          simpleBlock(grapefruit_block);
      //.........bricks
          net.minecraft.world.level.block.Block grapefruit_bricks_block = foodblockcompatregistry.GRAPEFRUIT_BRICKS_BLOCK.get();
          simpleBlock(grapefruit_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block grapefruit_chiseled_block = foodblockcompatregistry.GRAPEFRUIT_CHISELED_BLOCK.get();
          simpleBlock(grapefruit_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block grapefruit_tiles_block = foodblockcompatregistry.GRAPEFRUIT_TILES_BLOCK.get();
          simpleBlock(grapefruit_tiles_block);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block pomelo_block = foodblockcompatregistry.POMELO_BLOCK.get();
          simpleBlock(pomelo_block);
      //.........bricks
          net.minecraft.world.level.block.Block pomelo_bricks_block = foodblockcompatregistry.POMELO_BRICKS_BLOCK.get();
          simpleBlock(pomelo_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block pomelo_chiseled_block = foodblockcompatregistry.POMELO_CHISELED_BLOCK.get();
          simpleBlock(pomelo_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block pomelo_tiles_block = foodblockcompatregistry.POMELO_TILES_BLOCK.get();
          simpleBlock(pomelo_tiles_block);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block corn_block = foodblockcompatregistry.CORN_BLOCK.get();
          simpleBlock(corn_block);
      //.........bricks
          net.minecraft.world.level.block.Block corn_bricks_block = foodblockcompatregistry.CORN_BRICKS_BLOCK.get();
          simpleBlock(corn_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block corn_chiseled_block = foodblockcompatregistry.CORN_CHISELED_BLOCK.get();
          simpleBlock(corn_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block corn_tiles_block = foodblockcompatregistry.CORN_TILES_BLOCK.get();
          simpleBlock(corn_tiles_block);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block onion_block = foodblockcompatregistry.ONION_BLOCK.get();
          simpleBlock(onion_block);
      //.........bricks
          net.minecraft.world.level.block.Block onion_bricks_block = foodblockcompatregistry.ONION_BRICKS_BLOCK.get();
          simpleBlock(onion_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block onion_chiseled_block = foodblockcompatregistry.ONION_CHISELED_BLOCK.get();
          simpleBlock(onion_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block onion_tiles_block = foodblockcompatregistry.ONION_TILES_BLOCK.get();
          simpleBlock(onion_tiles_block);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block tomato_block = foodblockcompatregistry.TOMATO_BLOCK.get();
          simpleBlock(tomato_block);
      //.........bricks
          net.minecraft.world.level.block.Block tomato_bricks_block = foodblockcompatregistry.TOMATO_BRICKS_BLOCK.get();
          simpleBlock(tomato_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block tomato_chiseled_block = foodblockcompatregistry.TOMATO_CHISELED_BLOCK.get();
          simpleBlock(tomato_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block tomato_tiles_block = foodblockcompatregistry.TOMATO_TILES_BLOCK.get();
          simpleBlock(tomato_tiles_block);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block pecan_block = foodblockcompatregistry.PECAN_BLOCK.get();
          simpleBlock(pecan_block);
      //.........bricks
          net.minecraft.world.level.block.Block pecan_bricks_block = foodblockcompatregistry.PECAN_BRICKS_BLOCK.get();
          simpleBlock(pecan_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block pecan_chiseled_block = foodblockcompatregistry.PECAN_CHISELED_BLOCK.get();
          simpleBlock(pecan_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block pecan_tiles_block = foodblockcompatregistry.PECAN_TILES_BLOCK.get();
          simpleBlock(pecan_tiles_block);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block almond_block = foodblockcompatregistry.ALMOND_BLOCK.get();
          simpleBlock(almond_block);
      //.........bricks
          net.minecraft.world.level.block.Block almond_bricks_block = foodblockcompatregistry.ALMOND_BRICKS_BLOCK.get();
          simpleBlock(almond_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block almond_chiseled_block = foodblockcompatregistry.ALMOND_CHISELED_BLOCK.get();
          simpleBlock(almond_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block almond_tiles_block = foodblockcompatregistry.ALMOND_TILES_BLOCK.get();
          simpleBlock(almond_tiles_block);
    //==============================================================================================================================================
    //|                                                              Slabs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          SlabBlock elderberry_slab = foodblockcompatregistry.ELDERBERRY_SLAB.get();
          ResourceLocation elderberry_block_texture = modLoc("block/elderberry_block");
          slabBlock(elderberry_slab, elderberry_block_texture, elderberry_block_texture);
      //.........bricks
          SlabBlock elderberry_bricks_slab = foodblockcompatregistry.ELDERBERRY_BRICKS_SLAB.get();
          ResourceLocation elderberry_bricks_block_texture = modLoc("block/elderberry_bricks_block");
          slabBlock(elderberry_bricks_slab, elderberry_bricks_block_texture, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          SlabBlock juniper_slab = foodblockcompatregistry.JUNIPER_SLAB.get();
          ResourceLocation juniper_block_texture = modLoc("block/juniper_block");
          slabBlock(juniper_slab, juniper_block_texture, juniper_block_texture);
      //.........bricks
          SlabBlock juniper_bricks_slab = foodblockcompatregistry.JUNIPER_BRICKS_SLAB.get();
          ResourceLocation juniper_bricks_block_texture = modLoc("block/juniper_bricks_block");
          slabBlock(juniper_bricks_slab, juniper_bricks_block_texture, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          SlabBlock cherry_slab = foodblockcompatregistry.CHERRY_SLAB.get();
          ResourceLocation cherry_block_texture = modLoc("block/cherry_block");
          slabBlock(cherry_slab, cherry_block_texture, cherry_block_texture);
      //.........bricks
          SlabBlock cherry_bricks_slab = foodblockcompatregistry.CHERRY_BRICKS_SLAB.get();
          ResourceLocation cherry_bricks_block_texture = modLoc("block/cherry_bricks_block");
          slabBlock(cherry_bricks_slab, cherry_bricks_block_texture, cherry_bricks_block_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
      //.........plain
          SlabBlock blackcherry_slab = foodblockcompatregistry.BLACKCHERRY_SLAB.get();
          ResourceLocation blackcherry_block_texture = modLoc("block/blackcherry_block");
          slabBlock(blackcherry_slab, blackcherry_block_texture, blackcherry_block_texture);
      //.........bricks
          SlabBlock blackcherry_bricks_slab = foodblockcompatregistry.BLACKCHERRY_BRICKS_SLAB.get();
          ResourceLocation blackcherry_bricks_block_texture = modLoc("block/blackcherry_bricks_block");
          slabBlock(blackcherry_bricks_slab, blackcherry_bricks_block_texture, blackcherry_bricks_block_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
      //.........plain
          SlabBlock peach_slab = foodblockcompatregistry.PEACH_SLAB.get();
          ResourceLocation peach_block_texture = modLoc("block/peach_block");
          slabBlock(peach_slab, peach_block_texture, peach_block_texture);
      //.........bricks
          SlabBlock peach_bricks_slab = foodblockcompatregistry.PEACH_BRICKS_SLAB.get();
          ResourceLocation peach_bricks_block_texture = modLoc("block/peach_bricks_block");
          slabBlock(peach_bricks_slab, peach_bricks_block_texture, peach_bricks_block_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          SlabBlock coconut_slab = foodblockcompatregistry.COCONUT_SLAB.get();
          ResourceLocation coconut_block_texture = modLoc("block/coconut_block");
          slabBlock(coconut_slab, coconut_block_texture, coconut_block_texture);
      //.........bricks
          SlabBlock coconut_bricks_slab = foodblockcompatregistry.COCONUT_BRICKS_SLAB.get();
          ResourceLocation coconut_bricks_block_texture = modLoc("block/coconut_bricks_block");
          slabBlock(coconut_bricks_slab, coconut_bricks_block_texture, coconut_bricks_block_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          SlabBlock orange_slab = foodblockcompatregistry.ORANGE_SLAB.get();
          ResourceLocation orange_block_texture = modLoc("block/orange_block");
          slabBlock(orange_slab, orange_block_texture, orange_block_texture);
      //.........bricks
          SlabBlock orange_bricks_slab = foodblockcompatregistry.ORANGE_BRICKS_SLAB.get();
          ResourceLocation orange_bricks_block_texture = modLoc("block/orange_bricks_block");
          slabBlock(orange_bricks_slab, orange_bricks_block_texture, orange_bricks_block_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
      //.........plain
          SlabBlock tangerine_slab = foodblockcompatregistry.TANGERINE_SLAB.get();
          ResourceLocation tangerine_block_texture = modLoc("block/tangerine_block");
          slabBlock(tangerine_slab, tangerine_block_texture, tangerine_block_texture);
      //.........bricks
          SlabBlock tangerine_bricks_slab = foodblockcompatregistry.TANGERINE_BRICKS_SLAB.get();
          ResourceLocation tangerine_bricks_block_texture = modLoc("block/tangerine_bricks_block");
          slabBlock(tangerine_bricks_slab, tangerine_bricks_block_texture, tangerine_bricks_block_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
      //.........plain
          SlabBlock kumquat_slab = foodblockcompatregistry.KUMQUAT_SLAB.get();
          ResourceLocation kumquat_block_texture = modLoc("block/kumquat_block");
          slabBlock(kumquat_slab, kumquat_block_texture, kumquat_block_texture);
      //.........bricks
          SlabBlock kumquat_bricks_slab = foodblockcompatregistry.KUMQUAT_BRICKS_SLAB.get();
          ResourceLocation kumquat_bricks_block_texture = modLoc("block/kumquat_bricks_block");
          slabBlock(kumquat_bricks_slab, kumquat_bricks_block_texture, kumquat_bricks_block_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
      //.........plain
          SlabBlock persimmon_slab = foodblockcompatregistry.PERSIMMON_SLAB.get();
          ResourceLocation persimmon_block_texture = modLoc("block/persimmon_block");
          slabBlock(persimmon_slab, persimmon_block_texture, persimmon_block_texture);
      //.........bricks
          SlabBlock persimmon_bricks_slab = foodblockcompatregistry.PERSIMMON_BRICKS_SLAB.get();
          ResourceLocation persimmon_bricks_block_texture = modLoc("block/persimmon_bricks_block");
          slabBlock(persimmon_bricks_slab, persimmon_bricks_block_texture, persimmon_bricks_block_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
      //.........plain
          SlabBlock satsuma_slab = foodblockcompatregistry.SATSUMA_SLAB.get();
          ResourceLocation satsuma_block_texture = modLoc("block/satsuma_block");
          slabBlock(satsuma_slab, satsuma_block_texture, satsuma_block_texture);
      //.........bricks
          SlabBlock satsuma_bricks_slab = foodblockcompatregistry.SATSUMA_BRICKS_SLAB.get();
          ResourceLocation satsuma_bricks_block_texture = modLoc("block/satsuma_bricks_block");
          slabBlock(satsuma_bricks_slab, satsuma_bricks_block_texture, satsuma_bricks_block_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
      //.........plain
          SlabBlock mandarin_slab = foodblockcompatregistry.MANDARIN_SLAB.get();
          ResourceLocation mandarin_block_texture = modLoc("block/mandarin_block");
          slabBlock(mandarin_slab, mandarin_block_texture, mandarin_block_texture);
      //.........bricks
          SlabBlock mandarin_bricks_slab = foodblockcompatregistry.MANDARIN_BRICKS_SLAB.get();
          ResourceLocation mandarin_bricks_block_texture = modLoc("block/mandarin_bricks_block");
          slabBlock(mandarin_bricks_slab, mandarin_bricks_block_texture, mandarin_bricks_block_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
      //.........plain
          SlabBlock lemon_slab = foodblockcompatregistry.LEMON_SLAB.get();
          ResourceLocation lemon_block_texture = modLoc("block/lemon_block");
          slabBlock(lemon_slab, lemon_block_texture, lemon_block_texture);
      //.........bricks
          SlabBlock lemon_bricks_slab = foodblockcompatregistry.LEMON_BRICKS_SLAB.get();
          ResourceLocation lemon_bricks_block_texture = modLoc("block/lemon_bricks_block");
          slabBlock(lemon_bricks_slab, lemon_bricks_block_texture, lemon_bricks_block_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
      //.........plain
          SlabBlock citron_slab = foodblockcompatregistry.CITRON_SLAB.get();
          ResourceLocation citron_block_texture = modLoc("block/citron_block");
          slabBlock(citron_slab, citron_block_texture, citron_block_texture);
      //.........bricks
          SlabBlock citron_bricks_slab = foodblockcompatregistry.CITRON_BRICKS_SLAB.get();
          ResourceLocation citron_bricks_block_texture = modLoc("block/citron_bricks_block");
          slabBlock(citron_bricks_slab, citron_bricks_block_texture, citron_bricks_block_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
      //.........plain
          SlabBlock buddhashand_slab = foodblockcompatregistry.BUDDHASHAND_SLAB.get();
          ResourceLocation buddhashand_block_texture = modLoc("block/buddhashand_block");
          slabBlock(buddhashand_slab, buddhashand_block_texture, buddhashand_block_texture);
      //.........bricks
          SlabBlock buddhashand_bricks_slab = foodblockcompatregistry.BUDDHASHAND_BRICKS_SLAB.get();
          ResourceLocation buddhashand_bricks_block_texture = modLoc("block/buddhashand_bricks_block");
          slabBlock(buddhashand_bricks_slab, buddhashand_bricks_block_texture, buddhashand_bricks_block_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
      //.........plain
          SlabBlock lime_slab = foodblockcompatregistry.LIME_SLAB.get();
          ResourceLocation lime_block_texture = modLoc("block/lime_block");
          slabBlock(lime_slab, lime_block_texture, lime_block_texture);
      //.........bricks
          SlabBlock lime_bricks_slab = foodblockcompatregistry.LIME_BRICKS_SLAB.get();
          ResourceLocation lime_bricks_block_texture = modLoc("block/lime_bricks_block");
          slabBlock(lime_bricks_slab, lime_bricks_block_texture, lime_bricks_block_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
      //.........plain
          SlabBlock keylime_slab = foodblockcompatregistry.KEYLIME_SLAB.get();
          ResourceLocation keylime_block_texture = modLoc("block/keylime_block");
          slabBlock(keylime_slab, keylime_block_texture, keylime_block_texture);
      //.........bricks
          SlabBlock keylime_bricks_slab = foodblockcompatregistry.KEYLIME_BRICKS_SLAB.get();
          ResourceLocation keylime_bricks_block_texture = modLoc("block/keylime_bricks_block");
          slabBlock(keylime_bricks_slab, keylime_bricks_block_texture, keylime_bricks_block_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
      //.........plain
          SlabBlock fingerlime_slab = foodblockcompatregistry.FINGERLIME_SLAB.get();
          ResourceLocation fingerlime_block_texture = modLoc("block/fingerlime_block");
          slabBlock(fingerlime_slab, fingerlime_block_texture, fingerlime_block_texture);
      //.........bricks
          SlabBlock fingerlime_bricks_slab = foodblockcompatregistry.FINGERLIME_BRICKS_SLAB.get();
          ResourceLocation fingerlime_bricks_block_texture = modLoc("block/fingerlime_bricks_block");
          slabBlock(fingerlime_bricks_slab, fingerlime_bricks_block_texture, fingerlime_bricks_block_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
      //.........plain
          SlabBlock grapefruit_slab = foodblockcompatregistry.GRAPEFRUIT_SLAB.get();
          ResourceLocation grapefruit_block_texture = modLoc("block/grapefruit_block");
          slabBlock(grapefruit_slab, grapefruit_block_texture, grapefruit_block_texture);
      //.........bricks
          SlabBlock grapefruit_bricks_slab = foodblockcompatregistry.GRAPEFRUIT_BRICKS_SLAB.get();
          ResourceLocation grapefruit_bricks_block_texture = modLoc("block/grapefruit_bricks_block");
          slabBlock(grapefruit_bricks_slab, grapefruit_bricks_block_texture, grapefruit_bricks_block_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
      //.........plain
          SlabBlock pomelo_slab = foodblockcompatregistry.POMELO_SLAB.get();
          ResourceLocation pomelo_block_texture = modLoc("block/pomelo_block");
          slabBlock(pomelo_slab, pomelo_block_texture, pomelo_block_texture);
      //.........bricks
          SlabBlock pomelo_bricks_slab = foodblockcompatregistry.POMELO_BRICKS_SLAB.get();
          ResourceLocation pomelo_bricks_block_texture = modLoc("block/pomelo_bricks_block");
          slabBlock(pomelo_bricks_slab, pomelo_bricks_block_texture, pomelo_bricks_block_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          SlabBlock corn_slab = foodblockcompatregistry.CORN_SLAB.get();
          ResourceLocation corn_block_texture = modLoc("block/corn_block");
          slabBlock(corn_slab, corn_block_texture, corn_block_texture);
      //.........bricks
          SlabBlock corn_bricks_slab = foodblockcompatregistry.CORN_BRICKS_SLAB.get();
          ResourceLocation corn_bricks_block_texture = modLoc("block/corn_bricks_block");
          slabBlock(corn_bricks_slab, corn_bricks_block_texture, corn_bricks_block_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          SlabBlock onion_slab = foodblockcompatregistry.ONION_SLAB.get();
          ResourceLocation onion_block_texture = modLoc("block/onion_block");
          slabBlock(onion_slab, onion_block_texture, onion_block_texture);
      //.........bricks
          SlabBlock onion_bricks_slab = foodblockcompatregistry.ONION_BRICKS_SLAB.get();
          ResourceLocation onion_bricks_block_texture = modLoc("block/onion_bricks_block");
          slabBlock(onion_bricks_slab, onion_bricks_block_texture, onion_bricks_block_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
      //.........plain
          SlabBlock tomato_slab = foodblockcompatregistry.TOMATO_SLAB.get();
          ResourceLocation tomato_block_texture = modLoc("block/tomato_block");
          slabBlock(tomato_slab, tomato_block_texture, tomato_block_texture);
      //.........bricks
          SlabBlock tomato_bricks_slab = foodblockcompatregistry.TOMATO_BRICKS_SLAB.get();
          ResourceLocation tomato_bricks_block_texture = modLoc("block/tomato_bricks_block");
          slabBlock(tomato_bricks_slab, tomato_bricks_block_texture, tomato_bricks_block_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
      //.........plain
          SlabBlock pecan_slab = foodblockcompatregistry.PECAN_SLAB.get();
          ResourceLocation pecan_block_texture = modLoc("block/pecan_block");
          slabBlock(pecan_slab, pecan_block_texture, pecan_block_texture);
      //.........bricks
          SlabBlock pecan_bricks_slab = foodblockcompatregistry.PECAN_BRICKS_SLAB.get();
          ResourceLocation pecan_bricks_block_texture = modLoc("block/pecan_bricks_block");
          slabBlock(pecan_bricks_slab, pecan_bricks_block_texture, pecan_bricks_block_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
      //.........plain
          SlabBlock almond_slab = foodblockcompatregistry.ALMOND_SLAB.get();
          ResourceLocation almond_block_texture = modLoc("block/almond_block");
          slabBlock(almond_slab, almond_block_texture, almond_block_texture);
      //.........bricks
          SlabBlock almond_bricks_slab = foodblockcompatregistry.ALMOND_BRICKS_SLAB.get();
          ResourceLocation almond_bricks_block_texture = modLoc("block/almond_bricks_block");
          slabBlock(almond_bricks_slab, almond_bricks_block_texture, almond_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                              Stairs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          StairBlock elderberry_stairs = foodblockcompatregistry.ELDERBERRY_STAIRS.get();
          stairsBlock(elderberry_stairs, elderberry_block_texture);
      //.........bricks
          StairBlock elderberry_bricks_stairs = foodblockcompatregistry.ELDERBERRY_BRICKS_STAIRS.get();
          stairsBlock(elderberry_bricks_stairs, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          StairBlock juniper_stairs = foodblockcompatregistry.JUNIPER_STAIRS.get();
          stairsBlock(juniper_stairs, juniper_block_texture);
      //.........bricks
          StairBlock juniper_bricks_stairs = foodblockcompatregistry.JUNIPER_BRICKS_STAIRS.get();
          stairsBlock(juniper_bricks_stairs, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          StairBlock cherry_stairs = foodblockcompatregistry.CHERRY_STAIRS.get();
          stairsBlock(cherry_stairs, cherry_block_texture);
      //.........bricks
          StairBlock cherry_bricks_stairs = foodblockcompatregistry.CHERRY_BRICKS_STAIRS.get();
          stairsBlock(cherry_bricks_stairs, cherry_bricks_block_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
      //.........plain
          StairBlock blackcherry_stairs = foodblockcompatregistry.BLACKCHERRY_STAIRS.get();
          stairsBlock(blackcherry_stairs, blackcherry_block_texture);
      //.........bricks
          StairBlock blackcherry_bricks_stairs = foodblockcompatregistry.BLACKCHERRY_BRICKS_STAIRS.get();
          stairsBlock(blackcherry_bricks_stairs, blackcherry_bricks_block_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
      //.........plain
          StairBlock peach_stairs = foodblockcompatregistry.PEACH_STAIRS.get();
          stairsBlock(peach_stairs, peach_block_texture);
      //.........bricks
          StairBlock peach_bricks_stairs = foodblockcompatregistry.PEACH_BRICKS_STAIRS.get();
          stairsBlock(peach_bricks_stairs, peach_bricks_block_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          StairBlock coconut_stairs = foodblockcompatregistry.COCONUT_STAIRS.get();
          stairsBlock(coconut_stairs, coconut_block_texture);
      //.........bricks
          StairBlock coconut_bricks_stairs = foodblockcompatregistry.COCONUT_BRICKS_STAIRS.get();
          stairsBlock(coconut_bricks_stairs, coconut_bricks_block_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          StairBlock orange_stairs = foodblockcompatregistry.ORANGE_STAIRS.get();
          stairsBlock(orange_stairs, orange_block_texture);
      //.........bricks
          StairBlock orange_bricks_stairs = foodblockcompatregistry.ORANGE_BRICKS_STAIRS.get();
          stairsBlock(orange_bricks_stairs, orange_bricks_block_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
      //.........plain
          StairBlock tangerine_stairs = foodblockcompatregistry.TANGERINE_STAIRS.get();
          stairsBlock(tangerine_stairs, tangerine_block_texture);
      //.........bricks
          StairBlock tangerine_bricks_stairs = foodblockcompatregistry.TANGERINE_BRICKS_STAIRS.get();
          stairsBlock(tangerine_bricks_stairs, tangerine_bricks_block_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
      //.........plain
          StairBlock kumquat_stairs = foodblockcompatregistry.KUMQUAT_STAIRS.get();
          stairsBlock(kumquat_stairs, kumquat_block_texture);
      //.........bricks
          StairBlock kumquat_bricks_stairs = foodblockcompatregistry.KUMQUAT_BRICKS_STAIRS.get();
          stairsBlock(kumquat_bricks_stairs, kumquat_bricks_block_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
      //.........plain
          StairBlock persimmon_stairs = foodblockcompatregistry.PERSIMMON_STAIRS.get();
          stairsBlock(persimmon_stairs, persimmon_block_texture);
      //.........bricks
          StairBlock persimmon_bricks_stairs = foodblockcompatregistry.PERSIMMON_BRICKS_STAIRS.get();
          stairsBlock(persimmon_bricks_stairs, persimmon_bricks_block_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
      //.........plain
          StairBlock satsuma_stairs = foodblockcompatregistry.SATSUMA_STAIRS.get();
          stairsBlock(satsuma_stairs, satsuma_block_texture);
      //.........bricks
          StairBlock satsuma_bricks_stairs = foodblockcompatregistry.SATSUMA_BRICKS_STAIRS.get();
          stairsBlock(satsuma_bricks_stairs, satsuma_bricks_block_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
      //.........plain
          StairBlock mandarin_stairs = foodblockcompatregistry.MANDARIN_STAIRS.get();
          stairsBlock(mandarin_stairs, mandarin_block_texture);
      //.........bricks
          StairBlock mandarin_bricks_stairs = foodblockcompatregistry.MANDARIN_BRICKS_STAIRS.get();
          stairsBlock(mandarin_bricks_stairs, mandarin_bricks_block_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
      //.........plain
          StairBlock lemon_stairs = foodblockcompatregistry.LEMON_STAIRS.get();
          stairsBlock(lemon_stairs, lemon_block_texture);
      //.........bricks
          StairBlock lemon_bricks_stairs = foodblockcompatregistry.LEMON_BRICKS_STAIRS.get();
          stairsBlock(lemon_bricks_stairs, lemon_bricks_block_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
      //.........plain
          StairBlock citron_stairs = foodblockcompatregistry.CITRON_STAIRS.get();
          stairsBlock(citron_stairs, citron_block_texture);
      //.........bricks
          StairBlock citron_bricks_stairs = foodblockcompatregistry.CITRON_BRICKS_STAIRS.get();
          stairsBlock(citron_bricks_stairs, citron_bricks_block_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
      //.........plain
          StairBlock buddhashand_stairs = foodblockcompatregistry.BUDDHASHAND_STAIRS.get();
          stairsBlock(buddhashand_stairs, buddhashand_block_texture);
      //.........bricks
          StairBlock buddhashand_bricks_stairs = foodblockcompatregistry.BUDDHASHAND_BRICKS_STAIRS.get();
          stairsBlock(buddhashand_bricks_stairs, buddhashand_bricks_block_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
      //.........plain
          StairBlock lime_stairs = foodblockcompatregistry.LIME_STAIRS.get();
          stairsBlock(lime_stairs, lime_block_texture);
      //.........bricks
          StairBlock lime_bricks_stairs = foodblockcompatregistry.LIME_BRICKS_STAIRS.get();
          stairsBlock(lime_bricks_stairs, lime_bricks_block_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
      //.........plain
          StairBlock keylime_stairs = foodblockcompatregistry.KEYLIME_STAIRS.get();
          stairsBlock(keylime_stairs, keylime_block_texture);
      //.........bricks
          StairBlock keylime_bricks_stairs = foodblockcompatregistry.KEYLIME_BRICKS_STAIRS.get();
          stairsBlock(keylime_bricks_stairs, keylime_bricks_block_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
      //.........plain
          StairBlock fingerlime_stairs = foodblockcompatregistry.FINGERLIME_STAIRS.get();
          stairsBlock(fingerlime_stairs, fingerlime_block_texture);
      //.........bricks
          StairBlock fingerlime_bricks_stairs = foodblockcompatregistry.FINGERLIME_BRICKS_STAIRS.get();
          stairsBlock(fingerlime_bricks_stairs, fingerlime_bricks_block_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
      //.........plain
          StairBlock grapefruit_stairs = foodblockcompatregistry.GRAPEFRUIT_STAIRS.get();
          stairsBlock(grapefruit_stairs, grapefruit_block_texture);
      //.........bricks
          StairBlock grapefruit_bricks_stairs = foodblockcompatregistry.GRAPEFRUIT_BRICKS_STAIRS.get();
          stairsBlock(grapefruit_bricks_stairs, grapefruit_bricks_block_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
      //.........plain
          StairBlock pomelo_stairs = foodblockcompatregistry.POMELO_STAIRS.get();
          stairsBlock(pomelo_stairs, pomelo_block_texture);
      //.........bricks
          StairBlock pomelo_bricks_stairs = foodblockcompatregistry.POMELO_BRICKS_STAIRS.get();
          stairsBlock(pomelo_bricks_stairs, pomelo_bricks_block_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          StairBlock corn_stairs = foodblockcompatregistry.CORN_STAIRS.get();
          stairsBlock(corn_stairs, corn_block_texture);
      //.........bricks
          StairBlock corn_bricks_stairs = foodblockcompatregistry.CORN_BRICKS_STAIRS.get();
          stairsBlock(corn_bricks_stairs, corn_bricks_block_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          StairBlock onion_stairs = foodblockcompatregistry.ONION_STAIRS.get();
          stairsBlock(onion_stairs, onion_block_texture);
      //.........bricks
          StairBlock onion_bricks_stairs = foodblockcompatregistry.ONION_BRICKS_STAIRS.get();
          stairsBlock(onion_bricks_stairs, onion_bricks_block_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
      //.........plain
          StairBlock tomato_stairs = foodblockcompatregistry.TOMATO_STAIRS.get();
          stairsBlock(tomato_stairs, tomato_block_texture);
      //.........bricks
          StairBlock tomato_bricks_stairs = foodblockcompatregistry.TOMATO_BRICKS_STAIRS.get();
          stairsBlock(tomato_bricks_stairs, tomato_bricks_block_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
      //.........plain
          StairBlock pecan_stairs = foodblockcompatregistry.PECAN_STAIRS.get();
          stairsBlock(pecan_stairs, pecan_block_texture);
      //.........bricks
          StairBlock pecan_bricks_stairs = foodblockcompatregistry.PECAN_BRICKS_STAIRS.get();
          stairsBlock(pecan_bricks_stairs, pecan_bricks_block_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
      //.........plain
          StairBlock almond_stairs = foodblockcompatregistry.ALMOND_STAIRS.get();
          stairsBlock(almond_stairs, almond_block_texture);
      //.........bricks
          StairBlock almond_bricks_stairs = foodblockcompatregistry.ALMOND_BRICKS_STAIRS.get();
          stairsBlock(almond_bricks_stairs, almond_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                               Bars                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          IronBarsBlock elderberry_bars = foodblockcompatregistry.ELDERBERRY_BARS.get(); 
          ResourceLocation elderberry_bars_texture = modLoc("block/elderberry_bars");
          ResourceLocation elderberry_bars_rim_texture = modLoc("block/elderberry_block");
          paneBlockWithRenderType(elderberry_bars, "elderberry_bars", elderberry_bars_texture, elderberry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          IronBarsBlock juniper_bars = foodblockcompatregistry.JUNIPER_BARS.get(); 
          ResourceLocation juniper_bars_texture = modLoc("block/juniper_bars");
          ResourceLocation juniper_bars_rim_texture = modLoc("block/juniper_block");
          paneBlockWithRenderType(juniper_bars, "juniper_bars", juniper_bars_texture, juniper_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          IronBarsBlock cherry_bars = foodblockcompatregistry.CHERRY_BARS.get(); 
          ResourceLocation cherry_bars_texture = modLoc("block/cherry_bars");
          ResourceLocation cherry_bars_rim_texture = modLoc("block/cherry_block");
          paneBlockWithRenderType(cherry_bars, "cherry_bars", cherry_bars_texture, cherry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          IronBarsBlock blackcherry_bars = foodblockcompatregistry.BLACKCHERRY_BARS.get(); 
          ResourceLocation blackcherry_bars_texture = modLoc("block/blackcherry_bars");
          ResourceLocation blackcherry_bars_rim_texture = modLoc("block/blackcherry_block");
          paneBlockWithRenderType(blackcherry_bars, "blackcherry_bars", blackcherry_bars_texture, blackcherry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          IronBarsBlock peach_bars = foodblockcompatregistry.PEACH_BARS.get(); 
          ResourceLocation peach_bars_texture = modLoc("block/peach_bars");
          ResourceLocation peach_bars_rim_texture = modLoc("block/peach_block");
          paneBlockWithRenderType(peach_bars, "peach_bars", peach_bars_texture, peach_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          IronBarsBlock coconut_bars = foodblockcompatregistry.COCONUT_BARS.get(); 
          ResourceLocation coconut_bars_texture = modLoc("block/coconut_bars");
          ResourceLocation coconut_bars_rim_texture = modLoc("block/coconut_block");
          paneBlockWithRenderType(coconut_bars, "coconut_bars", coconut_bars_texture, coconut_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          IronBarsBlock orange_bars = foodblockcompatregistry.ORANGE_BARS.get(); 
          ResourceLocation orange_bars_texture = modLoc("block/orange_bars");
          ResourceLocation orange_bars_rim_texture = modLoc("block/orange_block");
          paneBlockWithRenderType(orange_bars, "orange_bars", orange_bars_texture, orange_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          IronBarsBlock tangerine_bars = foodblockcompatregistry.TANGERINE_BARS.get(); 
          ResourceLocation tangerine_bars_texture = modLoc("block/tangerine_bars");
          ResourceLocation tangerine_bars_rim_texture = modLoc("block/tangerine_block");
          paneBlockWithRenderType(tangerine_bars, "tangerine_bars", tangerine_bars_texture, tangerine_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          IronBarsBlock kumquat_bars = foodblockcompatregistry.KUMQUAT_BARS.get(); 
          ResourceLocation kumquat_bars_texture = modLoc("block/kumquat_bars");
          ResourceLocation kumquat_bars_rim_texture = modLoc("block/kumquat_block");
          paneBlockWithRenderType(kumquat_bars, "kumquat_bars", kumquat_bars_texture, kumquat_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          IronBarsBlock persimmon_bars = foodblockcompatregistry.PERSIMMON_BARS.get(); 
          ResourceLocation persimmon_bars_texture = modLoc("block/persimmon_bars");
          ResourceLocation persimmon_bars_rim_texture = modLoc("block/persimmon_block");
          paneBlockWithRenderType(persimmon_bars, "persimmon_bars", persimmon_bars_texture, persimmon_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          IronBarsBlock satsuma_bars = foodblockcompatregistry.SATSUMA_BARS.get(); 
          ResourceLocation satsuma_bars_texture = modLoc("block/satsuma_bars");
          ResourceLocation satsuma_bars_rim_texture = modLoc("block/satsuma_block");
          paneBlockWithRenderType(satsuma_bars, "satsuma_bars", satsuma_bars_texture, satsuma_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          IronBarsBlock mandarin_bars = foodblockcompatregistry.MANDARIN_BARS.get(); 
          ResourceLocation mandarin_bars_texture = modLoc("block/mandarin_bars");
          ResourceLocation mandarin_bars_rim_texture = modLoc("block/mandarin_block");
          paneBlockWithRenderType(mandarin_bars, "mandarin_bars", mandarin_bars_texture, mandarin_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          IronBarsBlock lemon_bars = foodblockcompatregistry.LEMON_BARS.get(); 
          ResourceLocation lemon_bars_texture = modLoc("block/lemon_bars");
          ResourceLocation lemon_bars_rim_texture = modLoc("block/lemon_block");
          paneBlockWithRenderType(lemon_bars, "lemon_bars", lemon_bars_texture, lemon_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          IronBarsBlock citron_bars = foodblockcompatregistry.CITRON_BARS.get(); 
          ResourceLocation citron_bars_texture = modLoc("block/citron_bars");
          ResourceLocation citron_bars_rim_texture = modLoc("block/citron_block");
          paneBlockWithRenderType(citron_bars, "citron_bars", citron_bars_texture, citron_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          IronBarsBlock buddhashand_bars = foodblockcompatregistry.BUDDHASHAND_BARS.get(); 
          ResourceLocation buddhashand_bars_texture = modLoc("block/buddhashand_bars");
          ResourceLocation buddhashand_bars_rim_texture = modLoc("block/buddhashand_block");
          paneBlockWithRenderType(buddhashand_bars, "buddhashand_bars", buddhashand_bars_texture, buddhashand_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          IronBarsBlock lime_bars = foodblockcompatregistry.LIME_BARS.get(); 
          ResourceLocation lime_bars_texture = modLoc("block/lime_bars");
          ResourceLocation lime_bars_rim_texture = modLoc("block/lime_block");
          paneBlockWithRenderType(lime_bars, "lime_bars", lime_bars_texture, lime_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          IronBarsBlock keylime_bars = foodblockcompatregistry.KEYLIME_BARS.get(); 
          ResourceLocation keylime_bars_texture = modLoc("block/keylime_bars");
          ResourceLocation keylime_bars_rim_texture = modLoc("block/keylime_block");
          paneBlockWithRenderType(keylime_bars, "keylime_bars", keylime_bars_texture, keylime_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          IronBarsBlock fingerlime_bars = foodblockcompatregistry.FINGERLIME_BARS.get(); 
          ResourceLocation fingerlime_bars_texture = modLoc("block/fingerlime_bars");
          ResourceLocation fingerlime_bars_rim_texture = modLoc("block/fingerlime_block");
          paneBlockWithRenderType(fingerlime_bars, "fingerlime_bars", fingerlime_bars_texture, fingerlime_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          IronBarsBlock grapefruit_bars = foodblockcompatregistry.GRAPEFRUIT_BARS.get(); 
          ResourceLocation grapefruit_bars_texture = modLoc("block/grapefruit_bars");
          ResourceLocation grapefruit_bars_rim_texture = modLoc("block/grapefruit_block");
          paneBlockWithRenderType(grapefruit_bars, "grapefruit_bars", grapefruit_bars_texture, grapefruit_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          IronBarsBlock pomelo_bars = foodblockcompatregistry.POMELO_BARS.get(); 
          ResourceLocation pomelo_bars_texture = modLoc("block/pomelo_bars");
          ResourceLocation pomelo_bars_rim_texture = modLoc("block/pomelo_block");
          paneBlockWithRenderType(pomelo_bars, "pomelo_bars", pomelo_bars_texture, pomelo_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          IronBarsBlock corn_bars = foodblockcompatregistry.CORN_BARS.get(); 
          ResourceLocation corn_bars_texture = modLoc("block/corn_bars");
          ResourceLocation corn_bars_rim_texture = modLoc("block/corn_block");
          paneBlockWithRenderType(corn_bars, "corn_bars", corn_bars_texture, corn_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          IronBarsBlock onion_bars = foodblockcompatregistry.ONION_BARS.get(); 
          ResourceLocation onion_bars_texture = modLoc("block/onion_bars");
          ResourceLocation onion_bars_rim_texture = modLoc("block/onion_block");
          paneBlockWithRenderType(onion_bars, "onion_bars", onion_bars_texture, onion_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          IronBarsBlock tomato_bars = foodblockcompatregistry.TOMATO_BARS.get(); 
          ResourceLocation tomato_bars_texture = modLoc("block/tomato_bars");
          ResourceLocation tomato_bars_rim_texture = modLoc("block/tomato_block");
          paneBlockWithRenderType(tomato_bars, "tomato_bars", tomato_bars_texture, tomato_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          IronBarsBlock pecan_bars = foodblockcompatregistry.PECAN_BARS.get(); 
          ResourceLocation pecan_bars_texture = modLoc("block/pecan_bars");
          ResourceLocation pecan_bars_rim_texture = modLoc("block/pecan_block");
          paneBlockWithRenderType(pecan_bars, "pecan_bars", pecan_bars_texture, pecan_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          IronBarsBlock almond_bars = foodblockcompatregistry.ALMOND_BARS.get(); 
          ResourceLocation almond_bars_texture = modLoc("block/almond_bars");
          ResourceLocation almond_bars_rim_texture = modLoc("block/almond_block");
          paneBlockWithRenderType(almond_bars, "almond_bars", almond_bars_texture, almond_bars_rim_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                               Door                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          DoorBlock elderberry_door = foodblockcompatregistry.ELDERBERRY_DOOR.get(); 
          ResourceLocation elderberry_door_top_texture = modLoc("block/elderberry_door_top");
          ResourceLocation elderberry_door_bottom_texture = modLoc("block/elderberry_door_bottom");
          doorBlockWithRenderType(elderberry_door, "elderberry_door", elderberry_door_bottom_texture, elderberry_door_top_texture, "translucent"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          DoorBlock juniper_door = foodblockcompatregistry.JUNIPER_DOOR.get(); 
          ResourceLocation juniper_door_top_texture = modLoc("block/juniper_door_top");
          ResourceLocation juniper_door_bottom_texture = modLoc("block/juniper_door_bottom");
          doorBlockWithRenderType(juniper_door, "juniper_door", juniper_door_bottom_texture, juniper_door_top_texture, "translucent"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          DoorBlock cherry_door = foodblockcompatregistry.CHERRY_DOOR.get(); 
          ResourceLocation cherry_door_top_texture = modLoc("block/cherry_door_top");
          ResourceLocation cherry_door_bottom_texture = modLoc("block/cherry_door_bottom");
          doorBlockWithRenderType(cherry_door, "cherry_door", cherry_door_top_texture, cherry_door_bottom_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          DoorBlock blackcherry_door = foodblockcompatregistry.BLACKCHERRY_DOOR.get(); 
          ResourceLocation blackcherry_door_top_texture = modLoc("block/blackcherry_door_top");
          ResourceLocation blackcherry_door_bottom_texture = modLoc("block/blackcherry_door_bottom");
          doorBlockWithRenderType(blackcherry_door, "blackcherry_door", blackcherry_door_bottom_texture, blackcherry_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          DoorBlock peach_door = foodblockcompatregistry.PEACH_DOOR.get(); 
          ResourceLocation peach_door_top_texture = modLoc("block/peach_door_top");
          ResourceLocation peach_door_bottom_texture = modLoc("block/peach_door_bottom");
          doorBlockWithRenderType(peach_door, "peach_door", peach_door_bottom_texture, peach_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          DoorBlock coconut_door = foodblockcompatregistry.COCONUT_DOOR.get(); 
          ResourceLocation coconut_door_top_texture = modLoc("block/coconut_door_top");
          ResourceLocation coconut_door_bottom_texture = modLoc("block/coconut_door_bottom");
          doorBlockWithRenderType(coconut_door, "coconut_door", coconut_door_bottom_texture, coconut_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          DoorBlock orange_door = foodblockcompatregistry.ORANGE_DOOR.get(); 
          ResourceLocation orange_door_top_texture = modLoc("block/orange_door_top");
          ResourceLocation orange_door_bottom_texture = modLoc("block/orange_door_bottom");
          doorBlockWithRenderType(orange_door, "orange_door", orange_door_bottom_texture, orange_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          DoorBlock tangerine_door = foodblockcompatregistry.TANGERINE_DOOR.get(); 
          ResourceLocation tangerine_door_top_texture = modLoc("block/tangerine_door_top");
          ResourceLocation tangerine_door_bottom_texture = modLoc("block/tangerine_door_bottom");
          doorBlockWithRenderType(tangerine_door, "tangerine_door", tangerine_door_bottom_texture, tangerine_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          DoorBlock kumquat_door = foodblockcompatregistry.KUMQUAT_DOOR.get(); 
          ResourceLocation kumquat_door_top_texture = modLoc("block/kumquat_door_top");
          ResourceLocation kumquat_door_bottom_texture = modLoc("block/kumquat_door_bottom");
          doorBlockWithRenderType(kumquat_door, "kumquat_door", kumquat_door_bottom_texture, kumquat_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          DoorBlock persimmon_door = foodblockcompatregistry.PERSIMMON_DOOR.get(); 
          ResourceLocation persimmon_door_top_texture = modLoc("block/persimmon_door_top");
          ResourceLocation persimmon_door_bottom_texture = modLoc("block/persimmon_door_bottom");
          doorBlockWithRenderType(persimmon_door, "persimmon_door", persimmon_door_bottom_texture, persimmon_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          DoorBlock satsuma_door = foodblockcompatregistry.SATSUMA_DOOR.get(); 
          ResourceLocation satsuma_door_top_texture = modLoc("block/satsuma_door_top");
          ResourceLocation satsuma_door_bottom_texture = modLoc("block/satsuma_door_bottom");
          doorBlockWithRenderType(satsuma_door, "satsuma_door", satsuma_door_bottom_texture, satsuma_door_top_texture, "translucent"); 
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          DoorBlock mandarin_door = foodblockcompatregistry.MANDARIN_DOOR.get(); 
          ResourceLocation mandarin_door_top_texture = modLoc("block/mandarin_door_top");
          ResourceLocation mandarin_door_bottom_texture = modLoc("block/mandarin_door_bottom");
          doorBlockWithRenderType(mandarin_door, "mandarin_door", mandarin_door_bottom_texture, mandarin_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          DoorBlock lemon_door = foodblockcompatregistry.LEMON_DOOR.get(); 
          ResourceLocation lemon_door_top_texture = modLoc("block/lemon_door_top");
          ResourceLocation lemon_door_bottom_texture = modLoc("block/lemon_door_bottom");
          doorBlockWithRenderType(lemon_door, "lemon_door", lemon_door_bottom_texture, lemon_door_top_texture, "translucent"); 
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          DoorBlock citron_door = foodblockcompatregistry.CITRON_DOOR.get(); 
          ResourceLocation citron_door_top_texture = modLoc("block/citron_door_top");
          ResourceLocation citron_door_bottom_texture = modLoc("block/citron_door_bottom");
          doorBlockWithRenderType(citron_door, "citron_door", citron_door_bottom_texture, citron_door_top_texture, "translucent"); 
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          DoorBlock buddhashand_door = foodblockcompatregistry.BUDDHASHAND_DOOR.get(); 
          ResourceLocation buddhashand_door_top_texture = modLoc("block/buddhashand_door_top");
          ResourceLocation buddhashand_door_bottom_texture = modLoc("block/buddhashand_door_bottom");
          doorBlockWithRenderType(buddhashand_door, "buddhashand_door", buddhashand_door_bottom_texture, buddhashand_door_top_texture, "translucent"); 
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          DoorBlock lime_door = foodblockcompatregistry.LIME_DOOR.get(); 
          ResourceLocation lime_door_top_texture = modLoc("block/lime_door_top");
          ResourceLocation lime_door_bottom_texture = modLoc("block/lime_door_bottom");
          doorBlockWithRenderType(lime_door, "lime_door", lime_door_bottom_texture, lime_door_top_texture, "translucent"); 
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          DoorBlock keylime_door = foodblockcompatregistry.KEYLIME_DOOR.get(); 
          ResourceLocation keylime_door_top_texture = modLoc("block/keylime_door_top");
          ResourceLocation keylime_door_bottom_texture = modLoc("block/keylime_door_bottom");
          doorBlockWithRenderType(keylime_door, "keylime_door", keylime_door_bottom_texture, keylime_door_top_texture, "translucent"); 
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          DoorBlock fingerlime_door = foodblockcompatregistry.FINGERLIME_DOOR.get(); 
          ResourceLocation fingerlime_door_top_texture = modLoc("block/fingerlime_door_top");
          ResourceLocation fingerlime_door_bottom_texture = modLoc("block/fingerlime_door_bottom");
          doorBlockWithRenderType(fingerlime_door, "fingerlime_door", fingerlime_door_bottom_texture, fingerlime_door_top_texture, "translucent"); 
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          DoorBlock grapefruit_door = foodblockcompatregistry.GRAPEFRUIT_DOOR.get(); 
          ResourceLocation grapefruit_door_top_texture = modLoc("block/grapefruit_door_top");
          ResourceLocation grapefruit_door_bottom_texture = modLoc("block/grapefruit_door_bottom");
          doorBlockWithRenderType(grapefruit_door, "grapefruit_door", grapefruit_door_bottom_texture, grapefruit_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          DoorBlock pomelo_door = foodblockcompatregistry.POMELO_DOOR.get(); 
          ResourceLocation pomelo_door_top_texture = modLoc("block/pomelo_door_top");
          ResourceLocation pomelo_door_bottom_texture = modLoc("block/pomelo_door_bottom");
          doorBlockWithRenderType(pomelo_door, "pomelo_door", pomelo_door_bottom_texture, pomelo_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          DoorBlock corn_door = foodblockcompatregistry.CORN_DOOR.get(); 
          ResourceLocation corn_door_top_texture = modLoc("block/corn_door_top");
          ResourceLocation corn_door_bottom_texture = modLoc("block/corn_door_bottom");
          doorBlockWithRenderType(corn_door, "corn_door", corn_door_bottom_texture, corn_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          DoorBlock onion_door = foodblockcompatregistry.ONION_DOOR.get(); 
          ResourceLocation onion_door_top_texture = modLoc("block/onion_door_top");
          ResourceLocation onion_door_bottom_texture = modLoc("block/onion_door_bottom");
          doorBlockWithRenderType(onion_door, "onion_door", onion_door_bottom_texture, onion_door_top_texture, "translucent"); 
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          DoorBlock tomato_door = foodblockcompatregistry.TOMATO_DOOR.get(); 
          ResourceLocation tomato_door_top_texture = modLoc("block/tomato_door_top");
          ResourceLocation tomato_door_bottom_texture = modLoc("block/tomato_door_bottom");
          doorBlockWithRenderType(tomato_door, "tomato_door", tomato_door_bottom_texture, tomato_door_top_texture, "translucent"); 
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          DoorBlock pecan_door = foodblockcompatregistry.PECAN_DOOR.get(); 
          ResourceLocation pecan_door_top_texture = modLoc("block/pecan_door_top");
          ResourceLocation pecan_door_bottom_texture = modLoc("block/pecan_door_bottom");
          doorBlockWithRenderType(pecan_door, "pecan_door", pecan_door_bottom_texture, pecan_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          DoorBlock almond_door = foodblockcompatregistry.ALMOND_DOOR.get(); 
          ResourceLocation almond_door_top_texture = modLoc("block/almond_door_top");
          ResourceLocation almond_door_bottom_texture = modLoc("block/almond_door_bottom");
          doorBlockWithRenderType(almond_door, "almond_door", almond_door_bottom_texture, almond_door_top_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                              Button                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          ButtonBlock elderberry_button = foodblockcompatregistry.ELDERBERRY_BUTTON.get();
          ResourceLocation elderberry_button_texture = modLoc("block/elderberry_block");
          buttonBlock(elderberry_button, elderberry_button_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          ButtonBlock juniper_button = foodblockcompatregistry.JUNIPER_BUTTON.get();
          ResourceLocation juniper_button_texture = modLoc("block/juniper_block");
          buttonBlock(juniper_button, juniper_button_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          ButtonBlock cherry_button = foodblockcompatregistry.CHERRY_BUTTON.get();
          ResourceLocation cherry_button_texture = modLoc("block/cherry_block");
          buttonBlock(cherry_button, cherry_button_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          ButtonBlock blackcherry_button = foodblockcompatregistry.BLACKCHERRY_BUTTON.get();
          ResourceLocation blackcherry_button_texture = modLoc("block/blackcherry_block");
          buttonBlock(blackcherry_button, blackcherry_button_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          ButtonBlock peach_button = foodblockcompatregistry.PEACH_BUTTON.get();
          ResourceLocation peach_button_texture = modLoc("block/peach_block");
          buttonBlock(peach_button, peach_button_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          ButtonBlock coconut_button = foodblockcompatregistry.COCONUT_BUTTON.get();
          ResourceLocation coconut_button_texture = modLoc("block/coconut_block");
          buttonBlock(coconut_button, coconut_button_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          ButtonBlock orange_button = foodblockcompatregistry.ORANGE_BUTTON.get();
          ResourceLocation orange_button_texture = modLoc("block/orange_block");
          buttonBlock(orange_button, orange_button_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          ButtonBlock tangerine_button = foodblockcompatregistry.TANGERINE_BUTTON.get();
          ResourceLocation tangerine_button_texture = modLoc("block/tangerine_block");
          buttonBlock(tangerine_button, tangerine_button_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          ButtonBlock kumquat_button = foodblockcompatregistry.KUMQUAT_BUTTON.get();
          ResourceLocation kumquat_button_texture = modLoc("block/kumquat_block");
          buttonBlock(kumquat_button, kumquat_button_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          ButtonBlock persimmon_button = foodblockcompatregistry.PERSIMMON_BUTTON.get();
          ResourceLocation persimmon_button_texture = modLoc("block/persimmon_block");
          buttonBlock(persimmon_button, persimmon_button_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          ButtonBlock satsuma_button = foodblockcompatregistry.SATSUMA_BUTTON.get();
          ResourceLocation satsuma_button_texture = modLoc("block/satsuma_block");
          buttonBlock(satsuma_button, satsuma_button_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          ButtonBlock mandarin_button = foodblockcompatregistry.MANDARIN_BUTTON.get();
          ResourceLocation mandarin_button_texture = modLoc("block/mandarin_block");
          buttonBlock(mandarin_button, mandarin_button_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          ButtonBlock lemon_button = foodblockcompatregistry.LEMON_BUTTON.get();
          ResourceLocation lemon_button_texture = modLoc("block/lemon_block");
          buttonBlock(lemon_button, lemon_button_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          ButtonBlock citron_button = foodblockcompatregistry.CITRON_BUTTON.get();
          ResourceLocation citron_button_texture = modLoc("block/citron_block");
          buttonBlock(citron_button, citron_button_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          ButtonBlock buddhashand_button = foodblockcompatregistry.BUDDHASHAND_BUTTON.get();
          ResourceLocation buddhashand_button_texture = modLoc("block/buddhashand_block");
          buttonBlock(buddhashand_button, buddhashand_button_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          ButtonBlock lime_button = foodblockcompatregistry.LIME_BUTTON.get();
          ResourceLocation lime_button_texture = modLoc("block/lime_block");
          buttonBlock(lime_button, lime_button_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          ButtonBlock keylime_button = foodblockcompatregistry.KEYLIME_BUTTON.get();
          ResourceLocation keylime_button_texture = modLoc("block/keylime_block");
          buttonBlock(keylime_button, keylime_button_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          ButtonBlock fingerlime_button = foodblockcompatregistry.FINGERLIME_BUTTON.get();
          ResourceLocation fingerlime_button_texture = modLoc("block/fingerlime_block");
          buttonBlock(fingerlime_button, fingerlime_button_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          ButtonBlock grapefruit_button = foodblockcompatregistry.GRAPEFRUIT_BUTTON.get();
          ResourceLocation grapefruit_button_texture = modLoc("block/grapefruit_block");
          buttonBlock(grapefruit_button, grapefruit_button_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          ButtonBlock pomelo_button = foodblockcompatregistry.POMELO_BUTTON.get();
          ResourceLocation pomelo_button_texture = modLoc("block/pomelo_block");
          buttonBlock(pomelo_button, pomelo_button_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          ButtonBlock corn_button = foodblockcompatregistry.CORN_BUTTON.get();
          ResourceLocation corn_button_texture = modLoc("block/corn_block");
          buttonBlock(corn_button, corn_button_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          ButtonBlock onion_button = foodblockcompatregistry.ONION_BUTTON.get();
          ResourceLocation onion_button_texture = modLoc("block/onion_block");
          buttonBlock(onion_button, onion_button_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          ButtonBlock tomato_button = foodblockcompatregistry.TOMATO_BUTTON.get();
          ResourceLocation tomato_button_texture = modLoc("block/tomato_block");
          buttonBlock(tomato_button, tomato_button_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          ButtonBlock pecan_button = foodblockcompatregistry.PECAN_BUTTON.get();
          ResourceLocation pecan_button_texture = modLoc("block/pecan_block");
          buttonBlock(pecan_button, pecan_button_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          ButtonBlock almond_button = foodblockcompatregistry.ALMOND_BUTTON.get();
          ResourceLocation almond_button_texture = modLoc("block/almond_block");
          buttonBlock(almond_button, almond_button_texture);
    //==============================================================================================================================================
    //|                                                              Fences                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //fence
          FenceBlock elderberry_fence = foodblockcompatregistry.ELDERBERRY_FENCE.get();
          ResourceLocation elderberry_fence_texture = modLoc("block/elderberry_block");
          fenceBlock(elderberry_fence, elderberry_fence_texture);
       //gate
          FenceGateBlock elderberry_gate = foodblockcompatregistry.ELDERBERRY_GATE.get();
          ResourceLocation elderberry_gate_texture = modLoc("block/elderberry_block");
          fenceGateBlock(elderberry_gate, elderberry_gate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
       //fence
          FenceBlock juniper_fence = foodblockcompatregistry.JUNIPER_FENCE.get();
          ResourceLocation juniper_fence_texture = modLoc("block/juniper_block");
          fenceBlock(juniper_fence, juniper_fence_texture);
       //gate
          FenceGateBlock juniper_gate = foodblockcompatregistry.JUNIPER_GATE.get();
          ResourceLocation juniper_gate_texture = modLoc("block/juniper_block");
          fenceGateBlock(juniper_gate, juniper_gate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //fence
          FenceBlock cherry_fence = foodblockcompatregistry.CHERRY_FENCE.get();
          ResourceLocation cherry_fence_texture = modLoc("block/cherry_block");
          fenceBlock(cherry_fence, cherry_fence_texture);
       //gate
          FenceGateBlock cherry_gate = foodblockcompatregistry.CHERRY_GATE.get();
          ResourceLocation cherry_gate_texture = modLoc("block/cherry_block");
          fenceGateBlock(cherry_gate, cherry_gate_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
       //fence
          FenceBlock blackcherry_fence = foodblockcompatregistry.BLACKCHERRY_FENCE.get();
          ResourceLocation blackcherry_fence_texture = modLoc("block/blackcherry_block");
          fenceBlock(blackcherry_fence, blackcherry_fence_texture);
       //gate
          FenceGateBlock blackcherry_gate = foodblockcompatregistry.BLACKCHERRY_GATE.get();
          ResourceLocation blackcherry_gate_texture = modLoc("block/blackcherry_block");
          fenceGateBlock(blackcherry_gate, blackcherry_gate_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
       //fence
          FenceBlock peach_fence = foodblockcompatregistry.PEACH_FENCE.get();
          ResourceLocation peach_fence_texture = modLoc("block/peach_block");
          fenceBlock(peach_fence, peach_fence_texture);
       //gate
          FenceGateBlock peach_gate = foodblockcompatregistry.PEACH_GATE.get();
          ResourceLocation peach_gate_texture = modLoc("block/peach_block");
          fenceGateBlock(peach_gate, peach_gate_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
       //fence
          FenceBlock coconut_fence = foodblockcompatregistry.COCONUT_FENCE.get();
          ResourceLocation coconut_fence_texture = modLoc("block/coconut_block");
          fenceBlock(coconut_fence, coconut_fence_texture);
       //gate
          FenceGateBlock coconut_gate = foodblockcompatregistry.COCONUT_GATE.get();
          ResourceLocation coconut_gate_texture = modLoc("block/coconut_block");
          fenceGateBlock(coconut_gate, coconut_gate_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
       //fence
          FenceBlock orange_fence = foodblockcompatregistry.ORANGE_FENCE.get();
          ResourceLocation orange_fence_texture = modLoc("block/orange_block");
          fenceBlock(orange_fence, orange_fence_texture);
       //gate
          FenceGateBlock orange_gate = foodblockcompatregistry.ORANGE_GATE.get();
          ResourceLocation orange_gate_texture = modLoc("block/orange_block");
          fenceGateBlock(orange_gate, orange_gate_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
       //fence
          FenceBlock tangerine_fence = foodblockcompatregistry.TANGERINE_FENCE.get();
          ResourceLocation tangerine_fence_texture = modLoc("block/tangerine_block");
          fenceBlock(tangerine_fence, tangerine_fence_texture);
       //gate
          FenceGateBlock tangerine_gate = foodblockcompatregistry.TANGERINE_GATE.get();
          ResourceLocation tangerine_gate_texture = modLoc("block/tangerine_block");
          fenceGateBlock(tangerine_gate, tangerine_gate_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
       //fence
          FenceBlock kumquat_fence = foodblockcompatregistry.KUMQUAT_FENCE.get();
          ResourceLocation kumquat_fence_texture = modLoc("block/kumquat_block");
          fenceBlock(kumquat_fence, kumquat_fence_texture);
       //gate
          FenceGateBlock kumquat_gate = foodblockcompatregistry.KUMQUAT_GATE.get();
          ResourceLocation kumquat_gate_texture = modLoc("block/kumquat_block");
          fenceGateBlock(kumquat_gate, kumquat_gate_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
       //fence
          FenceBlock persimmon_fence = foodblockcompatregistry.PERSIMMON_FENCE.get();
          ResourceLocation persimmon_fence_texture = modLoc("block/persimmon_block");
          fenceBlock(persimmon_fence, persimmon_fence_texture);
       //gate
          FenceGateBlock persimmon_gate = foodblockcompatregistry.PERSIMMON_GATE.get();
          ResourceLocation persimmon_gate_texture = modLoc("block/persimmon_block");
          fenceGateBlock(persimmon_gate, persimmon_gate_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
       //fence
          FenceBlock satsuma_fence = foodblockcompatregistry.SATSUMA_FENCE.get();
          ResourceLocation satsuma_fence_texture = modLoc("block/satsuma_block");
          fenceBlock(satsuma_fence, satsuma_fence_texture);
       //gate
          FenceGateBlock satsuma_gate = foodblockcompatregistry.SATSUMA_GATE.get();
          ResourceLocation satsuma_gate_texture = modLoc("block/satsuma_block");
          fenceGateBlock(satsuma_gate, satsuma_gate_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
       //fence
          FenceBlock mandarin_fence = foodblockcompatregistry.MANDARIN_FENCE.get();
          ResourceLocation mandarin_fence_texture = modLoc("block/mandarin_block");
          fenceBlock(mandarin_fence, mandarin_fence_texture);
       //gate
          FenceGateBlock mandarin_gate = foodblockcompatregistry.MANDARIN_GATE.get();
          ResourceLocation mandarin_gate_texture = modLoc("block/mandarin_block");
          fenceGateBlock(mandarin_gate, mandarin_gate_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
       //fence
          FenceBlock lemon_fence = foodblockcompatregistry.LEMON_FENCE.get();
          ResourceLocation lemon_fence_texture = modLoc("block/lemon_block");
          fenceBlock(lemon_fence, lemon_fence_texture);
       //gate
          FenceGateBlock lemon_gate = foodblockcompatregistry.LEMON_GATE.get();
          ResourceLocation lemon_gate_texture = modLoc("block/lemon_block");
          fenceGateBlock(lemon_gate, lemon_gate_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
       //fence
          FenceBlock citron_fence = foodblockcompatregistry.CITRON_FENCE.get();
          ResourceLocation citron_fence_texture = modLoc("block/citron_block");
          fenceBlock(citron_fence, citron_fence_texture);
       //gate
          FenceGateBlock citron_gate = foodblockcompatregistry.CITRON_GATE.get();
          ResourceLocation citron_gate_texture = modLoc("block/citron_block");
          fenceGateBlock(citron_gate, citron_gate_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
       //fence
          FenceBlock buddhashand_fence = foodblockcompatregistry.BUDDHASHAND_FENCE.get();
          ResourceLocation buddhashand_fence_texture = modLoc("block/buddhashand_block");
          fenceBlock(buddhashand_fence, buddhashand_fence_texture);
       //gate
          FenceGateBlock buddhashand_gate = foodblockcompatregistry.BUDDHASHAND_GATE.get();
          ResourceLocation buddhashand_gate_texture = modLoc("block/buddhashand_block");
          fenceGateBlock(buddhashand_gate, buddhashand_gate_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
       //fence
          FenceBlock lime_fence = foodblockcompatregistry.LIME_FENCE.get();
          ResourceLocation lime_fence_texture = modLoc("block/lime_block");
          fenceBlock(lime_fence, lime_fence_texture);
       //gate
          FenceGateBlock lime_gate = foodblockcompatregistry.LIME_GATE.get();
          ResourceLocation lime_gate_texture = modLoc("block/lime_block");
          fenceGateBlock(lime_gate, lime_gate_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
       //fence
          FenceBlock keylime_fence = foodblockcompatregistry.KEYLIME_FENCE.get();
          ResourceLocation keylime_fence_texture = modLoc("block/keylime_block");
          fenceBlock(keylime_fence, keylime_fence_texture);
       //gate
          FenceGateBlock keylime_gate = foodblockcompatregistry.KEYLIME_GATE.get();
          ResourceLocation keylime_gate_texture = modLoc("block/keylime_block");
          fenceGateBlock(keylime_gate, keylime_gate_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
       //fence
          FenceBlock fingerlime_fence = foodblockcompatregistry.FINGERLIME_FENCE.get();
          ResourceLocation fingerlime_fence_texture = modLoc("block/fingerlime_block");
          fenceBlock(fingerlime_fence, fingerlime_fence_texture);
       //gate
          FenceGateBlock fingerlime_gate = foodblockcompatregistry.FINGERLIME_GATE.get();
          ResourceLocation fingerlime_gate_texture = modLoc("block/fingerlime_block");
          fenceGateBlock(fingerlime_gate, fingerlime_gate_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
       //fence
          FenceBlock grapefruit_fence = foodblockcompatregistry.GRAPEFRUIT_FENCE.get();
          ResourceLocation grapefruit_fence_texture = modLoc("block/grapefruit_block");
          fenceBlock(grapefruit_fence, grapefruit_fence_texture);
       //gate
          FenceGateBlock grapefruit_gate = foodblockcompatregistry.GRAPEFRUIT_GATE.get();
          ResourceLocation grapefruit_gate_texture = modLoc("block/grapefruit_block");
          fenceGateBlock(grapefruit_gate, grapefruit_gate_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
       //fence
          FenceBlock pomelo_fence = foodblockcompatregistry.POMELO_FENCE.get();
          ResourceLocation pomelo_fence_texture = modLoc("block/pomelo_block");
          fenceBlock(pomelo_fence, pomelo_fence_texture);
       //gate
          FenceGateBlock pomelo_gate = foodblockcompatregistry.POMELO_GATE.get();
          ResourceLocation pomelo_gate_texture = modLoc("block/pomelo_block");
          fenceGateBlock(pomelo_gate, pomelo_gate_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
       //fence
          FenceBlock corn_fence = foodblockcompatregistry.CORN_FENCE.get();
          ResourceLocation corn_fence_texture = modLoc("block/corn_block");
          fenceBlock(corn_fence, corn_fence_texture);
       //gate
          FenceGateBlock corn_gate = foodblockcompatregistry.CORN_GATE.get();
          ResourceLocation corn_gate_texture = modLoc("block/corn_block");
          fenceGateBlock(corn_gate, corn_gate_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
       //fence
          FenceBlock onion_fence = foodblockcompatregistry.ONION_FENCE.get();
          ResourceLocation onion_fence_texture = modLoc("block/onion_block");
          fenceBlock(onion_fence, onion_fence_texture);
       //gate
          FenceGateBlock onion_gate = foodblockcompatregistry.ONION_GATE.get();
          ResourceLocation onion_gate_texture = modLoc("block/onion_block");
          fenceGateBlock(onion_gate, onion_gate_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
       //fence
          FenceBlock tomato_fence = foodblockcompatregistry.TOMATO_FENCE.get();
          ResourceLocation tomato_fence_texture = modLoc("block/tomato_block");
          fenceBlock(tomato_fence, tomato_fence_texture);
       //gate
          FenceGateBlock tomato_gate = foodblockcompatregistry.TOMATO_GATE.get();
          ResourceLocation tomato_gate_texture = modLoc("block/tomato_block");
          fenceGateBlock(tomato_gate, tomato_gate_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
       //fence
          FenceBlock pecan_fence = foodblockcompatregistry.PECAN_FENCE.get();
          ResourceLocation pecan_fence_texture = modLoc("block/pecan_block");
          fenceBlock(pecan_fence, pecan_fence_texture);
       //gate
          FenceGateBlock pecan_gate = foodblockcompatregistry.PECAN_GATE.get();
          ResourceLocation pecan_gate_texture = modLoc("block/pecan_block");
          fenceGateBlock(pecan_gate, pecan_gate_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
       //fence
          FenceBlock almond_fence = foodblockcompatregistry.ALMOND_FENCE.get();
          ResourceLocation almond_fence_texture = modLoc("block/almond_block");
          fenceBlock(almond_fence, almond_fence_texture);
       //gate
          FenceGateBlock almond_gate = foodblockcompatregistry.ALMOND_GATE.get();
          ResourceLocation almond_gate_texture = modLoc("block/almond_block");
          fenceGateBlock(almond_gate, almond_gate_texture);
    //==============================================================================================================================================
    //|                                                          Pressure Plates                                                                   |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          PressurePlateBlock elderberry_pressure_plate = foodblockcompatregistry.ELDERBERRY_PRESSURE_PLATE.get();
          ResourceLocation elderberry_pressure_plate_texture = modLoc("block/elderberry_block");
          pressurePlateBlock(elderberry_pressure_plate, elderberry_pressure_plate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          PressurePlateBlock juniper_pressure_plate = foodblockcompatregistry.JUNIPER_PRESSURE_PLATE.get();
          ResourceLocation juniper_pressure_plate_texture = modLoc("block/juniper_block");
          pressurePlateBlock(juniper_pressure_plate, juniper_pressure_plate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          PressurePlateBlock cherry_pressure_plate = foodblockcompatregistry.CHERRY_PRESSURE_PLATE.get();
          ResourceLocation cherry_pressure_plate_texture = modLoc("block/cherry_block");
          pressurePlateBlock(cherry_pressure_plate, cherry_pressure_plate_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          PressurePlateBlock blackcherry_pressure_plate = foodblockcompatregistry.BLACKCHERRY_PRESSURE_PLATE.get();
          ResourceLocation blackcherry_pressure_plate_texture = modLoc("block/blackcherry_block");
          pressurePlateBlock(blackcherry_pressure_plate, blackcherry_pressure_plate_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          PressurePlateBlock peach_pressure_plate = foodblockcompatregistry.PEACH_PRESSURE_PLATE.get();
          ResourceLocation peach_pressure_plate_texture = modLoc("block/peach_block");
          pressurePlateBlock(peach_pressure_plate, peach_pressure_plate_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          PressurePlateBlock coconut_pressure_plate = foodblockcompatregistry.COCONUT_PRESSURE_PLATE.get();
          ResourceLocation coconut_pressure_plate_texture = modLoc("block/coconut_block");
          pressurePlateBlock(coconut_pressure_plate, coconut_pressure_plate_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          PressurePlateBlock orange_pressure_plate = foodblockcompatregistry.ORANGE_PRESSURE_PLATE.get();
          ResourceLocation orange_pressure_plate_texture = modLoc("block/orange_block");
          pressurePlateBlock(orange_pressure_plate, orange_pressure_plate_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          PressurePlateBlock tangerine_pressure_plate = foodblockcompatregistry.TANGERINE_PRESSURE_PLATE.get();
          ResourceLocation tangerine_pressure_plate_texture = modLoc("block/tangerine_block");
          pressurePlateBlock(tangerine_pressure_plate, tangerine_pressure_plate_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          PressurePlateBlock kumquat_pressure_plate = foodblockcompatregistry.KUMQUAT_PRESSURE_PLATE.get();
          ResourceLocation kumquat_pressure_plate_texture = modLoc("block/kumquat_block");
          pressurePlateBlock(kumquat_pressure_plate, kumquat_pressure_plate_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          PressurePlateBlock persimmon_pressure_plate = foodblockcompatregistry.PERSIMMON_PRESSURE_PLATE.get();
          ResourceLocation persimmon_pressure_plate_texture = modLoc("block/persimmon_block");
          pressurePlateBlock(persimmon_pressure_plate, persimmon_pressure_plate_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          PressurePlateBlock satsuma_pressure_plate = foodblockcompatregistry.SATSUMA_PRESSURE_PLATE.get();
          ResourceLocation satsuma_pressure_plate_texture = modLoc("block/satsuma_block");
          pressurePlateBlock(satsuma_pressure_plate, satsuma_pressure_plate_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          PressurePlateBlock mandarin_pressure_plate = foodblockcompatregistry.MANDARIN_PRESSURE_PLATE.get();
          ResourceLocation mandarin_pressure_plate_texture = modLoc("block/mandarin_block");
          pressurePlateBlock(mandarin_pressure_plate, mandarin_pressure_plate_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          PressurePlateBlock lemon_pressure_plate = foodblockcompatregistry.LEMON_PRESSURE_PLATE.get();
          ResourceLocation lemon_pressure_plate_texture = modLoc("block/lemon_block");
          pressurePlateBlock(lemon_pressure_plate, lemon_pressure_plate_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          PressurePlateBlock citron_pressure_plate = foodblockcompatregistry.CITRON_PRESSURE_PLATE.get();
          ResourceLocation citron_pressure_plate_texture = modLoc("block/citron_block");
          pressurePlateBlock(citron_pressure_plate, citron_pressure_plate_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          PressurePlateBlock buddhashand_pressure_plate = foodblockcompatregistry.BUDDHASHAND_PRESSURE_PLATE.get();
          ResourceLocation buddhashand_pressure_plate_texture = modLoc("block/buddhashand_block");
          pressurePlateBlock(buddhashand_pressure_plate, buddhashand_pressure_plate_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          PressurePlateBlock lime_pressure_plate = foodblockcompatregistry.LIME_PRESSURE_PLATE.get();
          ResourceLocation lime_pressure_plate_texture = modLoc("block/lime_block");
          pressurePlateBlock(lime_pressure_plate, lime_pressure_plate_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          PressurePlateBlock keylime_pressure_plate = foodblockcompatregistry.KEYLIME_PRESSURE_PLATE.get();
          ResourceLocation keylime_pressure_plate_texture = modLoc("block/keylime_block");
          pressurePlateBlock(keylime_pressure_plate, keylime_pressure_plate_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          PressurePlateBlock fingerlime_pressure_plate = foodblockcompatregistry.FINGERLIME_PRESSURE_PLATE.get();
          ResourceLocation fingerlime_pressure_plate_texture = modLoc("block/fingerlime_block");
          pressurePlateBlock(fingerlime_pressure_plate, fingerlime_pressure_plate_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          PressurePlateBlock grapefruit_pressure_plate = foodblockcompatregistry.GRAPEFRUIT_PRESSURE_PLATE.get();
          ResourceLocation grapefruit_pressure_plate_texture = modLoc("block/grapefruit_block");
          pressurePlateBlock(grapefruit_pressure_plate, grapefruit_pressure_plate_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          PressurePlateBlock pomelo_pressure_plate = foodblockcompatregistry.POMELO_PRESSURE_PLATE.get();
          ResourceLocation pomelo_pressure_plate_texture = modLoc("block/pomelo_block");
          pressurePlateBlock(pomelo_pressure_plate, pomelo_pressure_plate_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          PressurePlateBlock corn_pressure_plate = foodblockcompatregistry.CORN_PRESSURE_PLATE.get();
          ResourceLocation corn_pressure_plate_texture = modLoc("block/corn_block");
          pressurePlateBlock(corn_pressure_plate, corn_pressure_plate_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          PressurePlateBlock onion_pressure_plate = foodblockcompatregistry.ONION_PRESSURE_PLATE.get();
          ResourceLocation onion_pressure_plate_texture = modLoc("block/onion_block");
          pressurePlateBlock(onion_pressure_plate, onion_pressure_plate_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          PressurePlateBlock tomato_pressure_plate = foodblockcompatregistry.TOMATO_PRESSURE_PLATE.get();
          ResourceLocation tomato_pressure_plate_texture = modLoc("block/tomato_block");
          pressurePlateBlock(tomato_pressure_plate, tomato_pressure_plate_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          PressurePlateBlock pecan_pressure_plate = foodblockcompatregistry.PECAN_PRESSURE_PLATE.get();
          ResourceLocation pecan_pressure_plate_texture = modLoc("block/pecan_block");
          pressurePlateBlock(pecan_pressure_plate, pecan_pressure_plate_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          PressurePlateBlock almond_pressure_plate = foodblockcompatregistry.ALMOND_PRESSURE_PLATE.get();
          ResourceLocation almond_pressure_plate_texture = modLoc("block/almond_block");
          pressurePlateBlock(almond_pressure_plate, almond_pressure_plate_texture);
    //==============================================================================================================================================
    //|                                                               Signs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
           StandingSignBlock elderberry_sign = foodblockcompatregistry.ELDERBERRY_STANDING_SIGN.get();
           WallSignBlock elderberry_wall_sign = foodblockcompatregistry.ELDERBERRY_WALL_SIGN.get();
           ResourceLocation elderberry_sign_texture = modLoc("block/elderberry_block");
           signBlock(elderberry_sign, elderberry_wall_sign, elderberry_sign_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
           StandingSignBlock juniper_sign = foodblockcompatregistry.JUNIPER_STANDING_SIGN.get();
           WallSignBlock juniper_wall_sign = foodblockcompatregistry.JUNIPER_WALL_SIGN.get();
           ResourceLocation juniper_sign_texture = modLoc("block/juniper_block");
           signBlock(juniper_sign, juniper_wall_sign, juniper_sign_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
           StandingSignBlock cherry_sign = foodblockcompatregistry.CHERRY_STANDING_SIGN.get();
           WallSignBlock cherry_wall_sign = foodblockcompatregistry.CHERRY_WALL_SIGN.get();
           ResourceLocation cherry_sign_texture = modLoc("block/cherry_block");
           signBlock(cherry_sign, cherry_wall_sign, cherry_sign_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
           StandingSignBlock blackcherry_sign = foodblockcompatregistry.BLACKCHERRY_STANDING_SIGN.get();
           WallSignBlock blackcherry_wall_sign = foodblockcompatregistry.BLACKCHERRY_WALL_SIGN.get();
           ResourceLocation blackcherry_sign_texture = modLoc("block/blackcherry_block");
           signBlock(blackcherry_sign, blackcherry_wall_sign, blackcherry_sign_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
           StandingSignBlock peach_sign = foodblockcompatregistry.PEACH_STANDING_SIGN.get();
           WallSignBlock peach_wall_sign = foodblockcompatregistry.PEACH_WALL_SIGN.get();
           ResourceLocation peach_sign_texture = modLoc("block/peach_block");
           signBlock(peach_sign, peach_wall_sign, peach_sign_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
           StandingSignBlock coconut_sign = foodblockcompatregistry.COCONUT_STANDING_SIGN.get();
           WallSignBlock coconut_wall_sign = foodblockcompatregistry.COCONUT_WALL_SIGN.get();
           ResourceLocation coconut_sign_texture = modLoc("block/coconut_block");
           signBlock(coconut_sign, coconut_wall_sign, coconut_sign_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
           StandingSignBlock orange_sign = foodblockcompatregistry.ORANGE_STANDING_SIGN.get();
           WallSignBlock orange_wall_sign = foodblockcompatregistry.ORANGE_WALL_SIGN.get();
           ResourceLocation orange_sign_texture = modLoc("block/orange_block");
           signBlock(orange_sign, orange_wall_sign, orange_sign_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
           StandingSignBlock tangerine_sign = foodblockcompatregistry.TANGERINE_STANDING_SIGN.get();
           WallSignBlock tangerine_wall_sign = foodblockcompatregistry.TANGERINE_WALL_SIGN.get();
           ResourceLocation tangerine_sign_texture = modLoc("block/tangerine_block");
           signBlock(tangerine_sign, tangerine_wall_sign, tangerine_sign_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
           StandingSignBlock kumquat_sign = foodblockcompatregistry.KUMQUAT_STANDING_SIGN.get();
           WallSignBlock kumquat_wall_sign = foodblockcompatregistry.KUMQUAT_WALL_SIGN.get();
           ResourceLocation kumquat_sign_texture = modLoc("block/kumquat_block");
           signBlock(kumquat_sign, kumquat_wall_sign, kumquat_sign_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
           StandingSignBlock persimmon_sign = foodblockcompatregistry.PERSIMMON_STANDING_SIGN.get();
           WallSignBlock persimmon_wall_sign = foodblockcompatregistry.PERSIMMON_WALL_SIGN.get();
           ResourceLocation persimmon_sign_texture = modLoc("block/persimmon_block");
           signBlock(persimmon_sign, persimmon_wall_sign, persimmon_sign_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
           StandingSignBlock satsuma_sign = foodblockcompatregistry.SATSUMA_STANDING_SIGN.get();
           WallSignBlock satsuma_wall_sign = foodblockcompatregistry.SATSUMA_WALL_SIGN.get();
           ResourceLocation satsuma_sign_texture = modLoc("block/satsuma_block");
           signBlock(satsuma_sign, satsuma_wall_sign, satsuma_sign_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
           StandingSignBlock mandarin_sign = foodblockcompatregistry.MANDARIN_STANDING_SIGN.get();
           WallSignBlock mandarin_wall_sign = foodblockcompatregistry.MANDARIN_WALL_SIGN.get();
           ResourceLocation mandarin_sign_texture = modLoc("block/mandarin_block");
           signBlock(mandarin_sign, mandarin_wall_sign, mandarin_sign_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
           StandingSignBlock lemon_sign = foodblockcompatregistry.LEMON_STANDING_SIGN.get();
           WallSignBlock lemon_wall_sign = foodblockcompatregistry.LEMON_WALL_SIGN.get();
           ResourceLocation lemon_sign_texture = modLoc("block/lemon_block");
           signBlock(lemon_sign, lemon_wall_sign, lemon_sign_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
           StandingSignBlock citron_sign = foodblockcompatregistry.CITRON_STANDING_SIGN.get();
           WallSignBlock citron_wall_sign = foodblockcompatregistry.CITRON_WALL_SIGN.get();
           ResourceLocation citron_sign_texture = modLoc("block/citron_block");
           signBlock(citron_sign, citron_wall_sign, citron_sign_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
           StandingSignBlock buddhashand_sign = foodblockcompatregistry.BUDDHASHAND_STANDING_SIGN.get();
           WallSignBlock buddhashand_wall_sign = foodblockcompatregistry.BUDDHASHAND_WALL_SIGN.get();
           ResourceLocation buddhashand_sign_texture = modLoc("block/buddhashand_block");
           signBlock(buddhashand_sign, buddhashand_wall_sign, buddhashand_sign_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
           StandingSignBlock lime_sign = foodblockcompatregistry.LIME_STANDING_SIGN.get();
           WallSignBlock lime_wall_sign = foodblockcompatregistry.LIME_WALL_SIGN.get();
           ResourceLocation lime_sign_texture = modLoc("block/lime_block");
           signBlock(lime_sign, lime_wall_sign, lime_sign_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
           StandingSignBlock keylime_sign = foodblockcompatregistry.KEYLIME_STANDING_SIGN.get();
           WallSignBlock keylime_wall_sign = foodblockcompatregistry.KEYLIME_WALL_SIGN.get();
           ResourceLocation keylime_sign_texture = modLoc("block/keylime_block");
           signBlock(keylime_sign, keylime_wall_sign, keylime_sign_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
           StandingSignBlock fingerlime_sign = foodblockcompatregistry.FINGERLIME_STANDING_SIGN.get();
           WallSignBlock fingerlime_wall_sign = foodblockcompatregistry.FINGERLIME_WALL_SIGN.get();
           ResourceLocation fingerlime_sign_texture = modLoc("block/fingerlime_block");
           signBlock(fingerlime_sign, fingerlime_wall_sign, fingerlime_sign_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
           StandingSignBlock grapefruit_sign = foodblockcompatregistry.GRAPEFRUIT_STANDING_SIGN.get();
           WallSignBlock grapefruit_wall_sign = foodblockcompatregistry.GRAPEFRUIT_WALL_SIGN.get();
           ResourceLocation grapefruit_sign_texture = modLoc("block/grapefruit_block");
           signBlock(grapefruit_sign, grapefruit_wall_sign, grapefruit_sign_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
           StandingSignBlock pomelo_sign = foodblockcompatregistry.POMELO_STANDING_SIGN.get();
           WallSignBlock pomelo_wall_sign = foodblockcompatregistry.POMELO_WALL_SIGN.get();
           ResourceLocation pomelo_sign_texture = modLoc("block/pomelo_block");
           signBlock(pomelo_sign, pomelo_wall_sign, pomelo_sign_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
           StandingSignBlock corn_sign = foodblockcompatregistry.CORN_STANDING_SIGN.get();
           WallSignBlock corn_wall_sign = foodblockcompatregistry.CORN_WALL_SIGN.get();
           ResourceLocation corn_sign_texture = modLoc("block/corn_block");
           signBlock(corn_sign, corn_wall_sign, corn_sign_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
           StandingSignBlock onion_sign = foodblockcompatregistry.ONION_STANDING_SIGN.get();
           WallSignBlock onion_wall_sign = foodblockcompatregistry.ONION_WALL_SIGN.get();
           ResourceLocation onion_sign_texture = modLoc("block/onion_block");
           signBlock(onion_sign, onion_wall_sign, onion_sign_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
           StandingSignBlock tomato_sign = foodblockcompatregistry.TOMATO_STANDING_SIGN.get();
           WallSignBlock tomato_wall_sign = foodblockcompatregistry.TOMATO_WALL_SIGN.get();
           ResourceLocation tomato_sign_texture = modLoc("block/tomato_block");
           signBlock(tomato_sign, tomato_wall_sign, tomato_sign_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
           StandingSignBlock pecan_sign = foodblockcompatregistry.PECAN_STANDING_SIGN.get();
           WallSignBlock pecan_wall_sign = foodblockcompatregistry.PECAN_WALL_SIGN.get();
           ResourceLocation pecan_sign_texture = modLoc("block/pecan_block");
           signBlock(pecan_sign, pecan_wall_sign, pecan_sign_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
           StandingSignBlock almond_sign = foodblockcompatregistry.ALMOND_STANDING_SIGN.get();
           WallSignBlock almond_wall_sign = foodblockcompatregistry.ALMOND_WALL_SIGN.get();
           ResourceLocation almond_sign_texture = modLoc("block/almond_block");
           signBlock(almond_sign, almond_wall_sign, almond_sign_texture);
    //==============================================================================================================================================
    //|                                                            Trap Doors                                                                      |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          TrapDoorBlock elderberry_trapdoor = foodblockcompatregistry.ELDERBERRY_TRAPDOOR.get(); 
          ResourceLocation elderberry_trapdoor_texture = modLoc("block/elderberry_block");
          trapdoorBlockWithRenderType(elderberry_trapdoor, "elderberry_trapdoor", elderberry_trapdoor_texture, false, elderberry_trapdoor_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          TrapDoorBlock juniper_trapdoor = foodblockcompatregistry.JUNIPER_TRAPDOOR.get(); 
          ResourceLocation juniper_trapdoor_texture = modLoc("block/juniper_block");
          trapdoorBlockWithRenderType(juniper_trapdoor, "juniper_trapdoor", juniper_trapdoor_texture, false, juniper_trapdoor_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          TrapDoorBlock cherry_trapdoor = foodblockcompatregistry.CHERRY_TRAPDOOR.get(); 
          ResourceLocation cherry_trapdoor_texture = modLoc("block/cherry_block");
          trapdoorBlockWithRenderType(cherry_trapdoor, "cherry_trapdoor", cherry_trapdoor_texture, false, cherry_trapdoor_texture);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          TrapDoorBlock blackcherry_trapdoor = foodblockcompatregistry.BLACKCHERRY_TRAPDOOR.get(); 
          ResourceLocation blackcherry_trapdoor_texture = modLoc("block/blackcherry_block");
          trapdoorBlockWithRenderType(blackcherry_trapdoor, "blackcherry_trapdoor", blackcherry_trapdoor_texture, false, blackcherry_trapdoor_texture);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          TrapDoorBlock peach_trapdoor = foodblockcompatregistry.PEACH_TRAPDOOR.get(); 
          ResourceLocation peach_trapdoor_texture = modLoc("block/peach_block");
          trapdoorBlockWithRenderType(peach_trapdoor, "peach_trapdoor", peach_trapdoor_texture, false, peach_trapdoor_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          TrapDoorBlock coconut_trapdoor = foodblockcompatregistry.COCONUT_TRAPDOOR.get(); 
          ResourceLocation coconut_trapdoor_texture = modLoc("block/coconut_block");
          trapdoorBlockWithRenderType(coconut_trapdoor, "coconut_trapdoor", coconut_trapdoor_texture, false, coconut_trapdoor_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          TrapDoorBlock orange_trapdoor = foodblockcompatregistry.ORANGE_TRAPDOOR.get(); 
          ResourceLocation orange_trapdoor_texture = modLoc("block/orange_block");
          trapdoorBlockWithRenderType(orange_trapdoor, "orange_trapdoor", orange_trapdoor_texture, false, orange_trapdoor_texture);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          TrapDoorBlock tangerine_trapdoor = foodblockcompatregistry.TANGERINE_TRAPDOOR.get(); 
          ResourceLocation tangerine_trapdoor_texture = modLoc("block/tangerine_block");
          trapdoorBlockWithRenderType(tangerine_trapdoor, "tangerine_trapdoor", tangerine_trapdoor_texture, false, tangerine_trapdoor_texture);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          TrapDoorBlock kumquat_trapdoor = foodblockcompatregistry.KUMQUAT_TRAPDOOR.get(); 
          ResourceLocation kumquat_trapdoor_texture = modLoc("block/kumquat_block");
          trapdoorBlockWithRenderType(kumquat_trapdoor, "kumquat_trapdoor", kumquat_trapdoor_texture, false, kumquat_trapdoor_texture);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          TrapDoorBlock persimmon_trapdoor = foodblockcompatregistry.PERSIMMON_TRAPDOOR.get(); 
          ResourceLocation persimmon_trapdoor_texture = modLoc("block/persimmon_block");
          trapdoorBlockWithRenderType(persimmon_trapdoor, "persimmon_trapdoor", persimmon_trapdoor_texture, false, persimmon_trapdoor_texture);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          TrapDoorBlock satsuma_trapdoor = foodblockcompatregistry.SATSUMA_TRAPDOOR.get(); 
          ResourceLocation satsuma_trapdoor_texture = modLoc("block/satsuma_block");
          trapdoorBlockWithRenderType(satsuma_trapdoor, "satsuma_trapdoor", satsuma_trapdoor_texture, false, satsuma_trapdoor_texture);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          TrapDoorBlock mandarin_trapdoor = foodblockcompatregistry.MANDARIN_TRAPDOOR.get(); 
          ResourceLocation mandarin_trapdoor_texture = modLoc("block/mandarin_block");
          trapdoorBlockWithRenderType(mandarin_trapdoor, "mandarin_trapdoor", mandarin_trapdoor_texture, false, mandarin_trapdoor_texture);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          TrapDoorBlock lemon_trapdoor = foodblockcompatregistry.LEMON_TRAPDOOR.get(); 
          ResourceLocation lemon_trapdoor_texture = modLoc("block/lemon_block");
          trapdoorBlockWithRenderType(lemon_trapdoor, "lemon_trapdoor", lemon_trapdoor_texture, false, lemon_trapdoor_texture);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          TrapDoorBlock citron_trapdoor = foodblockcompatregistry.CITRON_TRAPDOOR.get(); 
          ResourceLocation citron_trapdoor_texture = modLoc("block/citron_block");
          trapdoorBlockWithRenderType(citron_trapdoor, "citron_trapdoor", citron_trapdoor_texture, false, citron_trapdoor_texture);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          TrapDoorBlock buddhashand_trapdoor = foodblockcompatregistry.BUDDHASHAND_TRAPDOOR.get(); 
          ResourceLocation buddhashand_trapdoor_texture = modLoc("block/buddhashand_block");
          trapdoorBlockWithRenderType(buddhashand_trapdoor, "buddhashand_trapdoor", buddhashand_trapdoor_texture, false, buddhashand_trapdoor_texture);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          TrapDoorBlock lime_trapdoor = foodblockcompatregistry.LIME_TRAPDOOR.get(); 
          ResourceLocation lime_trapdoor_texture = modLoc("block/lime_block");
          trapdoorBlockWithRenderType(lime_trapdoor, "lime_trapdoor", lime_trapdoor_texture, false, lime_trapdoor_texture);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          TrapDoorBlock keylime_trapdoor = foodblockcompatregistry.KEYLIME_TRAPDOOR.get(); 
          ResourceLocation keylime_trapdoor_texture = modLoc("block/keylime_block");
          trapdoorBlockWithRenderType(keylime_trapdoor, "keylime_trapdoor", keylime_trapdoor_texture, false, keylime_trapdoor_texture);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          TrapDoorBlock fingerlime_trapdoor = foodblockcompatregistry.FINGERLIME_TRAPDOOR.get(); 
          ResourceLocation fingerlime_trapdoor_texture = modLoc("block/fingerlime_block");
          trapdoorBlockWithRenderType(fingerlime_trapdoor, "fingerlime_trapdoor", fingerlime_trapdoor_texture, false, fingerlime_trapdoor_texture);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          TrapDoorBlock grapefruit_trapdoor = foodblockcompatregistry.GRAPEFRUIT_TRAPDOOR.get(); 
          ResourceLocation grapefruit_trapdoor_texture = modLoc("block/grapefruit_block");
          trapdoorBlockWithRenderType(grapefruit_trapdoor, "grapefruit_trapdoor", grapefruit_trapdoor_texture, false, grapefruit_trapdoor_texture);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          TrapDoorBlock pomelo_trapdoor = foodblockcompatregistry.POMELO_TRAPDOOR.get(); 
          ResourceLocation pomelo_trapdoor_texture = modLoc("block/pomelo_block");
          trapdoorBlockWithRenderType(pomelo_trapdoor, "pomelo_trapdoor", pomelo_trapdoor_texture, false, pomelo_trapdoor_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          TrapDoorBlock corn_trapdoor = foodblockcompatregistry.CORN_TRAPDOOR.get(); 
          ResourceLocation corn_trapdoor_texture = modLoc("block/corn_block");
          trapdoorBlockWithRenderType(corn_trapdoor, "corn_trapdoor", corn_trapdoor_texture, false, corn_trapdoor_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          TrapDoorBlock onion_trapdoor = foodblockcompatregistry.ONION_TRAPDOOR.get(); 
          ResourceLocation onion_trapdoor_texture = modLoc("block/onion_block");
          trapdoorBlockWithRenderType(onion_trapdoor, "onion_trapdoor", onion_trapdoor_texture, false, onion_trapdoor_texture);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          TrapDoorBlock tomato_trapdoor = foodblockcompatregistry.TOMATO_TRAPDOOR.get(); 
          ResourceLocation tomato_trapdoor_texture = modLoc("block/tomato_block");
          trapdoorBlockWithRenderType(tomato_trapdoor, "tomato_trapdoor", tomato_trapdoor_texture, false, tomato_trapdoor_texture);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          TrapDoorBlock pecan_trapdoor = foodblockcompatregistry.PECAN_TRAPDOOR.get(); 
          ResourceLocation pecan_trapdoor_texture = modLoc("block/pecan_block");
          trapdoorBlockWithRenderType(pecan_trapdoor, "pecan_trapdoor", pecan_trapdoor_texture, false, pecan_trapdoor_texture);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          TrapDoorBlock almond_trapdoor = foodblockcompatregistry.ALMOND_TRAPDOOR.get(); 
          ResourceLocation almond_trapdoor_texture = modLoc("block/almond_block");
          trapdoorBlockWithRenderType(almond_trapdoor, "almond_trapdoor", almond_trapdoor_texture, false, almond_trapdoor_texture);
    //==============================================================================================================================================
    //|                                                               Lamps                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          Block elderberry_lamp = foodblockcompatregistry.ELDERBERRY_LAMP.get();
          simpleBlock(elderberry_lamp);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          Block juniper_lamp = foodblockcompatregistry.JUNIPER_LAMP.get();
          simpleBlock(juniper_lamp);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          Block cherry_lamp = foodblockcompatregistry.CHERRY_LAMP.get();
          simpleBlock(cherry_lamp);
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          Block blackcherry_lamp = foodblockcompatregistry.BLACKCHERRY_LAMP.get();
          simpleBlock(blackcherry_lamp);
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          Block peach_lamp = foodblockcompatregistry.PEACH_LAMP.get();
          ResourceLocation peach_lamp_texture = modLoc("block/peach_lamp");
          horizontalBlock(peach_lamp, peach_lamp_texture, peach_lamp_texture, peach_lamp_texture);

     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          Block coconut_lamp = foodblockcompatregistry.COCONUT_LAMP.get();
          simpleBlock(coconut_lamp);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          Block orange_lamp = foodblockcompatregistry.ORANGE_LAMP.get();
          simpleBlock(orange_lamp);
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          Block tangerine_lamp = foodblockcompatregistry.TANGERINE_LAMP.get();
          simpleBlock(tangerine_lamp);
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          Block kumquat_lamp = foodblockcompatregistry.KUMQUAT_LAMP.get();
          simpleBlock(kumquat_lamp);
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          Block persimmon_lamp = foodblockcompatregistry.PERSIMMON_LAMP.get();
          simpleBlock(persimmon_lamp);
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          Block satsuma_lamp = foodblockcompatregistry.SATSUMA_LAMP.get();
          simpleBlock(satsuma_lamp);
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          Block mandarin_lamp = foodblockcompatregistry.MANDARIN_LAMP.get();
          simpleBlock(mandarin_lamp);
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          Block lemon_lamp = foodblockcompatregistry.LEMON_LAMP.get();
          simpleBlock(lemon_lamp);
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          Block citron_lamp = foodblockcompatregistry.CITRON_LAMP.get();
          simpleBlock(citron_lamp);
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          Block buddhashand_lamp = foodblockcompatregistry.BUDDHASHAND_LAMP.get();
          simpleBlock(buddhashand_lamp);
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          Block lime_lamp = foodblockcompatregistry.LIME_LAMP.get();
          simpleBlock(lime_lamp);
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          Block keylime_lamp = foodblockcompatregistry.KEYLIME_LAMP.get();
          simpleBlock(keylime_lamp);
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          Block fingerlime_lamp = foodblockcompatregistry.FINGERLIME_LAMP.get();
          simpleBlock(fingerlime_lamp);
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          Block grapefruit_lamp = foodblockcompatregistry.GRAPEFRUIT_LAMP.get();
          simpleBlock(grapefruit_lamp);
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          Block pomelo_lamp = foodblockcompatregistry.POMELO_LAMP.get();
          simpleBlock(pomelo_lamp);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          Block corn_lamp = foodblockcompatregistry.CORN_LAMP.get();
          simpleBlock(corn_lamp);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          Block onion_lamp = foodblockcompatregistry.ONION_LAMP.get();
          simpleBlock(onion_lamp);
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          Block tomato_lamp = foodblockcompatregistry.TOMATO_LAMP.get();
          simpleBlock(tomato_lamp);
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          Block pecan_lamp = foodblockcompatregistry.PECAN_LAMP.get();
          simpleBlock(pecan_lamp);
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          Block almond_lamp = foodblockcompatregistry.ALMOND_LAMP.get();
          simpleBlock(almond_lamp);
    //==============================================================================================================================================
    //|                                                              Carpets                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          CarpetBlock elderberry_carpet = foodblockcompatregistry.ELDERBERRY_CARPET.get();
          ResourceLocation elderberry_carpet_texture = modLoc("block/elderberry_carpet");
          BlockModelBuilder elderberry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(elderberry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", elderberry_carpet_texture);
          simpleBlock(elderberry_carpet, new ModelFile.UncheckedModelFile(elderberry_carpet_model.getLocation()));
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          CarpetBlock juniper_carpet = foodblockcompatregistry.JUNIPER_CARPET.get();
          ResourceLocation juniper_carpet_texture = modLoc("block/juniper_carpet");
          BlockModelBuilder juniper_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(juniper_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", juniper_carpet_texture);
          simpleBlock(juniper_carpet, new ModelFile.UncheckedModelFile(juniper_carpet_model.getLocation()));
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          CarpetBlock cherry_carpet = foodblockcompatregistry.CHERRY_CARPET.get();
          ResourceLocation cherry_carpet_texture = modLoc("block/cherry_carpet");
          BlockModelBuilder cherry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(cherry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", cherry_carpet_texture);
          simpleBlock(cherry_carpet, new ModelFile.UncheckedModelFile(cherry_carpet_model.getLocation()));
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          CarpetBlock blackcherry_carpet = foodblockcompatregistry.BLACKCHERRY_CARPET.get();
          ResourceLocation blackcherry_carpet_texture = modLoc("block/blackcherry_carpet");
          BlockModelBuilder blackcherry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(blackcherry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", blackcherry_carpet_texture);
          simpleBlock(blackcherry_carpet, new ModelFile.UncheckedModelFile(blackcherry_carpet_model.getLocation()));
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          CarpetBlock peach_carpet = foodblockcompatregistry.PEACH_CARPET.get();
          ResourceLocation peach_carpet_texture = modLoc("block/peach_carpet");
          BlockModelBuilder peach_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(peach_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", peach_carpet_texture);
          simpleBlock(peach_carpet, new ModelFile.UncheckedModelFile(peach_carpet_model.getLocation()));
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          CarpetBlock coconut_carpet = foodblockcompatregistry.COCONUT_CARPET.get();
          ResourceLocation coconut_carpet_texture = modLoc("block/coconut_carpet");
          BlockModelBuilder coconut_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(coconut_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", coconut_carpet_texture);
          simpleBlock(coconut_carpet, new ModelFile.UncheckedModelFile(coconut_carpet_model.getLocation()));
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          CarpetBlock orange_carpet = foodblockcompatregistry.ORANGE_CARPET.get();
          ResourceLocation orange_carpet_texture = modLoc("block/orange_carpet");
          BlockModelBuilder orange_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(orange_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", orange_carpet_texture);
          simpleBlock(orange_carpet, new ModelFile.UncheckedModelFile(orange_carpet_model.getLocation()));
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          CarpetBlock tangerine_carpet = foodblockcompatregistry.TANGERINE_CARPET.get();
          ResourceLocation tangerine_carpet_texture = modLoc("block/tangerine_carpet");
          BlockModelBuilder tangerine_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(tangerine_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", tangerine_carpet_texture);
          simpleBlock(tangerine_carpet, new ModelFile.UncheckedModelFile(tangerine_carpet_model.getLocation()));
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          CarpetBlock kumquat_carpet = foodblockcompatregistry.KUMQUAT_CARPET.get();
          ResourceLocation kumquat_carpet_texture = modLoc("block/kumquat_carpet");
          BlockModelBuilder kumquat_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(kumquat_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", kumquat_carpet_texture);
          simpleBlock(kumquat_carpet, new ModelFile.UncheckedModelFile(kumquat_carpet_model.getLocation()));
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          CarpetBlock persimmon_carpet = foodblockcompatregistry.PERSIMMON_CARPET.get();
          ResourceLocation persimmon_carpet_texture = modLoc("block/persimmon_carpet");
          BlockModelBuilder persimmon_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(persimmon_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", persimmon_carpet_texture);
          simpleBlock(persimmon_carpet, new ModelFile.UncheckedModelFile(persimmon_carpet_model.getLocation()));
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          CarpetBlock satsuma_carpet = foodblockcompatregistry.SATSUMA_CARPET.get();
          ResourceLocation satsuma_carpet_texture = modLoc("block/satsuma_carpet");
          BlockModelBuilder satsuma_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(satsuma_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", satsuma_carpet_texture);
          simpleBlock(satsuma_carpet, new ModelFile.UncheckedModelFile(satsuma_carpet_model.getLocation()));
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          CarpetBlock mandarin_carpet = foodblockcompatregistry.MANDARIN_CARPET.get();
          ResourceLocation mandarin_carpet_texture = modLoc("block/mandarin_carpet");
          BlockModelBuilder mandarin_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(mandarin_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", mandarin_carpet_texture);
          simpleBlock(mandarin_carpet, new ModelFile.UncheckedModelFile(mandarin_carpet_model.getLocation()));
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          CarpetBlock lemon_carpet = foodblockcompatregistry.LEMON_CARPET.get();
          ResourceLocation lemon_carpet_texture = modLoc("block/lemon_carpet");
          BlockModelBuilder lemon_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(lemon_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", lemon_carpet_texture);
          simpleBlock(lemon_carpet, new ModelFile.UncheckedModelFile(lemon_carpet_model.getLocation()));
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          CarpetBlock citron_carpet = foodblockcompatregistry.CITRON_CARPET.get();
          ResourceLocation citron_carpet_texture = modLoc("block/citron_carpet");
          BlockModelBuilder citron_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(citron_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", citron_carpet_texture);
          simpleBlock(citron_carpet, new ModelFile.UncheckedModelFile(citron_carpet_model.getLocation()));
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          CarpetBlock buddhashand_carpet = foodblockcompatregistry.BUDDHASHAND_CARPET.get();
          ResourceLocation buddhashand_carpet_texture = modLoc("block/buddhashand_carpet");
          BlockModelBuilder buddhashand_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(buddhashand_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", buddhashand_carpet_texture);
          simpleBlock(buddhashand_carpet, new ModelFile.UncheckedModelFile(buddhashand_carpet_model.getLocation()));
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          CarpetBlock lime_carpet = foodblockcompatregistry.LIME_CARPET.get();
          ResourceLocation lime_carpet_texture = modLoc("block/lime_carpet");
          BlockModelBuilder lime_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(lime_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", lime_carpet_texture);
          simpleBlock(lime_carpet, new ModelFile.UncheckedModelFile(lime_carpet_model.getLocation()));
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          CarpetBlock keylime_carpet = foodblockcompatregistry.KEYLIME_CARPET.get();
          ResourceLocation keylime_carpet_texture = modLoc("block/keylime_carpet");
          BlockModelBuilder keylime_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(keylime_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", keylime_carpet_texture);
          simpleBlock(keylime_carpet, new ModelFile.UncheckedModelFile(keylime_carpet_model.getLocation()));
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          CarpetBlock fingerlime_carpet = foodblockcompatregistry.FINGERLIME_CARPET.get();
          ResourceLocation fingerlime_carpet_texture = modLoc("block/fingerlime_carpet");
          BlockModelBuilder fingerlime_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(fingerlime_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", fingerlime_carpet_texture);
          simpleBlock(fingerlime_carpet, new ModelFile.UncheckedModelFile(fingerlime_carpet_model.getLocation()));
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          CarpetBlock grapefruit_carpet = foodblockcompatregistry.GRAPEFRUIT_CARPET.get();
          ResourceLocation grapefruit_carpet_texture = modLoc("block/grapefruit_carpet");
          BlockModelBuilder grapefruit_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(grapefruit_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", grapefruit_carpet_texture);
          simpleBlock(grapefruit_carpet, new ModelFile.UncheckedModelFile(grapefruit_carpet_model.getLocation()));
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          CarpetBlock pomelo_carpet = foodblockcompatregistry.POMELO_CARPET.get();
          ResourceLocation pomelo_carpet_texture = modLoc("block/pomelo_carpet");
          BlockModelBuilder pomelo_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(pomelo_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", pomelo_carpet_texture);
          simpleBlock(pomelo_carpet, new ModelFile.UncheckedModelFile(pomelo_carpet_model.getLocation()));
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          CarpetBlock corn_carpet = foodblockcompatregistry.CORN_CARPET.get();
          ResourceLocation corn_carpet_texture = modLoc("block/corn_carpet");
          BlockModelBuilder corn_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(corn_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", corn_carpet_texture);
          simpleBlock(corn_carpet, new ModelFile.UncheckedModelFile(corn_carpet_model.getLocation()));
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          CarpetBlock onion_carpet = foodblockcompatregistry.ONION_CARPET.get();
          ResourceLocation onion_carpet_texture = modLoc("block/onion_carpet");
          BlockModelBuilder onion_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(onion_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", onion_carpet_texture);
          simpleBlock(onion_carpet, new ModelFile.UncheckedModelFile(onion_carpet_model.getLocation()));
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          CarpetBlock tomato_carpet = foodblockcompatregistry.TOMATO_CARPET.get();
          ResourceLocation tomato_carpet_texture = modLoc("block/tomato_carpet");
          BlockModelBuilder tomato_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(tomato_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", tomato_carpet_texture);
          simpleBlock(tomato_carpet, new ModelFile.UncheckedModelFile(tomato_carpet_model.getLocation()));
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          CarpetBlock pecan_carpet = foodblockcompatregistry.PECAN_CARPET.get();
          ResourceLocation pecan_carpet_texture = modLoc("block/pecan_carpet");
          BlockModelBuilder pecan_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(pecan_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", pecan_carpet_texture);
          simpleBlock(pecan_carpet, new ModelFile.UncheckedModelFile(pecan_carpet_model.getLocation()));
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          CarpetBlock almond_carpet = foodblockcompatregistry.ALMOND_CARPET.get();
          ResourceLocation almond_carpet_texture = modLoc("block/almond_carpet");
          BlockModelBuilder almond_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(almond_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", almond_carpet_texture);
          simpleBlock(almond_carpet, new ModelFile.UncheckedModelFile(almond_carpet_model.getLocation()));
    //==============================================================================================================================================
    //|                                                             Lanterns                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //regular
          LanternBlock elderberry_lantern = foodblockcompatregistry.ELDERBERRY_LANTERN.get();
          ResourceLocation elderberry_lantern_texture = modLoc("block/elderberry_lantern");
  
          BlockModelBuilder elderberry_lantern_model = models()
              .withExistingParent("elderberry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", elderberry_lantern_texture);
  
          BlockModelBuilder hanging_elderberry_lantern_model = models()
              .withExistingParent("elderberry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", elderberry_lantern_texture);
  
          getVariantBuilder(elderberry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_elderberry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(elderberry_lantern_model).addModel();
         //soul
         LanternBlock elderberry_soul_lantern = foodblockcompatregistry.ELDERBERRY_SOUL_LANTERN.get();
         ResourceLocation elderberry_soul_lantern_texture = modLoc("block/elderberry_soul_lantern");
 
         BlockModelBuilder elderberry_soul_lantern_model = models()
             .withExistingParent("elderberry_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", elderberry_soul_lantern_texture);
 
         BlockModelBuilder hanging_elderberry_soul_lantern_model = models()
             .withExistingParent("elderberry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", elderberry_soul_lantern_texture);
 
         getVariantBuilder(elderberry_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_elderberry_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(elderberry_soul_lantern_model).addModel();
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         //regular
          LanternBlock juniper_lantern = foodblockcompatregistry.JUNIPER_LANTERN.get();
          ResourceLocation juniper_lantern_texture = modLoc("block/juniper_lantern");
  
          BlockModelBuilder juniper_lantern_model = models()
              .withExistingParent("juniper_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", juniper_lantern_texture);
  
          BlockModelBuilder hanging_juniper_lantern_model = models()
              .withExistingParent("juniper_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", juniper_lantern_texture);
  
          getVariantBuilder(juniper_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_juniper_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(juniper_lantern_model).addModel();
         //soul
         LanternBlock juniper_soul_lantern = foodblockcompatregistry.JUNIPER_SOUL_LANTERN.get();
         ResourceLocation juniper_soul_lantern_texture = modLoc("block/juniper_soul_lantern");
 
         BlockModelBuilder juniper_soul_lantern_model = models()
             .withExistingParent("juniper_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", juniper_soul_lantern_texture);
 
         BlockModelBuilder hanging_juniper_soul_lantern_model = models()
             .withExistingParent("juniper_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", juniper_soul_lantern_texture);
 
         getVariantBuilder(juniper_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_juniper_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(juniper_soul_lantern_model).addModel();
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         //regular
          LanternBlock cherry_lantern = foodblockcompatregistry.CHERRY_LANTERN.get();
          ResourceLocation cherry_lantern_texture = modLoc("block/cherry_lantern");
  
          BlockModelBuilder cherry_lantern_model = models()
              .withExistingParent("cherry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cherry_lantern_texture);
  
          BlockModelBuilder hanging_cherry_lantern_model = models()
              .withExistingParent("cherry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cherry_lantern_texture);
  
          getVariantBuilder(cherry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_cherry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(cherry_lantern_model).addModel();
         //soul
         LanternBlock cherry_soul_lantern = foodblockcompatregistry.CHERRY_SOUL_LANTERN.get();
         ResourceLocation cherry_soul_lantern_texture = modLoc("block/cherry_soul_lantern");
 
         BlockModelBuilder cherry_soul_lantern_model = models()
             .withExistingParent("cherry_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", cherry_soul_lantern_texture);
 
         BlockModelBuilder hanging_cherry_soul_lantern_model = models()
             .withExistingParent("cherry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", cherry_soul_lantern_texture);
 
         getVariantBuilder(cherry_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_cherry_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(cherry_soul_lantern_model).addModel();
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
         //regular
          LanternBlock blackcherry_lantern = foodblockcompatregistry.BLACKCHERRY_LANTERN.get();
          ResourceLocation blackcherry_lantern_texture = modLoc("block/blackcherry_lantern");
  
          BlockModelBuilder blackcherry_lantern_model = models()
              .withExistingParent("blackcherry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", blackcherry_lantern_texture);
  
          BlockModelBuilder hanging_blackcherry_lantern_model = models()
              .withExistingParent("blackcherry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", blackcherry_lantern_texture);
  
          getVariantBuilder(blackcherry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_blackcherry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(blackcherry_lantern_model).addModel();
         //soul
         LanternBlock blackcherry_soul_lantern = foodblockcompatregistry.BLACKCHERRY_SOUL_LANTERN.get();
         ResourceLocation blackcherry_soul_lantern_texture = modLoc("block/blackcherry_soul_lantern");
 
         BlockModelBuilder blackcherry_soul_lantern_model = models()
             .withExistingParent("blackcherry_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", blackcherry_soul_lantern_texture);
 
         BlockModelBuilder hanging_blackcherry_soul_lantern_model = models()
             .withExistingParent("blackcherry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", blackcherry_soul_lantern_texture);
 
         getVariantBuilder(blackcherry_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_blackcherry_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(blackcherry_soul_lantern_model).addModel();
     //------------------------------------------------------------peach-----------------------------------------------------------------------
         //regular
          LanternBlock peach_lantern = foodblockcompatregistry.PEACH_LANTERN.get();
          ResourceLocation peach_lantern_texture = modLoc("block/peach_lantern");
  
          BlockModelBuilder peach_lantern_model = models()
              .withExistingParent("peach_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", peach_lantern_texture);
  
          BlockModelBuilder hanging_peach_lantern_model = models()
              .withExistingParent("peach_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", peach_lantern_texture);
  
          getVariantBuilder(peach_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_peach_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(peach_lantern_model).addModel();
         //soul
         LanternBlock peach_soul_lantern = foodblockcompatregistry.PEACH_SOUL_LANTERN.get();
         ResourceLocation peach_soul_lantern_texture = modLoc("block/peach_soul_lantern");
 
         BlockModelBuilder peach_soul_lantern_model = models()
             .withExistingParent("peach_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", peach_soul_lantern_texture);
 
         BlockModelBuilder hanging_peach_soul_lantern_model = models()
             .withExistingParent("peach_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", peach_soul_lantern_texture);
 
         getVariantBuilder(peach_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_peach_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(peach_soul_lantern_model).addModel();
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         //regular
          LanternBlock coconut_lantern = foodblockcompatregistry.COCONUT_LANTERN.get();
          ResourceLocation coconut_lantern_texture = modLoc("block/coconut_lantern");
  
          BlockModelBuilder coconut_lantern_model = models()
              .withExistingParent("coconut_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", coconut_lantern_texture);
  
          BlockModelBuilder hanging_coconut_lantern_model = models()
              .withExistingParent("coconut_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", coconut_lantern_texture);
  
          getVariantBuilder(coconut_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_coconut_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(coconut_lantern_model).addModel();
         //soul
         LanternBlock coconut_soul_lantern = foodblockcompatregistry.COCONUT_SOUL_LANTERN.get();
         ResourceLocation coconut_soul_lantern_texture = modLoc("block/coconut_soul_lantern");
 
         BlockModelBuilder coconut_soul_lantern_model = models()
             .withExistingParent("coconut_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", coconut_soul_lantern_texture);
 
         BlockModelBuilder hanging_coconut_soul_lantern_model = models()
             .withExistingParent("coconut_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", coconut_soul_lantern_texture);
 
         getVariantBuilder(coconut_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_coconut_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(coconut_soul_lantern_model).addModel();
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         //regular
          LanternBlock orange_lantern = foodblockcompatregistry.ORANGE_LANTERN.get();
          ResourceLocation orange_lantern_texture = modLoc("block/orange_lantern");
  
          BlockModelBuilder orange_lantern_model = models()
              .withExistingParent("orange_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", orange_lantern_texture);
  
          BlockModelBuilder hanging_orange_lantern_model = models()
              .withExistingParent("orange_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", orange_lantern_texture);
  
          getVariantBuilder(orange_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_orange_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(orange_lantern_model).addModel();
         //soul
         LanternBlock orange_soul_lantern = foodblockcompatregistry.ORANGE_SOUL_LANTERN.get();
         ResourceLocation orange_soul_lantern_texture = modLoc("block/orange_soul_lantern");
 
         BlockModelBuilder orange_soul_lantern_model = models()
             .withExistingParent("orange_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", orange_soul_lantern_texture);
 
         BlockModelBuilder hanging_orange_soul_lantern_model = models()
             .withExistingParent("orange_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", orange_soul_lantern_texture);
 
         getVariantBuilder(orange_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_orange_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(orange_soul_lantern_model).addModel();
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
         //regular
          LanternBlock tangerine_lantern = foodblockcompatregistry.TANGERINE_LANTERN.get();
          ResourceLocation tangerine_lantern_texture = modLoc("block/tangerine_lantern");
  
          BlockModelBuilder tangerine_lantern_model = models()
              .withExistingParent("tangerine_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tangerine_lantern_texture);
  
          BlockModelBuilder hanging_tangerine_lantern_model = models()
              .withExistingParent("tangerine_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tangerine_lantern_texture);
  
          getVariantBuilder(tangerine_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_tangerine_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(tangerine_lantern_model).addModel();
         //soul
         LanternBlock tangerine_soul_lantern = foodblockcompatregistry.TANGERINE_SOUL_LANTERN.get();
         ResourceLocation tangerine_soul_lantern_texture = modLoc("block/tangerine_soul_lantern");
 
         BlockModelBuilder tangerine_soul_lantern_model = models()
             .withExistingParent("tangerine_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", tangerine_soul_lantern_texture);
 
         BlockModelBuilder hanging_tangerine_soul_lantern_model = models()
             .withExistingParent("tangerine_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", tangerine_soul_lantern_texture);
 
         getVariantBuilder(tangerine_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_tangerine_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(tangerine_soul_lantern_model).addModel();
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
         //regular
          LanternBlock kumquat_lantern = foodblockcompatregistry.KUMQUAT_LANTERN.get();
          ResourceLocation kumquat_lantern_texture = modLoc("block/kumquat_lantern");
  
          BlockModelBuilder kumquat_lantern_model = models()
              .withExistingParent("kumquat_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", kumquat_lantern_texture);
  
          BlockModelBuilder hanging_kumquat_lantern_model = models()
              .withExistingParent("kumquat_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", kumquat_lantern_texture);
  
          getVariantBuilder(kumquat_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_kumquat_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(kumquat_lantern_model).addModel();
         //soul
         LanternBlock kumquat_soul_lantern = foodblockcompatregistry.KUMQUAT_SOUL_LANTERN.get();
         ResourceLocation kumquat_soul_lantern_texture = modLoc("block/kumquat_soul_lantern");
 
         BlockModelBuilder kumquat_soul_lantern_model = models()
             .withExistingParent("kumquat_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", kumquat_soul_lantern_texture);
 
         BlockModelBuilder hanging_kumquat_soul_lantern_model = models()
             .withExistingParent("kumquat_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", kumquat_soul_lantern_texture);
 
         getVariantBuilder(kumquat_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_kumquat_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(kumquat_soul_lantern_model).addModel();
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
         //regular
          LanternBlock persimmon_lantern = foodblockcompatregistry.PERSIMMON_LANTERN.get();
          ResourceLocation persimmon_lantern_texture = modLoc("block/persimmon_lantern");
  
          BlockModelBuilder persimmon_lantern_model = models()
              .withExistingParent("persimmon_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", persimmon_lantern_texture);
  
          BlockModelBuilder hanging_persimmon_lantern_model = models()
              .withExistingParent("persimmon_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", persimmon_lantern_texture);
  
          getVariantBuilder(persimmon_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_persimmon_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(persimmon_lantern_model).addModel();
         //soul
         LanternBlock persimmon_soul_lantern = foodblockcompatregistry.PERSIMMON_SOUL_LANTERN.get();
         ResourceLocation persimmon_soul_lantern_texture = modLoc("block/persimmon_soul_lantern");
 
         BlockModelBuilder persimmon_soul_lantern_model = models()
             .withExistingParent("persimmon_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", persimmon_soul_lantern_texture);
 
         BlockModelBuilder hanging_persimmon_soul_lantern_model = models()
             .withExistingParent("persimmon_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", persimmon_soul_lantern_texture);
 
         getVariantBuilder(persimmon_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_persimmon_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(persimmon_soul_lantern_model).addModel();
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
         //regular
          LanternBlock satsuma_lantern = foodblockcompatregistry.SATSUMA_LANTERN.get();
          ResourceLocation satsuma_lantern_texture = modLoc("block/satsuma_lantern");
  
          BlockModelBuilder satsuma_lantern_model = models()
              .withExistingParent("satsuma_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", satsuma_lantern_texture);
  
          BlockModelBuilder hanging_satsuma_lantern_model = models()
              .withExistingParent("satsuma_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", satsuma_lantern_texture);
  
          getVariantBuilder(satsuma_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_satsuma_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(satsuma_lantern_model).addModel();
         //soul
         LanternBlock satsuma_soul_lantern = foodblockcompatregistry.SATSUMA_SOUL_LANTERN.get();
         ResourceLocation satsuma_soul_lantern_texture = modLoc("block/satsuma_soul_lantern");
 
         BlockModelBuilder satsuma_soul_lantern_model = models()
             .withExistingParent("satsuma_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", satsuma_soul_lantern_texture);
 
         BlockModelBuilder hanging_satsuma_soul_lantern_model = models()
             .withExistingParent("satsuma_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", satsuma_soul_lantern_texture);
 
         getVariantBuilder(satsuma_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_satsuma_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(satsuma_soul_lantern_model).addModel();
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
         //regular
          LanternBlock mandarin_lantern = foodblockcompatregistry.MANDARIN_LANTERN.get();
          ResourceLocation mandarin_lantern_texture = modLoc("block/mandarin_lantern");
  
          BlockModelBuilder mandarin_lantern_model = models()
              .withExistingParent("mandarin_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mandarin_lantern_texture);
  
          BlockModelBuilder hanging_mandarin_lantern_model = models()
              .withExistingParent("mandarin_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", mandarin_lantern_texture);
  
          getVariantBuilder(mandarin_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_mandarin_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(mandarin_lantern_model).addModel();
         //soul
         LanternBlock mandarin_soul_lantern = foodblockcompatregistry.MANDARIN_SOUL_LANTERN.get();
         ResourceLocation mandarin_soul_lantern_texture = modLoc("block/mandarin_soul_lantern");
 
         BlockModelBuilder mandarin_soul_lantern_model = models()
             .withExistingParent("mandarin_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", mandarin_soul_lantern_texture);
 
         BlockModelBuilder hanging_mandarin_soul_lantern_model = models()
             .withExistingParent("mandarin_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", mandarin_soul_lantern_texture);
 
         getVariantBuilder(mandarin_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_mandarin_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(mandarin_soul_lantern_model).addModel();
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
         //regular
          LanternBlock lemon_lantern = foodblockcompatregistry.LEMON_LANTERN.get();
          ResourceLocation lemon_lantern_texture = modLoc("block/lemon_lantern");
  
          BlockModelBuilder lemon_lantern_model = models()
              .withExistingParent("lemon_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", lemon_lantern_texture);
  
          BlockModelBuilder hanging_lemon_lantern_model = models()
              .withExistingParent("lemon_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", lemon_lantern_texture);
  
          getVariantBuilder(lemon_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_lemon_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(lemon_lantern_model).addModel();
         //soul
         LanternBlock lemon_soul_lantern = foodblockcompatregistry.LEMON_SOUL_LANTERN.get();
         ResourceLocation lemon_soul_lantern_texture = modLoc("block/lemon_soul_lantern");
 
         BlockModelBuilder lemon_soul_lantern_model = models()
             .withExistingParent("lemon_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", lemon_soul_lantern_texture);
 
         BlockModelBuilder hanging_lemon_soul_lantern_model = models()
             .withExistingParent("lemon_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", lemon_soul_lantern_texture);
 
         getVariantBuilder(lemon_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_lemon_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(lemon_soul_lantern_model).addModel();
     //------------------------------------------------------------citron-----------------------------------------------------------------------
         //regular
          LanternBlock citron_lantern = foodblockcompatregistry.CITRON_LANTERN.get();
          ResourceLocation citron_lantern_texture = modLoc("block/citron_lantern");
  
          BlockModelBuilder citron_lantern_model = models()
              .withExistingParent("citron_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", citron_lantern_texture);
  
          BlockModelBuilder hanging_citron_lantern_model = models()
              .withExistingParent("citron_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", citron_lantern_texture);
  
          getVariantBuilder(citron_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_citron_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(citron_lantern_model).addModel();
         //soul
         LanternBlock citron_soul_lantern = foodblockcompatregistry.CITRON_SOUL_LANTERN.get();
         ResourceLocation citron_soul_lantern_texture = modLoc("block/citron_soul_lantern");
 
         BlockModelBuilder citron_soul_lantern_model = models()
             .withExistingParent("citron_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", citron_soul_lantern_texture);
 
         BlockModelBuilder hanging_citron_soul_lantern_model = models()
             .withExistingParent("citron_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", citron_soul_lantern_texture);
 
         getVariantBuilder(citron_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_citron_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(citron_soul_lantern_model).addModel();
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
         //regular
          LanternBlock buddhashand_lantern = foodblockcompatregistry.BUDDHASHAND_LANTERN.get();
          ResourceLocation buddhashand_lantern_texture = modLoc("block/buddhashand_lantern");
  
          BlockModelBuilder buddhashand_lantern_model = models()
              .withExistingParent("buddhashand_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", buddhashand_lantern_texture);
  
          BlockModelBuilder hanging_buddhashand_lantern_model = models()
              .withExistingParent("buddhashand_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", buddhashand_lantern_texture);
  
          getVariantBuilder(buddhashand_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_buddhashand_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(buddhashand_lantern_model).addModel();
         //soul
         LanternBlock buddhashand_soul_lantern = foodblockcompatregistry.BUDDHASHAND_SOUL_LANTERN.get();
         ResourceLocation buddhashand_soul_lantern_texture = modLoc("block/buddhashand_soul_lantern");
 
         BlockModelBuilder buddhashand_soul_lantern_model = models()
             .withExistingParent("buddhashand_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", buddhashand_soul_lantern_texture);
 
         BlockModelBuilder hanging_buddhashand_soul_lantern_model = models()
             .withExistingParent("buddhashand_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", buddhashand_soul_lantern_texture);
 
         getVariantBuilder(buddhashand_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_buddhashand_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(buddhashand_soul_lantern_model).addModel();
     //------------------------------------------------------------lime-----------------------------------------------------------------------
         //regular
          LanternBlock lime_lantern = foodblockcompatregistry.LIME_LANTERN.get();
          ResourceLocation lime_lantern_texture = modLoc("block/lime_lantern");
  
          BlockModelBuilder lime_lantern_model = models()
              .withExistingParent("lime_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", lime_lantern_texture);
  
          BlockModelBuilder hanging_lime_lantern_model = models()
              .withExistingParent("lime_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", lime_lantern_texture);
  
          getVariantBuilder(lime_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_lime_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(lime_lantern_model).addModel();
         //soul
         LanternBlock lime_soul_lantern = foodblockcompatregistry.LIME_SOUL_LANTERN.get();
         ResourceLocation lime_soul_lantern_texture = modLoc("block/lime_soul_lantern");
 
         BlockModelBuilder lime_soul_lantern_model = models()
             .withExistingParent("lime_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", lime_soul_lantern_texture);
 
         BlockModelBuilder hanging_lime_soul_lantern_model = models()
             .withExistingParent("lime_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", lime_soul_lantern_texture);
 
         getVariantBuilder(lime_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_lime_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(lime_soul_lantern_model).addModel();
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
         //regular
          LanternBlock keylime_lantern = foodblockcompatregistry.KEYLIME_LANTERN.get();
          ResourceLocation keylime_lantern_texture = modLoc("block/keylime_lantern");
  
          BlockModelBuilder keylime_lantern_model = models()
              .withExistingParent("keylime_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", keylime_lantern_texture);
  
          BlockModelBuilder hanging_keylime_lantern_model = models()
              .withExistingParent("keylime_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", keylime_lantern_texture);
  
          getVariantBuilder(keylime_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_keylime_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(keylime_lantern_model).addModel();
         //soul
         LanternBlock keylime_soul_lantern = foodblockcompatregistry.KEYLIME_SOUL_LANTERN.get();
         ResourceLocation keylime_soul_lantern_texture = modLoc("block/keylime_soul_lantern");
 
         BlockModelBuilder keylime_soul_lantern_model = models()
             .withExistingParent("keylime_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", keylime_soul_lantern_texture);
 
         BlockModelBuilder hanging_keylime_soul_lantern_model = models()
             .withExistingParent("keylime_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", keylime_soul_lantern_texture);
 
         getVariantBuilder(keylime_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_keylime_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(keylime_soul_lantern_model).addModel();
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
         //regular
          LanternBlock fingerlime_lantern = foodblockcompatregistry.FINGERLIME_LANTERN.get();
          ResourceLocation fingerlime_lantern_texture = modLoc("block/fingerlime_lantern");
  
          BlockModelBuilder fingerlime_lantern_model = models()
              .withExistingParent("fingerlime_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", fingerlime_lantern_texture);
  
          BlockModelBuilder hanging_fingerlime_lantern_model = models()
              .withExistingParent("fingerlime_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", fingerlime_lantern_texture);
  
          getVariantBuilder(fingerlime_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_fingerlime_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(fingerlime_lantern_model).addModel();
         //soul
         LanternBlock fingerlime_soul_lantern = foodblockcompatregistry.FINGERLIME_SOUL_LANTERN.get();
         ResourceLocation fingerlime_soul_lantern_texture = modLoc("block/fingerlime_soul_lantern");
 
         BlockModelBuilder fingerlime_soul_lantern_model = models()
             .withExistingParent("fingerlime_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", fingerlime_soul_lantern_texture);
 
         BlockModelBuilder hanging_fingerlime_soul_lantern_model = models()
             .withExistingParent("fingerlime_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", fingerlime_soul_lantern_texture);
 
         getVariantBuilder(fingerlime_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_fingerlime_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(fingerlime_soul_lantern_model).addModel();
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
         //regular
          LanternBlock grapefruit_lantern = foodblockcompatregistry.GRAPEFRUIT_LANTERN.get();
          ResourceLocation grapefruit_lantern_texture = modLoc("block/grapefruit_lantern");
  
          BlockModelBuilder grapefruit_lantern_model = models()
              .withExistingParent("grapefruit_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", grapefruit_lantern_texture);
  
          BlockModelBuilder hanging_grapefruit_lantern_model = models()
              .withExistingParent("grapefruit_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", grapefruit_lantern_texture);
  
          getVariantBuilder(grapefruit_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_grapefruit_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(grapefruit_lantern_model).addModel();
         //soul
         LanternBlock grapefruit_soul_lantern = foodblockcompatregistry.GRAPEFRUIT_SOUL_LANTERN.get();
         ResourceLocation grapefruit_soul_lantern_texture = modLoc("block/grapefruit_soul_lantern");
 
         BlockModelBuilder grapefruit_soul_lantern_model = models()
             .withExistingParent("grapefruit_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", grapefruit_soul_lantern_texture);
 
         BlockModelBuilder hanging_grapefruit_soul_lantern_model = models()
             .withExistingParent("grapefruit_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", grapefruit_soul_lantern_texture);
 
         getVariantBuilder(grapefruit_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_grapefruit_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(grapefruit_soul_lantern_model).addModel();
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
         //regular
          LanternBlock pomelo_lantern = foodblockcompatregistry.POMELO_LANTERN.get();
          ResourceLocation pomelo_lantern_texture = modLoc("block/pomelo_lantern");
  
          BlockModelBuilder pomelo_lantern_model = models()
              .withExistingParent("pomelo_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pomelo_lantern_texture);
  
          BlockModelBuilder hanging_pomelo_lantern_model = models()
              .withExistingParent("pomelo_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pomelo_lantern_texture);
  
          getVariantBuilder(pomelo_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pomelo_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pomelo_lantern_model).addModel();
         //soul
         LanternBlock pomelo_soul_lantern = foodblockcompatregistry.POMELO_SOUL_LANTERN.get();
         ResourceLocation pomelo_soul_lantern_texture = modLoc("block/pomelo_soul_lantern");
 
         BlockModelBuilder pomelo_soul_lantern_model = models()
             .withExistingParent("pomelo_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", pomelo_soul_lantern_texture);
 
         BlockModelBuilder hanging_pomelo_soul_lantern_model = models()
             .withExistingParent("pomelo_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", pomelo_soul_lantern_texture);
 
         getVariantBuilder(pomelo_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_pomelo_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(pomelo_soul_lantern_model).addModel();
     //------------------------------------------------------------corn-----------------------------------------------------------------------
         //regular
          LanternBlock corn_lantern = foodblockcompatregistry.CORN_LANTERN.get();
          ResourceLocation corn_lantern_texture = modLoc("block/corn_lantern");
  
          BlockModelBuilder corn_lantern_model = models()
              .withExistingParent("corn_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", corn_lantern_texture);
  
          BlockModelBuilder hanging_corn_lantern_model = models()
              .withExistingParent("corn_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", corn_lantern_texture);
  
          getVariantBuilder(corn_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_corn_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(corn_lantern_model).addModel();
         //soul
         LanternBlock corn_soul_lantern = foodblockcompatregistry.CORN_SOUL_LANTERN.get();
         ResourceLocation corn_soul_lantern_texture = modLoc("block/corn_soul_lantern");
 
         BlockModelBuilder corn_soul_lantern_model = models()
             .withExistingParent("corn_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", corn_soul_lantern_texture);
 
         BlockModelBuilder hanging_corn_soul_lantern_model = models()
             .withExistingParent("corn_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", corn_soul_lantern_texture);
 
         getVariantBuilder(corn_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_corn_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(corn_soul_lantern_model).addModel();
     //------------------------------------------------------------onion-----------------------------------------------------------------------
         //regular
          LanternBlock onion_lantern = foodblockcompatregistry.ONION_LANTERN.get();
          ResourceLocation onion_lantern_texture = modLoc("block/onion_lantern");
  
          BlockModelBuilder onion_lantern_model = models()
              .withExistingParent("onion_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", onion_lantern_texture);
  
          BlockModelBuilder hanging_onion_lantern_model = models()
              .withExistingParent("onion_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", onion_lantern_texture);
  
          getVariantBuilder(onion_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_onion_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(onion_lantern_model).addModel();
         //soul
         LanternBlock onion_soul_lantern = foodblockcompatregistry.ONION_SOUL_LANTERN.get();
         ResourceLocation onion_soul_lantern_texture = modLoc("block/onion_soul_lantern");
 
         BlockModelBuilder onion_soul_lantern_model = models()
             .withExistingParent("onion_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", onion_soul_lantern_texture);
 
         BlockModelBuilder hanging_onion_soul_lantern_model = models()
             .withExistingParent("onion_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", onion_soul_lantern_texture);
 
         getVariantBuilder(onion_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_onion_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(onion_soul_lantern_model).addModel();
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
         //regular
          LanternBlock tomato_lantern = foodblockcompatregistry.TOMATO_LANTERN.get();
          ResourceLocation tomato_lantern_texture = modLoc("block/tomato_lantern");
  
          BlockModelBuilder tomato_lantern_model = models()
              .withExistingParent("tomato_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tomato_lantern_texture);
  
          BlockModelBuilder hanging_tomato_lantern_model = models()
              .withExistingParent("tomato_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", tomato_lantern_texture);
  
          getVariantBuilder(tomato_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_tomato_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(tomato_lantern_model).addModel();
         //soul
         LanternBlock tomato_soul_lantern = foodblockcompatregistry.TOMATO_SOUL_LANTERN.get();
         ResourceLocation tomato_soul_lantern_texture = modLoc("block/tomato_soul_lantern");
 
         BlockModelBuilder tomato_soul_lantern_model = models()
             .withExistingParent("tomato_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", tomato_soul_lantern_texture);
 
         BlockModelBuilder hanging_tomato_soul_lantern_model = models()
             .withExistingParent("tomato_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", tomato_soul_lantern_texture);
 
         getVariantBuilder(tomato_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_tomato_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(tomato_soul_lantern_model).addModel();
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
         //regular
          LanternBlock pecan_lantern = foodblockcompatregistry.PECAN_LANTERN.get();
          ResourceLocation pecan_lantern_texture = modLoc("block/pecan_lantern");
  
          BlockModelBuilder pecan_lantern_model = models()
              .withExistingParent("pecan_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pecan_lantern_texture);
  
          BlockModelBuilder hanging_pecan_lantern_model = models()
              .withExistingParent("pecan_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", pecan_lantern_texture);
  
          getVariantBuilder(pecan_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_pecan_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(pecan_lantern_model).addModel();
         //soul
         LanternBlock pecan_soul_lantern = foodblockcompatregistry.PECAN_SOUL_LANTERN.get();
         ResourceLocation pecan_soul_lantern_texture = modLoc("block/pecan_soul_lantern");
 
         BlockModelBuilder pecan_soul_lantern_model = models()
             .withExistingParent("pecan_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", pecan_soul_lantern_texture);
 
         BlockModelBuilder hanging_pecan_soul_lantern_model = models()
             .withExistingParent("pecan_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", pecan_soul_lantern_texture);
 
         getVariantBuilder(pecan_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_pecan_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(pecan_soul_lantern_model).addModel();
     //------------------------------------------------------------almond-----------------------------------------------------------------------
         //regular
          LanternBlock almond_lantern = foodblockcompatregistry.ALMOND_LANTERN.get();
          ResourceLocation almond_lantern_texture = modLoc("block/almond_lantern");
  
          BlockModelBuilder almond_lantern_model = models()
              .withExistingParent("almond_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", almond_lantern_texture);
  
          BlockModelBuilder hanging_almond_lantern_model = models()
              .withExistingParent("almond_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", almond_lantern_texture);
  
          getVariantBuilder(almond_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_almond_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(almond_lantern_model).addModel();
         //soul
         LanternBlock almond_soul_lantern = foodblockcompatregistry.ALMOND_SOUL_LANTERN.get();
         ResourceLocation almond_soul_lantern_texture = modLoc("block/almond_soul_lantern");
 
         BlockModelBuilder almond_soul_lantern_model = models()
             .withExistingParent("almond_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", almond_soul_lantern_texture);
 
         BlockModelBuilder hanging_almond_soul_lantern_model = models()
             .withExistingParent("almond_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", almond_soul_lantern_texture);
 
         getVariantBuilder(almond_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_almond_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(almond_soul_lantern_model).addModel();
    //==============================================================================================================================================
    //|                                                              Chains                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         ChainBlock elderberry_chain = foodblockcompatregistry.ELDERBERRY_CHAIN.get();
         ResourceLocation elderberry_chain_texture = modLoc("block/elderberry_chain");
         BlockModelBuilder elderberry_chain_model = models()
          .withExistingParent("elderberry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", elderberry_chain_texture)
          .texture("particle", elderberry_chain_texture);

          getVariantBuilder(elderberry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(elderberry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(elderberry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(elderberry_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         ChainBlock juniper_chain = foodblockcompatregistry.JUNIPER_CHAIN.get();
         ResourceLocation juniper_chain_texture = modLoc("block/juniper_chain");
         BlockModelBuilder juniper_chain_model = models()
          .withExistingParent("juniper_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", juniper_chain_texture)
          .texture("particle", juniper_chain_texture);

          getVariantBuilder(juniper_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(juniper_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(juniper_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(juniper_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         ChainBlock cherry_chain = foodblockcompatregistry.CHERRY_CHAIN.get();
         ResourceLocation cherry_chain_texture = modLoc("block/cherry_chain");
         BlockModelBuilder cherry_chain_model = models()
          .withExistingParent("cherry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", cherry_chain_texture)
          .texture("particle", cherry_chain_texture);

          getVariantBuilder(cherry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(cherry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(cherry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(cherry_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
         ChainBlock blackcherry_chain = foodblockcompatregistry.BLACKCHERRY_CHAIN.get();
         ResourceLocation blackcherry_chain_texture = modLoc("block/blackcherry_chain");
         BlockModelBuilder blackcherry_chain_model = models()
          .withExistingParent("blackcherry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", blackcherry_chain_texture)
          .texture("particle", blackcherry_chain_texture);

          getVariantBuilder(blackcherry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(blackcherry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(blackcherry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(blackcherry_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------peach-----------------------------------------------------------------------
         ChainBlock peach_chain = foodblockcompatregistry.PEACH_CHAIN.get();
         ResourceLocation peach_chain_texture = modLoc("block/peach_chain");
         BlockModelBuilder peach_chain_model = models()
          .withExistingParent("peach_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", peach_chain_texture)
          .texture("particle", peach_chain_texture);

          getVariantBuilder(peach_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(peach_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(peach_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(peach_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         ChainBlock coconut_chain = foodblockcompatregistry.COCONUT_CHAIN.get();
         ResourceLocation coconut_chain_texture = modLoc("block/coconut_chain");
         BlockModelBuilder coconut_chain_model = models()
          .withExistingParent("coconut_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", coconut_chain_texture)
          .texture("particle", coconut_chain_texture);

          getVariantBuilder(coconut_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(coconut_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(coconut_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(coconut_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         ChainBlock orange_chain = foodblockcompatregistry.ORANGE_CHAIN.get();
         ResourceLocation orange_chain_texture = modLoc("block/orange_chain");
         BlockModelBuilder orange_chain_model = models()
          .withExistingParent("orange_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", orange_chain_texture)
          .texture("particle", orange_chain_texture);

          getVariantBuilder(orange_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(orange_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(orange_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(orange_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
         ChainBlock tangerine_chain = foodblockcompatregistry.TANGERINE_CHAIN.get();
         ResourceLocation tangerine_chain_texture = modLoc("block/tangerine_chain");
         BlockModelBuilder tangerine_chain_model = models()
          .withExistingParent("tangerine_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", tangerine_chain_texture)
          .texture("particle", tangerine_chain_texture);

          getVariantBuilder(tangerine_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(tangerine_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(tangerine_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(tangerine_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
         ChainBlock kumquat_chain = foodblockcompatregistry.KUMQUAT_CHAIN.get();
         ResourceLocation kumquat_chain_texture = modLoc("block/kumquat_chain");
         BlockModelBuilder kumquat_chain_model = models()
          .withExistingParent("kumquat_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", kumquat_chain_texture)
          .texture("particle", kumquat_chain_texture);

          getVariantBuilder(kumquat_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(kumquat_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(kumquat_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(kumquat_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
         ChainBlock persimmon_chain = foodblockcompatregistry.PERSIMMON_CHAIN.get();
         ResourceLocation persimmon_chain_texture = modLoc("block/persimmon_chain");
         BlockModelBuilder persimmon_chain_model = models()
          .withExistingParent("persimmon_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", persimmon_chain_texture)
          .texture("particle", persimmon_chain_texture);

          getVariantBuilder(persimmon_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(persimmon_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(persimmon_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(persimmon_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
         ChainBlock satsuma_chain = foodblockcompatregistry.SATSUMA_CHAIN.get();
         ResourceLocation satsuma_chain_texture = modLoc("block/satsuma_chain");
         BlockModelBuilder satsuma_chain_model = models()
          .withExistingParent("satsuma_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", satsuma_chain_texture)
          .texture("particle", satsuma_chain_texture);

          getVariantBuilder(satsuma_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(satsuma_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(satsuma_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(satsuma_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
         ChainBlock mandarin_chain = foodblockcompatregistry.MANDARIN_CHAIN.get();
         ResourceLocation mandarin_chain_texture = modLoc("block/mandarin_chain");
         BlockModelBuilder mandarin_chain_model = models()
          .withExistingParent("mandarin_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", mandarin_chain_texture)
          .texture("particle", mandarin_chain_texture);

          getVariantBuilder(mandarin_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(mandarin_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(mandarin_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(mandarin_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
         ChainBlock lemon_chain = foodblockcompatregistry.LEMON_CHAIN.get();
         ResourceLocation lemon_chain_texture = modLoc("block/lemon_chain");
         BlockModelBuilder lemon_chain_model = models()
          .withExistingParent("lemon_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", lemon_chain_texture)
          .texture("particle", lemon_chain_texture);

          getVariantBuilder(lemon_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(lemon_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(lemon_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(lemon_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------citron-----------------------------------------------------------------------
         ChainBlock citron_chain = foodblockcompatregistry.CITRON_CHAIN.get();
         ResourceLocation citron_chain_texture = modLoc("block/citron_chain");
         BlockModelBuilder citron_chain_model = models()
          .withExistingParent("citron_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", citron_chain_texture)
          .texture("particle", citron_chain_texture);

          getVariantBuilder(citron_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(citron_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(citron_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(citron_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
         ChainBlock buddhashand_chain = foodblockcompatregistry.BUDDHASHAND_CHAIN.get();
         ResourceLocation buddhashand_chain_texture = modLoc("block/buddhashand_chain");
         BlockModelBuilder buddhashand_chain_model = models()
          .withExistingParent("buddhashand_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", buddhashand_chain_texture)
          .texture("particle", buddhashand_chain_texture);

          getVariantBuilder(buddhashand_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(buddhashand_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(buddhashand_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(buddhashand_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------lime-----------------------------------------------------------------------
         ChainBlock lime_chain = foodblockcompatregistry.LIME_CHAIN.get();
         ResourceLocation lime_chain_texture = modLoc("block/lime_chain");
         BlockModelBuilder lime_chain_model = models()
          .withExistingParent("lime_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", lime_chain_texture)
          .texture("particle", lime_chain_texture);

          getVariantBuilder(lime_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(lime_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(lime_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(lime_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
         ChainBlock keylime_chain = foodblockcompatregistry.KEYLIME_CHAIN.get();
         ResourceLocation keylime_chain_texture = modLoc("block/keylime_chain");
         BlockModelBuilder keylime_chain_model = models()
          .withExistingParent("keylime_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", keylime_chain_texture)
          .texture("particle", keylime_chain_texture);

          getVariantBuilder(keylime_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(keylime_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(keylime_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(keylime_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
         ChainBlock fingerlime_chain = foodblockcompatregistry.FINGERLIME_CHAIN.get();
         ResourceLocation fingerlime_chain_texture = modLoc("block/fingerlime_chain");
         BlockModelBuilder fingerlime_chain_model = models()
          .withExistingParent("fingerlime_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", fingerlime_chain_texture)
          .texture("particle", fingerlime_chain_texture);

          getVariantBuilder(fingerlime_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(fingerlime_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(fingerlime_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(fingerlime_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
         ChainBlock grapefruit_chain = foodblockcompatregistry.GRAPEFRUIT_CHAIN.get();
         ResourceLocation grapefruit_chain_texture = modLoc("block/grapefruit_chain");
         BlockModelBuilder grapefruit_chain_model = models()
          .withExistingParent("grapefruit_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", grapefruit_chain_texture)
          .texture("particle", grapefruit_chain_texture);

          getVariantBuilder(grapefruit_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(grapefruit_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(grapefruit_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(grapefruit_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
         ChainBlock pomelo_chain = foodblockcompatregistry.POMELO_CHAIN.get();
         ResourceLocation pomelo_chain_texture = modLoc("block/pomelo_chain");
         BlockModelBuilder pomelo_chain_model = models()
          .withExistingParent("pomelo_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", pomelo_chain_texture)
          .texture("particle", pomelo_chain_texture);

          getVariantBuilder(pomelo_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(pomelo_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(pomelo_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(pomelo_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
         ChainBlock corn_chain = foodblockcompatregistry.CORN_CHAIN.get();
         ResourceLocation corn_chain_texture = modLoc("block/corn_chain");
         BlockModelBuilder corn_chain_model = models()
          .withExistingParent("corn_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", corn_chain_texture)
          .texture("particle", corn_chain_texture);

          getVariantBuilder(corn_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(corn_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(corn_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(corn_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
         ChainBlock onion_chain = foodblockcompatregistry.ONION_CHAIN.get();
         ResourceLocation onion_chain_texture = modLoc("block/onion_chain");
         BlockModelBuilder onion_chain_model = models()
          .withExistingParent("onion_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", onion_chain_texture)
          .texture("particle", onion_chain_texture);

          getVariantBuilder(onion_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(onion_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(onion_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(onion_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
         ChainBlock tomato_chain = foodblockcompatregistry.TOMATO_CHAIN.get();
         ResourceLocation tomato_chain_texture = modLoc("block/tomato_chain");
         BlockModelBuilder tomato_chain_model = models()
          .withExistingParent("tomato_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", tomato_chain_texture)
          .texture("particle", tomato_chain_texture);

          getVariantBuilder(tomato_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(tomato_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(tomato_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(tomato_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
         ChainBlock pecan_chain = foodblockcompatregistry.PECAN_CHAIN.get();
         ResourceLocation pecan_chain_texture = modLoc("block/pecan_chain");
         BlockModelBuilder pecan_chain_model = models()
          .withExistingParent("pecan_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", pecan_chain_texture)
          .texture("particle", pecan_chain_texture);

          getVariantBuilder(pecan_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(pecan_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(pecan_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(pecan_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------almond-----------------------------------------------------------------------
         ChainBlock almond_chain = foodblockcompatregistry.ALMOND_CHAIN.get();
         ResourceLocation almond_chain_texture = modLoc("block/almond_chain");
         BlockModelBuilder almond_chain_model = models()
          .withExistingParent("almond_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", almond_chain_texture)
          .texture("particle", almond_chain_texture);

          getVariantBuilder(almond_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(almond_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(almond_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(almond_chain_model).rotationX(90).addModel(); 
    //==============================================================================================================================================
    //|                                                             Ladders                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          LadderBlock elderberryladder = foodblockcompatregistry.ELDERBERRY_LADDER.get();

          getVariantBuilder(elderberryladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          LadderBlock juniperladder = foodblockcompatregistry.JUNIPER_LADDER.get();

          getVariantBuilder(juniperladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          LadderBlock cherryladder = foodblockcompatregistry.CHERRY_LADDER.get();

          getVariantBuilder(cherryladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          LadderBlock blackcherryladder = foodblockcompatregistry.BLACKCHERRY_LADDER.get();

          getVariantBuilder(blackcherryladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/blackcherry_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          LadderBlock peachladder = foodblockcompatregistry.PEACH_LADDER.get();

          getVariantBuilder(peachladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/peach_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          LadderBlock coconutladder = foodblockcompatregistry.COCONUT_LADDER.get();

          getVariantBuilder(coconutladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          LadderBlock orangeladder = foodblockcompatregistry.ORANGE_LADDER.get();

          getVariantBuilder(orangeladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          LadderBlock tangerineladder = foodblockcompatregistry.TANGERINE_LADDER.get();

          getVariantBuilder(tangerineladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tangerine_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          LadderBlock kumquatladder = foodblockcompatregistry.KUMQUAT_LADDER.get();

          getVariantBuilder(kumquatladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/kumquat_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          LadderBlock persimmonladder = foodblockcompatregistry.PERSIMMON_LADDER.get();

          getVariantBuilder(persimmonladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/persimmon_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          LadderBlock satsumaladder = foodblockcompatregistry.SATSUMA_LADDER.get();

          getVariantBuilder(satsumaladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/satsuma_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          LadderBlock mandarinladder = foodblockcompatregistry.MANDARIN_LADDER.get();

          getVariantBuilder(mandarinladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/mandarin_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          LadderBlock lemonladder = foodblockcompatregistry.LEMON_LADDER.get();

          getVariantBuilder(lemonladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lemon_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          LadderBlock citronladder = foodblockcompatregistry.CITRON_LADDER.get();

          getVariantBuilder(citronladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/citron_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          LadderBlock buddhashandladder = foodblockcompatregistry.BUDDHASHAND_LADDER.get();

          getVariantBuilder(buddhashandladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/buddhashand_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          LadderBlock limeladder = foodblockcompatregistry.LIME_LADDER.get();

          getVariantBuilder(limeladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lime_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          LadderBlock keylimeladder = foodblockcompatregistry.KEYLIME_LADDER.get();

          getVariantBuilder(keylimeladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/keylime_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          LadderBlock fingerlimeladder = foodblockcompatregistry.FINGERLIME_LADDER.get();

          getVariantBuilder(fingerlimeladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/fingerlime_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          LadderBlock grapefruitladder = foodblockcompatregistry.GRAPEFRUIT_LADDER.get();

          getVariantBuilder(grapefruitladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/grapefruit_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          LadderBlock pomeloladder = foodblockcompatregistry.POMELO_LADDER.get();

          getVariantBuilder(pomeloladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pomelo_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          LadderBlock cornladder = foodblockcompatregistry.CORN_LADDER.get();

          getVariantBuilder(cornladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          LadderBlock onionladder = foodblockcompatregistry.ONION_LADDER.get();

          getVariantBuilder(onionladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          LadderBlock tomatoladder = foodblockcompatregistry.TOMATO_LADDER.get();

          getVariantBuilder(tomatoladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tomato_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          LadderBlock pecanladder = foodblockcompatregistry.PECAN_LADDER.get();

          getVariantBuilder(pecanladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pecan_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          LadderBlock almondladder = foodblockcompatregistry.ALMOND_LADDER.get();

          getVariantBuilder(almondladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/almond_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Tables                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          HorizontalDirectionalBlock elderberrytable = foodblockcompatregistry.ELDERBERRY_TABLE.get();

          getVariantBuilder(elderberrytable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          HorizontalDirectionalBlock junipertable = foodblockcompatregistry.JUNIPER_TABLE.get();

          getVariantBuilder(junipertable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          HorizontalDirectionalBlock cherrytable = foodblockcompatregistry.CHERRY_TABLE.get();

          getVariantBuilder(cherrytable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          HorizontalDirectionalBlock blackcherrytable = foodblockcompatregistry.BLACKCHERRY_TABLE.get();

          getVariantBuilder(blackcherrytable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/blackcherry_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          HorizontalDirectionalBlock peachtable = foodblockcompatregistry.PEACH_TABLE.get();

          getVariantBuilder(peachtable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/peach_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          HorizontalDirectionalBlock coconuttable = foodblockcompatregistry.COCONUT_TABLE.get();

          getVariantBuilder(coconuttable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          HorizontalDirectionalBlock orangetable = foodblockcompatregistry.ORANGE_TABLE.get();

          getVariantBuilder(orangetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          HorizontalDirectionalBlock tangerinetable = foodblockcompatregistry.TANGERINE_TABLE.get();

          getVariantBuilder(tangerinetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tangerine_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          HorizontalDirectionalBlock kumquattable = foodblockcompatregistry.KUMQUAT_TABLE.get();

          getVariantBuilder(kumquattable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/kumquat_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          HorizontalDirectionalBlock persimmontable = foodblockcompatregistry.PERSIMMON_TABLE.get();

          getVariantBuilder(persimmontable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/persimmon_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          HorizontalDirectionalBlock satsumatable = foodblockcompatregistry.SATSUMA_TABLE.get();

          getVariantBuilder(satsumatable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/satsuma_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          HorizontalDirectionalBlock mandarintable = foodblockcompatregistry.MANDARIN_TABLE.get();

          getVariantBuilder(mandarintable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/mandarin_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          HorizontalDirectionalBlock lemontable = foodblockcompatregistry.LEMON_TABLE.get();

          getVariantBuilder(lemontable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lemon_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          HorizontalDirectionalBlock citrontable = foodblockcompatregistry.CITRON_TABLE.get();

          getVariantBuilder(citrontable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/citron_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          HorizontalDirectionalBlock buddhashandtable = foodblockcompatregistry.BUDDHASHAND_TABLE.get();

          getVariantBuilder(buddhashandtable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/buddhashand_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          HorizontalDirectionalBlock limetable = foodblockcompatregistry.LIME_TABLE.get();

          getVariantBuilder(limetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lime_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          HorizontalDirectionalBlock keylimetable = foodblockcompatregistry.KEYLIME_TABLE.get();

          getVariantBuilder(keylimetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/keylime_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          HorizontalDirectionalBlock fingerlimetable = foodblockcompatregistry.FINGERLIME_TABLE.get();

          getVariantBuilder(fingerlimetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/fingerlime_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          HorizontalDirectionalBlock grapefruittable = foodblockcompatregistry.GRAPEFRUIT_TABLE.get();

          getVariantBuilder(grapefruittable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/grapefruit_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          HorizontalDirectionalBlock pomelotable = foodblockcompatregistry.POMELO_TABLE.get();

          getVariantBuilder(pomelotable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pomelo_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          HorizontalDirectionalBlock corntable = foodblockcompatregistry.CORN_TABLE.get();

          getVariantBuilder(corntable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          HorizontalDirectionalBlock oniontable = foodblockcompatregistry.ONION_TABLE.get();

          getVariantBuilder(oniontable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          HorizontalDirectionalBlock tomatotable = foodblockcompatregistry.TOMATO_TABLE.get();

          getVariantBuilder(tomatotable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tomato_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          HorizontalDirectionalBlock pecantable = foodblockcompatregistry.PECAN_TABLE.get();

          getVariantBuilder(pecantable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pecan_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          HorizontalDirectionalBlock almondtable = foodblockcompatregistry.ALMOND_TABLE.get();

          getVariantBuilder(almondtable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/almond_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Torches                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //regular
        TorchBlock elderberry_torch = foodblockcompatregistry.ELDERBERRY_TORCH.get();
        ResourceLocation elderberry_torch_texture = modLoc("block/elderberry_torch");
        BlockModelBuilder elderberry_torch_model = models()
        .withExistingParent("elderberry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_torch_texture)
        .texture("particle", elderberry_torch_texture);

        simpleBlock(elderberry_torch, elderberry_torch_model);

        TorchBlock elderberry_wall_torch = foodblockcompatregistry.ELDERBERRY_WALL_TORCH.get();
        BlockModelBuilder elderberry_wall_torch_model = models()
        .withExistingParent("elderberry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_torch_texture)
        .texture("particle", elderberry_torch_texture);
        getVariantBuilder(elderberry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_torch_texture)
                    .texture("particle", elderberry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock elderberry_redstone_torch = foodblockcompatregistry.ELDERBERRY_REDSTONE_TORCH.get();
        ResourceLocation elderberry_redstone_torch_texture = modLoc("block/elderberry_redstone_torch");
        BlockModelBuilder elderberry_redstone_torch_model = models()
        .withExistingParent("elderberry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_redstone_torch_texture)
        .texture("particle", elderberry_redstone_torch_texture);
        

        simpleBlock(elderberry_redstone_torch, elderberry_redstone_torch_model);

        ResourceLocation elderberry_redstone_wall_torch_texture = modLoc("block/elderberry_redstone_torch");

        RedstoneTorchBlock elderberry_redstone_wall_torch = foodblockcompatregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder elderberry_redstone_wall_torch_model = models()
        .withExistingParent("elderberry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_redstone_wall_torch_texture)
        .texture("particle", elderberry_redstone_wall_torch_texture);
        getVariantBuilder(elderberry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_redstone_wall_torch_texture)
                    .texture("particle", elderberry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock elderberry_soul_torch = foodblockcompatregistry.ELDERBERRY_SOUL_TORCH.get();
        ResourceLocation elderberry_soul_torch_texture = modLoc("block/elderberry_soul_torch");
        BlockModelBuilder elderberry_soul_torch_model = models()
        .withExistingParent("elderberry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_soul_torch_texture)
        .texture("particle", elderberry_soul_torch_texture);
        

        simpleBlock(elderberry_soul_torch, elderberry_soul_torch_model);

        ResourceLocation elderberry_soul_wall_torch_texture = modLoc("block/elderberry_soul_torch");
        TorchBlock elderberry_soul_wall_torch = foodblockcompatregistry.ELDERBERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder elderberry_soul_wall_torch_model = models()
        .withExistingParent("elderberry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_soul_wall_torch_texture)
        .texture("particle", elderberry_soul_wall_torch_texture);
        getVariantBuilder(elderberry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_soul_wall_torch_texture)
                    .texture("particle", elderberry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
       //regular
        TorchBlock juniper_torch = foodblockcompatregistry.JUNIPER_TORCH.get();
        ResourceLocation juniper_torch_texture = modLoc("block/juniper_torch");
        BlockModelBuilder juniper_torch_model = models()
        .withExistingParent("juniper_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_torch_texture)
        .texture("particle", juniper_torch_texture);

        simpleBlock(juniper_torch, juniper_torch_model);

        TorchBlock juniper_wall_torch = foodblockcompatregistry.JUNIPER_WALL_TORCH.get();
        BlockModelBuilder juniper_wall_torch_model = models()
        .withExistingParent("juniper_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_torch_texture)
        .texture("particle", juniper_torch_texture);
        getVariantBuilder(juniper_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_torch_texture)
                    .texture("particle", juniper_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock juniper_redstone_torch = foodblockcompatregistry.JUNIPER_REDSTONE_TORCH.get();
        ResourceLocation juniper_redstone_torch_texture = modLoc("block/juniper_redstone_torch");
        BlockModelBuilder juniper_redstone_torch_model = models()
        .withExistingParent("juniper_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_redstone_torch_texture)
        .texture("particle", juniper_redstone_torch_texture);
        

        simpleBlock(juniper_redstone_torch, juniper_redstone_torch_model);

        ResourceLocation juniper_redstone_wall_torch_texture = modLoc("block/juniper_redstone_torch");

        RedstoneTorchBlock juniper_redstone_wall_torch = foodblockcompatregistry.JUNIPER_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder juniper_redstone_wall_torch_model = models()
        .withExistingParent("juniper_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_redstone_wall_torch_texture)
        .texture("particle", juniper_redstone_wall_torch_texture);
        getVariantBuilder(juniper_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_redstone_wall_torch_texture)
                    .texture("particle", juniper_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock juniper_soul_torch = foodblockcompatregistry.JUNIPER_SOUL_TORCH.get();
        ResourceLocation juniper_soul_torch_texture = modLoc("block/juniper_soul_torch");
        BlockModelBuilder juniper_soul_torch_model = models()
        .withExistingParent("juniper_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_soul_torch_texture)
        .texture("particle", juniper_soul_torch_texture);
        

        simpleBlock(juniper_soul_torch, juniper_soul_torch_model);

        ResourceLocation juniper_soul_wall_torch_texture = modLoc("block/juniper_soul_torch");
        TorchBlock juniper_soul_wall_torch = foodblockcompatregistry.JUNIPER_SOUL_WALL_TORCH.get();
        BlockModelBuilder juniper_soul_wall_torch_model = models()
        .withExistingParent("juniper_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_soul_wall_torch_texture)
        .texture("particle", juniper_soul_wall_torch_texture);
        getVariantBuilder(juniper_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_soul_wall_torch_texture)
                    .texture("particle", juniper_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //regular
        TorchBlock cherry_torch = foodblockcompatregistry.CHERRY_TORCH.get();
        ResourceLocation cherry_torch_texture = modLoc("block/cherry_torch");
        BlockModelBuilder cherry_torch_model = models()
        .withExistingParent("cherry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_torch_texture)
        .texture("particle", cherry_torch_texture);

        simpleBlock(cherry_torch, cherry_torch_model);

        TorchBlock cherry_wall_torch = foodblockcompatregistry.CHERRY_WALL_TORCH.get();
        BlockModelBuilder cherry_wall_torch_model = models()
        .withExistingParent("cherry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_torch_texture)
        .texture("particle", cherry_torch_texture);
        getVariantBuilder(cherry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_torch_texture)
                    .texture("particle", cherry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock cherry_redstone_torch = foodblockcompatregistry.CHERRY_REDSTONE_TORCH.get();
        ResourceLocation cherry_redstone_torch_texture = modLoc("block/cherry_redstone_torch");
        BlockModelBuilder cherry_redstone_torch_model = models()
        .withExistingParent("cherry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_redstone_torch_texture)
        .texture("particle", cherry_redstone_torch_texture);
        

        simpleBlock(cherry_redstone_torch, cherry_redstone_torch_model);

        ResourceLocation cherry_redstone_wall_torch_texture = modLoc("block/cherry_redstone_torch");

        RedstoneTorchBlock cherry_redstone_wall_torch = foodblockcompatregistry.CHERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder cherry_redstone_wall_torch_model = models()
        .withExistingParent("cherry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_redstone_wall_torch_texture)
        .texture("particle", cherry_redstone_wall_torch_texture);
        getVariantBuilder(cherry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_redstone_wall_torch_texture)
                    .texture("particle", cherry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock cherry_soul_torch = foodblockcompatregistry.CHERRY_SOUL_TORCH.get();
        ResourceLocation cherry_soul_torch_texture = modLoc("block/cherry_soul_torch");
        BlockModelBuilder cherry_soul_torch_model = models()
        .withExistingParent("cherry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_soul_torch_texture)
        .texture("particle", cherry_soul_torch_texture);
        

        simpleBlock(cherry_soul_torch, cherry_soul_torch_model);

        ResourceLocation cherry_soul_wall_torch_texture = modLoc("block/cherry_soul_torch");
        TorchBlock cherry_soul_wall_torch = foodblockcompatregistry.CHERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder cherry_soul_wall_torch_model = models()
        .withExistingParent("cherry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_soul_wall_torch_texture)
        .texture("particle", cherry_soul_wall_torch_texture);
        getVariantBuilder(cherry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_soul_wall_torch_texture)
                    .texture("particle", cherry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
       //regular
        TorchBlock blackcherry_torch = foodblockcompatregistry.BLACKCHERRY_TORCH.get();
        ResourceLocation blackcherry_torch_texture = modLoc("block/blackcherry_torch");
        BlockModelBuilder blackcherry_torch_model = models()
        .withExistingParent("blackcherry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_torch_texture)
        .texture("particle", blackcherry_torch_texture);

        simpleBlock(blackcherry_torch, blackcherry_torch_model);

        TorchBlock blackcherry_wall_torch = foodblockcompatregistry.BLACKCHERRY_WALL_TORCH.get();
        BlockModelBuilder blackcherry_wall_torch_model = models()
        .withExistingParent("blackcherry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_torch_texture)
        .texture("particle", blackcherry_torch_texture);
        getVariantBuilder(blackcherry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("blackcherry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", blackcherry_torch_texture)
                    .texture("particle", blackcherry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock blackcherry_redstone_torch = foodblockcompatregistry.BLACKCHERRY_REDSTONE_TORCH.get();
        ResourceLocation blackcherry_redstone_torch_texture = modLoc("block/blackcherry_redstone_torch");
        BlockModelBuilder blackcherry_redstone_torch_model = models()
        .withExistingParent("blackcherry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_redstone_torch_texture)
        .texture("particle", blackcherry_redstone_torch_texture);
        

        simpleBlock(blackcherry_redstone_torch, blackcherry_redstone_torch_model);

        ResourceLocation blackcherry_redstone_wall_torch_texture = modLoc("block/blackcherry_redstone_torch");

        RedstoneTorchBlock blackcherry_redstone_wall_torch = foodblockcompatregistry.BLACKCHERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder blackcherry_redstone_wall_torch_model = models()
        .withExistingParent("blackcherry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_redstone_wall_torch_texture)
        .texture("particle", blackcherry_redstone_wall_torch_texture);
        getVariantBuilder(blackcherry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("blackcherry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", blackcherry_redstone_wall_torch_texture)
                    .texture("particle", blackcherry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock blackcherry_soul_torch = foodblockcompatregistry.BLACKCHERRY_SOUL_TORCH.get();
        ResourceLocation blackcherry_soul_torch_texture = modLoc("block/blackcherry_soul_torch");
        BlockModelBuilder blackcherry_soul_torch_model = models()
        .withExistingParent("blackcherry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_soul_torch_texture)
        .texture("particle", blackcherry_soul_torch_texture);
        

        simpleBlock(blackcherry_soul_torch, blackcherry_soul_torch_model);

        ResourceLocation blackcherry_soul_wall_torch_texture = modLoc("block/blackcherry_soul_torch");
        TorchBlock blackcherry_soul_wall_torch = foodblockcompatregistry.BLACKCHERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder blackcherry_soul_wall_torch_model = models()
        .withExistingParent("blackcherry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", blackcherry_soul_wall_torch_texture)
        .texture("particle", blackcherry_soul_wall_torch_texture);
        getVariantBuilder(blackcherry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("blackcherry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", blackcherry_soul_wall_torch_texture)
                    .texture("particle", blackcherry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
       //regular
        TorchBlock peach_torch = foodblockcompatregistry.PEACH_TORCH.get();
        ResourceLocation peach_torch_texture = modLoc("block/peach_torch");
        BlockModelBuilder peach_torch_model = models()
        .withExistingParent("peach_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_torch_texture)
        .texture("particle", peach_torch_texture);

        simpleBlock(peach_torch, peach_torch_model);

        TorchBlock peach_wall_torch = foodblockcompatregistry.PEACH_WALL_TORCH.get();
        BlockModelBuilder peach_wall_torch_model = models()
        .withExistingParent("peach_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_torch_texture)
        .texture("particle", peach_torch_texture);
        getVariantBuilder(peach_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("peach_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", peach_torch_texture)
                    .texture("particle", peach_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock peach_redstone_torch = foodblockcompatregistry.PEACH_REDSTONE_TORCH.get();
        ResourceLocation peach_redstone_torch_texture = modLoc("block/peach_redstone_torch");
        BlockModelBuilder peach_redstone_torch_model = models()
        .withExistingParent("peach_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_redstone_torch_texture)
        .texture("particle", peach_redstone_torch_texture);
        

        simpleBlock(peach_redstone_torch, peach_redstone_torch_model);

        ResourceLocation peach_redstone_wall_torch_texture = modLoc("block/peach_redstone_torch");

        RedstoneTorchBlock peach_redstone_wall_torch = foodblockcompatregistry.PEACH_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder peach_redstone_wall_torch_model = models()
        .withExistingParent("peach_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_redstone_wall_torch_texture)
        .texture("particle", peach_redstone_wall_torch_texture);
        getVariantBuilder(peach_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("peach_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", peach_redstone_wall_torch_texture)
                    .texture("particle", peach_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock peach_soul_torch = foodblockcompatregistry.PEACH_SOUL_TORCH.get();
        ResourceLocation peach_soul_torch_texture = modLoc("block/peach_soul_torch");
        BlockModelBuilder peach_soul_torch_model = models()
        .withExistingParent("peach_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_soul_torch_texture)
        .texture("particle", peach_soul_torch_texture);
        

        simpleBlock(peach_soul_torch, peach_soul_torch_model);

        ResourceLocation peach_soul_wall_torch_texture = modLoc("block/peach_soul_torch");
        TorchBlock peach_soul_wall_torch = foodblockcompatregistry.PEACH_SOUL_WALL_TORCH.get();
        BlockModelBuilder peach_soul_wall_torch_model = models()
        .withExistingParent("peach_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", peach_soul_wall_torch_texture)
        .texture("particle", peach_soul_wall_torch_texture);
        getVariantBuilder(peach_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("peach_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", peach_soul_wall_torch_texture)
                    .texture("particle", peach_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
       //regular
        TorchBlock coconut_torch = foodblockcompatregistry.COCONUT_TORCH.get();
        ResourceLocation coconut_torch_texture = modLoc("block/coconut_torch");
        BlockModelBuilder coconut_torch_model = models()
        .withExistingParent("coconut_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_torch_texture)
        .texture("particle", coconut_torch_texture);

        simpleBlock(coconut_torch, coconut_torch_model);

        TorchBlock coconut_wall_torch = foodblockcompatregistry.COCONUT_WALL_TORCH.get();
        BlockModelBuilder coconut_wall_torch_model = models()
        .withExistingParent("coconut_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_torch_texture)
        .texture("particle", coconut_torch_texture);
        getVariantBuilder(coconut_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_torch_texture)
                    .texture("particle", coconut_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock coconut_redstone_torch = foodblockcompatregistry.COCONUT_REDSTONE_TORCH.get();
        ResourceLocation coconut_redstone_torch_texture = modLoc("block/coconut_redstone_torch");
        BlockModelBuilder coconut_redstone_torch_model = models()
        .withExistingParent("coconut_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_redstone_torch_texture)
        .texture("particle", coconut_redstone_torch_texture);
        

        simpleBlock(coconut_redstone_torch, coconut_redstone_torch_model);

        ResourceLocation coconut_redstone_wall_torch_texture = modLoc("block/coconut_redstone_torch");

        RedstoneTorchBlock coconut_redstone_wall_torch = foodblockcompatregistry.COCONUT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder coconut_redstone_wall_torch_model = models()
        .withExistingParent("coconut_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_redstone_wall_torch_texture)
        .texture("particle", coconut_redstone_wall_torch_texture);
        getVariantBuilder(coconut_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_redstone_wall_torch_texture)
                    .texture("particle", coconut_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock coconut_soul_torch = foodblockcompatregistry.COCONUT_SOUL_TORCH.get();
        ResourceLocation coconut_soul_torch_texture = modLoc("block/coconut_soul_torch");
        BlockModelBuilder coconut_soul_torch_model = models()
        .withExistingParent("coconut_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_soul_torch_texture)
        .texture("particle", coconut_soul_torch_texture);
        

        simpleBlock(coconut_soul_torch, coconut_soul_torch_model);

        ResourceLocation coconut_soul_wall_torch_texture = modLoc("block/coconut_soul_torch");
        TorchBlock coconut_soul_wall_torch = foodblockcompatregistry.COCONUT_SOUL_WALL_TORCH.get();
        BlockModelBuilder coconut_soul_wall_torch_model = models()
        .withExistingParent("coconut_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_soul_wall_torch_texture)
        .texture("particle", coconut_soul_wall_torch_texture);
        getVariantBuilder(coconut_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_soul_wall_torch_texture)
                    .texture("particle", coconut_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
       //regular
        TorchBlock orange_torch = foodblockcompatregistry.ORANGE_TORCH.get();
        ResourceLocation orange_torch_texture = modLoc("block/orange_torch");
        BlockModelBuilder orange_torch_model = models()
        .withExistingParent("orange_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_torch_texture)
        .texture("particle", orange_torch_texture);

        simpleBlock(orange_torch, orange_torch_model);

        TorchBlock orange_wall_torch = foodblockcompatregistry.ORANGE_WALL_TORCH.get();
        BlockModelBuilder orange_wall_torch_model = models()
        .withExistingParent("orange_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_torch_texture)
        .texture("particle", orange_torch_texture);
        getVariantBuilder(orange_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_torch_texture)
                    .texture("particle", orange_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock orange_redstone_torch = foodblockcompatregistry.ORANGE_REDSTONE_TORCH.get();
        ResourceLocation orange_redstone_torch_texture = modLoc("block/orange_redstone_torch");
        BlockModelBuilder orange_redstone_torch_model = models()
        .withExistingParent("orange_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_redstone_torch_texture)
        .texture("particle", orange_redstone_torch_texture);
        

        simpleBlock(orange_redstone_torch, orange_redstone_torch_model);

        ResourceLocation orange_redstone_wall_torch_texture = modLoc("block/orange_redstone_torch");

        RedstoneTorchBlock orange_redstone_wall_torch = foodblockcompatregistry.ORANGE_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder orange_redstone_wall_torch_model = models()
        .withExistingParent("orange_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_redstone_wall_torch_texture)
        .texture("particle", orange_redstone_wall_torch_texture);
        getVariantBuilder(orange_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_redstone_wall_torch_texture)
                    .texture("particle", orange_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock orange_soul_torch = foodblockcompatregistry.ORANGE_SOUL_TORCH.get();
        ResourceLocation orange_soul_torch_texture = modLoc("block/orange_soul_torch");
        BlockModelBuilder orange_soul_torch_model = models()
        .withExistingParent("orange_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_soul_torch_texture)
        .texture("particle", orange_soul_torch_texture);
        

        simpleBlock(orange_soul_torch, orange_soul_torch_model);

        ResourceLocation orange_soul_wall_torch_texture = modLoc("block/orange_soul_torch");
        TorchBlock orange_soul_wall_torch = foodblockcompatregistry.ORANGE_SOUL_WALL_TORCH.get();
        BlockModelBuilder orange_soul_wall_torch_model = models()
        .withExistingParent("orange_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_soul_wall_torch_texture)
        .texture("particle", orange_soul_wall_torch_texture);
        getVariantBuilder(orange_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_soul_wall_torch_texture)
                    .texture("particle", orange_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
       //regular
        TorchBlock tangerine_torch = foodblockcompatregistry.TANGERINE_TORCH.get();
        ResourceLocation tangerine_torch_texture = modLoc("block/tangerine_torch");
        BlockModelBuilder tangerine_torch_model = models()
        .withExistingParent("tangerine_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_torch_texture)
        .texture("particle", tangerine_torch_texture);

        simpleBlock(tangerine_torch, tangerine_torch_model);

        TorchBlock tangerine_wall_torch = foodblockcompatregistry.TANGERINE_WALL_TORCH.get();
        BlockModelBuilder tangerine_wall_torch_model = models()
        .withExistingParent("tangerine_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_torch_texture)
        .texture("particle", tangerine_torch_texture);
        getVariantBuilder(tangerine_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tangerine_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tangerine_torch_texture)
                    .texture("particle", tangerine_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock tangerine_redstone_torch = foodblockcompatregistry.TANGERINE_REDSTONE_TORCH.get();
        ResourceLocation tangerine_redstone_torch_texture = modLoc("block/tangerine_redstone_torch");
        BlockModelBuilder tangerine_redstone_torch_model = models()
        .withExistingParent("tangerine_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_redstone_torch_texture)
        .texture("particle", tangerine_redstone_torch_texture);
        

        simpleBlock(tangerine_redstone_torch, tangerine_redstone_torch_model);

        ResourceLocation tangerine_redstone_wall_torch_texture = modLoc("block/tangerine_redstone_torch");

        RedstoneTorchBlock tangerine_redstone_wall_torch = foodblockcompatregistry.TANGERINE_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder tangerine_redstone_wall_torch_model = models()
        .withExistingParent("tangerine_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_redstone_wall_torch_texture)
        .texture("particle", tangerine_redstone_wall_torch_texture);
        getVariantBuilder(tangerine_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tangerine_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tangerine_redstone_wall_torch_texture)
                    .texture("particle", tangerine_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock tangerine_soul_torch = foodblockcompatregistry.TANGERINE_SOUL_TORCH.get();
        ResourceLocation tangerine_soul_torch_texture = modLoc("block/tangerine_soul_torch");
        BlockModelBuilder tangerine_soul_torch_model = models()
        .withExistingParent("tangerine_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_soul_torch_texture)
        .texture("particle", tangerine_soul_torch_texture);
        

        simpleBlock(tangerine_soul_torch, tangerine_soul_torch_model);

        ResourceLocation tangerine_soul_wall_torch_texture = modLoc("block/tangerine_soul_torch");
        TorchBlock tangerine_soul_wall_torch = foodblockcompatregistry.TANGERINE_SOUL_WALL_TORCH.get();
        BlockModelBuilder tangerine_soul_wall_torch_model = models()
        .withExistingParent("tangerine_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tangerine_soul_wall_torch_texture)
        .texture("particle", tangerine_soul_wall_torch_texture);
        getVariantBuilder(tangerine_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tangerine_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tangerine_soul_wall_torch_texture)
                    .texture("particle", tangerine_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
       //regular
        TorchBlock kumquat_torch = foodblockcompatregistry.KUMQUAT_TORCH.get();
        ResourceLocation kumquat_torch_texture = modLoc("block/kumquat_torch");
        BlockModelBuilder kumquat_torch_model = models()
        .withExistingParent("kumquat_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_torch_texture)
        .texture("particle", kumquat_torch_texture);

        simpleBlock(kumquat_torch, kumquat_torch_model);

        TorchBlock kumquat_wall_torch = foodblockcompatregistry.KUMQUAT_WALL_TORCH.get();
        BlockModelBuilder kumquat_wall_torch_model = models()
        .withExistingParent("kumquat_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_torch_texture)
        .texture("particle", kumquat_torch_texture);
        getVariantBuilder(kumquat_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("kumquat_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", kumquat_torch_texture)
                    .texture("particle", kumquat_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock kumquat_redstone_torch = foodblockcompatregistry.KUMQUAT_REDSTONE_TORCH.get();
        ResourceLocation kumquat_redstone_torch_texture = modLoc("block/kumquat_redstone_torch");
        BlockModelBuilder kumquat_redstone_torch_model = models()
        .withExistingParent("kumquat_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_redstone_torch_texture)
        .texture("particle", kumquat_redstone_torch_texture);
        

        simpleBlock(kumquat_redstone_torch, kumquat_redstone_torch_model);

        ResourceLocation kumquat_redstone_wall_torch_texture = modLoc("block/kumquat_redstone_torch");

        RedstoneTorchBlock kumquat_redstone_wall_torch = foodblockcompatregistry.KUMQUAT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder kumquat_redstone_wall_torch_model = models()
        .withExistingParent("kumquat_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_redstone_wall_torch_texture)
        .texture("particle", kumquat_redstone_wall_torch_texture);
        getVariantBuilder(kumquat_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("kumquat_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", kumquat_redstone_wall_torch_texture)
                    .texture("particle", kumquat_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock kumquat_soul_torch = foodblockcompatregistry.KUMQUAT_SOUL_TORCH.get();
        ResourceLocation kumquat_soul_torch_texture = modLoc("block/kumquat_soul_torch");
        BlockModelBuilder kumquat_soul_torch_model = models()
        .withExistingParent("kumquat_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_soul_torch_texture)
        .texture("particle", kumquat_soul_torch_texture);
        

        simpleBlock(kumquat_soul_torch, kumquat_soul_torch_model);

        ResourceLocation kumquat_soul_wall_torch_texture = modLoc("block/kumquat_soul_torch");
        TorchBlock kumquat_soul_wall_torch = foodblockcompatregistry.KUMQUAT_SOUL_WALL_TORCH.get();
        BlockModelBuilder kumquat_soul_wall_torch_model = models()
        .withExistingParent("kumquat_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", kumquat_soul_wall_torch_texture)
        .texture("particle", kumquat_soul_wall_torch_texture);
        getVariantBuilder(kumquat_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("kumquat_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", kumquat_soul_wall_torch_texture)
                    .texture("particle", kumquat_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
       //regular
        TorchBlock persimmon_torch = foodblockcompatregistry.PERSIMMON_TORCH.get();
        ResourceLocation persimmon_torch_texture = modLoc("block/persimmon_torch");
        BlockModelBuilder persimmon_torch_model = models()
        .withExistingParent("persimmon_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_torch_texture)
        .texture("particle", persimmon_torch_texture);

        simpleBlock(persimmon_torch, persimmon_torch_model);

        TorchBlock persimmon_wall_torch = foodblockcompatregistry.PERSIMMON_WALL_TORCH.get();
        BlockModelBuilder persimmon_wall_torch_model = models()
        .withExistingParent("persimmon_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_torch_texture)
        .texture("particle", persimmon_torch_texture);
        getVariantBuilder(persimmon_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("persimmon_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", persimmon_torch_texture)
                    .texture("particle", persimmon_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock persimmon_redstone_torch = foodblockcompatregistry.PERSIMMON_REDSTONE_TORCH.get();
        ResourceLocation persimmon_redstone_torch_texture = modLoc("block/persimmon_redstone_torch");
        BlockModelBuilder persimmon_redstone_torch_model = models()
        .withExistingParent("persimmon_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_redstone_torch_texture)
        .texture("particle", persimmon_redstone_torch_texture);
        

        simpleBlock(persimmon_redstone_torch, persimmon_redstone_torch_model);

        ResourceLocation persimmon_redstone_wall_torch_texture = modLoc("block/persimmon_redstone_torch");

        RedstoneTorchBlock persimmon_redstone_wall_torch = foodblockcompatregistry.PERSIMMON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder persimmon_redstone_wall_torch_model = models()
        .withExistingParent("persimmon_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_redstone_wall_torch_texture)
        .texture("particle", persimmon_redstone_wall_torch_texture);
        getVariantBuilder(persimmon_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("persimmon_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", persimmon_redstone_wall_torch_texture)
                    .texture("particle", persimmon_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock persimmon_soul_torch = foodblockcompatregistry.PERSIMMON_SOUL_TORCH.get();
        ResourceLocation persimmon_soul_torch_texture = modLoc("block/persimmon_soul_torch");
        BlockModelBuilder persimmon_soul_torch_model = models()
        .withExistingParent("persimmon_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_soul_torch_texture)
        .texture("particle", persimmon_soul_torch_texture);
        

        simpleBlock(persimmon_soul_torch, persimmon_soul_torch_model);

        ResourceLocation persimmon_soul_wall_torch_texture = modLoc("block/persimmon_soul_torch");
        TorchBlock persimmon_soul_wall_torch = foodblockcompatregistry.PERSIMMON_SOUL_WALL_TORCH.get();
        BlockModelBuilder persimmon_soul_wall_torch_model = models()
        .withExistingParent("persimmon_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", persimmon_soul_wall_torch_texture)
        .texture("particle", persimmon_soul_wall_torch_texture);
        getVariantBuilder(persimmon_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("persimmon_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", persimmon_soul_wall_torch_texture)
                    .texture("particle", persimmon_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
       //regular
        TorchBlock satsuma_torch = foodblockcompatregistry.SATSUMA_TORCH.get();
        ResourceLocation satsuma_torch_texture = modLoc("block/satsuma_torch");
        BlockModelBuilder satsuma_torch_model = models()
        .withExistingParent("satsuma_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_torch_texture)
        .texture("particle", satsuma_torch_texture);

        simpleBlock(satsuma_torch, satsuma_torch_model);

        TorchBlock satsuma_wall_torch = foodblockcompatregistry.SATSUMA_WALL_TORCH.get();
        BlockModelBuilder satsuma_wall_torch_model = models()
        .withExistingParent("satsuma_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_torch_texture)
        .texture("particle", satsuma_torch_texture);
        getVariantBuilder(satsuma_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("satsuma_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", satsuma_torch_texture)
                    .texture("particle", satsuma_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock satsuma_redstone_torch = foodblockcompatregistry.SATSUMA_REDSTONE_TORCH.get();
        ResourceLocation satsuma_redstone_torch_texture = modLoc("block/satsuma_redstone_torch");
        BlockModelBuilder satsuma_redstone_torch_model = models()
        .withExistingParent("satsuma_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_redstone_torch_texture)
        .texture("particle", satsuma_redstone_torch_texture);
        

        simpleBlock(satsuma_redstone_torch, satsuma_redstone_torch_model);

        ResourceLocation satsuma_redstone_wall_torch_texture = modLoc("block/satsuma_redstone_torch");

        RedstoneTorchBlock satsuma_redstone_wall_torch = foodblockcompatregistry.SATSUMA_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder satsuma_redstone_wall_torch_model = models()
        .withExistingParent("satsuma_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_redstone_wall_torch_texture)
        .texture("particle", satsuma_redstone_wall_torch_texture);
        getVariantBuilder(satsuma_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("satsuma_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", satsuma_redstone_wall_torch_texture)
                    .texture("particle", satsuma_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock satsuma_soul_torch = foodblockcompatregistry.SATSUMA_SOUL_TORCH.get();
        ResourceLocation satsuma_soul_torch_texture = modLoc("block/satsuma_soul_torch");
        BlockModelBuilder satsuma_soul_torch_model = models()
        .withExistingParent("satsuma_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_soul_torch_texture)
        .texture("particle", satsuma_soul_torch_texture);
        

        simpleBlock(satsuma_soul_torch, satsuma_soul_torch_model);

        ResourceLocation satsuma_soul_wall_torch_texture = modLoc("block/satsuma_soul_torch");
        TorchBlock satsuma_soul_wall_torch = foodblockcompatregistry.SATSUMA_SOUL_WALL_TORCH.get();
        BlockModelBuilder satsuma_soul_wall_torch_model = models()
        .withExistingParent("satsuma_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", satsuma_soul_wall_torch_texture)
        .texture("particle", satsuma_soul_wall_torch_texture);
        getVariantBuilder(satsuma_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("satsuma_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", satsuma_soul_wall_torch_texture)
                    .texture("particle", satsuma_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
       //regular
        TorchBlock mandarin_torch = foodblockcompatregistry.MANDARIN_TORCH.get();
        ResourceLocation mandarin_torch_texture = modLoc("block/mandarin_torch");
        BlockModelBuilder mandarin_torch_model = models()
        .withExistingParent("mandarin_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_torch_texture)
        .texture("particle", mandarin_torch_texture);

        simpleBlock(mandarin_torch, mandarin_torch_model);

        TorchBlock mandarin_wall_torch = foodblockcompatregistry.MANDARIN_WALL_TORCH.get();
        BlockModelBuilder mandarin_wall_torch_model = models()
        .withExistingParent("mandarin_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_torch_texture)
        .texture("particle", mandarin_torch_texture);
        getVariantBuilder(mandarin_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mandarin_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mandarin_torch_texture)
                    .texture("particle", mandarin_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock mandarin_redstone_torch = foodblockcompatregistry.MANDARIN_REDSTONE_TORCH.get();
        ResourceLocation mandarin_redstone_torch_texture = modLoc("block/mandarin_redstone_torch");
        BlockModelBuilder mandarin_redstone_torch_model = models()
        .withExistingParent("mandarin_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_redstone_torch_texture)
        .texture("particle", mandarin_redstone_torch_texture);
        

        simpleBlock(mandarin_redstone_torch, mandarin_redstone_torch_model);

        ResourceLocation mandarin_redstone_wall_torch_texture = modLoc("block/mandarin_redstone_torch");

        RedstoneTorchBlock mandarin_redstone_wall_torch = foodblockcompatregistry.MANDARIN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder mandarin_redstone_wall_torch_model = models()
        .withExistingParent("mandarin_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_redstone_wall_torch_texture)
        .texture("particle", mandarin_redstone_wall_torch_texture);
        getVariantBuilder(mandarin_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mandarin_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mandarin_redstone_wall_torch_texture)
                    .texture("particle", mandarin_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock mandarin_soul_torch = foodblockcompatregistry.MANDARIN_SOUL_TORCH.get();
        ResourceLocation mandarin_soul_torch_texture = modLoc("block/mandarin_soul_torch");
        BlockModelBuilder mandarin_soul_torch_model = models()
        .withExistingParent("mandarin_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_soul_torch_texture)
        .texture("particle", mandarin_soul_torch_texture);
        

        simpleBlock(mandarin_soul_torch, mandarin_soul_torch_model);

        ResourceLocation mandarin_soul_wall_torch_texture = modLoc("block/mandarin_soul_torch");
        TorchBlock mandarin_soul_wall_torch = foodblockcompatregistry.MANDARIN_SOUL_WALL_TORCH.get();
        BlockModelBuilder mandarin_soul_wall_torch_model = models()
        .withExistingParent("mandarin_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", mandarin_soul_wall_torch_texture)
        .texture("particle", mandarin_soul_wall_torch_texture);
        getVariantBuilder(mandarin_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("mandarin_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", mandarin_soul_wall_torch_texture)
                    .texture("particle", mandarin_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
       //regular
        TorchBlock lemon_torch = foodblockcompatregistry.LEMON_TORCH.get();
        ResourceLocation lemon_torch_texture = modLoc("block/lemon_torch");
        BlockModelBuilder lemon_torch_model = models()
        .withExistingParent("lemon_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_torch_texture)
        .texture("particle", lemon_torch_texture);

        simpleBlock(lemon_torch, lemon_torch_model);

        TorchBlock lemon_wall_torch = foodblockcompatregistry.LEMON_WALL_TORCH.get();
        BlockModelBuilder lemon_wall_torch_model = models()
        .withExistingParent("lemon_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_torch_texture)
        .texture("particle", lemon_torch_texture);
        getVariantBuilder(lemon_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lemon_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lemon_torch_texture)
                    .texture("particle", lemon_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock lemon_redstone_torch = foodblockcompatregistry.LEMON_REDSTONE_TORCH.get();
        ResourceLocation lemon_redstone_torch_texture = modLoc("block/lemon_redstone_torch");
        BlockModelBuilder lemon_redstone_torch_model = models()
        .withExistingParent("lemon_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_redstone_torch_texture)
        .texture("particle", lemon_redstone_torch_texture);
        

        simpleBlock(lemon_redstone_torch, lemon_redstone_torch_model);

        ResourceLocation lemon_redstone_wall_torch_texture = modLoc("block/lemon_redstone_torch");

        RedstoneTorchBlock lemon_redstone_wall_torch = foodblockcompatregistry.LEMON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder lemon_redstone_wall_torch_model = models()
        .withExistingParent("lemon_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_redstone_wall_torch_texture)
        .texture("particle", lemon_redstone_wall_torch_texture);
        getVariantBuilder(lemon_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lemon_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lemon_redstone_wall_torch_texture)
                    .texture("particle", lemon_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock lemon_soul_torch = foodblockcompatregistry.LEMON_SOUL_TORCH.get();
        ResourceLocation lemon_soul_torch_texture = modLoc("block/lemon_soul_torch");
        BlockModelBuilder lemon_soul_torch_model = models()
        .withExistingParent("lemon_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_soul_torch_texture)
        .texture("particle", lemon_soul_torch_texture);
        

        simpleBlock(lemon_soul_torch, lemon_soul_torch_model);

        ResourceLocation lemon_soul_wall_torch_texture = modLoc("block/lemon_soul_torch");
        TorchBlock lemon_soul_wall_torch = foodblockcompatregistry.LEMON_SOUL_WALL_TORCH.get();
        BlockModelBuilder lemon_soul_wall_torch_model = models()
        .withExistingParent("lemon_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lemon_soul_wall_torch_texture)
        .texture("particle", lemon_soul_wall_torch_texture);
        getVariantBuilder(lemon_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lemon_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lemon_soul_wall_torch_texture)
                    .texture("particle", lemon_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
       //regular
        TorchBlock citron_torch = foodblockcompatregistry.CITRON_TORCH.get();
        ResourceLocation citron_torch_texture = modLoc("block/citron_torch");
        BlockModelBuilder citron_torch_model = models()
        .withExistingParent("citron_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_torch_texture)
        .texture("particle", citron_torch_texture);

        simpleBlock(citron_torch, citron_torch_model);

        TorchBlock citron_wall_torch = foodblockcompatregistry.CITRON_WALL_TORCH.get();
        BlockModelBuilder citron_wall_torch_model = models()
        .withExistingParent("citron_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_torch_texture)
        .texture("particle", citron_torch_texture);
        getVariantBuilder(citron_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("citron_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", citron_torch_texture)
                    .texture("particle", citron_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock citron_redstone_torch = foodblockcompatregistry.CITRON_REDSTONE_TORCH.get();
        ResourceLocation citron_redstone_torch_texture = modLoc("block/citron_redstone_torch");
        BlockModelBuilder citron_redstone_torch_model = models()
        .withExistingParent("citron_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_redstone_torch_texture)
        .texture("particle", citron_redstone_torch_texture);
        

        simpleBlock(citron_redstone_torch, citron_redstone_torch_model);

        ResourceLocation citron_redstone_wall_torch_texture = modLoc("block/citron_redstone_torch");

        RedstoneTorchBlock citron_redstone_wall_torch = foodblockcompatregistry.CITRON_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder citron_redstone_wall_torch_model = models()
        .withExistingParent("citron_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_redstone_wall_torch_texture)
        .texture("particle", citron_redstone_wall_torch_texture);
        getVariantBuilder(citron_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("citron_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", citron_redstone_wall_torch_texture)
                    .texture("particle", citron_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock citron_soul_torch = foodblockcompatregistry.CITRON_SOUL_TORCH.get();
        ResourceLocation citron_soul_torch_texture = modLoc("block/citron_soul_torch");
        BlockModelBuilder citron_soul_torch_model = models()
        .withExistingParent("citron_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_soul_torch_texture)
        .texture("particle", citron_soul_torch_texture);
        

        simpleBlock(citron_soul_torch, citron_soul_torch_model);

        ResourceLocation citron_soul_wall_torch_texture = modLoc("block/citron_soul_torch");
        TorchBlock citron_soul_wall_torch = foodblockcompatregistry.CITRON_SOUL_WALL_TORCH.get();
        BlockModelBuilder citron_soul_wall_torch_model = models()
        .withExistingParent("citron_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", citron_soul_wall_torch_texture)
        .texture("particle", citron_soul_wall_torch_texture);
        getVariantBuilder(citron_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("citron_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", citron_soul_wall_torch_texture)
                    .texture("particle", citron_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
       //regular
        TorchBlock buddhashand_torch = foodblockcompatregistry.BUDDHASHAND_TORCH.get();
        ResourceLocation buddhashand_torch_texture = modLoc("block/buddhashand_torch");
        BlockModelBuilder buddhashand_torch_model = models()
        .withExistingParent("buddhashand_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_torch_texture)
        .texture("particle", buddhashand_torch_texture);

        simpleBlock(buddhashand_torch, buddhashand_torch_model);

        TorchBlock buddhashand_wall_torch = foodblockcompatregistry.BUDDHASHAND_WALL_TORCH.get();
        BlockModelBuilder buddhashand_wall_torch_model = models()
        .withExistingParent("buddhashand_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_torch_texture)
        .texture("particle", buddhashand_torch_texture);
        getVariantBuilder(buddhashand_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("buddhashand_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", buddhashand_torch_texture)
                    .texture("particle", buddhashand_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock buddhashand_redstone_torch = foodblockcompatregistry.BUDDHASHAND_REDSTONE_TORCH.get();
        ResourceLocation buddhashand_redstone_torch_texture = modLoc("block/buddhashand_redstone_torch");
        BlockModelBuilder buddhashand_redstone_torch_model = models()
        .withExistingParent("buddhashand_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_redstone_torch_texture)
        .texture("particle", buddhashand_redstone_torch_texture);
        

        simpleBlock(buddhashand_redstone_torch, buddhashand_redstone_torch_model);

        ResourceLocation buddhashand_redstone_wall_torch_texture = modLoc("block/buddhashand_redstone_torch");

        RedstoneTorchBlock buddhashand_redstone_wall_torch = foodblockcompatregistry.BUDDHASHAND_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder buddhashand_redstone_wall_torch_model = models()
        .withExistingParent("buddhashand_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_redstone_wall_torch_texture)
        .texture("particle", buddhashand_redstone_wall_torch_texture);
        getVariantBuilder(buddhashand_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("buddhashand_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", buddhashand_redstone_wall_torch_texture)
                    .texture("particle", buddhashand_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock buddhashand_soul_torch = foodblockcompatregistry.BUDDHASHAND_SOUL_TORCH.get();
        ResourceLocation buddhashand_soul_torch_texture = modLoc("block/buddhashand_soul_torch");
        BlockModelBuilder buddhashand_soul_torch_model = models()
        .withExistingParent("buddhashand_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_soul_torch_texture)
        .texture("particle", buddhashand_soul_torch_texture);
        

        simpleBlock(buddhashand_soul_torch, buddhashand_soul_torch_model);

        ResourceLocation buddhashand_soul_wall_torch_texture = modLoc("block/buddhashand_soul_torch");
        TorchBlock buddhashand_soul_wall_torch = foodblockcompatregistry.BUDDHASHAND_SOUL_WALL_TORCH.get();
        BlockModelBuilder buddhashand_soul_wall_torch_model = models()
        .withExistingParent("buddhashand_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", buddhashand_soul_wall_torch_texture)
        .texture("particle", buddhashand_soul_wall_torch_texture);
        getVariantBuilder(buddhashand_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("buddhashand_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", buddhashand_soul_wall_torch_texture)
                    .texture("particle", buddhashand_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
       //regular
        TorchBlock lime_torch = foodblockcompatregistry.LIME_TORCH.get();
        ResourceLocation lime_torch_texture = modLoc("block/lime_torch");
        BlockModelBuilder lime_torch_model = models()
        .withExistingParent("lime_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_torch_texture)
        .texture("particle", lime_torch_texture);

        simpleBlock(lime_torch, lime_torch_model);

        TorchBlock lime_wall_torch = foodblockcompatregistry.LIME_WALL_TORCH.get();
        BlockModelBuilder lime_wall_torch_model = models()
        .withExistingParent("lime_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_torch_texture)
        .texture("particle", lime_torch_texture);
        getVariantBuilder(lime_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lime_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lime_torch_texture)
                    .texture("particle", lime_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock lime_redstone_torch = foodblockcompatregistry.LIME_REDSTONE_TORCH.get();
        ResourceLocation lime_redstone_torch_texture = modLoc("block/lime_redstone_torch");
        BlockModelBuilder lime_redstone_torch_model = models()
        .withExistingParent("lime_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_redstone_torch_texture)
        .texture("particle", lime_redstone_torch_texture);
        

        simpleBlock(lime_redstone_torch, lime_redstone_torch_model);

        ResourceLocation lime_redstone_wall_torch_texture = modLoc("block/lime_redstone_torch");

        RedstoneTorchBlock lime_redstone_wall_torch = foodblockcompatregistry.LIME_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder lime_redstone_wall_torch_model = models()
        .withExistingParent("lime_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_redstone_wall_torch_texture)
        .texture("particle", lime_redstone_wall_torch_texture);
        getVariantBuilder(lime_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lime_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lime_redstone_wall_torch_texture)
                    .texture("particle", lime_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock lime_soul_torch = foodblockcompatregistry.LIME_SOUL_TORCH.get();
        ResourceLocation lime_soul_torch_texture = modLoc("block/lime_soul_torch");
        BlockModelBuilder lime_soul_torch_model = models()
        .withExistingParent("lime_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_soul_torch_texture)
        .texture("particle", lime_soul_torch_texture);
        

        simpleBlock(lime_soul_torch, lime_soul_torch_model);

        ResourceLocation lime_soul_wall_torch_texture = modLoc("block/lime_soul_torch");
        TorchBlock lime_soul_wall_torch = foodblockcompatregistry.LIME_SOUL_WALL_TORCH.get();
        BlockModelBuilder lime_soul_wall_torch_model = models()
        .withExistingParent("lime_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", lime_soul_wall_torch_texture)
        .texture("particle", lime_soul_wall_torch_texture);
        getVariantBuilder(lime_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("lime_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", lime_soul_wall_torch_texture)
                    .texture("particle", lime_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
       //regular
        TorchBlock keylime_torch = foodblockcompatregistry.KEYLIME_TORCH.get();
        ResourceLocation keylime_torch_texture = modLoc("block/keylime_torch");
        BlockModelBuilder keylime_torch_model = models()
        .withExistingParent("keylime_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_torch_texture)
        .texture("particle", keylime_torch_texture);

        simpleBlock(keylime_torch, keylime_torch_model);

        TorchBlock keylime_wall_torch = foodblockcompatregistry.KEYLIME_WALL_TORCH.get();
        BlockModelBuilder keylime_wall_torch_model = models()
        .withExistingParent("keylime_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_torch_texture)
        .texture("particle", keylime_torch_texture);
        getVariantBuilder(keylime_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("keylime_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", keylime_torch_texture)
                    .texture("particle", keylime_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock keylime_redstone_torch = foodblockcompatregistry.KEYLIME_REDSTONE_TORCH.get();
        ResourceLocation keylime_redstone_torch_texture = modLoc("block/keylime_redstone_torch");
        BlockModelBuilder keylime_redstone_torch_model = models()
        .withExistingParent("keylime_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_redstone_torch_texture)
        .texture("particle", keylime_redstone_torch_texture);
        

        simpleBlock(keylime_redstone_torch, keylime_redstone_torch_model);

        ResourceLocation keylime_redstone_wall_torch_texture = modLoc("block/keylime_redstone_torch");

        RedstoneTorchBlock keylime_redstone_wall_torch = foodblockcompatregistry.KEYLIME_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder keylime_redstone_wall_torch_model = models()
        .withExistingParent("keylime_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_redstone_wall_torch_texture)
        .texture("particle", keylime_redstone_wall_torch_texture);
        getVariantBuilder(keylime_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("keylime_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", keylime_redstone_wall_torch_texture)
                    .texture("particle", keylime_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock keylime_soul_torch = foodblockcompatregistry.KEYLIME_SOUL_TORCH.get();
        ResourceLocation keylime_soul_torch_texture = modLoc("block/keylime_soul_torch");
        BlockModelBuilder keylime_soul_torch_model = models()
        .withExistingParent("keylime_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_soul_torch_texture)
        .texture("particle", keylime_soul_torch_texture);
        

        simpleBlock(keylime_soul_torch, keylime_soul_torch_model);

        ResourceLocation keylime_soul_wall_torch_texture = modLoc("block/keylime_soul_torch");
        TorchBlock keylime_soul_wall_torch = foodblockcompatregistry.KEYLIME_SOUL_WALL_TORCH.get();
        BlockModelBuilder keylime_soul_wall_torch_model = models()
        .withExistingParent("keylime_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", keylime_soul_wall_torch_texture)
        .texture("particle", keylime_soul_wall_torch_texture);
        getVariantBuilder(keylime_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("keylime_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", keylime_soul_wall_torch_texture)
                    .texture("particle", keylime_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
       //regular
        TorchBlock fingerlime_torch = foodblockcompatregistry.FINGERLIME_TORCH.get();
        ResourceLocation fingerlime_torch_texture = modLoc("block/fingerlime_torch");
        BlockModelBuilder fingerlime_torch_model = models()
        .withExistingParent("fingerlime_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_torch_texture)
        .texture("particle", fingerlime_torch_texture);

        simpleBlock(fingerlime_torch, fingerlime_torch_model);

        TorchBlock fingerlime_wall_torch = foodblockcompatregistry.FINGERLIME_WALL_TORCH.get();
        BlockModelBuilder fingerlime_wall_torch_model = models()
        .withExistingParent("fingerlime_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_torch_texture)
        .texture("particle", fingerlime_torch_texture);
        getVariantBuilder(fingerlime_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("fingerlime_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", fingerlime_torch_texture)
                    .texture("particle", fingerlime_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock fingerlime_redstone_torch = foodblockcompatregistry.FINGERLIME_REDSTONE_TORCH.get();
        ResourceLocation fingerlime_redstone_torch_texture = modLoc("block/fingerlime_redstone_torch");
        BlockModelBuilder fingerlime_redstone_torch_model = models()
        .withExistingParent("fingerlime_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_redstone_torch_texture)
        .texture("particle", fingerlime_redstone_torch_texture);
        

        simpleBlock(fingerlime_redstone_torch, fingerlime_redstone_torch_model);

        ResourceLocation fingerlime_redstone_wall_torch_texture = modLoc("block/fingerlime_redstone_torch");

        RedstoneTorchBlock fingerlime_redstone_wall_torch = foodblockcompatregistry.FINGERLIME_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder fingerlime_redstone_wall_torch_model = models()
        .withExistingParent("fingerlime_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_redstone_wall_torch_texture)
        .texture("particle", fingerlime_redstone_wall_torch_texture);
        getVariantBuilder(fingerlime_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("fingerlime_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", fingerlime_redstone_wall_torch_texture)
                    .texture("particle", fingerlime_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock fingerlime_soul_torch = foodblockcompatregistry.FINGERLIME_SOUL_TORCH.get();
        ResourceLocation fingerlime_soul_torch_texture = modLoc("block/fingerlime_soul_torch");
        BlockModelBuilder fingerlime_soul_torch_model = models()
        .withExistingParent("fingerlime_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_soul_torch_texture)
        .texture("particle", fingerlime_soul_torch_texture);
        

        simpleBlock(fingerlime_soul_torch, fingerlime_soul_torch_model);

        ResourceLocation fingerlime_soul_wall_torch_texture = modLoc("block/fingerlime_soul_torch");
        TorchBlock fingerlime_soul_wall_torch = foodblockcompatregistry.FINGERLIME_SOUL_WALL_TORCH.get();
        BlockModelBuilder fingerlime_soul_wall_torch_model = models()
        .withExistingParent("fingerlime_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", fingerlime_soul_wall_torch_texture)
        .texture("particle", fingerlime_soul_wall_torch_texture);
        getVariantBuilder(fingerlime_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("fingerlime_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", fingerlime_soul_wall_torch_texture)
                    .texture("particle", fingerlime_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
       //regular
        TorchBlock grapefruit_torch = foodblockcompatregistry.GRAPEFRUIT_TORCH.get();
        ResourceLocation grapefruit_torch_texture = modLoc("block/grapefruit_torch");
        BlockModelBuilder grapefruit_torch_model = models()
        .withExistingParent("grapefruit_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_torch_texture)
        .texture("particle", grapefruit_torch_texture);

        simpleBlock(grapefruit_torch, grapefruit_torch_model);

        TorchBlock grapefruit_wall_torch = foodblockcompatregistry.GRAPEFRUIT_WALL_TORCH.get();
        BlockModelBuilder grapefruit_wall_torch_model = models()
        .withExistingParent("grapefruit_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_torch_texture)
        .texture("particle", grapefruit_torch_texture);
        getVariantBuilder(grapefruit_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("grapefruit_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", grapefruit_torch_texture)
                    .texture("particle", grapefruit_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock grapefruit_redstone_torch = foodblockcompatregistry.GRAPEFRUIT_REDSTONE_TORCH.get();
        ResourceLocation grapefruit_redstone_torch_texture = modLoc("block/grapefruit_redstone_torch");
        BlockModelBuilder grapefruit_redstone_torch_model = models()
        .withExistingParent("grapefruit_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_redstone_torch_texture)
        .texture("particle", grapefruit_redstone_torch_texture);
        

        simpleBlock(grapefruit_redstone_torch, grapefruit_redstone_torch_model);

        ResourceLocation grapefruit_redstone_wall_torch_texture = modLoc("block/grapefruit_redstone_torch");

        RedstoneTorchBlock grapefruit_redstone_wall_torch = foodblockcompatregistry.GRAPEFRUIT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder grapefruit_redstone_wall_torch_model = models()
        .withExistingParent("grapefruit_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_redstone_wall_torch_texture)
        .texture("particle", grapefruit_redstone_wall_torch_texture);
        getVariantBuilder(grapefruit_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("grapefruit_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", grapefruit_redstone_wall_torch_texture)
                    .texture("particle", grapefruit_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock grapefruit_soul_torch = foodblockcompatregistry.GRAPEFRUIT_SOUL_TORCH.get();
        ResourceLocation grapefruit_soul_torch_texture = modLoc("block/grapefruit_soul_torch");
        BlockModelBuilder grapefruit_soul_torch_model = models()
        .withExistingParent("grapefruit_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_soul_torch_texture)
        .texture("particle", grapefruit_soul_torch_texture);
        

        simpleBlock(grapefruit_soul_torch, grapefruit_soul_torch_model);

        ResourceLocation grapefruit_soul_wall_torch_texture = modLoc("block/grapefruit_soul_torch");
        TorchBlock grapefruit_soul_wall_torch = foodblockcompatregistry.GRAPEFRUIT_SOUL_WALL_TORCH.get();
        BlockModelBuilder grapefruit_soul_wall_torch_model = models()
        .withExistingParent("grapefruit_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", grapefruit_soul_wall_torch_texture)
        .texture("particle", grapefruit_soul_wall_torch_texture);
        getVariantBuilder(grapefruit_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("grapefruit_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", grapefruit_soul_wall_torch_texture)
                    .texture("particle", grapefruit_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
       //regular
        TorchBlock pomelo_torch = foodblockcompatregistry.POMELO_TORCH.get();
        ResourceLocation pomelo_torch_texture = modLoc("block/pomelo_torch");
        BlockModelBuilder pomelo_torch_model = models()
        .withExistingParent("pomelo_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_torch_texture)
        .texture("particle", pomelo_torch_texture);

        simpleBlock(pomelo_torch, pomelo_torch_model);

        TorchBlock pomelo_wall_torch = foodblockcompatregistry.POMELO_WALL_TORCH.get();
        BlockModelBuilder pomelo_wall_torch_model = models()
        .withExistingParent("pomelo_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_torch_texture)
        .texture("particle", pomelo_torch_texture);
        getVariantBuilder(pomelo_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pomelo_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pomelo_torch_texture)
                    .texture("particle", pomelo_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock pomelo_redstone_torch = foodblockcompatregistry.POMELO_REDSTONE_TORCH.get();
        ResourceLocation pomelo_redstone_torch_texture = modLoc("block/pomelo_redstone_torch");
        BlockModelBuilder pomelo_redstone_torch_model = models()
        .withExistingParent("pomelo_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_redstone_torch_texture)
        .texture("particle", pomelo_redstone_torch_texture);
        

        simpleBlock(pomelo_redstone_torch, pomelo_redstone_torch_model);

        ResourceLocation pomelo_redstone_wall_torch_texture = modLoc("block/pomelo_redstone_torch");

        RedstoneTorchBlock pomelo_redstone_wall_torch = foodblockcompatregistry.POMELO_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder pomelo_redstone_wall_torch_model = models()
        .withExistingParent("pomelo_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_redstone_wall_torch_texture)
        .texture("particle", pomelo_redstone_wall_torch_texture);
        getVariantBuilder(pomelo_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pomelo_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pomelo_redstone_wall_torch_texture)
                    .texture("particle", pomelo_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock pomelo_soul_torch = foodblockcompatregistry.POMELO_SOUL_TORCH.get();
        ResourceLocation pomelo_soul_torch_texture = modLoc("block/pomelo_soul_torch");
        BlockModelBuilder pomelo_soul_torch_model = models()
        .withExistingParent("pomelo_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_soul_torch_texture)
        .texture("particle", pomelo_soul_torch_texture);
        

        simpleBlock(pomelo_soul_torch, pomelo_soul_torch_model);

        ResourceLocation pomelo_soul_wall_torch_texture = modLoc("block/pomelo_soul_torch");
        TorchBlock pomelo_soul_wall_torch = foodblockcompatregistry.POMELO_SOUL_WALL_TORCH.get();
        BlockModelBuilder pomelo_soul_wall_torch_model = models()
        .withExistingParent("pomelo_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pomelo_soul_wall_torch_texture)
        .texture("particle", pomelo_soul_wall_torch_texture);
        getVariantBuilder(pomelo_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pomelo_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pomelo_soul_wall_torch_texture)
                    .texture("particle", pomelo_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
       //regular
        TorchBlock corn_torch = foodblockcompatregistry.CORN_TORCH.get();
        ResourceLocation corn_torch_texture = modLoc("block/corn_torch");
        BlockModelBuilder corn_torch_model = models()
        .withExistingParent("corn_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_torch_texture)
        .texture("particle", corn_torch_texture);

        simpleBlock(corn_torch, corn_torch_model);

        TorchBlock corn_wall_torch = foodblockcompatregistry.CORN_WALL_TORCH.get();
        BlockModelBuilder corn_wall_torch_model = models()
        .withExistingParent("corn_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_torch_texture)
        .texture("particle", corn_torch_texture);
        getVariantBuilder(corn_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_torch_texture)
                    .texture("particle", corn_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock corn_redstone_torch = foodblockcompatregistry.CORN_REDSTONE_TORCH.get();
        ResourceLocation corn_redstone_torch_texture = modLoc("block/corn_redstone_torch");
        BlockModelBuilder corn_redstone_torch_model = models()
        .withExistingParent("corn_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_redstone_torch_texture)
        .texture("particle", corn_redstone_torch_texture);
        

        simpleBlock(corn_redstone_torch, corn_redstone_torch_model);

        ResourceLocation corn_redstone_wall_torch_texture = modLoc("block/corn_redstone_torch");

        RedstoneTorchBlock corn_redstone_wall_torch = foodblockcompatregistry.CORN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder corn_redstone_wall_torch_model = models()
        .withExistingParent("corn_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_redstone_wall_torch_texture)
        .texture("particle", corn_redstone_wall_torch_texture);
        getVariantBuilder(corn_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_redstone_wall_torch_texture)
                    .texture("particle", corn_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock corn_soul_torch = foodblockcompatregistry.CORN_SOUL_TORCH.get();
        ResourceLocation corn_soul_torch_texture = modLoc("block/corn_soul_torch");
        BlockModelBuilder corn_soul_torch_model = models()
        .withExistingParent("corn_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_soul_torch_texture)
        .texture("particle", corn_soul_torch_texture);
        

        simpleBlock(corn_soul_torch, corn_soul_torch_model);

        ResourceLocation corn_soul_wall_torch_texture = modLoc("block/corn_soul_torch");
        TorchBlock corn_soul_wall_torch = foodblockcompatregistry.CORN_SOUL_WALL_TORCH.get();
        BlockModelBuilder corn_soul_wall_torch_model = models()
        .withExistingParent("corn_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_soul_wall_torch_texture)
        .texture("particle", corn_soul_wall_torch_texture);
        getVariantBuilder(corn_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_soul_wall_torch_texture)
                    .texture("particle", corn_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
       //regular
        TorchBlock onion_torch = foodblockcompatregistry.ONION_TORCH.get();
        ResourceLocation onion_torch_texture = modLoc("block/onion_torch");
        BlockModelBuilder onion_torch_model = models()
        .withExistingParent("onion_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_torch_texture)
        .texture("particle", onion_torch_texture);

        simpleBlock(onion_torch, onion_torch_model);

        TorchBlock onion_wall_torch = foodblockcompatregistry.ONION_WALL_TORCH.get();
        BlockModelBuilder onion_wall_torch_model = models()
        .withExistingParent("onion_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_torch_texture)
        .texture("particle", onion_torch_texture);
        getVariantBuilder(onion_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_torch_texture)
                    .texture("particle", onion_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock onion_redstone_torch = foodblockcompatregistry.ONION_REDSTONE_TORCH.get();
        ResourceLocation onion_redstone_torch_texture = modLoc("block/onion_redstone_torch");
        BlockModelBuilder onion_redstone_torch_model = models()
        .withExistingParent("onion_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_redstone_torch_texture)
        .texture("particle", onion_redstone_torch_texture);
        

        simpleBlock(onion_redstone_torch, onion_redstone_torch_model);

        ResourceLocation onion_redstone_wall_torch_texture = modLoc("block/onion_redstone_torch");

        RedstoneTorchBlock onion_redstone_wall_torch = foodblockcompatregistry.ONION_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder onion_redstone_wall_torch_model = models()
        .withExistingParent("onion_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_redstone_wall_torch_texture)
        .texture("particle", onion_redstone_wall_torch_texture);
        getVariantBuilder(onion_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_redstone_wall_torch_texture)
                    .texture("particle", onion_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock onion_soul_torch = foodblockcompatregistry.ONION_SOUL_TORCH.get();
        ResourceLocation onion_soul_torch_texture = modLoc("block/onion_soul_torch");
        BlockModelBuilder onion_soul_torch_model = models()
        .withExistingParent("onion_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_soul_torch_texture)
        .texture("particle", onion_soul_torch_texture);
        

        simpleBlock(onion_soul_torch, onion_soul_torch_model);

        ResourceLocation onion_soul_wall_torch_texture = modLoc("block/onion_soul_torch");
        TorchBlock onion_soul_wall_torch = foodblockcompatregistry.ONION_SOUL_WALL_TORCH.get();
        BlockModelBuilder onion_soul_wall_torch_model = models()
        .withExistingParent("onion_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_soul_wall_torch_texture)
        .texture("particle", onion_soul_wall_torch_texture);
        getVariantBuilder(onion_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_soul_wall_torch_texture)
                    .texture("particle", onion_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
       //regular
        TorchBlock tomato_torch = foodblockcompatregistry.TOMATO_TORCH.get();
        ResourceLocation tomato_torch_texture = modLoc("block/tomato_torch");
        BlockModelBuilder tomato_torch_model = models()
        .withExistingParent("tomato_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_torch_texture)
        .texture("particle", tomato_torch_texture);

        simpleBlock(tomato_torch, tomato_torch_model);

        TorchBlock tomato_wall_torch = foodblockcompatregistry.TOMATO_WALL_TORCH.get();
        BlockModelBuilder tomato_wall_torch_model = models()
        .withExistingParent("tomato_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_torch_texture)
        .texture("particle", tomato_torch_texture);
        getVariantBuilder(tomato_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tomato_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tomato_torch_texture)
                    .texture("particle", tomato_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock tomato_redstone_torch = foodblockcompatregistry.TOMATO_REDSTONE_TORCH.get();
        ResourceLocation tomato_redstone_torch_texture = modLoc("block/tomato_redstone_torch");
        BlockModelBuilder tomato_redstone_torch_model = models()
        .withExistingParent("tomato_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_redstone_torch_texture)
        .texture("particle", tomato_redstone_torch_texture);
        

        simpleBlock(tomato_redstone_torch, tomato_redstone_torch_model);

        ResourceLocation tomato_redstone_wall_torch_texture = modLoc("block/tomato_redstone_torch");

        RedstoneTorchBlock tomato_redstone_wall_torch = foodblockcompatregistry.TOMATO_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder tomato_redstone_wall_torch_model = models()
        .withExistingParent("tomato_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_redstone_wall_torch_texture)
        .texture("particle", tomato_redstone_wall_torch_texture);
        getVariantBuilder(tomato_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tomato_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tomato_redstone_wall_torch_texture)
                    .texture("particle", tomato_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock tomato_soul_torch = foodblockcompatregistry.TOMATO_SOUL_TORCH.get();
        ResourceLocation tomato_soul_torch_texture = modLoc("block/tomato_soul_torch");
        BlockModelBuilder tomato_soul_torch_model = models()
        .withExistingParent("tomato_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_soul_torch_texture)
        .texture("particle", tomato_soul_torch_texture);
        

        simpleBlock(tomato_soul_torch, tomato_soul_torch_model);

        ResourceLocation tomato_soul_wall_torch_texture = modLoc("block/tomato_soul_torch");
        TorchBlock tomato_soul_wall_torch = foodblockcompatregistry.TOMATO_SOUL_WALL_TORCH.get();
        BlockModelBuilder tomato_soul_wall_torch_model = models()
        .withExistingParent("tomato_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", tomato_soul_wall_torch_texture)
        .texture("particle", tomato_soul_wall_torch_texture);
        getVariantBuilder(tomato_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("tomato_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", tomato_soul_wall_torch_texture)
                    .texture("particle", tomato_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
       //regular
        TorchBlock pecan_torch = foodblockcompatregistry.PECAN_TORCH.get();
        ResourceLocation pecan_torch_texture = modLoc("block/pecan_torch");
        BlockModelBuilder pecan_torch_model = models()
        .withExistingParent("pecan_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_torch_texture)
        .texture("particle", pecan_torch_texture);

        simpleBlock(pecan_torch, pecan_torch_model);

        TorchBlock pecan_wall_torch = foodblockcompatregistry.PECAN_WALL_TORCH.get();
        BlockModelBuilder pecan_wall_torch_model = models()
        .withExistingParent("pecan_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_torch_texture)
        .texture("particle", pecan_torch_texture);
        getVariantBuilder(pecan_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pecan_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pecan_torch_texture)
                    .texture("particle", pecan_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock pecan_redstone_torch = foodblockcompatregistry.PECAN_REDSTONE_TORCH.get();
        ResourceLocation pecan_redstone_torch_texture = modLoc("block/pecan_redstone_torch");
        BlockModelBuilder pecan_redstone_torch_model = models()
        .withExistingParent("pecan_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_redstone_torch_texture)
        .texture("particle", pecan_redstone_torch_texture);
        

        simpleBlock(pecan_redstone_torch, pecan_redstone_torch_model);

        ResourceLocation pecan_redstone_wall_torch_texture = modLoc("block/pecan_redstone_torch");

        RedstoneTorchBlock pecan_redstone_wall_torch = foodblockcompatregistry.PECAN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder pecan_redstone_wall_torch_model = models()
        .withExistingParent("pecan_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_redstone_wall_torch_texture)
        .texture("particle", pecan_redstone_wall_torch_texture);
        getVariantBuilder(pecan_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pecan_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pecan_redstone_wall_torch_texture)
                    .texture("particle", pecan_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock pecan_soul_torch = foodblockcompatregistry.PECAN_SOUL_TORCH.get();
        ResourceLocation pecan_soul_torch_texture = modLoc("block/pecan_soul_torch");
        BlockModelBuilder pecan_soul_torch_model = models()
        .withExistingParent("pecan_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_soul_torch_texture)
        .texture("particle", pecan_soul_torch_texture);
        

        simpleBlock(pecan_soul_torch, pecan_soul_torch_model);

        ResourceLocation pecan_soul_wall_torch_texture = modLoc("block/pecan_soul_torch");
        TorchBlock pecan_soul_wall_torch = foodblockcompatregistry.PECAN_SOUL_WALL_TORCH.get();
        BlockModelBuilder pecan_soul_wall_torch_model = models()
        .withExistingParent("pecan_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", pecan_soul_wall_torch_texture)
        .texture("particle", pecan_soul_wall_torch_texture);
        getVariantBuilder(pecan_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("pecan_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", pecan_soul_wall_torch_texture)
                    .texture("particle", pecan_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
       //regular
        TorchBlock almond_torch = foodblockcompatregistry.ALMOND_TORCH.get();
        ResourceLocation almond_torch_texture = modLoc("block/almond_torch");
        BlockModelBuilder almond_torch_model = models()
        .withExistingParent("almond_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_torch_texture)
        .texture("particle", almond_torch_texture);

        simpleBlock(almond_torch, almond_torch_model);

        TorchBlock almond_wall_torch = foodblockcompatregistry.ALMOND_WALL_TORCH.get();
        BlockModelBuilder almond_wall_torch_model = models()
        .withExistingParent("almond_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_torch_texture)
        .texture("particle", almond_torch_texture);
        getVariantBuilder(almond_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("almond_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", almond_torch_texture)
                    .texture("particle", almond_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock almond_redstone_torch = foodblockcompatregistry.ALMOND_REDSTONE_TORCH.get();
        ResourceLocation almond_redstone_torch_texture = modLoc("block/almond_redstone_torch");
        BlockModelBuilder almond_redstone_torch_model = models()
        .withExistingParent("almond_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_redstone_torch_texture)
        .texture("particle", almond_redstone_torch_texture);
        

        simpleBlock(almond_redstone_torch, almond_redstone_torch_model);

        ResourceLocation almond_redstone_wall_torch_texture = modLoc("block/almond_redstone_torch");

        RedstoneTorchBlock almond_redstone_wall_torch = foodblockcompatregistry.ALMOND_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder almond_redstone_wall_torch_model = models()
        .withExistingParent("almond_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_redstone_wall_torch_texture)
        .texture("particle", almond_redstone_wall_torch_texture);
        getVariantBuilder(almond_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("almond_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", almond_redstone_wall_torch_texture)
                    .texture("particle", almond_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock almond_soul_torch = foodblockcompatregistry.ALMOND_SOUL_TORCH.get();
        ResourceLocation almond_soul_torch_texture = modLoc("block/almond_soul_torch");
        BlockModelBuilder almond_soul_torch_model = models()
        .withExistingParent("almond_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_soul_torch_texture)
        .texture("particle", almond_soul_torch_texture);
        

        simpleBlock(almond_soul_torch, almond_soul_torch_model);

        ResourceLocation almond_soul_wall_torch_texture = modLoc("block/almond_soul_torch");
        TorchBlock almond_soul_wall_torch = foodblockcompatregistry.ALMOND_SOUL_WALL_TORCH.get();
        BlockModelBuilder almond_soul_wall_torch_model = models()
        .withExistingParent("almond_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", almond_soul_wall_torch_texture)
        .texture("particle", almond_soul_wall_torch_texture);
        getVariantBuilder(almond_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("almond_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", almond_soul_wall_torch_texture)
                    .texture("particle", almond_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
    //==============================================================================================================================================
    //|                                                             Furnaces                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          FurnaceBlock elderberry_furnace = foodblockcompatregistry.ELDERBERRY_FURNACE.get();
          ResourceLocation elderberry_furnace_unlit_texture = modLoc("block/elderberry_furnace");
          ResourceLocation elderberry_furnace_lit_texture = modLoc("block/elderberry_furnace_lit");
          ResourceLocation elderberry_furnace_side = modLoc("block/elderberry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder elderberry_furnace_model_unlit = models()
              .withExistingParent("elderberry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_furnace_side)
              .texture("top", elderberry_furnace_side)
              .texture("front", elderberry_furnace_unlit_texture)
              .texture("particle", elderberry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder elderberry_furnace_model_lit = models()
              .withExistingParent("elderberry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_furnace_side)
              .texture("top", elderberry_furnace_side)
              .texture("front", elderberry_furnace_lit_texture)
              .texture("particle", elderberry_furnace_side);
          
          // Configure variants for the elderberry_furnace block
          getVariantBuilder(elderberry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/elderberry_furnace_model_lit") : modLoc("block/elderberry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          FurnaceBlock juniper_furnace = foodblockcompatregistry.JUNIPER_FURNACE.get();
          ResourceLocation juniper_furnace_unlit_texture = modLoc("block/juniper_furnace");
          ResourceLocation juniper_furnace_lit_texture = modLoc("block/juniper_furnace_lit");
          ResourceLocation juniper_furnace_side = modLoc("block/juniper_block");
          
          // Define the model for the unlit state
          BlockModelBuilder juniper_furnace_model_unlit = models()
              .withExistingParent("juniper_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_furnace_side)
              .texture("top", juniper_furnace_side)
              .texture("front", juniper_furnace_unlit_texture)
              .texture("particle", juniper_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder juniper_furnace_model_lit = models()
              .withExistingParent("juniper_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_furnace_side)
              .texture("top", juniper_furnace_side)
              .texture("front", juniper_furnace_lit_texture)
              .texture("particle", juniper_furnace_side);
          
          // Configure variants for the juniper_furnace block
          getVariantBuilder(juniper_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/juniper_furnace_model_lit") : modLoc("block/juniper_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          FurnaceBlock cherry_furnace = foodblockcompatregistry.CHERRY_FURNACE.get();
          ResourceLocation cherry_furnace_unlit_texture = modLoc("block/cherry_furnace");
          ResourceLocation cherry_furnace_lit_texture = modLoc("block/cherry_furnace_lit");
          ResourceLocation cherry_furnace_side = modLoc("block/cherry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder cherry_furnace_model_unlit = models()
              .withExistingParent("cherry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_furnace_side)
              .texture("top", cherry_furnace_side)
              .texture("front", cherry_furnace_unlit_texture)
              .texture("particle", cherry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder cherry_furnace_model_lit = models()
              .withExistingParent("cherry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_furnace_side)
              .texture("top", cherry_furnace_side)
              .texture("front", cherry_furnace_lit_texture)
              .texture("particle", cherry_furnace_side);
          
          // Configure variants for the cherry_furnace block
          getVariantBuilder(cherry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/cherry_furnace_model_lit") : modLoc("block/cherry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          FurnaceBlock blackcherry_furnace = foodblockcompatregistry.BLACKCHERRY_FURNACE.get();
          ResourceLocation blackcherry_furnace_unlit_texture = modLoc("block/blackcherry_furnace");
          ResourceLocation blackcherry_furnace_lit_texture = modLoc("block/blackcherry_furnace_lit");
          ResourceLocation blackcherry_furnace_side = modLoc("block/blackcherry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder blackcherry_furnace_model_unlit = models()
              .withExistingParent("blackcherry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", blackcherry_furnace_side)
              .texture("top", blackcherry_furnace_side)
              .texture("front", blackcherry_furnace_unlit_texture)
              .texture("particle", blackcherry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder blackcherry_furnace_model_lit = models()
              .withExistingParent("blackcherry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", blackcherry_furnace_side)
              .texture("top", blackcherry_furnace_side)
              .texture("front", blackcherry_furnace_lit_texture)
              .texture("particle", blackcherry_furnace_side);
          
          // Configure variants for the blackcherry_furnace block
          getVariantBuilder(blackcherry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/blackcherry_furnace_model_lit") : modLoc("block/blackcherry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          FurnaceBlock peach_furnace = foodblockcompatregistry.PEACH_FURNACE.get();
          ResourceLocation peach_furnace_unlit_texture = modLoc("block/peach_furnace");
          ResourceLocation peach_furnace_lit_texture = modLoc("block/peach_furnace_lit");
          ResourceLocation peach_furnace_side = modLoc("block/peach_block");
          
          // Define the model for the unlit state
          BlockModelBuilder peach_furnace_model_unlit = models()
              .withExistingParent("peach_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", peach_furnace_side)
              .texture("top", peach_furnace_side)
              .texture("front", peach_furnace_unlit_texture)
              .texture("particle", peach_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder peach_furnace_model_lit = models()
              .withExistingParent("peach_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", peach_furnace_side)
              .texture("top", peach_furnace_side)
              .texture("front", peach_furnace_lit_texture)
              .texture("particle", peach_furnace_side);
          
          // Configure variants for the peach_furnace block
          getVariantBuilder(peach_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/peach_furnace_model_lit") : modLoc("block/peach_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          FurnaceBlock coconut_furnace = foodblockcompatregistry.COCONUT_FURNACE.get();
          ResourceLocation coconut_furnace_unlit_texture = modLoc("block/coconut_furnace");
          ResourceLocation coconut_furnace_lit_texture = modLoc("block/coconut_furnace_lit");
          ResourceLocation coconut_furnace_side = modLoc("block/coconut_block");
          
          // Define the model for the unlit state
          BlockModelBuilder coconut_furnace_model_unlit = models()
              .withExistingParent("coconut_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_furnace_side)
              .texture("top", coconut_furnace_side)
              .texture("front", coconut_furnace_unlit_texture)
              .texture("particle", coconut_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder coconut_furnace_model_lit = models()
              .withExistingParent("coconut_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_furnace_side)
              .texture("top", coconut_furnace_side)
              .texture("front", coconut_furnace_lit_texture)
              .texture("particle", coconut_furnace_side);
          
          // Configure variants for the coconut_furnace block
          getVariantBuilder(coconut_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/coconut_furnace_model_lit") : modLoc("block/coconut_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          FurnaceBlock orange_furnace = foodblockcompatregistry.ORANGE_FURNACE.get();
          ResourceLocation orange_furnace_unlit_texture = modLoc("block/orange_furnace");
          ResourceLocation orange_furnace_lit_texture = modLoc("block/orange_furnace_lit");
          ResourceLocation orange_furnace_side = modLoc("block/orange_block");
          
          // Define the model for the unlit state
          BlockModelBuilder orange_furnace_model_unlit = models()
              .withExistingParent("orange_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_furnace_side)
              .texture("top", orange_furnace_side)
              .texture("front", orange_furnace_unlit_texture)
              .texture("particle", orange_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder orange_furnace_model_lit = models()
              .withExistingParent("orange_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_furnace_side)
              .texture("top", orange_furnace_side)
              .texture("front", orange_furnace_lit_texture)
              .texture("particle", orange_furnace_side);
          
          // Configure variants for the orange_furnace block
          getVariantBuilder(orange_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/orange_furnace_model_lit") : modLoc("block/orange_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          FurnaceBlock tangerine_furnace = foodblockcompatregistry.TANGERINE_FURNACE.get();
          ResourceLocation tangerine_furnace_unlit_texture = modLoc("block/tangerine_furnace");
          ResourceLocation tangerine_furnace_lit_texture = modLoc("block/tangerine_furnace_lit");
          ResourceLocation tangerine_furnace_side = modLoc("block/tangerine_block");
          
          // Define the model for the unlit state
          BlockModelBuilder tangerine_furnace_model_unlit = models()
              .withExistingParent("tangerine_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tangerine_furnace_side)
              .texture("top", tangerine_furnace_side)
              .texture("front", tangerine_furnace_unlit_texture)
              .texture("particle", tangerine_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder tangerine_furnace_model_lit = models()
              .withExistingParent("tangerine_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tangerine_furnace_side)
              .texture("top", tangerine_furnace_side)
              .texture("front", tangerine_furnace_lit_texture)
              .texture("particle", tangerine_furnace_side);
          
          // Configure variants for the tangerine_furnace block
          getVariantBuilder(tangerine_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/tangerine_furnace_model_lit") : modLoc("block/tangerine_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          FurnaceBlock kumquat_furnace = foodblockcompatregistry.KUMQUAT_FURNACE.get();
          ResourceLocation kumquat_furnace_unlit_texture = modLoc("block/kumquat_furnace");
          ResourceLocation kumquat_furnace_lit_texture = modLoc("block/kumquat_furnace_lit");
          ResourceLocation kumquat_furnace_side = modLoc("block/kumquat_block");

          BlockModelBuilder kumquat_furnace_model_unlit = models()
              .withExistingParent("kumquat_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", kumquat_furnace_side)
              .texture("top", kumquat_furnace_side)
              .texture("front", kumquat_furnace_unlit_texture)
              .texture("particle", kumquat_furnace_side);
          
          BlockModelBuilder kumquat_furnace_model_lit = models()
              .withExistingParent("kumquat_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", kumquat_furnace_side)
              .texture("top", kumquat_furnace_side)
              .texture("front", kumquat_furnace_lit_texture)
              .texture("particle", kumquat_furnace_side);
          
          getVariantBuilder(kumquat_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/kumquat_furnace_model_lit") : modLoc("block/kumquat_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          FurnaceBlock persimmon_furnace = foodblockcompatregistry.PERSIMMON_FURNACE.get();
          ResourceLocation persimmon_furnace_unlit_texture = modLoc("block/persimmon_furnace");
          ResourceLocation persimmon_furnace_lit_texture = modLoc("block/persimmon_furnace_lit");
          ResourceLocation persimmon_furnace_side = modLoc("block/persimmon_block");
          
          // Define the model for the unlit state
          BlockModelBuilder persimmon_furnace_model_unlit = models()
              .withExistingParent("persimmon_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", persimmon_furnace_side)
              .texture("top", persimmon_furnace_side)
              .texture("front", persimmon_furnace_unlit_texture)
              .texture("particle", persimmon_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder persimmon_furnace_model_lit = models()
              .withExistingParent("persimmon_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", persimmon_furnace_side)
              .texture("top", persimmon_furnace_side)
              .texture("front", persimmon_furnace_lit_texture)
              .texture("particle", persimmon_furnace_side);
          
          // Configure variants for the persimmon_furnace block
          getVariantBuilder(persimmon_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/persimmon_furnace_model_lit") : modLoc("block/persimmon_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          FurnaceBlock satsuma_furnace = foodblockcompatregistry.SATSUMA_FURNACE.get();
          ResourceLocation satsuma_furnace_unlit_texture = modLoc("block/satsuma_furnace");
          ResourceLocation satsuma_furnace_lit_texture = modLoc("block/satsuma_furnace_lit");
          ResourceLocation satsuma_furnace_side = modLoc("block/satsuma_block");
          
          // Define the model for the unlit state
          BlockModelBuilder satsuma_furnace_model_unlit = models()
              .withExistingParent("satsuma_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", satsuma_furnace_side)
              .texture("top", satsuma_furnace_side)
              .texture("front", satsuma_furnace_unlit_texture)
              .texture("particle", satsuma_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder satsuma_furnace_model_lit = models()
              .withExistingParent("satsuma_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", satsuma_furnace_side)
              .texture("top", satsuma_furnace_side)
              .texture("front", satsuma_furnace_lit_texture)
              .texture("particle", satsuma_furnace_side);
          
          // Configure variants for the satsuma_furnace block
          getVariantBuilder(satsuma_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/satsuma_furnace_model_lit") : modLoc("block/satsuma_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          FurnaceBlock mandarin_furnace = foodblockcompatregistry.MANDARIN_FURNACE.get();
          ResourceLocation mandarin_furnace_unlit_texture = modLoc("block/mandarin_furnace");
          ResourceLocation mandarin_furnace_lit_texture = modLoc("block/mandarin_furnace_lit");
          ResourceLocation mandarin_furnace_side = modLoc("block/mandarin_block");
          
          // Define the model for the unlit state
          BlockModelBuilder mandarin_furnace_model_unlit = models()
              .withExistingParent("mandarin_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", mandarin_furnace_side)
              .texture("top", mandarin_furnace_side)
              .texture("front", mandarin_furnace_unlit_texture)
              .texture("particle", mandarin_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder mandarin_furnace_model_lit = models()
              .withExistingParent("mandarin_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", mandarin_furnace_side)
              .texture("top", mandarin_furnace_side)
              .texture("front", mandarin_furnace_lit_texture)
              .texture("particle", mandarin_furnace_side);
          
          // Configure variants for the mandarin_furnace block
          getVariantBuilder(mandarin_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/mandarin_furnace_model_lit") : modLoc("block/mandarin_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          FurnaceBlock lemon_furnace = foodblockcompatregistry.LEMON_FURNACE.get();
          ResourceLocation lemon_furnace_unlit_texture = modLoc("block/lemon_furnace");
          ResourceLocation lemon_furnace_lit_texture = modLoc("block/lemon_furnace_lit");
          ResourceLocation lemon_furnace_side = modLoc("block/lemon_block");
          
          BlockModelBuilder lemon_furnace_model_unlit = models()
              .withExistingParent("lemon_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", lemon_furnace_side)
              .texture("top", lemon_furnace_side)
              .texture("front", lemon_furnace_unlit_texture)
              .texture("particle", lemon_furnace_side);
          
          BlockModelBuilder lemon_furnace_model_lit = models()
              .withExistingParent("lemon_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", lemon_furnace_side)
              .texture("top", lemon_furnace_side)
              .texture("front", lemon_furnace_lit_texture)
              .texture("particle", lemon_furnace_side);
          
          getVariantBuilder(lemon_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/lemon_furnace_model_lit") : modLoc("block/lemon_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          FurnaceBlock citron_furnace = foodblockcompatregistry.CITRON_FURNACE.get();
          ResourceLocation citron_furnace_unlit_texture = modLoc("block/citron_furnace");
          ResourceLocation citron_furnace_lit_texture = modLoc("block/citron_furnace_lit");
          ResourceLocation citron_furnace_side = modLoc("block/citron_block");
          
          BlockModelBuilder citron_furnace_model_unlit = models()
              .withExistingParent("citron_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", citron_furnace_side)
              .texture("top", citron_furnace_side)
              .texture("front", citron_furnace_unlit_texture)
              .texture("particle", citron_furnace_side);
          
          BlockModelBuilder citron_furnace_model_lit = models()
              .withExistingParent("citron_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", citron_furnace_side)
              .texture("top", citron_furnace_side)
              .texture("front", citron_furnace_lit_texture)
              .texture("particle", citron_furnace_side);
          
          getVariantBuilder(citron_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/citron_furnace_model_lit") : modLoc("block/citron_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          FurnaceBlock buddhashand_furnace = foodblockcompatregistry.BUDDHASHAND_FURNACE.get();
          ResourceLocation buddhashand_furnace_unlit_texture = modLoc("block/buddhashand_furnace");
          ResourceLocation buddhashand_furnace_lit_texture = modLoc("block/buddhashand_furnace_lit");
          ResourceLocation buddhashand_furnace_side = modLoc("block/buddhashand_block");

          BlockModelBuilder buddhashand_furnace_model_unlit = models()
              .withExistingParent("buddhashand_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", buddhashand_furnace_side)
              .texture("top", buddhashand_furnace_side)
              .texture("front", buddhashand_furnace_unlit_texture)
              .texture("particle", buddhashand_furnace_side);
          
          BlockModelBuilder buddhashand_furnace_model_lit = models()
              .withExistingParent("buddhashand_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", buddhashand_furnace_side)
              .texture("top", buddhashand_furnace_side)
              .texture("front", buddhashand_furnace_lit_texture)
              .texture("particle", buddhashand_furnace_side);
          
          getVariantBuilder(buddhashand_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/buddhashand_furnace_model_lit") : modLoc("block/buddhashand_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          FurnaceBlock lime_furnace = foodblockcompatregistry.LIME_FURNACE.get();
          ResourceLocation lime_furnace_unlit_texture = modLoc("block/lime_furnace");
          ResourceLocation lime_furnace_lit_texture = modLoc("block/lime_furnace_lit");
          ResourceLocation lime_furnace_side = modLoc("block/lime_block");
          
          // Define the model for the unlit state
          BlockModelBuilder lime_furnace_model_unlit = models()
              .withExistingParent("lime_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", lime_furnace_side)
              .texture("top", lime_furnace_side)
              .texture("front", lime_furnace_unlit_texture)
              .texture("particle", lime_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder lime_furnace_model_lit = models()
              .withExistingParent("lime_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", lime_furnace_side)
              .texture("top", lime_furnace_side)
              .texture("front", lime_furnace_lit_texture)
              .texture("particle", lime_furnace_side);
          
          // Configure variants for the lime_furnace block
          getVariantBuilder(lime_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/lime_furnace_model_lit") : modLoc("block/lime_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          FurnaceBlock keylime_furnace = foodblockcompatregistry.KEYLIME_FURNACE.get();
          ResourceLocation keylime_furnace_unlit_texture = modLoc("block/keylime_furnace");
          ResourceLocation keylime_furnace_lit_texture = modLoc("block/keylime_furnace_lit");
          ResourceLocation keylime_furnace_side = modLoc("block/keylime_block");
          
          // Define the model for the unlit state
          BlockModelBuilder keylime_furnace_model_unlit = models()
              .withExistingParent("keylime_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", keylime_furnace_side)
              .texture("top", keylime_furnace_side)
              .texture("front", keylime_furnace_unlit_texture)
              .texture("particle", keylime_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder keylime_furnace_model_lit = models()
              .withExistingParent("keylime_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", keylime_furnace_side)
              .texture("top", keylime_furnace_side)
              .texture("front", keylime_furnace_lit_texture)
              .texture("particle", keylime_furnace_side);
          
          // Configure variants for the keylime_furnace block
          getVariantBuilder(keylime_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/keylime_furnace_model_lit") : modLoc("block/keylime_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          FurnaceBlock fingerlime_furnace = foodblockcompatregistry.FINGERLIME_FURNACE.get();
          ResourceLocation fingerlime_furnace_unlit_texture = modLoc("block/fingerlime_furnace");
          ResourceLocation fingerlime_furnace_lit_texture = modLoc("block/fingerlime_furnace_lit");
          ResourceLocation fingerlime_furnace_side = modLoc("block/fingerlime_block");
          
          // Define the model for the unlit state
          BlockModelBuilder fingerlime_furnace_model_unlit = models()
              .withExistingParent("fingerlime_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", fingerlime_furnace_side)
              .texture("top", fingerlime_furnace_side)
              .texture("front", fingerlime_furnace_unlit_texture)
              .texture("particle", fingerlime_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder fingerlime_furnace_model_lit = models()
              .withExistingParent("fingerlime_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", fingerlime_furnace_side)
              .texture("top", fingerlime_furnace_side)
              .texture("front", fingerlime_furnace_lit_texture)
              .texture("particle", fingerlime_furnace_side);
          
          // Configure variants for the fingerlime_furnace block
          getVariantBuilder(fingerlime_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/fingerlime_furnace_model_lit") : modLoc("block/fingerlime_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          FurnaceBlock grapefruit_furnace = foodblockcompatregistry.GRAPEFRUIT_FURNACE.get();
          ResourceLocation grapefruit_furnace_unlit_texture = modLoc("block/grapefruit_furnace");
          ResourceLocation grapefruit_furnace_lit_texture = modLoc("block/grapefruit_furnace_lit");
          ResourceLocation grapefruit_furnace_side = modLoc("block/grapefruit_block");
          
          // Define the model for the unlit state
          BlockModelBuilder grapefruit_furnace_model_unlit = models()
              .withExistingParent("grapefruit_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", grapefruit_furnace_side)
              .texture("top", grapefruit_furnace_side)
              .texture("front", grapefruit_furnace_unlit_texture)
              .texture("particle", grapefruit_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder grapefruit_furnace_model_lit = models()
              .withExistingParent("grapefruit_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", grapefruit_furnace_side)
              .texture("top", grapefruit_furnace_side)
              .texture("front", grapefruit_furnace_lit_texture)
              .texture("particle", grapefruit_furnace_side);
          
          // Configure variants for the grapefruit_furnace block
          getVariantBuilder(grapefruit_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/grapefruit_furnace_model_lit") : modLoc("block/grapefruit_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          FurnaceBlock pomelo_furnace = foodblockcompatregistry.POMELO_FURNACE.get();
          ResourceLocation pomelo_furnace_unlit_texture = modLoc("block/pomelo_furnace");
          ResourceLocation pomelo_furnace_lit_texture = modLoc("block/pomelo_furnace_lit");
          ResourceLocation pomelo_furnace_side = modLoc("block/pomelo_block");
          
          // Define the model for the unlit state
          BlockModelBuilder pomelo_furnace_model_unlit = models()
              .withExistingParent("pomelo_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pomelo_furnace_side)
              .texture("top", pomelo_furnace_side)
              .texture("front", pomelo_furnace_unlit_texture)
              .texture("particle", pomelo_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder pomelo_furnace_model_lit = models()
              .withExistingParent("pomelo_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pomelo_furnace_side)
              .texture("top", pomelo_furnace_side)
              .texture("front", pomelo_furnace_lit_texture)
              .texture("particle", pomelo_furnace_side);
          
          // Configure variants for the pomelo_furnace block
          getVariantBuilder(pomelo_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/pomelo_furnace_model_lit") : modLoc("block/pomelo_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          FurnaceBlock corn_furnace = foodblockcompatregistry.CORN_FURNACE.get();
          ResourceLocation corn_furnace_unlit_texture = modLoc("block/corn_furnace");
          ResourceLocation corn_furnace_lit_texture = modLoc("block/corn_furnace_lit");
          ResourceLocation corn_furnace_side = modLoc("block/corn_block");
          
          BlockModelBuilder corn_furnace_model_unlit = models()
              .withExistingParent("corn_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_furnace_side)
              .texture("top", corn_furnace_side)
              .texture("front", corn_furnace_unlit_texture)
              .texture("particle", corn_furnace_side);
          
          BlockModelBuilder corn_furnace_model_lit = models()
              .withExistingParent("corn_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_furnace_side)
              .texture("top", corn_furnace_side)
              .texture("front", corn_furnace_lit_texture)
              .texture("particle", corn_furnace_side);
          
          // Configure variants for the corn_furnace block
          getVariantBuilder(corn_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/corn_furnace_model_lit") : modLoc("block/corn_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          FurnaceBlock onion_furnace = foodblockcompatregistry.ONION_FURNACE.get();
          ResourceLocation onion_furnace_unlit_texture = modLoc("block/onion_furnace");
          ResourceLocation onion_furnace_lit_texture = modLoc("block/onion_furnace_lit");
          ResourceLocation onion_furnace_side = modLoc("block/onion_block");
          
          BlockModelBuilder onion_furnace_model_unlit = models()
              .withExistingParent("onion_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_furnace_side)
              .texture("top", onion_furnace_side)
              .texture("front", onion_furnace_unlit_texture)
              .texture("particle", onion_furnace_side);
          
          BlockModelBuilder onion_furnace_model_lit = models()
              .withExistingParent("onion_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_furnace_side)
              .texture("top", onion_furnace_side)
              .texture("front", onion_furnace_lit_texture)
              .texture("particle", onion_furnace_side);
          
          getVariantBuilder(onion_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/onion_furnace_model_lit") : modLoc("block/onion_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          FurnaceBlock tomato_furnace = foodblockcompatregistry.TOMATO_FURNACE.get();
          ResourceLocation tomato_furnace_unlit_texture = modLoc("block/tomato_furnace");
          ResourceLocation tomato_furnace_lit_texture = modLoc("block/tomato_furnace_lit");
          ResourceLocation tomato_furnace_side = modLoc("block/tomato_block");
          
          BlockModelBuilder tomato_furnace_model_unlit = models()
              .withExistingParent("tomato_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tomato_furnace_side)
              .texture("top", tomato_furnace_side)
              .texture("front", tomato_furnace_unlit_texture)
              .texture("particle", tomato_furnace_side);
          
          BlockModelBuilder tomato_furnace_model_lit = models()
              .withExistingParent("tomato_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", tomato_furnace_side)
              .texture("top", tomato_furnace_side)
              .texture("front", tomato_furnace_lit_texture)
              .texture("particle", tomato_furnace_side);
          
          getVariantBuilder(tomato_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/tomato_furnace_model_lit") : modLoc("block/tomato_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          FurnaceBlock pecan_furnace = foodblockcompatregistry.PECAN_FURNACE.get();
          ResourceLocation pecan_furnace_unlit_texture = modLoc("block/pecan_furnace");
          ResourceLocation pecan_furnace_lit_texture = modLoc("block/pecan_furnace_lit");
          ResourceLocation pecan_furnace_side = modLoc("block/pecan_block");
          
          // Define the model for the unlit state
          BlockModelBuilder pecan_furnace_model_unlit = models()
              .withExistingParent("pecan_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pecan_furnace_side)
              .texture("top", pecan_furnace_side)
              .texture("front", pecan_furnace_unlit_texture)
              .texture("particle", pecan_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder pecan_furnace_model_lit = models()
              .withExistingParent("pecan_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", pecan_furnace_side)
              .texture("top", pecan_furnace_side)
              .texture("front", pecan_furnace_lit_texture)
              .texture("particle", pecan_furnace_side);
          
          // Configure variants for the pecan_furnace block
          getVariantBuilder(pecan_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/pecan_furnace_model_lit") : modLoc("block/pecan_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          FurnaceBlock almond_furnace = foodblockcompatregistry.ALMOND_FURNACE.get();
          ResourceLocation almond_furnace_unlit_texture = modLoc("block/almond_furnace");
          ResourceLocation almond_furnace_lit_texture = modLoc("block/almond_furnace_lit");
          ResourceLocation almond_furnace_side = modLoc("block/almond_block");
          
          // Define the model for the unlit state
          BlockModelBuilder almond_furnace_model_unlit = models()
              .withExistingParent("almond_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", almond_furnace_side)
              .texture("top", almond_furnace_side)
              .texture("front", almond_furnace_unlit_texture)
              .texture("particle", almond_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder almond_furnace_model_lit = models()
              .withExistingParent("almond_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", almond_furnace_side)
              .texture("top", almond_furnace_side)
              .texture("front", almond_furnace_lit_texture)
              .texture("particle", almond_furnace_side);
          
          // Configure variants for the almond_furnace block
          getVariantBuilder(almond_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/almond_furnace_model_lit") : modLoc("block/almond_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
    //==============================================================================================================================================
    //|                                                               Paths                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodpathtypeminislab elderberry_stone_path = foodblockcompatregistry.ELDERBERRY_STONE_PATH.get();

          getVariantBuilder(elderberry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/elderberry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodpathtypeminislab juniper_stone_path = foodblockcompatregistry.JUNIPER_STONE_PATH.get();

          getVariantBuilder(juniper_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/juniper_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodpathtypeminislab cherry_stone_path = foodblockcompatregistry.CHERRY_STONE_PATH.get();

          getVariantBuilder(cherry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/cherry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          foodpathtypeminislab blackcherry_stone_path = foodblockcompatregistry.BLACKCHERRY_STONE_PATH.get();

          getVariantBuilder(blackcherry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/blackcherry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          foodpathtypeminislab peach_stone_path = foodblockcompatregistry.PEACH_STONE_PATH.get();

          getVariantBuilder(peach_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/peach_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodpathtypeminislab coconut_stone_path = foodblockcompatregistry.COCONUT_STONE_PATH.get();

          getVariantBuilder(coconut_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/coconut_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodpathtypeminislab orange_stone_path = foodblockcompatregistry.ORANGE_STONE_PATH.get();

          getVariantBuilder(orange_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/orange_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          foodpathtypeminislab tangerine_stone_path = foodblockcompatregistry.TANGERINE_STONE_PATH.get();

          getVariantBuilder(tangerine_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/tangerine_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          foodpathtypeminislab kumquat_stone_path = foodblockcompatregistry.KUMQUAT_STONE_PATH.get();

          getVariantBuilder(kumquat_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/kumquat_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          foodpathtypeminislab persimmon_stone_path = foodblockcompatregistry.PERSIMMON_STONE_PATH.get();

          getVariantBuilder(persimmon_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/persimmon_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          foodpathtypeminislab satsuma_stone_path = foodblockcompatregistry.SATSUMA_STONE_PATH.get();

          getVariantBuilder(satsuma_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/satsuma_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          foodpathtypeminislab mandarin_stone_path = foodblockcompatregistry.MANDARIN_STONE_PATH.get();

          getVariantBuilder(mandarin_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/mandarin_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          foodpathtypeminislab lemon_stone_path = foodblockcompatregistry.LEMON_STONE_PATH.get();

          getVariantBuilder(lemon_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/lemon_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          foodpathtypeminislab citron_stone_path = foodblockcompatregistry.CITRON_STONE_PATH.get();

          getVariantBuilder(citron_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/citron_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          foodpathtypeminislab buddhashand_stone_path = foodblockcompatregistry.BUDDHASHAND_STONE_PATH.get();

          getVariantBuilder(buddhashand_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/buddhashand_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          foodpathtypeminislab lime_stone_path = foodblockcompatregistry.LIME_STONE_PATH.get();

          getVariantBuilder(lime_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/lime_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          foodpathtypeminislab keylime_stone_path = foodblockcompatregistry.KEYLIME_STONE_PATH.get();

          getVariantBuilder(keylime_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/keylime_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          foodpathtypeminislab fingerlime_stone_path = foodblockcompatregistry.FINGERLIME_STONE_PATH.get();

          getVariantBuilder(fingerlime_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/fingerlime_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          foodpathtypeminislab grapefruit_stone_path = foodblockcompatregistry.GRAPEFRUIT_STONE_PATH.get();

          getVariantBuilder(grapefruit_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/grapefruit_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          foodpathtypeminislab pomelo_stone_path = foodblockcompatregistry.POMELO_STONE_PATH.get();

          getVariantBuilder(pomelo_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/pomelo_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          foodpathtypeminislab corn_stone_path = foodblockcompatregistry.CORN_STONE_PATH.get();

          getVariantBuilder(corn_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/corn_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          foodpathtypeminislab onion_stone_path = foodblockcompatregistry.ONION_STONE_PATH.get();

          getVariantBuilder(onion_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/onion_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          foodpathtypeminislab tomato_stone_path = foodblockcompatregistry.TOMATO_STONE_PATH.get();

          getVariantBuilder(tomato_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/tomato_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          foodpathtypeminislab pecan_stone_path = foodblockcompatregistry.PECAN_STONE_PATH.get();

          getVariantBuilder(pecan_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/pecan_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          foodpathtypeminislab almond_stone_path = foodblockcompatregistry.ALMOND_STONE_PATH.get();

          getVariantBuilder(almond_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/almond_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Barrels                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBarrel elderberry_barrel = foodblockcompatregistry.ELDERBERRY_BARREL.get();
          ResourceLocation elderberry_barrel_closed_texture = modLoc("block/elderberry_barrel_top_closed");
          ResourceLocation elderberry_barrel_open_texture = modLoc("block/elderberry_barrel_top_open");
          ResourceLocation elderberry_barrel_side = modLoc("block/elderberry_barrel_side");
          ResourceLocation elderberry_barrel_bottom = modLoc("block/elderberry_barrel_bottom");
          
          BlockModelBuilder elderberry_barrel_model_closed = models()
              .withExistingParent("elderberry_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_barrel_side)
              .texture("bottom", elderberry_barrel_bottom)
              .texture("top", elderberry_barrel_closed_texture)
              .texture("particle", elderberry_barrel_side);
          
          BlockModelBuilder elderberry_barrel_model_open = models()
              .withExistingParent("elderberry_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_barrel_side)
              .texture("bottom", elderberry_barrel_bottom)
              .texture("top", elderberry_barrel_open_texture)
              .texture("particle", elderberry_barrel_side);
          
          getVariantBuilder(elderberry_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/elderberry_barrel_model_open") : modLoc("block/elderberry_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodBarrel juniper_barrel = foodblockcompatregistry.JUNIPER_BARREL.get();
          ResourceLocation juniper_barrel_closed_texture = modLoc("block/juniper_barrel_top_closed");
          ResourceLocation juniper_barrel_open_texture = modLoc("block/juniper_barrel_top_open");
          ResourceLocation juniper_barrel_side = modLoc("block/juniper_barrel_side");
          ResourceLocation juniper_barrel_bottom = modLoc("block/juniper_barrel_bottom");
          
          BlockModelBuilder juniper_barrel_model_closed = models()
              .withExistingParent("juniper_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_barrel_side)
              .texture("bottom", juniper_barrel_bottom)
              .texture("top", juniper_barrel_closed_texture)
              .texture("particle", juniper_barrel_side);
          
          BlockModelBuilder juniper_barrel_model_open = models()
              .withExistingParent("juniper_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_barrel_side)
              .texture("bottom", juniper_barrel_bottom)
              .texture("top", juniper_barrel_open_texture)
              .texture("particle", juniper_barrel_side);
          
          getVariantBuilder(juniper_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/juniper_barrel_model_open") : modLoc("block/juniper_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBarrel cherry_barrel = foodblockcompatregistry.CHERRY_BARREL.get();
          ResourceLocation cherry_barrel_closed_texture = modLoc("block/cherry_barrel_top_closed");
          ResourceLocation cherry_barrel_open_texture = modLoc("block/cherry_barrel_top_open");
          ResourceLocation cherry_barrel_side = modLoc("block/cherry_barrel_side");
          ResourceLocation cherry_barrel_bottom = modLoc("block/cherry_barrel_bottom");
          
          BlockModelBuilder cherry_barrel_model_closed = models()
              .withExistingParent("cherry_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_barrel_side)
              .texture("bottom", cherry_barrel_bottom)
              .texture("top", cherry_barrel_closed_texture)
              .texture("particle", cherry_barrel_side);
          
          BlockModelBuilder cherry_barrel_model_open = models()
              .withExistingParent("cherry_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_barrel_side)
              .texture("bottom", cherry_barrel_bottom)
              .texture("top", cherry_barrel_open_texture)
              .texture("particle", cherry_barrel_side);
          
          getVariantBuilder(cherry_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/cherry_barrel_model_open") : modLoc("block/cherry_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          foodBarrel blackcherry_barrel = foodblockcompatregistry.BLACKCHERRY_BARREL.get();
          ResourceLocation blackcherry_barrel_closed_texture = modLoc("block/blackcherry_barrel_top_closed");
          ResourceLocation blackcherry_barrel_open_texture = modLoc("block/blackcherry_barrel_top_open");
          ResourceLocation blackcherry_barrel_side = modLoc("block/blackcherry_barrel_side");
          ResourceLocation blackcherry_barrel_bottom = modLoc("block/blackcherry_barrel_bottom");
          
          BlockModelBuilder blackcherry_barrel_model_closed = models()
              .withExistingParent("blackcherry_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", blackcherry_barrel_side)
              .texture("bottom", blackcherry_barrel_bottom)
              .texture("top", blackcherry_barrel_closed_texture)
              .texture("particle", blackcherry_barrel_side);
          
          BlockModelBuilder blackcherry_barrel_model_open = models()
              .withExistingParent("blackcherry_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", blackcherry_barrel_side)
              .texture("bottom", blackcherry_barrel_bottom)
              .texture("top", blackcherry_barrel_open_texture)
              .texture("particle", blackcherry_barrel_side);
          
          getVariantBuilder(blackcherry_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/blackcherry_barrel_model_open") : modLoc("block/blackcherry_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          foodBarrel peach_barrel = foodblockcompatregistry.PEACH_BARREL.get();
          ResourceLocation peach_barrel_closed_texture = modLoc("block/peach_barrel_top_closed");
          ResourceLocation peach_barrel_open_texture = modLoc("block/peach_barrel_top_open");
          ResourceLocation peach_barrel_side = modLoc("block/peach_barrel_side");
          ResourceLocation peach_barrel_bottom = modLoc("block/peach_barrel_bottom");
          
          BlockModelBuilder peach_barrel_model_closed = models()
              .withExistingParent("peach_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", peach_barrel_side)
              .texture("bottom", peach_barrel_bottom)
              .texture("top", peach_barrel_closed_texture)
              .texture("particle", peach_barrel_side);
          
          BlockModelBuilder peach_barrel_model_open = models()
              .withExistingParent("peach_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", peach_barrel_side)
              .texture("bottom", peach_barrel_bottom)
              .texture("top", peach_barrel_open_texture)
              .texture("particle", peach_barrel_side);
          
          getVariantBuilder(peach_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/peach_barrel_model_open") : modLoc("block/peach_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodBarrel coconut_barrel = foodblockcompatregistry.COCONUT_BARREL.get();
          ResourceLocation coconut_barrel_closed_texture = modLoc("block/coconut_barrel_top_closed");
          ResourceLocation coconut_barrel_open_texture = modLoc("block/coconut_barrel_top_open");
          ResourceLocation coconut_barrel_side = modLoc("block/coconut_barrel_side");
          ResourceLocation coconut_barrel_bottom = modLoc("block/coconut_barrel_bottom");
          
          BlockModelBuilder coconut_barrel_model_closed = models()
              .withExistingParent("coconut_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_barrel_side)
              .texture("bottom", coconut_barrel_bottom)
              .texture("top", coconut_barrel_closed_texture)
              .texture("particle", coconut_barrel_side);
          
          BlockModelBuilder coconut_barrel_model_open = models()
              .withExistingParent("coconut_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_barrel_side)
              .texture("bottom", coconut_barrel_bottom)
              .texture("top", coconut_barrel_open_texture)
              .texture("particle", coconut_barrel_side);
          
          getVariantBuilder(coconut_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/coconut_barrel_model_open") : modLoc("block/coconut_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodBarrel orange_barrel = foodblockcompatregistry.ORANGE_BARREL.get();
          ResourceLocation orange_barrel_closed_texture = modLoc("block/orange_barrel_top_closed");
          ResourceLocation orange_barrel_open_texture = modLoc("block/orange_barrel_top_open");
          ResourceLocation orange_barrel_side = modLoc("block/orange_barrel_side");
          ResourceLocation orange_barrel_bottom = modLoc("block/orange_barrel_bottom");
          
          BlockModelBuilder orange_barrel_model_closed = models()
              .withExistingParent("orange_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_barrel_side)
              .texture("bottom", orange_barrel_bottom)
              .texture("top", orange_barrel_closed_texture)
              .texture("particle", orange_barrel_side);
          
          BlockModelBuilder orange_barrel_model_open = models()
              .withExistingParent("orange_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_barrel_side)
              .texture("bottom", orange_barrel_bottom)
              .texture("top", orange_barrel_open_texture)
              .texture("particle", orange_barrel_side);
          
          getVariantBuilder(orange_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/orange_barrel_model_open") : modLoc("block/orange_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          foodBarrel tangerine_barrel = foodblockcompatregistry.TANGERINE_BARREL.get();
          ResourceLocation tangerine_barrel_closed_texture = modLoc("block/tangerine_barrel_top_closed");
          ResourceLocation tangerine_barrel_open_texture = modLoc("block/tangerine_barrel_top_open");
          ResourceLocation tangerine_barrel_side = modLoc("block/tangerine_barrel_side");
          ResourceLocation tangerine_barrel_bottom = modLoc("block/tangerine_barrel_bottom");
          
          BlockModelBuilder tangerine_barrel_model_closed = models()
              .withExistingParent("tangerine_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", tangerine_barrel_side)
              .texture("bottom", tangerine_barrel_bottom)
              .texture("top", tangerine_barrel_closed_texture)
              .texture("particle", tangerine_barrel_side);
          
          BlockModelBuilder tangerine_barrel_model_open = models()
              .withExistingParent("tangerine_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", tangerine_barrel_side)
              .texture("bottom", tangerine_barrel_bottom)
              .texture("top", tangerine_barrel_open_texture)
              .texture("particle", tangerine_barrel_side);
          
          getVariantBuilder(tangerine_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/tangerine_barrel_model_open") : modLoc("block/tangerine_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          foodBarrel kumquat_barrel = foodblockcompatregistry.KUMQUAT_BARREL.get();
          ResourceLocation kumquat_barrel_closed_texture = modLoc("block/kumquat_barrel_top_closed");
          ResourceLocation kumquat_barrel_open_texture = modLoc("block/kumquat_barrel_top_open");
          ResourceLocation kumquat_barrel_side = modLoc("block/kumquat_barrel_side");
          ResourceLocation kumquat_barrel_bottom = modLoc("block/kumquat_barrel_bottom");
          
          BlockModelBuilder kumquat_barrel_model_closed = models()
              .withExistingParent("kumquat_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", kumquat_barrel_side)
              .texture("bottom", kumquat_barrel_bottom)
              .texture("top", kumquat_barrel_closed_texture)
              .texture("particle", kumquat_barrel_side);
          
          BlockModelBuilder kumquat_barrel_model_open = models()
              .withExistingParent("kumquat_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", kumquat_barrel_side)
              .texture("bottom", kumquat_barrel_bottom)
              .texture("top", kumquat_barrel_open_texture)
              .texture("particle", kumquat_barrel_side);
          
          getVariantBuilder(kumquat_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/kumquat_barrel_model_open") : modLoc("block/kumquat_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          foodBarrel persimmon_barrel = foodblockcompatregistry.PERSIMMON_BARREL.get();
          ResourceLocation persimmon_barrel_closed_texture = modLoc("block/persimmon_barrel_top_closed");
          ResourceLocation persimmon_barrel_open_texture = modLoc("block/persimmon_barrel_top_open");
          ResourceLocation persimmon_barrel_side = modLoc("block/persimmon_barrel_side");
          ResourceLocation persimmon_barrel_bottom = modLoc("block/persimmon_barrel_bottom");
          
          BlockModelBuilder persimmon_barrel_model_closed = models()
              .withExistingParent("persimmon_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", persimmon_barrel_side)
              .texture("bottom", persimmon_barrel_bottom)
              .texture("top", persimmon_barrel_closed_texture)
              .texture("particle", persimmon_barrel_side);
          
          BlockModelBuilder persimmon_barrel_model_open = models()
              .withExistingParent("persimmon_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", persimmon_barrel_side)
              .texture("bottom", persimmon_barrel_bottom)
              .texture("top", persimmon_barrel_open_texture)
              .texture("particle", persimmon_barrel_side);
          
          getVariantBuilder(persimmon_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/persimmon_barrel_model_open") : modLoc("block/persimmon_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          foodBarrel satsuma_barrel = foodblockcompatregistry.SATSUMA_BARREL.get();
          ResourceLocation satsuma_barrel_closed_texture = modLoc("block/satsuma_barrel_top_closed");
          ResourceLocation satsuma_barrel_open_texture = modLoc("block/satsuma_barrel_top_open");
          ResourceLocation satsuma_barrel_side = modLoc("block/satsuma_barrel_side");
          ResourceLocation satsuma_barrel_bottom = modLoc("block/satsuma_barrel_bottom");
          
          BlockModelBuilder satsuma_barrel_model_closed = models()
              .withExistingParent("satsuma_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", satsuma_barrel_side)
              .texture("bottom", satsuma_barrel_bottom)
              .texture("top", satsuma_barrel_closed_texture)
              .texture("particle", satsuma_barrel_side);
          
          BlockModelBuilder satsuma_barrel_model_open = models()
              .withExistingParent("satsuma_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", satsuma_barrel_side)
              .texture("bottom", satsuma_barrel_bottom)
              .texture("top", satsuma_barrel_open_texture)
              .texture("particle", satsuma_barrel_side);
          
          getVariantBuilder(satsuma_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/satsuma_barrel_model_open") : modLoc("block/satsuma_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          foodBarrel mandarin_barrel = foodblockcompatregistry.MANDARIN_BARREL.get();
          ResourceLocation mandarin_barrel_closed_texture = modLoc("block/mandarin_barrel_top_closed");
          ResourceLocation mandarin_barrel_open_texture = modLoc("block/mandarin_barrel_top_open");
          ResourceLocation mandarin_barrel_side = modLoc("block/mandarin_barrel_side");
          ResourceLocation mandarin_barrel_bottom = modLoc("block/mandarin_barrel_bottom");
          
          BlockModelBuilder mandarin_barrel_model_closed = models()
              .withExistingParent("mandarin_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", mandarin_barrel_side)
              .texture("bottom", mandarin_barrel_bottom)
              .texture("top", mandarin_barrel_closed_texture)
              .texture("particle", mandarin_barrel_side);
          
          BlockModelBuilder mandarin_barrel_model_open = models()
              .withExistingParent("mandarin_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", mandarin_barrel_side)
              .texture("bottom", mandarin_barrel_bottom)
              .texture("top", mandarin_barrel_open_texture)
              .texture("particle", mandarin_barrel_side);
          
          getVariantBuilder(mandarin_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/mandarin_barrel_model_open") : modLoc("block/mandarin_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          foodBarrel lemon_barrel = foodblockcompatregistry.LEMON_BARREL.get();
          ResourceLocation lemon_barrel_closed_texture = modLoc("block/lemon_barrel_top_closed");
          ResourceLocation lemon_barrel_open_texture = modLoc("block/lemon_barrel_top_open");
          ResourceLocation lemon_barrel_side = modLoc("block/lemon_barrel_side");
          ResourceLocation lemon_barrel_bottom = modLoc("block/lemon_barrel_bottom");
          
          BlockModelBuilder lemon_barrel_model_closed = models()
              .withExistingParent("lemon_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", lemon_barrel_side)
              .texture("bottom", lemon_barrel_bottom)
              .texture("top", lemon_barrel_closed_texture)
              .texture("particle", lemon_barrel_side);
          
          BlockModelBuilder lemon_barrel_model_open = models()
              .withExistingParent("lemon_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", lemon_barrel_side)
              .texture("bottom", lemon_barrel_bottom)
              .texture("top", lemon_barrel_open_texture)
              .texture("particle", lemon_barrel_side);
          
          getVariantBuilder(lemon_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/lemon_barrel_model_open") : modLoc("block/lemon_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          foodBarrel citron_barrel = foodblockcompatregistry.CITRON_BARREL.get();
          ResourceLocation citron_barrel_closed_texture = modLoc("block/citron_barrel_top_closed");
          ResourceLocation citron_barrel_open_texture = modLoc("block/citron_barrel_top_open");
          ResourceLocation citron_barrel_side = modLoc("block/citron_barrel_side");
          ResourceLocation citron_barrel_bottom = modLoc("block/citron_barrel_bottom");
          
          BlockModelBuilder citron_barrel_model_closed = models()
              .withExistingParent("citron_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", citron_barrel_side)
              .texture("bottom", citron_barrel_bottom)
              .texture("top", citron_barrel_closed_texture)
              .texture("particle", citron_barrel_side);
          
          BlockModelBuilder citron_barrel_model_open = models()
              .withExistingParent("citron_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", citron_barrel_side)
              .texture("bottom", citron_barrel_bottom)
              .texture("top", citron_barrel_open_texture)
              .texture("particle", citron_barrel_side);
          
          getVariantBuilder(citron_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/citron_barrel_model_open") : modLoc("block/citron_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          foodBarrel buddhashand_barrel = foodblockcompatregistry.BUDDHASHAND_BARREL.get();
          ResourceLocation buddhashand_barrel_closed_texture = modLoc("block/buddhashand_barrel_top_closed");
          ResourceLocation buddhashand_barrel_open_texture = modLoc("block/buddhashand_barrel_top_open");
          ResourceLocation buddhashand_barrel_side = modLoc("block/buddhashand_barrel_side");
          ResourceLocation buddhashand_barrel_bottom = modLoc("block/buddhashand_barrel_bottom");
          
          BlockModelBuilder buddhashand_barrel_model_closed = models()
              .withExistingParent("buddhashand_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", buddhashand_barrel_side)
              .texture("bottom", buddhashand_barrel_bottom)
              .texture("top", buddhashand_barrel_closed_texture)
              .texture("particle", buddhashand_barrel_side);
          
          BlockModelBuilder buddhashand_barrel_model_open = models()
              .withExistingParent("buddhashand_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", buddhashand_barrel_side)
              .texture("bottom", buddhashand_barrel_bottom)
              .texture("top", buddhashand_barrel_open_texture)
              .texture("particle", buddhashand_barrel_side);
          
          getVariantBuilder(buddhashand_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/buddhashand_barrel_model_open") : modLoc("block/buddhashand_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          foodBarrel lime_barrel = foodblockcompatregistry.LIME_BARREL.get();
          ResourceLocation lime_barrel_closed_texture = modLoc("block/lime_barrel_top_closed");
          ResourceLocation lime_barrel_open_texture = modLoc("block/lime_barrel_top_open");
          ResourceLocation lime_barrel_side = modLoc("block/lime_barrel_side");
          ResourceLocation lime_barrel_bottom = modLoc("block/lime_barrel_bottom");
          
          BlockModelBuilder lime_barrel_model_closed = models()
              .withExistingParent("lime_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", lime_barrel_side)
              .texture("bottom", lime_barrel_bottom)
              .texture("top", lime_barrel_closed_texture)
              .texture("particle", lime_barrel_side);
          
          BlockModelBuilder lime_barrel_model_open = models()
              .withExistingParent("lime_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", lime_barrel_side)
              .texture("bottom", lime_barrel_bottom)
              .texture("top", lime_barrel_open_texture)
              .texture("particle", lime_barrel_side);
          
          getVariantBuilder(lime_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/lime_barrel_model_open") : modLoc("block/lime_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          foodBarrel keylime_barrel = foodblockcompatregistry.KEYLIME_BARREL.get();
          ResourceLocation keylime_barrel_closed_texture = modLoc("block/keylime_barrel_top_closed");
          ResourceLocation keylime_barrel_open_texture = modLoc("block/keylime_barrel_top_open");
          ResourceLocation keylime_barrel_side = modLoc("block/keylime_barrel_side");
          ResourceLocation keylime_barrel_bottom = modLoc("block/keylime_barrel_bottom");
          
          BlockModelBuilder keylime_barrel_model_closed = models()
              .withExistingParent("keylime_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", keylime_barrel_side)
              .texture("bottom", keylime_barrel_bottom)
              .texture("top", keylime_barrel_closed_texture)
              .texture("particle", keylime_barrel_side);
          
          BlockModelBuilder keylime_barrel_model_open = models()
              .withExistingParent("keylime_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", keylime_barrel_side)
              .texture("bottom", keylime_barrel_bottom)
              .texture("top", keylime_barrel_open_texture)
              .texture("particle", keylime_barrel_side);
          
          getVariantBuilder(keylime_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/keylime_barrel_model_open") : modLoc("block/keylime_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          foodBarrel fingerlime_barrel = foodblockcompatregistry.FINGERLIME_BARREL.get();
          ResourceLocation fingerlime_barrel_closed_texture = modLoc("block/fingerlime_barrel_top_closed");
          ResourceLocation fingerlime_barrel_open_texture = modLoc("block/fingerlime_barrel_top_open");
          ResourceLocation fingerlime_barrel_side = modLoc("block/fingerlime_barrel_side");
          ResourceLocation fingerlime_barrel_bottom = modLoc("block/fingerlime_barrel_bottom");
          
          BlockModelBuilder fingerlime_barrel_model_closed = models()
              .withExistingParent("fingerlime_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", fingerlime_barrel_side)
              .texture("bottom", fingerlime_barrel_bottom)
              .texture("top", fingerlime_barrel_closed_texture)
              .texture("particle", fingerlime_barrel_side);
          
          BlockModelBuilder fingerlime_barrel_model_open = models()
              .withExistingParent("fingerlime_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", fingerlime_barrel_side)
              .texture("bottom", fingerlime_barrel_bottom)
              .texture("top", fingerlime_barrel_open_texture)
              .texture("particle", fingerlime_barrel_side);
          
          getVariantBuilder(fingerlime_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/fingerlime_barrel_model_open") : modLoc("block/fingerlime_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          foodBarrel grapefruit_barrel = foodblockcompatregistry.GRAPEFRUIT_BARREL.get();
          ResourceLocation grapefruit_barrel_closed_texture = modLoc("block/grapefruit_barrel_top_closed");
          ResourceLocation grapefruit_barrel_open_texture = modLoc("block/grapefruit_barrel_top_open");
          ResourceLocation grapefruit_barrel_side = modLoc("block/grapefruit_barrel_side");
          ResourceLocation grapefruit_barrel_bottom = modLoc("block/grapefruit_barrel_bottom");
          
          BlockModelBuilder grapefruit_barrel_model_closed = models()
              .withExistingParent("grapefruit_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", grapefruit_barrel_side)
              .texture("bottom", grapefruit_barrel_bottom)
              .texture("top", grapefruit_barrel_closed_texture)
              .texture("particle", grapefruit_barrel_side);
          
          BlockModelBuilder grapefruit_barrel_model_open = models()
              .withExistingParent("grapefruit_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", grapefruit_barrel_side)
              .texture("bottom", grapefruit_barrel_bottom)
              .texture("top", grapefruit_barrel_open_texture)
              .texture("particle", grapefruit_barrel_side);
          
          getVariantBuilder(grapefruit_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/grapefruit_barrel_model_open") : modLoc("block/grapefruit_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          foodBarrel pomelo_barrel = foodblockcompatregistry.POMELO_BARREL.get();
          ResourceLocation pomelo_barrel_closed_texture = modLoc("block/pomelo_barrel_top_closed");
          ResourceLocation pomelo_barrel_open_texture = modLoc("block/pomelo_barrel_top_open");
          ResourceLocation pomelo_barrel_side = modLoc("block/pomelo_barrel_side");
          ResourceLocation pomelo_barrel_bottom = modLoc("block/pomelo_barrel_bottom");
          
          BlockModelBuilder pomelo_barrel_model_closed = models()
              .withExistingParent("pomelo_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", pomelo_barrel_side)
              .texture("bottom", pomelo_barrel_bottom)
              .texture("top", pomelo_barrel_closed_texture)
              .texture("particle", pomelo_barrel_side);
          
          BlockModelBuilder pomelo_barrel_model_open = models()
              .withExistingParent("pomelo_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", pomelo_barrel_side)
              .texture("bottom", pomelo_barrel_bottom)
              .texture("top", pomelo_barrel_open_texture)
              .texture("particle", pomelo_barrel_side);
          
          getVariantBuilder(pomelo_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/pomelo_barrel_model_open") : modLoc("block/pomelo_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          foodBarrel corn_barrel = foodblockcompatregistry.CORN_BARREL.get();
          ResourceLocation corn_barrel_closed_texture = modLoc("block/corn_barrel_top_closed");
          ResourceLocation corn_barrel_open_texture = modLoc("block/corn_barrel_top_open");
          ResourceLocation corn_barrel_side = modLoc("block/corn_barrel_side");
          ResourceLocation corn_barrel_bottom = modLoc("block/corn_barrel_bottom");
          
          BlockModelBuilder corn_barrel_model_closed = models()
              .withExistingParent("corn_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_barrel_side)
              .texture("bottom", corn_barrel_bottom)
              .texture("top", corn_barrel_closed_texture)
              .texture("particle", corn_barrel_side);
          
          BlockModelBuilder corn_barrel_model_open = models()
              .withExistingParent("corn_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_barrel_side)
              .texture("bottom", corn_barrel_bottom)
              .texture("top", corn_barrel_open_texture)
              .texture("particle", corn_barrel_side);
          
          getVariantBuilder(corn_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/corn_barrel_model_open") : modLoc("block/corn_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          foodBarrel onion_barrel = foodblockcompatregistry.ONION_BARREL.get();
          ResourceLocation onion_barrel_closed_texture = modLoc("block/onion_barrel_top_closed");
          ResourceLocation onion_barrel_open_texture = modLoc("block/onion_barrel_top_open");
          ResourceLocation onion_barrel_side = modLoc("block/onion_barrel_side");
          ResourceLocation onion_barrel_bottom = modLoc("block/onion_barrel_bottom");
          
          BlockModelBuilder onion_barrel_model_closed = models()
              .withExistingParent("onion_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_barrel_side)
              .texture("bottom", onion_barrel_bottom)
              .texture("top", onion_barrel_closed_texture)
              .texture("particle", onion_barrel_side);
          
          BlockModelBuilder onion_barrel_model_open = models()
              .withExistingParent("onion_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_barrel_side)
              .texture("bottom", onion_barrel_bottom)
              .texture("top", onion_barrel_open_texture)
              .texture("particle", onion_barrel_side);
          
          getVariantBuilder(onion_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/onion_barrel_model_open") : modLoc("block/onion_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          foodBarrel tomato_barrel = foodblockcompatregistry.TOMATO_BARREL.get();
          ResourceLocation tomato_barrel_closed_texture = modLoc("block/tomato_barrel_top_closed");
          ResourceLocation tomato_barrel_open_texture = modLoc("block/tomato_barrel_top_open");
          ResourceLocation tomato_barrel_side = modLoc("block/tomato_barrel_side");
          ResourceLocation tomato_barrel_bottom = modLoc("block/tomato_barrel_bottom");
          
          BlockModelBuilder tomato_barrel_model_closed = models()
              .withExistingParent("tomato_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", tomato_barrel_side)
              .texture("bottom", tomato_barrel_bottom)
              .texture("top", tomato_barrel_closed_texture)
              .texture("particle", tomato_barrel_side);
          
          BlockModelBuilder tomato_barrel_model_open = models()
              .withExistingParent("tomato_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", tomato_barrel_side)
              .texture("bottom", tomato_barrel_bottom)
              .texture("top", tomato_barrel_open_texture)
              .texture("particle", tomato_barrel_side);
          
          getVariantBuilder(tomato_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/tomato_barrel_model_open") : modLoc("block/tomato_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          foodBarrel pecan_barrel = foodblockcompatregistry.PECAN_BARREL.get();
          ResourceLocation pecan_barrel_closed_texture = modLoc("block/pecan_barrel_top_closed");
          ResourceLocation pecan_barrel_open_texture = modLoc("block/pecan_barrel_top_open");
          ResourceLocation pecan_barrel_side = modLoc("block/pecan_barrel_side");
          ResourceLocation pecan_barrel_bottom = modLoc("block/pecan_barrel_bottom");
          
          BlockModelBuilder pecan_barrel_model_closed = models()
              .withExistingParent("pecan_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", pecan_barrel_side)
              .texture("bottom", pecan_barrel_bottom)
              .texture("top", pecan_barrel_closed_texture)
              .texture("particle", pecan_barrel_side);
          
          BlockModelBuilder pecan_barrel_model_open = models()
              .withExistingParent("pecan_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", pecan_barrel_side)
              .texture("bottom", pecan_barrel_bottom)
              .texture("top", pecan_barrel_open_texture)
              .texture("particle", pecan_barrel_side);
          
          getVariantBuilder(pecan_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/pecan_barrel_model_open") : modLoc("block/pecan_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          foodBarrel almond_barrel = foodblockcompatregistry.ALMOND_BARREL.get();
          ResourceLocation almond_barrel_closed_texture = modLoc("block/almond_barrel_top_closed");
          ResourceLocation almond_barrel_open_texture = modLoc("block/almond_barrel_top_open");
          ResourceLocation almond_barrel_side = modLoc("block/almond_barrel_side");
          ResourceLocation almond_barrel_bottom = modLoc("block/almond_barrel_bottom");
          
          BlockModelBuilder almond_barrel_model_closed = models()
              .withExistingParent("almond_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", almond_barrel_side)
              .texture("bottom", almond_barrel_bottom)
              .texture("top", almond_barrel_closed_texture)
              .texture("particle", almond_barrel_side);
          
          BlockModelBuilder almond_barrel_model_open = models()
              .withExistingParent("almond_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", almond_barrel_side)
              .texture("bottom", almond_barrel_bottom)
              .texture("top", almond_barrel_open_texture)
              .texture("particle", almond_barrel_side);
          
          getVariantBuilder(almond_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/almond_barrel_model_open") : modLoc("block/almond_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
    //==============================================================================================================================================
    //|                                                              Chairs                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodChairBlock elderberryChair = foodblockcompatregistry.ELDERBERRY_CHAIR.get();

          getVariantBuilder(elderberryChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodChairBlock juniperChair = foodblockcompatregistry.JUNIPER_CHAIR.get();

          getVariantBuilder(juniperChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodChairBlock cherryChair = foodblockcompatregistry.CHERRY_CHAIR.get();

          getVariantBuilder(cherryChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          foodChairBlock blackcherryChair = foodblockcompatregistry.BLACKCHERRY_CHAIR.get();

          getVariantBuilder(blackcherryChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/blackcherry_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          foodChairBlock peachChair = foodblockcompatregistry.PEACH_CHAIR.get();

          getVariantBuilder(peachChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/peach_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodChairBlock coconutChair = foodblockcompatregistry.COCONUT_CHAIR.get();

          getVariantBuilder(coconutChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodChairBlock orangeChair = foodblockcompatregistry.ORANGE_CHAIR.get();

          getVariantBuilder(orangeChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          foodChairBlock tangerineChair = foodblockcompatregistry.TANGERINE_CHAIR.get();

          getVariantBuilder(tangerineChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tangerine_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          foodChairBlock kumquatChair = foodblockcompatregistry.KUMQUAT_CHAIR.get();

          getVariantBuilder(kumquatChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/kumquat_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          foodChairBlock persimmonChair = foodblockcompatregistry.PERSIMMON_CHAIR.get();

          getVariantBuilder(persimmonChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/persimmon_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          foodChairBlock satsumaChair = foodblockcompatregistry.SATSUMA_CHAIR.get();

          getVariantBuilder(satsumaChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/satsuma_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          foodChairBlock mandarinChair = foodblockcompatregistry.MANDARIN_CHAIR.get();

          getVariantBuilder(mandarinChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/mandarin_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          foodChairBlock lemonChair = foodblockcompatregistry.LEMON_CHAIR.get();

          getVariantBuilder(lemonChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lemon_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          foodChairBlock citronChair = foodblockcompatregistry.CITRON_CHAIR.get();

          getVariantBuilder(citronChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/citron_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          foodChairBlock buddhashandChair = foodblockcompatregistry.BUDDHASHAND_CHAIR.get();

          getVariantBuilder(buddhashandChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/buddhashand_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          foodChairBlock limeChair = foodblockcompatregistry.LIME_CHAIR.get();

          getVariantBuilder(limeChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lime_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          foodChairBlock keylimeChair = foodblockcompatregistry.KEYLIME_CHAIR.get();

          getVariantBuilder(keylimeChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/keylime_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          foodChairBlock fingerlimeChair = foodblockcompatregistry.FINGERLIME_CHAIR.get();

          getVariantBuilder(fingerlimeChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/fingerlime_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          foodChairBlock grapefruitChair = foodblockcompatregistry.GRAPEFRUIT_CHAIR.get();

          getVariantBuilder(grapefruitChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/grapefruit_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          foodChairBlock pomeloChair = foodblockcompatregistry.POMELO_CHAIR.get();

          getVariantBuilder(pomeloChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pomelo_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          foodChairBlock cornChair = foodblockcompatregistry.CORN_CHAIR.get();

          getVariantBuilder(cornChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          foodChairBlock onionChair = foodblockcompatregistry.ONION_CHAIR.get();

          getVariantBuilder(onionChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          foodChairBlock tomatoChair = foodblockcompatregistry.TOMATO_CHAIR.get();

          getVariantBuilder(tomatoChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tomato_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          foodChairBlock pecanChair = foodblockcompatregistry.PECAN_CHAIR.get();

          getVariantBuilder(pecanChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pecan_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          foodChairBlock almondChair = foodblockcompatregistry.ALMOND_CHAIR.get();

          getVariantBuilder(almondChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/almond_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                               Beds                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBed elderberryBed = foodblockcompatregistry.ELDERBERRY_BED.get();

          getVariantBuilder(elderberryBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodBed juniperBed = foodblockcompatregistry.JUNIPER_BED.get();

          getVariantBuilder(juniperBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBed cherryBed = foodblockcompatregistry.CHERRY_BED.get();

          getVariantBuilder(cherryBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
          foodBed blackcherryBed = foodblockcompatregistry.BLACKCHERRY_BED.get();

          getVariantBuilder(blackcherryBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/blackcherry_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
          foodBed peachBed = foodblockcompatregistry.PEACH_BED.get();

          getVariantBuilder(peachBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/peach_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodBed coconutBed = foodblockcompatregistry.COCONUT_BED.get();

          getVariantBuilder(coconutBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodBed orangeBed = foodblockcompatregistry.ORANGE_BED.get();

          getVariantBuilder(orangeBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
          foodBed tangerineBed = foodblockcompatregistry.TANGERINE_BED.get();

          getVariantBuilder(tangerineBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tangerine_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
          foodBed kumquatBed = foodblockcompatregistry.KUMQUAT_BED.get();

          getVariantBuilder(kumquatBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/kumquat_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
          foodBed persimmonBed = foodblockcompatregistry.PERSIMMON_BED.get();

          getVariantBuilder(persimmonBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/persimmon_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
          foodBed satsumaBed = foodblockcompatregistry.SATSUMA_BED.get();

          getVariantBuilder(satsumaBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/satsuma_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
          foodBed mandarinBed = foodblockcompatregistry.MANDARIN_BED.get();

          getVariantBuilder(mandarinBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/mandarin_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
          foodBed lemonBed = foodblockcompatregistry.LEMON_BED.get();

          getVariantBuilder(lemonBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lemon_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
          foodBed citronBed = foodblockcompatregistry.CITRON_BED.get();

          getVariantBuilder(citronBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/citron_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
          foodBed buddhashandBed = foodblockcompatregistry.BUDDHASHAND_BED.get();

          getVariantBuilder(buddhashandBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/buddhashand_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
          foodBed limeBed = foodblockcompatregistry.LIME_BED.get();

          getVariantBuilder(limeBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/lime_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
          foodBed keylimeBed = foodblockcompatregistry.KEYLIME_BED.get();

          getVariantBuilder(keylimeBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/keylime_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
          foodBed fingerlimeBed = foodblockcompatregistry.FINGERLIME_BED.get();

          getVariantBuilder(fingerlimeBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/fingerlime_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
          foodBed grapefruitBed = foodblockcompatregistry.GRAPEFRUIT_BED.get();

          getVariantBuilder(grapefruitBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/grapefruit_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
          foodBed pomeloBed = foodblockcompatregistry.POMELO_BED.get();

          getVariantBuilder(pomeloBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pomelo_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          foodBed cornBed = foodblockcompatregistry.CORN_BED.get();

          getVariantBuilder(cornBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          foodBed onionBed = foodblockcompatregistry.ONION_BED.get();

          getVariantBuilder(onionBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
          foodBed tomatoBed = foodblockcompatregistry.TOMATO_BED.get();

          getVariantBuilder(tomatoBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/tomato_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
          foodBed pecanBed = foodblockcompatregistry.PECAN_BED.get();

          getVariantBuilder(pecanBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/pecan_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
          foodBed almondBed = foodblockcompatregistry.ALMOND_BED.get();

          getVariantBuilder(almondBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/almond_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                             Cabinet                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //small
          smallFoodCabinet elderberryCabinet = foodblockcompatregistry.SMALL_ELDERBERRY_CABINET.get();

          getVariantBuilder(elderberryCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/elderberry_cabinet_open") : modLoc("block/elderberry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet elderberryMediumCabinet = foodblockcompatregistry.MEDIUM_ELDERBERRY_CABINET.get();

          getVariantBuilder(elderberryMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_elderberry_cabinet_open") : modLoc("block/medium_elderberry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         //small
          smallFoodCabinet juniperCabinet = foodblockcompatregistry.SMALL_JUNIPER_CABINET.get();

          getVariantBuilder(juniperCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/juniper_cabinet_open") : modLoc("block/juniper_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet juniperMediumCabinet = foodblockcompatregistry.MEDIUM_JUNIPER_CABINET.get();

          getVariantBuilder(juniperMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_juniper_cabinet_open") : modLoc("block/medium_juniper_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         //small
          smallFoodCabinet cherryCabinet = foodblockcompatregistry.SMALL_CHERRY_CABINET.get();

          getVariantBuilder(cherryCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/cherry_cabinet_open") : modLoc("block/cherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet cherryMediumCabinet = foodblockcompatregistry.MEDIUM_CHERRY_CABINET.get();

          getVariantBuilder(cherryMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_cherry_cabinet_open") : modLoc("block/medium_cherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------blackcherry-----------------------------------------------------------------------
         //small
          smallFoodCabinet blackcherryCabinet = foodblockcompatregistry.SMALL_BLACKCHERRY_CABINET.get();

          getVariantBuilder(blackcherryCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/blackcherry_cabinet_open") : modLoc("block/blackcherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet blackcherryMediumCabinet = foodblockcompatregistry.MEDIUM_BLACKCHERRY_CABINET.get();

          getVariantBuilder(blackcherryMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_blackcherry_cabinet_open") : modLoc("block/medium_blackcherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------peach-----------------------------------------------------------------------
         //small
          smallFoodCabinet peachCabinet = foodblockcompatregistry.SMALL_PEACH_CABINET.get();

          getVariantBuilder(peachCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/peach_cabinet_open") : modLoc("block/peach_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet peachMediumCabinet = foodblockcompatregistry.MEDIUM_PEACH_CABINET.get();

          getVariantBuilder(peachMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_peach_cabinet_open") : modLoc("block/medium_peach_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         //small
          smallFoodCabinet coconutCabinet = foodblockcompatregistry.SMALL_COCONUT_CABINET.get();

          getVariantBuilder(coconutCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/coconut_cabinet_open") : modLoc("block/coconut_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet coconutMediumCabinet = foodblockcompatregistry.MEDIUM_COCONUT_CABINET.get();

          getVariantBuilder(coconutMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_coconut_cabinet_open") : modLoc("block/medium_coconut_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         //small
          smallFoodCabinet orangeCabinet = foodblockcompatregistry.SMALL_ORANGE_CABINET.get();

          getVariantBuilder(orangeCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/orange_cabinet_open") : modLoc("block/orange_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet orangeMediumCabinet = foodblockcompatregistry.MEDIUM_ORANGE_CABINET.get();

          getVariantBuilder(orangeMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_orange_cabinet_open") : modLoc("block/medium_orange_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tangerine-----------------------------------------------------------------------
         //small
          smallFoodCabinet tangerineCabinet = foodblockcompatregistry.SMALL_TANGERINE_CABINET.get();

          getVariantBuilder(tangerineCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/tangerine_cabinet_open") : modLoc("block/tangerine_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet tangerineMediumCabinet = foodblockcompatregistry.MEDIUM_TANGERINE_CABINET.get();

          getVariantBuilder(tangerineMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_tangerine_cabinet_open") : modLoc("block/medium_tangerine_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------kumquat-----------------------------------------------------------------------
         //small
          smallFoodCabinet kumquatCabinet = foodblockcompatregistry.SMALL_KUMQUAT_CABINET.get();

          getVariantBuilder(kumquatCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/kumquat_cabinet_open") : modLoc("block/kumquat_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet kumquatMediumCabinet = foodblockcompatregistry.MEDIUM_KUMQUAT_CABINET.get();

          getVariantBuilder(kumquatMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_kumquat_cabinet_open") : modLoc("block/medium_kumquat_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------persimmon-----------------------------------------------------------------------
         //small
          smallFoodCabinet persimmonCabinet = foodblockcompatregistry.SMALL_PERSIMMON_CABINET.get();

          getVariantBuilder(persimmonCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/persimmon_cabinet_open") : modLoc("block/persimmon_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet persimmonMediumCabinet = foodblockcompatregistry.MEDIUM_PERSIMMON_CABINET.get();

          getVariantBuilder(persimmonMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_persimmon_cabinet_open") : modLoc("block/medium_persimmon_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------satsuma-----------------------------------------------------------------------
         //small
          smallFoodCabinet satsumaCabinet = foodblockcompatregistry.SMALL_SATSUMA_CABINET.get();

          getVariantBuilder(satsumaCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/satsuma_cabinet_open") : modLoc("block/satsuma_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet satsumaMediumCabinet = foodblockcompatregistry.MEDIUM_SATSUMA_CABINET.get();

          getVariantBuilder(satsumaMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_satsuma_cabinet_open") : modLoc("block/medium_satsuma_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------mandarin-----------------------------------------------------------------------
         //small
          smallFoodCabinet mandarinCabinet = foodblockcompatregistry.SMALL_MANDARIN_CABINET.get();

          getVariantBuilder(mandarinCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/mandarin_cabinet_open") : modLoc("block/mandarin_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet mandarinMediumCabinet = foodblockcompatregistry.MEDIUM_MANDARIN_CABINET.get();

          getVariantBuilder(mandarinMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_mandarin_cabinet_open") : modLoc("block/medium_mandarin_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lemon-----------------------------------------------------------------------
         //small
          smallFoodCabinet lemonCabinet = foodblockcompatregistry.SMALL_LEMON_CABINET.get();

          getVariantBuilder(lemonCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/lemon_cabinet_open") : modLoc("block/lemon_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet lemonMediumCabinet = foodblockcompatregistry.MEDIUM_LEMON_CABINET.get();

          getVariantBuilder(lemonMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_lemon_cabinet_open") : modLoc("block/medium_lemon_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------citron-----------------------------------------------------------------------
         //small
          smallFoodCabinet citronCabinet = foodblockcompatregistry.SMALL_CITRON_CABINET.get();

          getVariantBuilder(citronCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/citron_cabinet_open") : modLoc("block/citron_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet citronMediumCabinet = foodblockcompatregistry.MEDIUM_CITRON_CABINET.get();

          getVariantBuilder(citronMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_citron_cabinet_open") : modLoc("block/medium_citron_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------buddhashand-----------------------------------------------------------------------
         //small
          smallFoodCabinet buddhashandCabinet = foodblockcompatregistry.SMALL_BUDDHASHAND_CABINET.get();

          getVariantBuilder(buddhashandCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/buddhashand_cabinet_open") : modLoc("block/buddhashand_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet buddhashandMediumCabinet = foodblockcompatregistry.MEDIUM_BUDDHASHAND_CABINET.get();

          getVariantBuilder(buddhashandMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_buddhashand_cabinet_open") : modLoc("block/medium_buddhashand_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------lime-----------------------------------------------------------------------
         //small
          smallFoodCabinet limeCabinet = foodblockcompatregistry.SMALL_LIME_CABINET.get();

          getVariantBuilder(limeCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/lime_cabinet_open") : modLoc("block/lime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet limeMediumCabinet = foodblockcompatregistry.MEDIUM_LIME_CABINET.get();

          getVariantBuilder(limeMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_lime_cabinet_open") : modLoc("block/medium_lime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------keylime-----------------------------------------------------------------------
         //small
          smallFoodCabinet keylimeCabinet = foodblockcompatregistry.SMALL_KEYLIME_CABINET.get();

          getVariantBuilder(keylimeCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/keylime_cabinet_open") : modLoc("block/keylime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet keylimeMediumCabinet = foodblockcompatregistry.MEDIUM_KEYLIME_CABINET.get();

          getVariantBuilder(keylimeMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_keylime_cabinet_open") : modLoc("block/medium_keylime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------fingerlime-----------------------------------------------------------------------
         //small
          smallFoodCabinet fingerlimeCabinet = foodblockcompatregistry.SMALL_FINGERLIME_CABINET.get();

          getVariantBuilder(fingerlimeCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/fingerlime_cabinet_open") : modLoc("block/fingerlime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet fingerlimeMediumCabinet = foodblockcompatregistry.MEDIUM_FINGERLIME_CABINET.get();

          getVariantBuilder(fingerlimeMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_fingerlime_cabinet_open") : modLoc("block/medium_fingerlime_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------grapefruit-----------------------------------------------------------------------
         //small
          smallFoodCabinet grapefruitCabinet = foodblockcompatregistry.SMALL_GRAPEFRUIT_CABINET.get();

          getVariantBuilder(grapefruitCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/grapefruit_cabinet_open") : modLoc("block/grapefruit_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet grapefruitMediumCabinet = foodblockcompatregistry.MEDIUM_GRAPEFRUIT_CABINET.get();

          getVariantBuilder(grapefruitMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_grapefruit_cabinet_open") : modLoc("block/medium_grapefruit_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pomelo-----------------------------------------------------------------------
         //small
          smallFoodCabinet pomeloCabinet = foodblockcompatregistry.SMALL_POMELO_CABINET.get();

          getVariantBuilder(pomeloCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/pomelo_cabinet_open") : modLoc("block/pomelo_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet pomeloMediumCabinet = foodblockcompatregistry.MEDIUM_POMELO_CABINET.get();

          getVariantBuilder(pomeloMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_pomelo_cabinet_open") : modLoc("block/medium_pomelo_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
         //small
          smallFoodCabinet cornCabinet = foodblockcompatregistry.SMALL_CORN_CABINET.get();

          getVariantBuilder(cornCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/corn_cabinet_open") : modLoc("block/corn_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet cornMediumCabinet = foodblockcompatregistry.MEDIUM_CORN_CABINET.get();

          getVariantBuilder(cornMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_corn_cabinet_open") : modLoc("block/medium_corn_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
         //small
          smallFoodCabinet onionCabinet = foodblockcompatregistry.SMALL_ONION_CABINET.get();

          getVariantBuilder(onionCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/onion_cabinet_open") : modLoc("block/onion_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet onionMediumCabinet = foodblockcompatregistry.MEDIUM_ONION_CABINET.get();

          getVariantBuilder(onionMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_onion_cabinet_open") : modLoc("block/medium_onion_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------tomato-----------------------------------------------------------------------
         //small
          smallFoodCabinet tomatoCabinet = foodblockcompatregistry.SMALL_TOMATO_CABINET.get();

          getVariantBuilder(tomatoCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/tomato_cabinet_open") : modLoc("block/tomato_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet tomatoMediumCabinet = foodblockcompatregistry.MEDIUM_TOMATO_CABINET.get();

          getVariantBuilder(tomatoMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_tomato_cabinet_open") : modLoc("block/medium_tomato_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------pecan-----------------------------------------------------------------------
         //small
          smallFoodCabinet pecanCabinet = foodblockcompatregistry.SMALL_PECAN_CABINET.get();

          getVariantBuilder(pecanCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/pecan_cabinet_open") : modLoc("block/pecan_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet pecanMediumCabinet = foodblockcompatregistry.MEDIUM_PECAN_CABINET.get();

          getVariantBuilder(pecanMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_pecan_cabinet_open") : modLoc("block/medium_pecan_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------almond-----------------------------------------------------------------------
         //small
          smallFoodCabinet almondCabinet = foodblockcompatregistry.SMALL_ALMOND_CABINET.get();

          getVariantBuilder(almondCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/almond_cabinet_open") : modLoc("block/almond_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet almondMediumCabinet = foodblockcompatregistry.MEDIUM_ALMOND_CABINET.get();

          getVariantBuilder(almondMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_almond_cabinet_open") : modLoc("block/medium_almond_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
   };

}
    
