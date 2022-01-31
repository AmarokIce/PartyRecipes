package com.someoneice.partyrecipes.Tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class DrinkEnpty extends Item {
    UseAnim type;

    public DrinkEnpty(Item.Properties Properties, UseAnim type) {
        super(Properties);
        this.type = type;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return this.type;
    }
}
