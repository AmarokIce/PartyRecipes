package com.someoneice.partyrecipes.MissingNo;

import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class someoneice extends Item {

    // This item is for dgjar something changed in 1.17.

    private static final FoodProperties food = ((new FoodProperties.Builder()).saturationMod(0).nutrition(0)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 5 * 20, 0), (float) 1)
            .fast().alwaysEat().build());

    public someoneice(Properties properties) {
        super(new Item.Properties().tab(partyrecipes.TAB).food(food));
    }
}
