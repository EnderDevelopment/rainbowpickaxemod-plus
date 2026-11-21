package com.enderdevelopment.rainbowpickaxe;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public final class ModItems {
    public static final Item RAINBOW_PICKAXE = register("rainbow_pickaxe", new PickaxeItem(Tiers.NETHERITE, 1, -2.8f, new Item.Properties().fireResistant().stacksTo(1)));

    private ModItems() {
    }

    private static Item register(String name, Item.Properties properties) {
        ResourceKey<Item> key =
                ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RainbowPickaxeMod.MOD_ID, name));
        return Registry.register(BuiltInRegistries.ITEM, key, new Item(properties.setId(key)));
    }

    public static void init() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS).register(output -> output.accept(RAINBOW_PICKAXE));
    }
}