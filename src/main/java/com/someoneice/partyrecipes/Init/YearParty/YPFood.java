package com.someoneice.partyrecipes.Init.YearParty;

import com.someoneice.partyrecipes.Client.TAB.YearParty;
import com.someoneice.partyrecipes.Client.TAB.dinnerparty;
import com.someoneice.partyrecipes.FoodItem.Food.YearParty.CTJP;
import com.someoneice.partyrecipes.FoodItem.Food.YearParty.TJP;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class YPFood {
    public static Item food(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(YearParty.YP);
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        Builder.nutrition(nutrition);
        Builder.saturationMod(saturation);
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.fast();
        }
        if (alwaysEat) {
            Builder.alwaysEat();
        }
        Properties.food(Builder.build());
        return new Item(Properties);
    }

    public static Item item() {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(YearParty.YP);
        return new Item(Properties);
    }

    public static Item TJP(){
        Item.Properties Properties = new Item.Properties();
        Properties.tab(YearParty.YP);
        return new TJP(Properties);
    }

    public static Item CTJP(){
        Item.Properties Properties = new Item.Properties();
        Properties.tab(YearParty.YP);
        return new CTJP(Properties);
    }
}
