package com.fabryolc05.baucinastatuemod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class BaucinastatueBlock extends Block {
    public static final BooleanProperty TRANSFORMED = BooleanProperty.create("transformed");

    public BaucinastatueBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TRANSFORMED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TRANSFORMED);
    }

    public void transformToBoat(BlockState state) {
        // Logic to transform the block into a boat
    }
}