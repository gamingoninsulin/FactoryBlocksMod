package me.gamingoninsulin.factoryblocksmod.block;

import me.gamingoninsulin.factoryblocksmod.FactoryBlockMod;
import me.gamingoninsulin.factoryblocksmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FactoryBlockMod.MODID);


    // ############################################################################################################## \\


    public static final RegistryObject<Block> YELLOW_HAZARD_BLOCK = registerBlock("yellow_hazard_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> ORANGE_HAZARD_BLOCK = registerBlock("orange_hazard_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RUSTY_BLOCK_1 = registerBlock("rusty_block_1",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RUSTY_BLOCK_2 = registerBlock("rusty_block_2",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> PLATEX_BLOCK_1 = registerBlock("platex_block_1",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> METAL_BLOCK_1 = registerBlock("metal_block_1",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> METAL_BLOCK_2 = registerBlock("metal_block_2",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> METAL_BLOCK_3 = registerBlock("metal_block_3",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> METAL_BLOCK_4 = registerBlock("metal_block_4",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> GOLD_BLOCK_1 = registerBlock("gold_block_1",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> GOLD_BLOCK_2 = registerBlock("gold_block_2",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_BLOCK = registerBlock("industrial_iron_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_PILLAR = registerBlock("industrial_iron_pillar",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> RUSTY_METAL_PLATING = registerBlock("rusty_sheet_metal_paneling",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> WRAPPED_GOLD_CHAINS = registerBlock("wrapped_gold_chains",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> WRAPPED_CHAINS = registerBlock("wrapped_chains",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.NETHERITE_BLOCK)));


    // ############################################################################################################## \\


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
