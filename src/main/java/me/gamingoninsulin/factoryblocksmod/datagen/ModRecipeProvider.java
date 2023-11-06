package me.gamingoninsulin.factoryblocksmod.datagen;

import me.gamingoninsulin.factoryblocksmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
    // IRON

        // yellow hazard block
        SingleItemRecipeBuilder builderYellowHazard = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.YELLOW_HAZARD_BLOCK.get(), 1);
        builderYellowHazard.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderYellowHazard.save(writer);

        // yellow hazard block REVERT
        SingleItemRecipeBuilder builderYellowHazardRevert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.YELLOW_HAZARD_BLOCK.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderYellowHazardRevert.unlockedBy("has_item",has(ModBlocks.YELLOW_HAZARD_BLOCK.get()));
        builderYellowHazardRevert.save(writer, "yellow_hazard_block_iron_block");

        // #########################

        // orange hazard block
        SingleItemRecipeBuilder builderOrangeHazard = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.ORANGE_HAZARD_BLOCK.get(), 1);
        builderOrangeHazard.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderOrangeHazard.save(writer);

        // orange hazard block REVERT
        SingleItemRecipeBuilder builderOrangeHazardRevert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.ORANGE_HAZARD_BLOCK.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderOrangeHazardRevert.unlockedBy("has_item", has(ModBlocks.ORANGE_HAZARD_BLOCK.get()));
        builderOrangeHazardRevert.save(writer, "orange_hazard_block_iron_block");

        // #########################

        // industrial iron block
        SingleItemRecipeBuilder builderIndustrialBlock = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.INDUSTRIAL_IRON_BLOCK.get(), 1);
        builderIndustrialBlock.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderIndustrialBlock.save(writer);

        // industrial iron block REVERT
        SingleItemRecipeBuilder builderIndustrialBlockRevert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.INDUSTRIAL_IRON_BLOCK.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderIndustrialBlockRevert.unlockedBy("has_item", has(ModBlocks.INDUSTRIAL_IRON_BLOCK.get()));
        builderIndustrialBlockRevert.save(writer, "industrial_iron_block_iron_block");

        // #########################

        // industrial iron pillar
        SingleItemRecipeBuilder builderIndustrialPillar = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.INDUSTRIAL_IRON_PILLAR.get(), 1);
        builderIndustrialPillar.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderIndustrialPillar.save(writer);

        // industrial iron pillar REVERT
        SingleItemRecipeBuilder builderIndustrialPillarRevert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.INDUSTRIAL_IRON_PILLAR.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderIndustrialPillarRevert.unlockedBy("has_item", has(ModBlocks.INDUSTRIAL_IRON_PILLAR.get()));
        builderIndustrialPillarRevert.save(writer, "industrial_iron_pillar_iron_block");

        // #########################

        // metal block 1
        SingleItemRecipeBuilder builderMetalBlock_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.METAL_BLOCK_1.get(), 1);
        builderMetalBlock_1.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderMetalBlock_1.save(writer);

        // metal block 1 REVERT
        SingleItemRecipeBuilder builderMetalBlock_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.METAL_BLOCK_1.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderMetalBlock_1Revert.unlockedBy("has_item", has(ModBlocks.METAL_BLOCK_1.get()));
        builderMetalBlock_1Revert.save(writer, "metal_block_1_iron_block");

        // #########################

        // metal block 2
        SingleItemRecipeBuilder builderMetalBlock_2 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.METAL_BLOCK_2.get(), 1);
        builderMetalBlock_2.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderMetalBlock_2.save(writer);

        // metal block 2 REVERT
        SingleItemRecipeBuilder builderMetalBlock_2Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.METAL_BLOCK_2.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderMetalBlock_2Revert.unlockedBy("has_item", has(ModBlocks.METAL_BLOCK_2.get()));
        builderMetalBlock_2Revert.save(writer, "metal_block_2_iron_block");

        // #########################

        // metal block 3
        SingleItemRecipeBuilder builderMetalBlock_3 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.METAL_BLOCK_3.get(), 1);
        builderMetalBlock_3.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderMetalBlock_3.save(writer);

        // metal block 3 REVERT
        SingleItemRecipeBuilder builderMetalBlock_3Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.METAL_BLOCK_3.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderMetalBlock_3Revert.unlockedBy("has_item",has(ModBlocks.METAL_BLOCK_3.get()));
        builderMetalBlock_3Revert.save(writer, "metal_block_3_iron_block");

        // #########################

        // metal block 4
        SingleItemRecipeBuilder builderMetalBlock_4 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.METAL_BLOCK_4.get(), 1);
        builderMetalBlock_4.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderMetalBlock_4.save(writer);

        // metal block 4 REVERT
        SingleItemRecipeBuilder builderMetalBlock_4Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.METAL_BLOCK_4.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderMetalBlock_4Revert.unlockedBy("has_item", has(ModBlocks.METAL_BLOCK_4.get()));
        builderMetalBlock_4Revert.save(writer, "metal_block_4_iron_block");

        // #########################

        // platex 1
        SingleItemRecipeBuilder builderPlatex_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.PLATEX_BLOCK_1.get(), 1);
        builderPlatex_1.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderPlatex_1.save(writer);

        // platex 1 REVERT
        SingleItemRecipeBuilder builderPlatex_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.PLATEX_BLOCK_1.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderPlatex_1Revert.unlockedBy("has_item", has(ModBlocks.PLATEX_BLOCK_1.get()));
        builderPlatex_1Revert.save(writer, "platex_iron_block");

        // #########################

        // rusty 1
        SingleItemRecipeBuilder builderRustyBlock_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.RUSTY_BLOCK_1.get(), 1);
        builderRustyBlock_1.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderRustyBlock_1.save(writer);

        // rusty 1 REVERT
        SingleItemRecipeBuilder builderRustyBlock_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RUSTY_BLOCK_1.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderRustyBlock_1Revert.unlockedBy("has_item", has(ModBlocks.RUSTY_BLOCK_1.get()));
        builderRustyBlock_1Revert.save(writer,"rusty_block_1_iron_block");

        // #########################

        // rusty 2
        SingleItemRecipeBuilder builderRustyBlock_2 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.RUSTY_BLOCK_2.get(), 1);
        builderRustyBlock_2.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderRustyBlock_2.save(writer);

        // rusty 2 REVERT
        SingleItemRecipeBuilder builderRustyBlock_2Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RUSTY_BLOCK_2.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderRustyBlock_2Revert.unlockedBy("has_item", has(ModBlocks.RUSTY_BLOCK_2.get()));
        builderRustyBlock_2Revert.save(writer, "rusty_block_2_iron_block");

        // #########################

        // wrapped chains
        SingleItemRecipeBuilder builderWrappedChains_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.WRAPPED_CHAINS.get(), 1);
        builderWrappedChains_1.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderWrappedChains_1.save(writer);

        // wrapped chains REVERT
        SingleItemRecipeBuilder builderWrappedChains_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WRAPPED_CHAINS.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderWrappedChains_1Revert.unlockedBy("has_item", has(ModBlocks.WRAPPED_CHAINS.get()));
        builderWrappedChains_1Revert.save(writer, "wrapped_chains_iron_block");

        // #########################

        // rusty plating
        SingleItemRecipeBuilder builderRustyMetalPlating_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.IRON_BLOCK), RecipeCategory.MISC, ModBlocks.RUSTY_METAL_PLATING.get(), 1);
        builderRustyMetalPlating_1.unlockedBy("has_item", has(Blocks.IRON_BLOCK));
        builderRustyMetalPlating_1.save(writer);

        // rusty plating REVERT
        SingleItemRecipeBuilder builderRustyMetalPlating_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.RUSTY_METAL_PLATING.get()), RecipeCategory.MISC, Blocks.IRON_BLOCK, 1);
        builderRustyMetalPlating_1Revert.unlockedBy("has_item", has(ModBlocks.RUSTY_METAL_PLATING.get()));
        builderRustyMetalPlating_1Revert.save(writer, "rusty_plating_iron_block");

    // GOLD

        // #########################

        // gold block 1
        SingleItemRecipeBuilder builderGoldBlock_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GOLD_BLOCK), RecipeCategory.MISC, ModBlocks.GOLD_BLOCK_1.get(), 1);
        builderGoldBlock_1.unlockedBy("has_item", has(Blocks.GOLD_BLOCK));
        builderGoldBlock_1.save(writer);

        // gold block 1 REVERT
        SingleItemRecipeBuilder builderGoldBlock_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GOLD_BLOCK_1.get()), RecipeCategory.MISC, Blocks.GOLD_BLOCK, 1);
        builderGoldBlock_1Revert.unlockedBy("has_item",has(ModBlocks.GOLD_BLOCK_1.get()));
        builderGoldBlock_1Revert.save(writer, "gold_block_1_gold_block");

        // #########################

        // gold block 2
        SingleItemRecipeBuilder builderGoldBlock_2 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GOLD_BLOCK), RecipeCategory.MISC, ModBlocks.GOLD_BLOCK_2.get(), 1);
        builderGoldBlock_2.unlockedBy("has_item", has(Blocks.GOLD_BLOCK));
        builderGoldBlock_2.save(writer);

        // gold block 2 REVERT
        SingleItemRecipeBuilder builderGoldBlock_2Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GOLD_BLOCK_2.get()), RecipeCategory.MISC, Blocks.GOLD_BLOCK, 1);
        builderGoldBlock_2Revert.unlockedBy("has_item", has(ModBlocks.GOLD_BLOCK_2.get()));
        builderGoldBlock_2Revert.save(writer, "gold_block_2_gold_block");

        // #########################

        // wrapped gold chains
        SingleItemRecipeBuilder builderWrappedGoldChains_1 = SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GOLD_BLOCK), RecipeCategory.MISC, ModBlocks.WRAPPED_GOLD_CHAINS.get(), 1);
        builderWrappedGoldChains_1.unlockedBy("has_item", has(Blocks.GOLD_BLOCK));
        builderWrappedGoldChains_1.save(writer);

        // wrapped gold chains REVERT
        SingleItemRecipeBuilder builderWrappedGoldChains_1Revert = SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WRAPPED_GOLD_CHAINS.get()), RecipeCategory.MISC, Blocks.GOLD_BLOCK, 1);
        builderWrappedGoldChains_1Revert.unlockedBy("has_item", has(ModBlocks.WRAPPED_GOLD_CHAINS.get()));
        builderWrappedGoldChains_1Revert.save(writer, "wrapped_gold_chains_to_gold_block");
    }
}
