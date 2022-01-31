package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = partyrecipes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> STATUS_EFFECTS = DeferredRegister.create(MobEffect.class, partyrecipes.MODID);

    public static final RegistryObject<MobEffect> JsSoda = register(Effectlist::jsSoda, "jssoda");
    public static final RegistryObject<MobEffect> sweet = register(Effectlist::sweet,"sweet");
    public static final RegistryObject<MobEffect> TsSoda = register(Effectlist::tssoda, "tsoda");
    public static final RegistryObject<MobEffect> Cofe = register(Effectlist::Cofe, "cofe");

    public static RegistryObject<MobEffect> register(@Nonnull Supplier<MobEffect> initializer, @Nonnull String name) {
        return STATUS_EFFECTS.register(name, initializer);
    }
}
