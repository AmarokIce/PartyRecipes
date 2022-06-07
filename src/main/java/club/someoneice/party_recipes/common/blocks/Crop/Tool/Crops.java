package club.someoneice.party_recipes.common.blocks.Crop.Tool;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Crops extends CropBlock{
    public Crops() {
        super(Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
    }
}
