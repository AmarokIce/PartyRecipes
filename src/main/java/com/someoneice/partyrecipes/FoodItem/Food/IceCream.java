package com.someoneice.partyrecipes.FoodItem.Food;

import com.someoneice.partyrecipes.Client.TAB.houseparty;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class IceCream extends Item {
    private static final FoodProperties food = ((new FoodProperties.Builder()).saturationMod(5).nutrition(10).fast().alwaysEat().build());

    public IceCream(Item.Properties properties) {
        super(new Item.Properties().tab(houseparty.HP).food(food));
    }

    @Override
    public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
        list.add(new TranslatableComponent("info.icecream.food").withStyle(ChatFormatting.GRAY));
    }
}
