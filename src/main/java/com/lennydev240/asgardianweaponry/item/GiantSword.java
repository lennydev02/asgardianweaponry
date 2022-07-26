package com.lennydev240.asgardianweaponry.item;

import com.lennydev240.asgardianweaponry.GiantSwordsMod;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.FORGE, modid = GiantSwordsMod.MOD_ID)
public class GiantSword extends SwordItem {

   //TO-DO: Animation beim blocken

    public static final int EFFECTIVE_BLOCK_DELAY = 5;
    public static final float MINIMUM_DURABILITY_DAMAGE = 3.0F;
    public static final String TAG_BASE_COLOR = "Base";

    public GiantSword(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public Tier getTier() {
        return super.getTier();
    }
    

    @Override
    public UseAnim getUseAnimation(ItemStack p_43105_) {
        return UseAnim.BLOCK;
     }
  
     public int getUseDuration(ItemStack p_43107_) {
        return 72000;
     }
  
     public InteractionResultHolder<ItemStack> use(Level p_43099_, Player p_43100_, InteractionHand p_43101_) {
        ItemStack itemstack = p_43100_.getItemInHand(p_43101_);
        p_43100_.startUsingItem(p_43101_);
        return InteractionResultHolder.consume(itemstack);
     }
  
     public boolean isValidRepairItem(ItemStack p_43091_, ItemStack p_43092_) {
        return super.isValidRepairItem(p_43091_, p_43092_);
     }
  
     @Override
     public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return net.minecraftforge.common.ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
     }



}
