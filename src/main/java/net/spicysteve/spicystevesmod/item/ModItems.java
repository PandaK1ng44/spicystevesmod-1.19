package net.spicysteve.spicystevesmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spicysteve.spicystevesmod.SpicyStevesMod;

public class ModItems {

    public static final Item RAW_SPICE = registerItem("raw_spice",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name , Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SpicyStevesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpicyStevesMod.LOGGER.debug("Registering Mod Items For " + SpicyStevesMod.MOD_ID);
    }
}
