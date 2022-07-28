package com.lennydev240.asgardianweaponry;

import com.lennydev240.asgardianweaponry.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("asgardianweaponry")
public class AsgardianWeaponryMod {

    public static final String MOD_ID = "asgardianweaponry";

    public static final CreativeModeTab GIANT_CREATIVE_MODE_TAB = new CreativeModeTab(MOD_ID){
       @Override
       @OnlyIn(Dist.CLIENT)
       public ItemStack makeIcon(){
        return new ItemStack(ItemInit.GIANT_DIAMOND_SWORD.get());
       }
    };


    public AsgardianWeaponryMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
