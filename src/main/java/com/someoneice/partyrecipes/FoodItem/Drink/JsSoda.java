package com.someoneice.partyrecipes.FoodItem.Drink;

import com.someoneice.partyrecipes.Client.TAB.houseparty;
import com.someoneice.partyrecipes.Init.EffectRegistry;
import com.someoneice.partyrecipes.Init.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class JsSoda extends Item {
    private static final FoodProperties food = ((new FoodProperties.Builder()).saturationMod(1).nutrition(0)
            .effect(() -> new MobEffectInstance(EffectRegistry.JsSoda.get(), 120 * 20, 0), (float) 1)
            .fast().alwaysEat().build());

    public JsSoda(Item.Properties properties) {
        super(new Item.Properties().tab(houseparty.HP).food(food));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (((Player) player).getInventory().add(new ItemStack(ItemRegistry.can.get())) == false) {
                ((Player) player).drop(new ItemStack(ItemRegistry.can.get()), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }

    @Override
    public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
        list.add(new TranslatableComponent("info.jssoda.food").withStyle(ChatFormatting.GRAY));
    }
}
