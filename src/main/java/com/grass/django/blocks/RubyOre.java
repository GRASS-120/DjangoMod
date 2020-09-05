package com.grass.django.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {
    public RubyOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 15.0F)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );

    }
}
