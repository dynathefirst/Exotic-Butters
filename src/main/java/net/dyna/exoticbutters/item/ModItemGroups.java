package net.dyna.exoticbutters.item;

import net.dyna.exoticbutters.ExoticButters;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EXOTIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExoticButters.MOD_ID, "exoticbutters"),
            FabricItemGroup.builder().displayName(Text.translatable("exoticbutters.itemgroup.name"))
                    .icon(() -> new ItemStack(ModItems.EXOTIC_BUTTER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EXOTIC_BUTTER);
                        entries.add(ModItems.BASKET);
                        entries.add(ModItems.BASKET_OF_EXOTIC_BUTTERS);
                    }).build());

    public static void registerItemGroups() {
        ExoticButters.LOGGER.info("Registering Item Groups for " + ExoticButters.MOD_ID);
    }
}
