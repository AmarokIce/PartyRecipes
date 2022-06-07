package club.someoneice.party_recipes.init;

import club.someoneice.party_recipes.Main;
import club.someoneice.party_recipes.client.TAB;
import club.someoneice.party_recipes.common.Itemlist;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegsiter {
    public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, Main.NAME);

    /* Items */
    public static RegistryObject<Item> CAN = register(Itemlist::Item, "can");
    public static RegistryObject<Item> CAP = register(Itemlist::Item, "cap");
    public static RegistryObject<Item> DIRSHCAP = register(Itemlist::Item, "dirsh_cup");
    public static RegistryObject<Item> CAKEMODEL = register(Itemlist::Item, "cake_model");
    public static RegistryObject<Item> FINESUGAR = register(Itemlist::Item, "fine_sugar");
    public static RegistryObject<Item> WOODEN_CAP = register(Itemlist::Item, "wooden_cap");
    public static RegistryObject<Item> ICECUBE = register(Itemlist::Item, "ice_cube");
    public static RegistryObject<Item> THINSTACK = register(Itemlist::Item, "thin_stack");
    public static RegistryObject<Item> FLOUR = register(Itemlist::Item, "flour");
    public static RegistryObject<Item> NAIL = register(Itemlist::Item, "nail");
    public static RegistryObject<Item> PLANTASH = register(Itemlist::Item, "ash");
    public static RegistryObject<Item> HOTTER = register(Itemlist::Item, "hotter");
    public static RegistryObject<Item> OIL = register(Itemlist::Item, "oil");

    /* Foods */



    /* Fruits And Crops */
    public static RegistryObject<Item> COFFEEBEAN = register(() -> Itemlist.itemFood(1,0.5F, false, true, true, UseAnim.EAT, null, TAB.FRUIT), "coffee_bean");
    public static RegistryObject<Item> PINEAPPLE = register(() -> Itemlist.itemFood(10, 0.5f, true, true, true,  UseAnim.EAT,null, TAB.FRUIT), "pineapple");

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}
