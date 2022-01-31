package com.someoneice.partyrecipes.Client.TAB;

import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class houseparty extends CreativeModeTab {
        public static final houseparty HP = new houseparty();

        public houseparty() {
            super("houseparty");
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.PineapplePie.get());
        }

}
