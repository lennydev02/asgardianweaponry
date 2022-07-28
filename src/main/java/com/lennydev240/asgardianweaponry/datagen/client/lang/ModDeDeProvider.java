package com.lennydev240.asgardianweaponry.datagen.client.lang;

import com.lennydev240.asgardianweaponry.AsgardianWeaponryMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModDeDeProvider extends LanguageProvider{

    public ModDeDeProvider(DataGenerator gen) {
        super(gen, AsgardianWeaponryMod.MOD_ID, "de_de");
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.GIANT_WOODEN_SWORD.get(), "Riesiges Holzschwert");
        add(ItemInit.GIANT_STONE_SWORD.get(), "Riesiges Steinschwert");
        add(ItemInit.GIANT_IRON_SWORD.get(), "Riesiges Eisenschwert");
        add(ItemInit.GIANT_GOLD_SWORD.get(), "Riesiges Goldschwert");
        add(ItemInit.GIANT_DIAMOND_SWORD.get(), "Riesiges Diamantschwert");
        add(ItemInit.GIANT_NETHERITE_SWORD.get(), "Riesiges Netheritschwert");
        add(ItemInit.GIANT_ENDER_SWORD.get(), "Riesiges Enderschwert");
        add(ItemInit.PATCHWORK_SWORD.get(), "Flickwerkschwert");
        add(ItemInit.GIANT_BONE_SWORD.get(), "Riesiges Knochenschwert");
        add(ItemInit.GIANT_NETHERRACK_SWORD.get(), "Riesiges Netherrackschwert");
        add("itemGroup.asgardianweaponry", "Asgardian Weaponry Mod");
    }
    
}
