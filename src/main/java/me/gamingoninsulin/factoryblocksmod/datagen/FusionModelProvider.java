package me.gamingoninsulin.factoryblocksmod.datagen;

import com.supermartijn642.fusion.api.model.DefaultModelTypes;
import com.supermartijn642.fusion.api.model.ModelInstance;
import com.supermartijn642.fusion.api.model.data.ConnectingModelDataBuilder;
import com.supermartijn642.fusion.api.predicate.DefaultConnectionPredicates;
import me.gamingoninsulin.factoryblocksmod.FactoryBlockMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;

public class FusionModelProvider extends com.supermartijn642.fusion.api.provider.FusionModelProvider {
    public FusionModelProvider( PackOutput output) {
        super(FactoryBlockMod.MODID, output);
    }

    @Override
    protected void generate() {

        // metal block
        var modelData_1 = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/yellow_hazard_block"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var instanceHazard_1 = ModelInstance.of(DefaultModelTypes.CONNECTING, modelData_1);
        this.addModel(new ResourceLocation("factoryblocks", "block/yellow_hazard_block"), instanceHazard_1);

        var modelData_2 = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/orange_hazard_block"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstance_2 = ModelInstance.of(DefaultModelTypes.CONNECTING, modelData_2);
        this.addModel(new ResourceLocation("factoryblocks", "block/orange_hazard_block"), modelInstance_2);

        // gold

    }
}
