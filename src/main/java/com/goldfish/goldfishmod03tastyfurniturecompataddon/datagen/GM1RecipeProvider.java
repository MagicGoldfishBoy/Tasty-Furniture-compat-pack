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
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "elderberries")
        );
       public static final TagKey<Item> JUNIPER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "juniper_berries")
        );
       public static final TagKey<Item> CHERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "cherries")
        );
       public static final TagKey<Item> COCONUT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "coconuts")
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
          buildBarrelRecipes(output);
          buildChairRecipes(output);
          buildBedRecipes(output);
          buildCabinetRecipes(output);
        }

 protected void buildMushRecipes(RecipeOutput output) {
        LOGGER.info("building mush recipes");
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_most_advanced_mushhammer");
      }
 protected void buildIngotRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.JUNIPER_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetregistry.JUNIPER_NUGGET.get())
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output, "juniper_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.JUNIPER_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.JUNIPER_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_juniper_mush", has(mushcompatregistry.JUNIPER_MUSH.get()))
            .save(output, "juniper_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.JUNIPER_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.JUNIPER_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_juniper_mush", has(mushcompatregistry.JUNIPER_MUSH.get()))
            .save(output, "juniper_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.JUNIPER_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
            .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
            .save(output, "juniper_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.CHERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHERRY_NUGGET.get())
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output, "cherry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.CHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.CHERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_cherry_mush", has(mushcompatregistry.CHERRY_MUSH.get()))
            .save(output, "cherry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.CHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.CHERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_cherry_mush", has(mushcompatregistry.CHERRY_MUSH.get()))
            .save(output, "cherry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.CHERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
            .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
            .save(output, "cherry_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotregistry.COCONUT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetregistry.COCONUT_NUGGET.get())
            .unlockedBy("has_coconut_nugget", has(nuggetregistry.COCONUT_NUGGET.get()))
            .save(output, "coconut_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.COCONUT_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.COCONUT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_coconut_mush", has(mushcompatregistry.COCONUT_MUSH.get()))
            .save(output, "coconut_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.COCONUT_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.COCONUT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_coconut_mush", has(mushcompatregistry.COCONUT_MUSH.get()))
            .save(output, "coconut_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.COCONUT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
            .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
            .save(output, "coconut_ingot_from_unpacking");
      }
 protected void buildNuggetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.ELDERBERRY_NUGGET.get(), 9)
        .requires(ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.JUNIPER_NUGGET.get(), 9)
        .requires(ingotregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.CHERRY_NUGGET.get(), 9)
        .requires(ingotregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetregistry.COCONUT_NUGGET.get(), 9)
        .requires(ingotregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotregistry.COCONUT_INGOT.get()))
        .save(output);
      }
 protected void buildBlockRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_block_from_juniper_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_chiseled_block_from_juniper_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_tiles_block_from_juniper_block_stonecutting");
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_block_from_cherry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_chiseled_block_from_cherry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_tiles_block_from_cherry_block_stonecutting");
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotregistry.COCONUT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_block_from_coconut_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_chiseled_block_from_coconut_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_tiles_block_from_coconut_block_stonecutting");
      }
 protected void buildSlabRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.JUNIPER_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_juniper_bricks_block", has(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_slab_from_juniper_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CHERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_cherry_bricks_block", has(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_slab_from_cherry_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotregistry.COCONUT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.COCONUT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_coconut_bricks_block", has(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_slab_from_coconut_bricks_block_stonecutting");
      }
 protected void buildStairsRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.JUNIPER_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_juniper_bricks_block", has(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_stairs_from_juniper_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CHERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_cherry_bricks_block", has(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_stairs_from_cherry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotregistry.COCONUT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.COCONUT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_coconut_bricks_block", has(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_stairs_from_coconut_bricks_block_stonecutting");
      }
 protected void buildBarsRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
         .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.JUNIPER_NUGGET.get())
         .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.CHERRY_NUGGET.get())
         .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetregistry.COCONUT_NUGGET.get())
         .unlockedBy("has_coconut_nugget", has(nuggetregistry.COCONUT_NUGGET.get()))
         .save(output);
      }
 protected void buildDoorRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotregistry.ELDERBERRY_INGOT.get())
         .unlockedBy("has_elderberry_nugget", has(ingotregistry.ELDERBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotregistry.JUNIPER_INGOT.get())
         .unlockedBy("has_juniper_nugget", has(ingotregistry.JUNIPER_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotregistry.CHERRY_INGOT.get())
         .unlockedBy("has_cherry_nugget", has(ingotregistry.CHERRY_INGOT.get()))
         .save(output);
      }
 protected void buildButtonRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetregistry.ELDERBERRY_NUGGET.get())
       .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BUTTON_ITEM.get(), 1)
       .requires(nuggetregistry.JUNIPER_NUGGET.get())
       .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetregistry.CHERRY_NUGGET.get())
       .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
       .save(output);
      }
 protected void buildFenceRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotregistry.JUNIPER_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotregistry.JUNIPER_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotregistry.CHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotregistry.CHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
          .save(output);        
      }
 protected void buildPressurePlateRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_elderberry_block",  has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .unlockedBy("has_juniper_block",  has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
        .unlockedBy("has_cherry_block",  has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildSignRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_elderberry_ingot",  has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotregistry.JUNIPER_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_juniper_ingot",  has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotregistry.CHERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_cherry_ingot",  has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildTrapDoorRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildLampRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotregistry.JUNIPER_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotregistry.CHERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildCarpetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
        .unlockedBy("has_elderberry_nugget", has(nuggetregistry.ELDERBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetregistry.JUNIPER_NUGGET.get())
        .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetregistry.CHERRY_NUGGET.get())
        .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
        .save(output);
      }
 protected void buildLanternRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.JUNIPER_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.JUNIPER_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetregistry.CHERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output);
      }
 protected void buildChainRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetregistry.ELDERBERRY_NUGGET.get())
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetregistry.JUNIPER_NUGGET.get())
        .define('B', ingotregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetregistry.CHERRY_NUGGET.get())
        .define('B', ingotregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildLadderRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildTableRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .define('B', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .define('B', ingotregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .define('B', ingotregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildTorchRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
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
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.JUNIPER_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.JUNIPER_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.JUNIPER_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_juniper_nugget", has(nuggetregistry.JUNIPER_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetregistry.CHERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_cherry_nugget", has(nuggetregistry.CHERRY_NUGGET.get()))
            .save(output);
      } 
 protected void buildFurnaceRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotregistry.JUNIPER_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotregistry.CHERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
        .save(output);
      }
 protected void buildPathRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
        .save(output);        
      }
 protected void buildBarrelRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildChairRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotregistry.JUNIPER_INGOT.get())
        .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotregistry.CHERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
        .save(output);
      } 
 protected void buildBedRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.ELDERBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.ELDERBERRY_CARPET_ITEM.get())
           .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.JUNIPER_INGOT.get())
           .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.JUNIPER_CARPET_ITEM.get())
           .unlockedBy("has_juniper_ingot", has(ingotregistry.JUNIPER_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotregistry.CHERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.CHERRY_CARPET_ITEM.get())
           .unlockedBy("has_cherry_ingot", has(ingotregistry.CHERRY_INGOT.get()))
           .save(output);
      }
 protected void buildCabinetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_ELDERBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_ELDERBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_ELDERBERRY_CABINET_ITEM.get())
         .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_JUNIPER_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_JUNIPER_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_JUNIPER_CABINET_ITEM.get())
         .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_CHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_CHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_CHERRY_CABINET_ITEM.get())
         .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
         .save(output);
      }
  }
}
