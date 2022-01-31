package com.someoneice.partyrecipes.FoodItem.Food.YearParty;

import com.someoneice.partyrecipes.Client.TAB.YearParty;
import com.someoneice.partyrecipes.Client.TAB.houseparty;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CTJP extends Item {
    private static final FoodProperties item = ((new FoodProperties.Builder()).build());

    public CTJP(Item.Properties properties) {
        super(new Item.Properties().tab(YearParty.YP));
    }

    @Override
    public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
        list.add(new TranslatableComponent("info.CTJP.tj").withStyle(ChatFormatting.GRAY));
    }
}