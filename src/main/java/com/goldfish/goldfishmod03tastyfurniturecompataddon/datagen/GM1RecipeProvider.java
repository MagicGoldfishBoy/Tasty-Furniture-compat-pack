package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockitemregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.ingotregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.mushregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.nuggetregistry;

//import com.goldfish.goldfishmod02tastyfurniture;
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

        public GM1RecipeProviderConcrete(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected void buildRecipes(RecipeOutput output) {
          buildMushRecipes(output);
          buildIngotRecipes(output);
          buildNuggetRecipes(output);
          buildBlockRecipes(output);
        }

      protected void buildMushRecipes(RecipeOutput output) {
        LOGGER.info("building mush recipes");
         //elderberry
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.ELDERBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', MUSHHAMMER_TAG)
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(MUSHHAMMER_TAG))
            .save(output);
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
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_elderberry_mush", has(mushregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_elderberry_mush", has(mushregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotregistry.ELDERBERRY_INGOT.get(), 9)
            .requires(foodblockitemregistry.ELDERBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_elderberry_block", has(foodblockitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockitemregistry.ELDERBERRY_BLOCK_ITEM.get(), 1)
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotregistry.ELDERBERRY_INGOT.get()))
        .save(output); 
      }
      
        
  }
}
