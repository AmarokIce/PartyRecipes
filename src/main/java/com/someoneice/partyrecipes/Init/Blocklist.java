package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.Block.Crop.Tool.Crops;
import com.someoneice.partyrecipes.Block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class Blocklist {
    public static final Block Soda(Material Material) {
        Properties data = Properties.of(Material);
        return new sodamachine(data);
    }

    public static final Block Icewolf(Material Material) {
        Properties data = Properties.of(Material);
        return new Icewolf(data);
    }

    public static final Block seedbag(Material Material) {
        Properties data = Properties.of(Material);
        return new seedbag(data);
    }

    public static final Block dgjar(Material Material) {return new dgjar();
    }

    public static final Block Corps(Material Material) {return new Crops.commonCrop();}

    public static final Block block(Material Material) {
        Properties data = Properties.of(Material);
        return new Block(data);
    }

    public static final Block pizza(Material Material){
        Properties data = Properties.of(Material);
        return new PizzaBlock(data);
    }

    public static final Block nutplant(Material Material){return new nutplant();}

}
