package club.someoneice.party_recipes.common;

import club.someoneice.party_recipes.common.blocks.*;
import club.someoneice.party_recipes.common.blocks.Crop.Tool.Crops;
import com.someoneice.partyrecipes.Block.dgjar;
import net.minecraft.world.level.block.Block;

public class Blocklist {
    public static Block Corp () {
        return new Crops();
    }

    public static Block DragonJar() {
        return new dgjar();
    }

    public static Block IceWolf() {
        return new Icewolf();
    }

    public static Block SeedBag() {
        return new seedbag();
    }

    public static Block soda() {
        return new sodamachine();
    }

    public static Block pizza() {
        return new PizzaBlock();
    }
}
