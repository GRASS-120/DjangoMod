package com.grass.django.util;

import com.grass.django.DjangoMod;
import com.grass.django.blocks.BlockItemBase;
import com.grass.django.blocks.RubyBlock;
import com.grass.django.blocks.RubyOre;
import com.grass.django.items.ItemBase;
import com.grass.django.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Класс для добавления предметов и блоков
public class RegistryHandler {

    // Регистрация новых предметов в моде
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, DjangoMod.MOD_ID);

    // Регистрация новых блоков в моде
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, DjangoMod.MOD_ID);


    // Добавление всех этих вещей в игру
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ---Предметы--- //

    // Создание предмета
    // public static final RegistryObject<Item> ITEM_NAME = ITEMS.register("item_name", ItemBase::new);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> CHARGED_RUBY = ITEMS.register("charged_ruby", ItemBase::new);
    public static final RegistryObject<Item> MYSTICAL_INGOT = ITEMS.register("mystical_ingot", ItemBase::new);
    public static final RegistryObject<Item> MYSTICAL_ESSENCE = ITEMS.register("mystical_essence", ItemBase::new);

    // ---Инструменты---

    // Создание инструмента
    // public static final RegistryObject<TypeItem> NAME = ITEMS.register("name", () ->
    //      new TypeItem(ModItemTier.MATERIAL, attackDamage, attackSpeed, new Item.Properties().group(DjangoMod.TAB)));

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, -2.4F, new Item.Properties().group(DjangoMod.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 2, -2.8F, new Item.Properties().group(DjangoMod.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 2, -3.0F, new Item.Properties().group(DjangoMod.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 6, -3.0F, new Item.Properties().group(DjangoMod.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, -2.8F, new Item.Properties().group(DjangoMod.TAB)));

    // ---Блоки--- //

    // Создание блока
    // public static final RegistryObject<Block> BLOCK_NAME = BLOCKS.register("block_name", BlockName::new);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // ---Блок-предмет--- //

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
}
