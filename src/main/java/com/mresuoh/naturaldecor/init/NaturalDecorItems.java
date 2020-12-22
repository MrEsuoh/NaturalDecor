package com.mresuoh.naturaldecor.init;

import com.mresuoh.naturaldecor.NaturalDecor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NaturalDecorItems {

    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NaturalDecor.MOD_ID);

    //Blocks
    public static final RegistryObject<BlockItem> ACACIA_BONSAI = REGISTRY.register("acacia_bonsai",
            () -> new BlockItem(NaturalDecorBlocks.ACACIA_BONSAI.get(), new Item.Properties().group(NaturalDecor.GROUP)));


}
