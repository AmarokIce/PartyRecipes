package club.someoneice.party_recipes.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class nutplant extends Block{

    public static int getNumber;

    public static final IntegerProperty AMOUNT = IntegerProperty.create("amount", 1, 3);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public nutplant() {
        super(BlockBehaviour.Properties.of(Material.GLASS).strength(2.0f).noOcclusion());
    }

    protected static final VoxelShape[] SHAPE = new VoxelShape[]{
            Block.box(6, 0, 6, 18, 18, 18),
            Block.box(6, 0, 6, 10, 10, 10),
            Block.box(6, 0, 6, 10, 10, 7),
            Block.box(6, 0, 6, 15, 10, 6)
    };

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        return SHAPE[p_220053_1_.getValue(AMOUNT)];
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AMOUNT, FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, LevelAccessor p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        return p_196271_2_ == Direction.DOWN && !p_196271_1_.canSurvive(p_196271_4_, p_196271_5_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }


    @Override
    public InteractionResult use(BlockState block, Level world, BlockPos pos, Player player, InteractionHand data, BlockHitResult hitfx) {
        // player.addItem(new ItemStack(ItemRegistry.saltnut.get()));
        world.playSound((Player) null, pos, SoundEvents.GENERIC_EAT, SoundSource.BLOCKS, 1.0F, 1.0F + world.random.nextFloat()*0.3F);
        if (!world.isClientSide()) {
            getNumber++;
            if (getNumber == 6) {
                world.removeBlock(pos, false);
                world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
