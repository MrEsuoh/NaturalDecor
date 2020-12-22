package com.mresuoh.naturaldecor.init;

import com.mresuoh.naturaldecor.NaturalDecor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NaturalDecorBlocks {

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NaturalDecor.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> ACACIA_BONSAI = REGISTRY.register("acacia_bonsai",
            () -> new Block(Block.Properties.from(Blocks.GRASS).sound(SoundType.PLANT)));

}
