package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.FoodItem.Food.Else.SpicyStrip;
import com.someoneice.partyrecipes.FoodItem.Item.Syrup;
import com.someoneice.partyrecipes.MissingNo.MissingNo;
import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Itemlist {

    public static final Item item() {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(partyrecipes.TAB);
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        Item Item = new Item(Properties);
        return Item;
    }

    public static final Item sy() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new SpicyStrip(Properties);
    }

    public static final Item syrup() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new Syrup(Properties);
    }

    public static Item MissingNo(){
        Item.Properties Properties = new Item.Properties();
        Properties.tab(partyrecipes.TAB);
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new MissingNo(Properties);
    }
}
