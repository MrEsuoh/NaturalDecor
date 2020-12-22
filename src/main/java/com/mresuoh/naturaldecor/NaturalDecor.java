package com.mresuoh.naturaldecor;

import com.mresuoh.naturaldecor.init.NaturalDecorBlocks;
import com.mresuoh.naturaldecor.init.NaturalDecorItems;
import com.mresuoh.naturaldecor.util.ClientEventHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(NaturalDecor.MOD_ID)
public class NaturalDecor
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "naturaldecor";

    public NaturalDecor() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);

        NaturalDecorItems.REGISTRY.register(modEventBus);
        NaturalDecorBlocks.REGISTRY.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ClientEventHandler.init();
    }

    public final static ItemGroup GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(NaturalDecorItems.ACACIA_BONSAI.get());
        }
    };

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

}
