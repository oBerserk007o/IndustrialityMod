package com.Berserk007.IndustrialityMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class SteelBlock extends Block
{
    public SteelBlock()
    {
        super(Properties.of(Material.HEAVY_METAL)
                .strength(10.0f, 15.0f)
                .sound(SoundType.ANVIL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops()
        );
    }
}
