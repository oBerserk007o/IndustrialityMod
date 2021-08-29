package com.Berserk007.IndustrialityMod.util;

import com.Berserk007.IndustrialityMod.Industriality;
import com.Berserk007.IndustrialityMod.armor.ModArmorMaterial;
import com.Berserk007.IndustrialityMod.blocks.BlockItemBase;
import com.Berserk007.IndustrialityMod.blocks.SteelBlock;
import com.Berserk007.IndustrialityMod.items.ItemBase;
import com.Berserk007.IndustrialityMod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Industriality.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Industriality.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_STICK = ITEMS.register("steel_stick", ItemBase::new);
    public static final RegistryObject<Item> STEEL_HANDLE = ITEMS.register("steel_handle", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> FAST_SWORD = ITEMS.register("fast_sword", () ->
        new SwordItem(ModItemTier.STEEL, 0, 1.0f, new Item.Properties().tab(Industriality.TAB)));
    public static final RegistryObject<SwordItem> DAGGER = ITEMS.register("dagger", () ->
            new SwordItem(ModItemTier.STEEL, 1, -2.0f, new Item.Properties().tab(Industriality.TAB)));

    //Armour
    public static final RegistryObject<ArmorItem> STEEL_PLATED_HELMET =  ITEMS.register("steel_plated_helmet", () ->
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().tab(Industriality.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_PLATED_CHESTPLATE =  ITEMS.register("steel_plated_chestplate", () ->
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().tab(Industriality.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_PLATED_HELMET_LEGGINGS =  ITEMS.register("steel_plated_leggings", () ->
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().tab(Industriality.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_PLATED_HELMET_BOOTS =  ITEMS.register("steel_plated_boots", () ->
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().tab(Industriality.TAB)));

    //Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);

    //Block Items
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
}
