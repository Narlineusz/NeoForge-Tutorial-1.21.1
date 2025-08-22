package net.narlineusz.alltheports.item;

import net.minecraft.world.item.Item;
import net.narlineusz.alltheports.AllThePorts;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllThePorts.MOD_Id);

    public static final DeferredItem<Item> RABARBAR = ITEMS.register("rabarbar",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
