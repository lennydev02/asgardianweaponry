package com.lennydev240.asgardianweaponry.datagen.client;

import com.lennydev240.asgardianweaponry.AsgardianWeaponryMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, AsgardianWeaponryMod.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(item.getRegistryName().toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture, ResourceLocation model) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        ResourceLocation itemModel = new ResourceLocation(model.getNamespace(), "item/" + model.getPath());
        ResourceLocation itemBlocking = new ResourceLocation(AsgardianWeaponryMod.MOD_ID + ":blocking");
        ModelFile modelBlocking = getBuilder(itemModel + "_blocking");

        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/handheld")))
                    .texture("layer0", itemTexture).override()
                    .predicate(itemBlocking,1).model(modelBlocking);
        } else {
            System.out.println("Texture is missing for: "
                    + item.getRegistryName().toString() + " at: " + itemTexture.toString());
        }

        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath() + "_blocking").parent(getExistingFile(mcLoc("item/handheld")))
                    .texture("layer0", itemTexture)
                    .transforms()
                    .transform(ItemTransforms.TransformType.THIRD_PERSON_RIGHT_HAND).rotation(45, -20, 90).translation(-3, 3, 3).scale(0.75F, 0.75F, 0.75F).end()
                    .transform(ItemTransforms.TransformType.THIRD_PERSON_LEFT_HAND).rotation(45, 160, -90).translation(-3, 3, 3).scale(0.75F, 0.75F, 0.75F).end()
                    .transform(ItemTransforms.TransformType.FIRST_PERSON_RIGHT_HAND).rotation(0, -180, -5).translation(0, 3, 0).scale(0.75F, 0.75F, 0.75F).end()
                    .transform(ItemTransforms.TransformType.FIRST_PERSON_LEFT_HAND).rotation(0, 0, 5).translation(0, 3, 0).scale(0.75F, 0.75F, 0.75F).end()
                    .end();
        } else {
            System.out.println("Texture is missing for: "
                    + item.getRegistryName().toString() + " at: " + itemTexture.toString());
        }

    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, item.getRegistryName(),item.getRegistryName());
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
