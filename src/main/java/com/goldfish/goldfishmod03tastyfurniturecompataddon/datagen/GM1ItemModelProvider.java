package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod03tastyfurniturecompataddon", existingFileHelper);
    }

        @Override
        protected void registerModels() {

      //.........elderberry
       //mush
        withExistingParent("elderberry_mush", mcLoc("item/generated")).texture("layer0", "item/elderberry_mush");
       //ingot
        withExistingParent("elderberry_ingot", mcLoc("item/generated")).texture("layer0", "item/elderberry_ingot");
       //nugget
        withExistingParent("elderberry_nugget", mcLoc("item/generated")).texture("layer0", "item/elderberry_nugget");
       //block
        withExistingParent("elderberry_block_item", modLoc("block/elderberry_block"));
  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();