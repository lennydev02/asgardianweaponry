package com.lennydev240.asgardianweaponry.datagen.client;

import com.lennydev240.asgardianweaponry.GiantSwordsMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GiantSwordsMod.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(item.getRegistryName().toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/handheld")))
                    .texture("layer0", itemTexture);
        } else {
            System.out.println("Texture is missing for: "
                    + item.getRegistryName().toString() + " at: " + itemTexture.toString());
        }

    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, item.getRegistryName());
    }

    @Override
    protected void registerModels() {
        oneLayerItem(ItemInit.GIANT_WOODEN_SWORD.get());
        oneLayerItem(ItemInit.GIANT_STONE_SWORD.get());
        oneLayerItem(ItemInit.GIANT_IRON_SWORD.get());
        oneLayerItem(ItemInit.GIANT_GOLD_SWORD.get());
        oneLayerItem(ItemInit.GIANT_DIAMOND_SWORD.get());
        oneLayerItem(ItemInit.GIANT_NETHERITE_SWORD.get());
        oneLayerItem(ItemInit.GIANT_ENDER_SWORD.get());
        oneLayerItem(ItemInit.PATCHWORK_SWORD.get());
        oneLayerItem(ItemInit.GIANT_BONE_SWORD.get());
        oneLayerItem(ItemInit.GIANT_NETHERRACK_SWORD.get());

        
    }

}
