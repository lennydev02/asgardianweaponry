package com.lennydev240.asgardianweaponry.init;

import com.google.common.base.Supplier;
import com.lennydev240.asgardianweaponry.AsgardianWeaponryMod;
import com.lennydev240.asgardianweaponry.ModTiers;
import com.lennydev240.asgardianweaponry.item.GiantSword;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        AsgardianWeaponryMod.MOD_ID);

        public static final RegistryObject<Item> GIANT_WOODEN_SWORD = register("giant_wooden_sword",
                        () -> new GiantSword(Tiers.WOOD, 6, -2.4F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(88)));

        public static final RegistryObject<Item> GIANT_STONE_SWORD = register("giant_stone_sword",
                        () -> new GiantSword(Tiers.STONE, 6, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(196)));

        public static final RegistryObject<Item> GIANT_IRON_SWORD = register("giant_iron_sword",
                        () -> new GiantSword(Tiers.IRON, 7, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(375)));

        public static final RegistryObject<Item> GIANT_GOLD_SWORD = register("giant_gold_sword",
                        () -> new GiantSword(Tiers.GOLD, 6, -3F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(48)));

        public static final RegistryObject<Item> GIANT_DIAMOND_SWORD = register("giant_diamond_sword",
                        () -> new GiantSword(Tiers.DIAMOND, 8, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(2341)));

        public static final RegistryObject<Item> GIANT_NETHERITE_SWORD = register("giant_netherite_sword",
                        () -> new GiantSword(Tiers.NETHERITE, 9, -2.4F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(3474).fireResistant()));

        public static final RegistryObject<Item> GIANT_ENDER_SWORD = register("giant_ender_sword",
                        () -> new GiantSword(ModTiers.ENDER, 8, -2.4F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(1350)));

        public static final RegistryObject<Item> PATCHWORK_SWORD = register("patchwork_sword",
                        () -> new GiantSword(ModTiers.PATCHWORK, 6, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(45)));

        public static final RegistryObject<Item> GIANT_BONE_SWORD = register("giant_bone_sword",
                        () -> new GiantSword(ModTiers.BONE, 6, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(240)));

        public static final RegistryObject<Item> GIANT_NETHERRACK_SWORD = register("giant_netherrack_sword",
                        () -> new GiantSword(ModTiers.NETHERRACK, 6, -2.6F,
                                        new GiantSword.Properties().tab(AsgardianWeaponryMod.GIANT_CREATIVE_MODE_TAB)
                                                        .durability(225)));

        private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
                return ITEMS.register(name, item);
        }
}