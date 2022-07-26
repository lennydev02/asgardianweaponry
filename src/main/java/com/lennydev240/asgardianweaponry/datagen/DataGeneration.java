package com.lennydev240.asgardianweaponry.datagen;

import com.lennydev240.asgardianweaponry.GiantSwordsMod;
import com.lennydev240.asgardianweaponry.datagen.client.ModItemModelProvider;
import com.lennydev240.asgardianweaponry.datagen.client.lang.ModEnUsProvider;
import com.lennydev240.asgardianweaponry.datagen.server.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = GiantSwordsMod.MOD_ID, bus = Bus.MOD)
public class DataGeneration {
    
    @SubscribeEvent
    public static void gatherData(GatherDataEvent sEvent){

        DataGenerator generator = sEvent.getGenerator();
        ExistingFileHelper helper = sEvent.getExistingFileHelper();

        if(sEvent.includeClient()){
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
        }

        if(sEvent.includeServer()){
            generator.addProvider(new ModRecipeProvider(generator));
        }


    }


}
