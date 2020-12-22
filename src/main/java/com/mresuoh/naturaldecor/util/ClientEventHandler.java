package com.mresuoh.naturaldecor.util;

import com.mresuoh.naturaldecor.NaturalDecor;
import com.mresuoh.naturaldecor.init.NaturalDecorBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = NaturalDecor.MOD_ID)
public class ClientEventHandler {

    @OnlyIn(Dist.CLIENT)
    public static void init() {
        RenderTypeLookup.setRenderLayer(NaturalDecorBlocks.ACACIA_BONSAI.get(), RenderType.getCutout());
    }

}
