package club.someoneice.party_recipes;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "party_recipes";
    public static final String NAME = "party_recipes";
    private static final String VERSION = "0.1.0";

    public Main() {
        MinecraftForge.EVENT_BUS.register(this);

    }
}
