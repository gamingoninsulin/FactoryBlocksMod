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
        var modelData = ConnectingModelDataBuilder.builder()
                .parent(new ResourceLocation("minecraft", "block/cube_all"))
                .texture("all", new ResourceLocation("factoryblocks", "block/hazard_block"))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstance = ModelInstance.of(DefaultModelTypes.CONNECTING, modelData);

        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-02"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-03"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-04"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-05"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-06"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-07"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-08"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-09"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-10"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-11"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-12"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-13"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-14"), modelInstance);
        this.addModel(new ResourceLocation("factoryblocks", "block/hazard/hazard_block-15"), modelInstance);
    }
}
