package com.lennydev240.asgardianweaponry.item;

import com.lennydev240.asgardianweaponry.AsgardianWeaponryMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;


public class ModItemProperties {

    public static void register() {
        ItemProperties.register(ItemInit.GIANT_WOODEN_SWORD.get(),
                    new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_STONE_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_IRON_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_GOLD_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_DIAMOND_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_NETHERITE_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_ENDER_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.PATCHWORK_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_BONE_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });
        ItemProperties.register(ItemInit.GIANT_NETHERRACK_SWORD.get(),
                new ResourceLocation(AsgardianWeaponryMod.MOD_ID, "blocking"), (stack, level, living, id) -> {
                    return living != null && living.isUsingItem() && living.getUseItem() == stack ? 1.0F : 0.0F;
                });



    }

}
