package com.zgamelogic.mysticalforge.data;

import com.zgamelogic.mysticalforge.MysticalForge;
import com.zgamelogic.mysticalforge.data.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public abstract class MysticalForgeCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticalForge.MODID);


    public static final RegistryObject<CreativeModeTab> MYSTICAL_FORGE_PARTS_TAB = CREATIVE_MODE_TABS.register("mystical_forge_parts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mystical_forge_parts_tab"))
                    .displayItems((pParameters, pOutput) -> {

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> MYSTICAL_FORGE_TAB = CREATIVE_MODE_TABS.register("mystical_forge_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mystical_forge_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHOVEL_TEST.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
