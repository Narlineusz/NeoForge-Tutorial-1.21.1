package net.narlineusz.alltheports.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;

public final class ModTiers {

    // Jeśli chcesz własny tag "incorrect_for_*", możesz podmienić na swój:
    public static final TagKey<Block> INCORRECT_FOR_CUSTOM_TOOL =
            TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath("swordmod", "incorrect_for_custom_tool"));

    // Przykładowe wartości: trochę między żelazem a diamentem
    public static final Tier CUSTOM_TIER = new SimpleTier(
            INCORRECT_FOR_CUSTOM_TOOL,  // które bloki NIE dają dropa (możesz też użyć vanilla tagów)
            800,                        // trwałość (iron 250, diamond 1561)
            8.0f,                       // prędkość kopania (miecz i tak tego nie używa)
            2.0f,                       // bonus do obrażeń TIER (Sword doda jeszcze +3)
            18,                         // enchantowalność
            () -> Ingredient.of(net.minecraft.world.item.Items.DIAMOND) // składnik naprawy (do zmiany)
    );

    private ModTiers() {}
}

