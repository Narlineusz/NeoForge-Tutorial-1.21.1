package net.narlineusz.alltheports.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.narlineusz.alltheports.AllThePorts;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllThePorts.MOD_Id);

    public static final DeferredItem<Item> RABARBAR = ITEMS.register("rabarbar",
            () -> new Item(new Item.Properties()));

    public static final Supplier<SwordItem> BABEL = ITEMS.register("babel_sword",
            () -> new SwordItem(
                    ModTiers.CUSTOM_TIER,
                    // properties z atrybutami
                    new Item.Properties().attributes(
                            SwordItem.createAttributes(ModTiers.CUSTOM_TIER, 3, -2.4f)
                    )
            ));
    private ModItems() {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
