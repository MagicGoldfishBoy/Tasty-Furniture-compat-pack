package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatitemregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.ingotregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.mushcompatregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.nuggetregistry;

import com.goldfish.goldfishmod02tastyfurniture.block.*;
import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.mushregistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

public abstract class GM1RecipeProvider extends RecipeProvider {

    private PackOutput output;
    private CompletableFuture<Provider> lookupProvider;

    public GM1RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    public static class GM1RecipeProviderConcrete extends GM1RecipeProvider {

      //tags
       public static final TagKey<Item> ELDERBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("c", "elderberries")
        );
       public static final TagKey<Item> MUSHHAMMER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod02tastyfurniture", "mushhammer")
        );
       public static final TagKey<Item> ADVANCED_MUSHHAMMER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod02tastyfurniture", "advanced_mushhammer")
        );
       public static final TagKey<Item> MORE_ADVANCED_MUSHHAMMER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod02tastyfurniture", "more_advanced_mushhammer")
        );
       public static final TagKey<Item> MOST_ADVANCED_MUSHHAMMER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod02tastyfurniture", "most_advanced_mushhammer")
        );

        public GM1RecipeProviderConcrete(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected void buildRecipes(RecipeOutput output) {
          buildMushRecipes(output);
          buildIngotRecipes(output);
          buildNuggetRecipes(output);
          buildBlockRecipes(output);
          buildSlabRecipes(output);
          buildStairsRecipes(output);
          buildBarsRecipes(output);
          buildDoorRecipes(output);
          buildButtonRecipes(output);
          buildFenceRecipes(output);
          buildPressurePlateRecipes(output);
          buildSignRecipes(output);
          buildTrapDoorRecipes(output);
          buildLampRecipes(output);
          buildCarpetRecipes(output);
          buildLanternRecipes(output);
          buildChainRecipes(output);
          buildLadderRecipes(output);
          buildTableRecipes(output);
          buildTorchRecipes(output);
          buildFurnaceRecipes(output);
          buildPathRecipes(output);
        }

      protected void buildMushRecipes(RecipeOutput output) {
        LOGGER.info("building mush recipes");
         //elderberry
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', MUSHHAMMER_TAG)
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', ADVANCED_MUSHHAMMER_TAG)
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(ADVANCED_MUSHHAMMER_TAG))
            .save(output, "elderberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', MORE_ADVANCED_MUSHHAMMER_TAG)
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(MORE_ADVANCED_MUSHHAMMER_TAG))
            .save(output, "elderberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', MOST_ADVANCED_MUSHHAMMER_TAG)
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(MOST_ADVANCED_MUSHHAMMER_TAG))
            .save(output, "elderberry_mush_from_most_advanced_mushhammer");
      }
      protected void buildIngotRecipes(RecipeOutput output) {
       //elderberry
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.ELDERBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output, "elderberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_elderberry_mush", has(mushcompatregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_elderberry_mush", has(mushcompatregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.ELDERBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
            .save(output, "elderberry_ingot_from_unpacking");
      }
      protected void buildNuggetRecipes(RecipeOutput output) {
       //elderberry
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.ELDERBERRY_NUGGET.get(), 9)
        .requires(ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildBlockRecipes(RecipeOutput output) {
       //elderberry
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_block_from_elderberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_chiseled_block_from_elderberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_tiles_block_from_elderberry_block_stonecutting");
      }
      protected void buildSlabRecipes(RecipeOutput output) {
       //elderberry
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ELDERBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_elderberry_bricks_block", has(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_slab_from_elderberry_bricks_block_stonecutting");
      }
      protected void buildStairsRecipes(RecipeOutput output) {
       //elderberry
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ELDERBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_elderberry_bricks_block", has(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_stairs_from_elderberry_bricks_block_stonecutting");
      }
      protected void buildBarsRecipes(RecipeOutput output) {
       //elderberry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
         .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
         .save(output);
      }
      protected void buildDoorRecipes(RecipeOutput output) {
       //elderberry
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotregistry.ELDERBERRY_INGOT.get())
         .unlockedBy("has_elderberry_nugget", has(ingotregistry.ELDERBERRY_INGOT.get()))
         .save(output);
      }
      protected void buildButtonRecipes(RecipeOutput output) {
       //elderberry
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetregistry.ELDERBERRY_NUGGET.get())
       .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
       .save(output);
      }
      protected void buildFenceRecipes(RecipeOutput output) {
       //elderberry
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotregistry.ELDERBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotregistry.ELDERBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
          .save(output);        
      }
      protected void buildPressurePlateRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_elderberry_block",  has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);
      }
      protected void buildSignRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_elderberry_ingot",  has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildTrapDoorRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildLampRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
      }
      protected void buildCarpetRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
        .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
        .save(output);
      }
      protected void buildLanternRecipes(RecipeOutput output) {
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
      }
      protected void buildChainRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildLadderRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildTableRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildTorchRecipes(RecipeOutput output) {
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.ELDERBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.ELDERBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.ELDERBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
      } 
      protected void buildFurnaceRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
      }
      protected void buildPathRecipes(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);        
      }
  }
}
