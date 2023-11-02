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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.YELLOW_HAZARD_BLOCK.get())).title(Component.translatable("creativemode_factory_tab")).displayItems(
             (Parameters, Output) -> {
                 Output.accept(ModBlocks.YELLOW_HAZARD_BLOCK.get());
                 Output.accept(ModBlocks.ORANGE_HAZARD_BLOCK.get());

                 Output.accept(ModBlocks.GOLD_BLOCK_1.get());
                 Output.accept(ModBlocks.GOLD_BLOCK_2.get());

                 Output.accept(ModBlocks.METAL_BLOCK_1.get());
                 Output.accept(ModBlocks.METAL_BLOCK_2.get());
                 Output.accept(ModBlocks.METAL_BLOCK_3.get());
                 Output.accept(ModBlocks.METAL_BLOCK_4.get());

                 Output.accept(ModBlocks.PLATEX_BLOCK_1.get());

                 Output.accept(ModBlocks.RUSTY_BLOCK_1.get());
                 Output.accept(ModBlocks.RUSTY_BLOCK_2.get());

                 Output.accept(ModBlocks.RUSTY_METAL_PLATING.get());
                 Output.accept(ModBlocks.INDUSTRIAL_IRON_BLOCK.get());
                 Output.accept(ModBlocks.INDUSTRIAL_IRON_PILLAR.get());
                 Output.accept(ModBlocks.WRAPPED_CHAINS.get());
                 Output.accept(ModBlocks.WRAPPED_GOLD_CHAINS.get());
             }
            ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
