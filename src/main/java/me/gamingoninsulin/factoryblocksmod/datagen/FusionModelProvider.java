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
        var modelDataYHazard = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/hazard_block"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstanceYHazard = ModelInstance.of(DefaultModelTypes.CONNECTING, modelDataYHazard);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard_block"), modelInstanceYHazard);



        var modelDataOHazard = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/orange_hazard_block"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstanceOHazard = ModelInstance.of(DefaultModelTypes.CONNECTING, modelDataOHazard);
        this.addModel(new ResourceLocation("factoryblocks", "block/orange_hazard_block"), modelInstanceOHazard);



        var modelDataCGlass = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/clear_glass"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstanceCGlass = ModelInstance.of(DefaultModelTypes.CONNECTING, modelDataCGlass);
        this.addModel(new ResourceLocation("factoryblocks", "block/clear_glass"), modelInstanceCGlass);
    }
}
