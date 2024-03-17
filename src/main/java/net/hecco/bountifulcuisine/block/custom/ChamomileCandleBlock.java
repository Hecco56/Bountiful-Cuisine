package net.hecco.bountifulcuisine.block.custom;

import net.hecco.bountifulcuisine.block.entity.ChamomileCandleBlockEntity;
import net.hecco.bountifulcuisine.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ChamomileCandleBlock extends InfusedCandleBlock {
    public ChamomileCandleBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ChamomileCandleBlockEntity(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, ModBlockEntities.CHAMOMILE_CANDLE_BLOCK_ENTITY, ChamomileCandleBlockEntity::tick);
    }
}
