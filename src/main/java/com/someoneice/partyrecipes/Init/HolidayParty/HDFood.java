package com.someoneice.partyrecipes.Init.HolidayParty;

import com.someoneice.partyrecipes.Client.TAB.dailyparty;
import com.someoneice.partyrecipes.Tool.*;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.UseAnim;

public class HDFood {
    public static final Item sweet(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Builder Builder = new Builder();
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
        sweet Item = new sweet(Properties);
        return Item;
    }

    public static final Item Cofe(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Builder Builder = new Builder();
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
        Coffee Item = new Coffee(Properties);
        return Item;
    }

    public static final Item food(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Builder Builder = new Builder();
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
        Item Item = new Item(Properties);
        return Item;
    }

    public static final Item drink(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Properties.stacksTo(16);
        Builder Builder = new Builder();
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
        DrinkItem Item = new DrinkItem(Properties, UseAnim.DRINK);
        return Item;
    }

    public static final Item bowl(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, UseAnim type) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Properties.stacksTo(16);
        Builder Builder = new Builder();
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
        BowlFood Item = new BowlFood(Properties, type);
        return Item;
    }

    public static final Item capfood(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, UseAnim type) {
        Properties Properties = new Properties();
        Properties.tab(dailyparty.DP);
        Builder Builder = new Builder();
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
        CapFood Item = new CapFood(Properties, type);
        return Item;
    }
}
