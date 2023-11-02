package me.gamingoninsulin.factoryblocksmod.datagen.loot;

import me.gamingoninsulin.factoryblocksmod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {


    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.YELLOW_HAZARD_BLOCK.get());
        this.dropSelf(ModBlocks.ORANGE_HAZARD_BLOCK.get());

        this.dropSelf(ModBlocks.GOLD_BLOCK_1.get());
        this.dropSelf(ModBlocks.GOLD_BLOCK_2.get());

        this.dropSelf(ModBlocks.METAL_BLOCK_1.get());
        this.dropSelf(ModBlocks.METAL_BLOCK_2.get());
        this.dropSelf(ModBlocks.METAL_BLOCK_3.get());
        this.dropSelf(ModBlocks.METAL_BLOCK_4.get());

        this.dropSelf(ModBlocks.PLATEX_BLOCK_1.get());

        this.dropSelf(ModBlocks.RUSTY_BLOCK_1.get());
        this.dropSelf(ModBlocks.RUSTY_BLOCK_2.get());

        this.dropSelf(ModBlocks.WRAPPED_GOLD_CHAINS.get());
        this.dropSelf(ModBlocks.WRAPPED_CHAINS.get());
        this.dropSelf(ModBlocks.INDUSTRIAL_IRON_PILLAR.get());
        this.dropSelf(ModBlocks.RUSTY_METAL_PLATING.get());
        this.dropSelf(ModBlocks.INDUSTRIAL_IRON_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
