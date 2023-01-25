package net.spicysteve.spicystevesmod;

import net.fabricmc.api.ModInitializer;
import net.spicysteve.spicystevesmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//hi
public class SpicyStevesMod implements ModInitializer {
	public static final String MOD_ID = "spicystevesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
