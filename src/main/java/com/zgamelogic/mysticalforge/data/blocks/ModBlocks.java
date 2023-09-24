package com.zgamelogic.mysticalforge.data.blocks;

import com.zgamelogic.mysticalforge.MysticalForge;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysticalForge.MODID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
