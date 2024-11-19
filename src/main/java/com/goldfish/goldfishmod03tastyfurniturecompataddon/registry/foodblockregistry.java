package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
}
