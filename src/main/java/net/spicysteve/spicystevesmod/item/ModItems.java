package net.spicysteve.spicystevesmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spicysteve.spicystevesmod.SpicyStevesMod;

public class ModItems {



    private  static Item registerItem(String name , Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SpicyStevesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpicyStevesMod.LOGGER.debug("Registering Mod Items For " + SpicyStevesMod.MOD_ID);
    }
}
