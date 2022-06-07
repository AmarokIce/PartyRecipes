package club.someoneice.party_recipes.common;

import club.someoneice.party_recipes.common.items.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public class Itemlist {
    public static Item Item() {
        return Item();
    }
    public static Item itemCrafting(int MixStacks, int MixDamage, int DamageNumber, ItemStack getItem, CreativeModeTab tab){
        return new CraftingItems(MixStacks, MixStacks, DamageNumber, getItem, tab);
    }

    public static Item itemItem(Item getItem, int stacks, boolean fireResistant,CreativeModeTab tab) {
        Item.Properties properties = new Item.Properties();
        if (fireResistant)
            properties.fireResistant();
        properties.craftRemainder(getItem);
        properties.stacksTo(stacks);
        properties.tab(tab);

        return new ItemItems(getItem, stacks, tab);
    }

    public static Item itemAdvancedFood(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, int MixStacks, MobEffect[] effects, int getEffectTime, int getEffectLever, float random, UseAnim UseAnim, Item getItem, CreativeModeTab tab){
        Item.Properties properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        Builder.nutrition(nutrition);
        Builder.saturationMod(saturation);

        for (MobEffect effect : effects) Builder.effect(() -> new MobEffectInstance(effect, getEffectTime, getEffectLever), random);
        if (isMeat) Builder.meat();
        if (fastFood) Builder.fast();
        if (alwaysEat) Builder.alwaysEat();

        properties.stacksTo(MixStacks);
        properties.food(Builder.build());
        properties.craftRemainder(getItem);
        properties.tab(tab);

        return new ReturnItems(properties, getItem);
    }

    public static Item itemFood(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, UseAnim UseAnim, Item getItem, CreativeModeTab tab) {
        Item.Properties properties = new Item.Properties();
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        Builder.nutrition(nutrition);
        Builder.saturationMod(saturation);
        if (isMeat) Builder.meat();
        if (fastFood) Builder.fast();
        if (alwaysEat) Builder.alwaysEat();
        properties.food(Builder.build());
        properties.craftRemainder(getItem);
        properties.tab(tab);

        return new ReturnItems(properties, getItem);
    }

}
