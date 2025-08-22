package net.narlineusz.alltheports.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.narlineusz.alltheports.AllThePorts;
import net.narlineusz.alltheports.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AllThePorts.MOD_Id);

    public static final DeferredBlock<Block> RABARBAR_CRATE = registerBlock("rabarbar_crate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> THICK_BAMBOO = registerBlock("thick_bamboo",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.BAMBOO)));

    public static final DeferredBlock<Block> COBBLED_GRAVEL = registerBlock("cobbled_gravel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> GRAVEL_STONE = registerBlock("gravel_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> FLINTY_GRAVEL = registerBlock("flinty_gravel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> FLINTY_GRAVEL_STONE = registerBlock("flinty_gravel_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> FLINT_BLOCK = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f, 3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
