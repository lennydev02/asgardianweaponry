package com.lennydev240.asgardianweaponry;

import com.google.common.base.Supplier;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTiers implements Tier {
    PATCHWORK(0, 59, 2.0F, 0.0F, 5, () -> {
        return Ingredient.of(Items.ROTTEN_FLESH);
    }),
    BONE(3, 140, 2.0F, 2.0F, 15, () -> {
        return Ingredient.of(Items.BONE);
    }),
    NETHERRACK(3, 225, 2.0F, 3.0F, 15, () -> {
        return Ingredient.of(Items.NETHERRACK);
    }),
    ENDER(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(Items.OBSIDIAN);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModTiers(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_,
            Supplier<Ingredient> p_43337_) {
        this.level = p_43332_;
        this.uses = p_43333_;
        this.speed = p_43334_;
        this.damage = p_43335_;
        this.enchantmentValue = p_43336_;
        this.repairIngredient = new LazyLoadedValue<>(p_43337_);
    }

    @Override
    public int getUses() {
        // TODO Auto-generated method stub
        return uses;
    }

    @Override
    public float getSpeed() {
        // TODO Auto-generated method stub
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        // TODO Auto-generated method stub
        return damage;
    }

    @Override
    public int getLevel() {
        // TODO Auto-generated method stub
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        // TODO Auto-generated method stub
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    

}
