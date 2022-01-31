package com.someoneice.partyrecipes.Effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;

public class Sweet extends MobEffect {
    public Sweet() {
        super(MobEffectCategory.BENEFICIAL,4393481);
    }

    public void applyEffectTick(LivingEntity entityLivingBaseIn, int amplifier) {
        if (!entityLivingBaseIn.getCommandSenderWorld().isClientSide && entityLivingBaseIn instanceof Player player) {
            FoodData food = player.getFoodData();
                float exhaustion = food.getExhaustionLevel();
                float reduction = Math.min(exhaustion, 0.1F);
                if (exhaustion > 0.0F) {
                    player.causeFoodExhaustion(-reduction);
                }
            }
        }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}