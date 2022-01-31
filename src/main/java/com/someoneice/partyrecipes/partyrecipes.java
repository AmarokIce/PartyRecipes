package com.someoneice.partyrecipes;

import com.someoneice.partyrecipes.Init.BlockRegistry;
import com.someoneice.partyrecipes.Init.EffectRegistry;
import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("partyrecipes")
public class partyrecipes {
    public static final String MODID = "partyrecipes";
    public static final String Version = "t2";
    public static final Logger LOGGER = LogManager.getLogger("[partyrecipes]");

    public static final CreativeModeTab TAB = new CreativeModeTab("partyrecipes") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.soda.get());
        }
    };

    public partyrecipes() {
        MinecraftForge.EVENT_BUS.register(this);
        ItemRegistry.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BlockList.register(FMLJavaModLoadingContext.get().getModEventBus());
        EffectRegistry.STATUS_EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
