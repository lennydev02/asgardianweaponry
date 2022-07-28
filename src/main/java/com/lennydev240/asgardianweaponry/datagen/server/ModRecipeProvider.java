package com.lennydev240.asgardianweaponry.datagen.server;

import java.util.function.Consumer;

import com.lennydev240.asgardianweaponry.AsgardianWeaponryMod;
import com.lennydev240.asgardianweaponry.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModRecipeProvider extends RecipeProvider {

        public ModRecipeProvider(DataGenerator generator) {
                super(generator);
        }

        @Override
        protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
                ShapedRecipeBuilder.shaped(ItemInit.GIANT_WOODEN_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', ItemTags.PLANKS)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_WOODEN_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_STONE_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', ItemTags.STONE_CRAFTING_MATERIALS)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_STONE_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_IRON_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', Items.IRON_INGOT)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_IRON_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_GOLD_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', Items.GOLD_INGOT)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_GOLD_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_DIAMOND_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', Items.DIAMOND)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_DIAMOND_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_ENDER_SWORD.get())
                                .define('s', Items.BLAZE_ROD)
                                .define('w', Items.OBSIDIAN)
                                .define('e', Items.ENDER_EYE)
                                .pattern(" ww").pattern("wew").pattern("sw ")
                                .unlockedBy("has_" + Items.OBSIDIAN.getRegistryName().getPath(), has(Items.OBSIDIAN))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_ENDER_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.PATCHWORK_SWORD.get())
                                .define('s', Items.ROTTEN_FLESH)
                                .pattern(" ss").pattern("sss").pattern("ss ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.PATCHWORK_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_BONE_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', Items.BONE)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_BONE_SWORD.get().getRegistryName().getPath()));

                ShapedRecipeBuilder.shaped(ItemInit.GIANT_NETHERRACK_SWORD.get())
                                .define('s', Items.STICK)
                                .define('w', Items.NETHERRACK)
                                .pattern(" ww").pattern("www").pattern("sw ")
                                .unlockedBy("has_" + Items.STICK.getRegistryName().getPath(), has(Items.STICK))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_NETHERRACK_SWORD.get().getRegistryName().getPath()));

                UpgradeRecipeBuilder.smithing(Ingredient.of(ItemInit.GIANT_DIAMOND_SWORD.get()),
                                Ingredient.of(Items.NETHERITE_INGOT), ItemInit.GIANT_NETHERITE_SWORD.get())
                                .unlocks("has_" + Items.NETHERITE_INGOT.getRegistryName().getPath(),
                                                has(Items.NETHERITE_INGOT))
                                .save(consumer, new ResourceLocation(AsgardianWeaponryMod.MOD_ID,
                                                ItemInit.GIANT_NETHERITE_SWORD.get().getRegistryName().getPath()));
        }
}
