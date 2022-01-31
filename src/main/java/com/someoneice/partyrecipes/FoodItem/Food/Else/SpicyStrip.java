package com.someoneice.partyrecipes.FoodItem.Food.Else;

import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class SpicyStrip extends Item{
    private static final FoodProperties food = ((new FoodProperties.Builder()).saturationMod(1).nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 60 * 20, 2), (float) 1)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 60 * 20, 2), (float) 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 60 * 20, 2), (float) 1)
            .fast().alwaysEat().build());

    public SpicyStrip(Item.Properties properties) {
        super(new Item.Properties().tab(partyrecipes.TAB).food(food));
    }

    @Override
    public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
        list.add(new TranslatableComponent("info.sy.food").withStyle(ChatFormatting.GRAY));
    }
}
