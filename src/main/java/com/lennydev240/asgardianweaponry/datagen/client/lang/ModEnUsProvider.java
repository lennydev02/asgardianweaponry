package com.lennydev240.asgardianweaponry.datagen.client.lang;

import com.lennydev240.asgardianweaponry.GiantSwordsMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider{

    public ModEnUsProvider(DataGenerator gen) {
        super(gen, GiantSwordsMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.GIANT_WOODEN_SWORD.get(), "Giant Wooden Sword");
        add(ItemInit.GIANT_STONE_SWORD.get(), "Giant Stone Sword");
        add(ItemInit.GIANT_IRON_SWORD.get(), "Giant Iron Sword");
        add(ItemInit.GIANT_GOLD_SWORD.get(), "Giant Gold Sword");
        add(ItemInit.GIANT_DIAMOND_SWORD.get(), "Giant Diamond Sword");
        add(ItemInit.GIANT_NETHERITE_SWORD.get(), "Giant Netherite Sword");
        add(ItemInit.GIANT_ENDER_SWORD.get(), "Giant Ender Sword");
        add(ItemInit.PATCHWORK_SWORD.get(), "Patchwork Sword");
        add(ItemInit.GIANT_BONE_SWORD.get(), "Giant Bone Sword");
        add(ItemInit.GIANT_NETHERRACK_SWORD.get(), "Giant Netherrack Sword");
        add("itemGroup.asgardianweaponry", "Asgardian Weaponry Mod");
    }
    
}
