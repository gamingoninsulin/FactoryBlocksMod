package me.gamingoninsulin.factoryblocksmod.datagen;

import me.gamingoninsulin.factoryblocksmod.FactoryBlockMod;
import me.gamingoninsulin.factoryblocksmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FactoryBlockMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockItem(ModBlocks.YELLOW_HAZARD_BLOCK);
        blockItem(ModBlocks.ORANGE_HAZARD_BLOCK);
        blockItem(ModBlocks.WRAPPED_GOLD_CHAINS);
        blockItem(ModBlocks.WRAPPED_CHAINS);
        blockItem(ModBlocks.INDUSTRIAL_IRON_PILLAR);
        blockItem(ModBlocks.RUSTY_METAL_PLATING);
        blockItem(ModBlocks.INDUSTRIAL_IRON_BLOCK);

        blockWithItem(ModBlocks.RUSTY_BLOCK_1);
        blockWithItem(ModBlocks.RUSTY_BLOCK_2);
        blockWithItem(ModBlocks.METAL_BLOCK_1);
        blockWithItem(ModBlocks.METAL_BLOCK_2);
        blockWithItem(ModBlocks.METAL_BLOCK_3);
        blockWithItem(ModBlocks.METAL_BLOCK_4);
        blockWithItem(ModBlocks.PLATEX_BLOCK_1);
        blockWithItem(ModBlocks.GOLD_BLOCK_1);
        blockWithItem(ModBlocks.GOLD_BLOCK_2);
    }


    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("factoryblocks:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("factoryblocks:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
