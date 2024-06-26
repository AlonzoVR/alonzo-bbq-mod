package com.alonzovr.bbqmod.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import com.alonzovr.bbqmod.item.ModItems;

import java.util.HashMap;
import java.util.Map;

public class SaucedItemsRegistry {
    private static final Map<Item, Map<Item, Item>> SAUCED_ITEM_MAP = new HashMap<>();

    static {
        Map<Item, Item> ketchupMap = new HashMap<>();
        ketchupMap.put(Items.BEEF, ModItems.KETCHUP_BEEF);
        ketchupMap.put(Items.PORKCHOP, ModItems.KETCHUP_PORKCHOP);
        ketchupMap.put(Items.MUTTON, ModItems.KETCHUP_MUTTON);
        ketchupMap.put(Items.CHICKEN, ModItems.KETCHUP_CHICKEN);
        ketchupMap.put(Items.RABBIT, ModItems.KETCHUP_RABBIT);

        Map<Item, Item> barbecueMap = new HashMap<>();
        barbecueMap.put(Items.BEEF, ModItems.BARBECUE_BEEF);
        barbecueMap.put(Items.PORKCHOP, ModItems.BARBECUE_PORKCHOP);
        barbecueMap.put(Items.MUTTON, ModItems.BARBECUE_MUTTON);
        barbecueMap.put(Items.CHICKEN, ModItems.BARBECUE_CHICKEN);
        barbecueMap.put(Items.RABBIT, ModItems.BARBECUE_RABBIT);

        SAUCED_ITEM_MAP.put(ModItems.KETCHUP_BOTTLE, ketchupMap);
        SAUCED_ITEM_MAP.put(ModItems.BARBECUE_BOTTLE, barbecueMap);
    }

    public static Item getSaucedItem(Item sauce, Item normalItem) {
        return SAUCED_ITEM_MAP.getOrDefault(sauce, new HashMap<>()).getOrDefault(normalItem, normalItem);
    }
}
