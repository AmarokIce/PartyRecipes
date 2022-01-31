package com.someoneice.partyrecipes.Tool;


import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class Drink extends Item {

    public Drink(Properties builder) {
        super(builder);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (((Player) player).getInventory().add(new ItemStack(ItemRegistry.can.get())) == false) {
                ((Player) player).drop(new ItemStack(ItemRegistry.can.get()), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }
}