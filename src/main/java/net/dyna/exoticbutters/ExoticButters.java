package net.dyna.exoticbutters;

import net.dyna.exoticbutters.item.ModItemGroups;
import net.dyna.exoticbutters.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExoticButters implements ModInitializer {
	public static final String MOD_ID = new String("exoticbutters");
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}