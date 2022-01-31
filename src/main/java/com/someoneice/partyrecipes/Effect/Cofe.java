package com.someoneice.partyrecipes.Effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class Cofe extends MobEffect {
    public Cofe() {
        super(MobEffectCategory.BENEFICIAL, 8171462);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
            addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", (double)0.8F, AttributeModifier.Operation.MULTIPLY_TOTAL);
            addAttributeModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", (double)0.4F, AttributeModifier.Operation.MULTIPLY_TOTAL);
            }

            @Override
            public boolean isDurationEffectTick ( int duration, int amplifier){
                return true;
            }
}
