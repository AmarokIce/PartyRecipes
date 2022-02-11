package com.someoneice.partyrecipes.Client.TAB;

import com.someoneice.partyrecipes.Init.BlockRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class partyblock extends CreativeModeTab {
    public static final partyblock BK = new partyblock();

    public partyblock() {
        super("partyblock");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockRegistry.icewolf.get());
    }

}
