package com.someoneice.partyrecipes.Block.Crop.Tool;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


public class Crops {
    public static class commonCrop extends CropBlock{
        public commonCrop() {
            super(Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
        }
    }
}
