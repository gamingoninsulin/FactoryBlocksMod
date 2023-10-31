package me.gamingoninsulin.factoryblocksmod.datagen;

import me.gamingoninsulin.factoryblocksmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {

//        SingleItemRecipeBuilder builder = SingleItemRecipeBuilder.stonecutting(Blocks.IRON_BLOCK, RecipeCategory.MISC, ModBlocks.HAZARD_BLOCK)
//                .unlockedBy("criteria", "criteria")// How the recipe is unlocked
//                .group("factory")
//                .save(writer); // Add data to builder
    }
}
