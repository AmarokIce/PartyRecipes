package com.someoneice.partyrecipes.Init.HouseParty;

import com.someoneice.partyrecipes.Client.TAB.houseparty;
import com.someoneice.partyrecipes.FoodItem.Drink.JsSoda;
import com.someoneice.partyrecipes.FoodItem.Drink.Soda;
import com.someoneice.partyrecipes.FoodItem.Drink.TsSoda;
import com.someoneice.partyrecipes.FoodItem.Food.IceCream;
import com.someoneice.partyrecipes.FoodItem.Food.Pasta;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HPItemlist {
    public static final Item item() {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(houseparty.HP);
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        Item Item = new Item(Properties);
        return Item;
    }

    // Something else item&food will on here for registry.
    public static Item Soda() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new Soda(Properties);
    }

    public static final Item Cream() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new IceCream(Properties);
    }

    public static final Item pasta() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new Pasta(Properties);
    }
    //todo in Night Party.

    public static final Item JsSoda() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new JsSoda(Properties);
    }

    public static final Item TsSoda() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new TsSoda(Properties);
    }

/*
    // Item for dgjar.
    public static final Item someoneice() {
        Item.Properties Properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new someoneice(Properties);
    }
    //todo It a dgjar item!
*/
}
