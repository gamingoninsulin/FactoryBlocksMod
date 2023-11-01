package me.gamingoninsulin.factoryblocksmod.creativetabs;

import me.gamingoninsulin.factoryblocksmod.FactoryBlockMod;
import me.gamingoninsulin.factoryblocksmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FactoryBlockMod.MODID);

    public static final RegistryObject<CreativeModeTab> FACTORY_TAB = CREATIVE_MODE_TABS.register("factory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HAZARD_BLOCK.get())).title(Component.translatable("creativemode_factory_tab")).displayItems(
             (Parameters, Output) -> {
                 Output.accept(ModBlocks.HAZARD_BLOCK.get());
                 Output.accept(ModBlocks.ORANGE_HAZARD_BLOCK.get());

                 Output.accept(ModBlocks.CLEAR_GLASS.get());
             }
            ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
