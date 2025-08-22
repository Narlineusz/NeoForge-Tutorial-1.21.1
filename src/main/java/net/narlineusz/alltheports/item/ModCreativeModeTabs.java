package net.narlineusz.alltheports.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.narlineusz.alltheports.AllThePorts;
import net.narlineusz.alltheports.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllThePorts.MOD_Id);

    public static final Supplier<CreativeModeTab> ALL_THE_PORTS = CREATIVE_MODE_TAB.register("alltheports",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RABARBAR.get()))
                    .title(Component.translatable("creativetab.alltheports.rabarbar_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RABARBAR);
                        output.accept(ModBlocks.RABARBAR_CRATE);
                        output.accept(ModBlocks.THICK_BAMBOO);
                        output.accept(ModBlocks.COBBLED_GRAVEL);
                        output.accept(ModBlocks.FLINTY_GRAVEL);
                        output.accept(ModBlocks.FLINTY_GRAVEL_STONE);
                        output.accept(ModBlocks.GRAVEL_STONE);
                        output.accept(ModBlocks.FLINT_BLOCK);
                  }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
