package com.someoneice.partyrecipes.Client.TAB;

import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class YearParty extends CreativeModeTab {
    public static final YearParty YP = new YearParty();

    public YearParty() {
        super("year_party");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.wolf_sweet.get());
    }

}
