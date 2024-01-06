package net.dyna.exoticbutters.item;

import net.dyna.exoticbutters.ExoticButters;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BASKET = registerItem("basket", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item EXOTIC_BUTTER = registerItem("exotic_butter", new Item(new FabricItemSettings().food(ModFoodComponents.EXOTIC_BUTTER)));
    public static final Item BASKET_OF_EXOTIC_BUTTERS = registerItem("basket_of_exotic_butters", new Item(new FabricItemSettings().food(ModFoodComponents.BASKET_OF_EXOTIC_BUTTERS).maxCount(1)));

    /* Rarity Levels:
    Common - White; Applies to most items.
    Uncommon - Yellow; Mostly common treasure items, as well as drops from minor bosses.
    Rare - Aqua; Items crafted from boss drops, as well as trickier to obtain treasures.
    Epic - Magenta; Mostly reserved for extremely difficult-to-obtain treasures. Certain Creative-exclusive blocks and items are also contained here,
    however, exceptions exist (such as player heads, which are Uncommon).
     */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExoticButters.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExoticButters.LOGGER.info("Registering Mod Items for " + ExoticButters.MOD_ID);
    }
}