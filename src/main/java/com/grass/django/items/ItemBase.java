package com.grass.django.items;

import com.grass.django.DjangoMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        // Добавление предмета в определеный тип предметов (оружие, блоки, материалы и т.п.)
        super(new Item.Properties().group(DjangoMod.TAB));
    }
}
