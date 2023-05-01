package net.devjavu.magicMod.item;

import net.devjavu.magicMod.MagicMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    public static final Item WHISTLEROSE = registerItem("whistlerose",
//            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagicMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MagicMod.LOGGER.debug("registering mod items");
    }
}
