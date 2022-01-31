package com.someoneice.partyrecipes.Client.TAB;

import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class dailyparty extends CreativeModeTab {
    public static final dailyparty DP = new dailyparty();

    public dailyparty() {
        super("dailyparty");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.chocSoda.get());
    }
}