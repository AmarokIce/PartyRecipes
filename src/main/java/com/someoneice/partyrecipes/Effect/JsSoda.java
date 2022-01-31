package com.someoneice.partyrecipes.Effect;

import com.someoneice.partyrecipes.Init.EffectRegistry;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class JsSoda extends MobEffect {
    public JsSoda() {
        super(MobEffectCategory.BENEFICIAL,8171462);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        int EffectTick = entity.getEffect(EffectRegistry.JsSoda.get()).getDuration();
        entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, EffectTick));
        addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", (double)0.4F, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
