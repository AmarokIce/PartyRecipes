package com.someoneice.partyrecipes.Client.TAB;

import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class dinnerparty extends CreativeModeTab {
    public static final dinnerparty NP = new dinnerparty();

    public dinnerparty() {
        super("dinnerparty");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.pasta.get());
    }
}