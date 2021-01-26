package com.ldtteam.structurize.blocks.bricks;

import com.ldtteam.structurize.blocks.AbstractBlockStructurizeWall;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockBrickWall extends AbstractBlockStructurizeWall<BlockBrickWall>
{
    public BlockBrickWall(final String modelName)
    {
        super(Block.Properties.from(Blocks.BRICK_WALL));
        this.setRegistryName(modelName);
    }
}
