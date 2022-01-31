package com.someoneice.partyrecipes.Effect;

import com.google.common.collect.Sets;
import com.someoneice.partyrecipes.Init.EffectRegistry;
import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Set;

public class TsSoda extends MobEffect {
    public static final Set<MobEffect> BadEffects = Sets.newHashSet(MobEffects.MOVEMENT_SLOWDOWN, MobEffects.WEAKNESS, MobEffects.DIG_SLOWDOWN);

    public TsSoda() {
        super(MobEffectCategory.BENEFICIAL,8171462);
    }

    // Registry a new event for remove the bed effect.

    @Mod.EventBusSubscriber(modid = partyrecipes.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ComfortEvent
    {
        @SubscribeEvent
        public static void onBadEffectApplicable(PotionEvent.PotionApplicableEvent event) {
            MobEffectInstance effect = event.getPotionEffect();
            LivingEntity entity = event.getEntityLiving();
            if (entity.getEffect(EffectRegistry.TsSoda.get()) != null && BadEffects.contains(effect.getEffect())) {
                event.setResult(Event.Result.DENY);
            }
        }

        @SubscribeEvent
        public static void onBadEffectApplied(PotionEvent.PotionAddedEvent event) {
            MobEffectInstance addedEffect = event.getPotionEffect();
            LivingEntity entity = event.getEntityLiving();
            if (addedEffect.getEffect().equals(EffectRegistry.TsSoda.get())) {
                for (MobEffect effect : BadEffects) {
                    entity.removeEffect(effect);
                }
            }
        }
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        entity.setTicksFrozen(0);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
