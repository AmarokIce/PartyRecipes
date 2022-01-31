package com.someoneice.partyrecipes.Tool;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class BowlFood extends Item {
    UseAnim type;

    public BowlFood(Item.Properties Properties, UseAnim type) {
        super(Properties);
        this.type = type;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return this.type;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (((Player) player).getInventory().add(new ItemStack(Items.BOWL)) == false) {
                ((Player) player).drop(new ItemStack(Items.BOWL), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }
}