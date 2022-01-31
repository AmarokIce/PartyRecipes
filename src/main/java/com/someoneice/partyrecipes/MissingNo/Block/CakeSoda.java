/*
package com.someoneice.partyrecipes.Block;

import com.someoneice.partyrecipes.Entity.CakeSodaEntity;
import com.someoneice.partyrecipes.Init.BlockRegistry;
import com.someoneice.partyrecipes.Init.EntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.partyblock.Block;
import net.minecraft.world.level.partyblock.entity.BlockEntity;
import net.minecraft.world.level.partyblock.entity.BlockEntityTicker;
import net.minecraft.world.level.partyblock.entity.BlockEntityType;
import net.minecraft.world.level.partyblock.state.BlockState;
import net.minecraft.world.level.partyblock.state.properties.BlockStateProperties;
import net.minecraft.world.level.partyblock.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

import javax.annotation.Nullable;


public class CakeSoda extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

//TODO

    public CakeSoda() {
        super(Properties.of(Material.WOOD).strength(10f, 10).noOcclusion());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return new CakeSodaEntity(p_153215_, p_153216_);
    }


    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide) {
            world.playSound(null, pos, SoundEvents.BARREL_OPEN, SoundSource.BLOCKS, 1f, 1f);

            CakeSodaEntity CakeSodaEntity = (CakeSodaEntity) world.getBlockEntity(pos);
            NetworkHooks.openGui((ServerPlayer) player, CakeSodaEntity, (FriendlyByteBuf packerBuffer) -> {
                packerBuffer.writeBlockPos(CakeSodaEntity.getBlockPos());
            });
        }
        return InteractionResult.sidedSuccess(world.isClientSide);
    }
}
*/