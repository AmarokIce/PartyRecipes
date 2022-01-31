package com.someoneice.partyrecipes.FoodItem.Food;

import com.someoneice.partyrecipes.Client.TAB.houseparty;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class Pasta extends Item {
    private static final FoodProperties food = ((new FoodProperties.Builder()).saturationMod(10).nutrition(15).alwaysEat().build());

    public Pasta(Properties properties) {
        super(new Item.Properties().tab(houseparty.HP).food(food));
    }

    @Override
    public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
        list.add(new TranslatableComponent("info.pasta.food").withStyle(ChatFormatting.GRAY));
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
