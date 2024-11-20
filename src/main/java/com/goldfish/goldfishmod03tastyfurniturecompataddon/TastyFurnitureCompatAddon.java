package com.goldfish.goldfishmod03tastyfurniturecompataddon;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.client.renderer.foodChairEntityRenderer;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen.GM1BlockLootTableProvider;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen.GM1Datagen;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen.GM1LootTableProvider;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodEntityRegistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatitemregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodmaterialtyperegistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.ingotregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.mushcompatregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.nuggetregistry;
import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


@Mod(TastyFurnitureCompatAddon.MODID)
public class TastyFurnitureCompatAddon
{
    public static final String MODID = "goldfishmod03tastyfurniturecompataddon";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Blocks FOODBLOCK = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Blocks FOODBLOCKENTITY = DeferredRegister.createBlocks(MODID);

   // public static final DeferredRegister.Blocks FOODENTITY = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    
    public static final DeferredRegister.Items FOODWEAPON = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items MUSH = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODINGOT = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODNUGGET = DeferredRegister.createItems(MODID);

    public static final DeferredRegister.Items FOODBLOCKITEM = DeferredRegister.createItems(MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TASTY_FURNITURE_COMPAT_ADDON_TAB = CREATIVE_MODE_TABS.register("tasty_furniture_compat_addon_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tastyfurniturecompataddon"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> mushcompatregistry.ELDERBERRY_MUSH.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.acceptAll(mushcompatregistry.MUSH.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(ingotregistry.FOODINGOT.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(nuggetregistry.FOODNUGGET.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
                output.acceptAll(foodblockcompatitemregistry.FOODBLOCKITEM.getEntries().stream().map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> gettab(){
              return TASTY_FURNITURE_COMPAT_ADDON_TAB;
    }

    public TastyFurnitureCompatAddon(IEventBus modEventBus, ModContainer modContainer)
    {

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(GM1Datagen::gatherData);

        modEventBus.addListener(datagathering::onGatherData);

        BLOCKS.register(modEventBus);

        WoodType.register(foodmaterialtyperegistry.ELDERBERRYWOODMAT);

        foodblockregistry.FOODBLOCK.register(modEventBus);

        foodblockregistry.FOODBLOCKENTITY.register(modEventBus);

        foodEntityRegistry.FOODENTITY.register(modEventBus);

        ITEMS.register(modEventBus);

        mushcompatregistry.MUSH.register(modEventBus);

        ingotregistry.FOODINGOT.register(modEventBus);

        nuggetregistry.FOODNUGGET.register(modEventBus);

        foodblockcompatitemregistry.FOODBLOCKITEM.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from the VOID");
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());      
        }

        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(foodblockregistry.ELDERBERRY_SIGN_ENTITY.get(), SignRenderer::new);
        event.registerEntityRenderer(foodEntityRegistry.CHAIR_ENTITY.get(), foodChairEntityRenderer::new);
        }
        
    }


public class datagathering {
     @SubscribeEvent
     public static void onGatherData(GatherDataEvent event) {

        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeClient(), new GM1LootTableProvider(output, lookupProvider));
        new SubProviderEntry(
            GM1BlockLootTableProvider::new,
            LootContextParamSets.EMPTY
        );
        LOGGER.info("hello from robot heck");
        } catch (RuntimeException e) {
            LOGGER.error("failed to generate blockstates");
        }
        
        }
       }

       
}

//Note to self: "recipes" is now "recipe" in 1.21.

//command to reinstall java 17 below. It likes to uninstall itself for some reason, only computer jesus knows why
//sudo apt install openjdk-17-jdk openjdk-17-jre