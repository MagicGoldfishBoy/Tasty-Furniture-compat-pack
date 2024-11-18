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

        //items
     //   Item mushhammer = goldfishmod02tastyfurniture.mushhammer.get();  

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
        }

        protected void buildMushRecipes(RecipeOutput output) {
          LOGGER.info("building mush recipes");
                  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushregistry.ELDERBERRY_MUSH.get(), 1)
                  .pattern("ABB")
                  .pattern("BB ")
                  .pattern("   ")
                  .define('A', MUSHHAMMER_TAG)
                  .define('B', ELDERBERRY_TAG)
                  .unlockedBy("has_mush_hammer", has(MUSHHAMMER_TAG))
                  .save(output);
      }
      
        
  }
}
