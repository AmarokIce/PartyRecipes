package com.someoneice.partyrecipes.MissingNo;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MissingNo extends Item {
    public MissingNo(Properties p_41383_) {
        super(p_41383_);
    }

@Override
public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
    var item = player.getItemInHand(hand);

    world.playSound(player,
            player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW,
            SoundSource.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));

    if (!world.isClientSide()) {
        var ballEntity = new Snowball(world, player);
        ballEntity.setItem(item);
        ballEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
        world.addFreshEntity(ballEntity);
    }

    player.awardStat(Stats.ITEM_USED.get(this));

    if (!player.isCreative()) {
        item.shrink(1);
    }

    return InteractionResultHolder.success(item);
    }
}
