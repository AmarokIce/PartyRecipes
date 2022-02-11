package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.Init.DinnerParty.DPFood;
import com.someoneice.partyrecipes.Init.HolidayParty.HDFood;
import com.someoneice.partyrecipes.Init.HouseParty.HPFood;
import com.someoneice.partyrecipes.Init.HouseParty.HPItemlist;
import com.someoneice.partyrecipes.Init.YearParty.YPFood;
import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = partyrecipes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ItemRegistry {

        public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, partyrecipes.MODID);

        /* other */
        public static final RegistryObject<Item> can = register(Itemlist::item, "can");
        public static final RegistryObject<Item> cap = register(Itemlist::item,"cap");
        public static final RegistryObject<Item> paste = register(Itemlist::item,"paste");
        public static final RegistryObject<Item> dirshcup = register(Itemlist::item,"dirshcup");
        public static final RegistryObject<Item> cakeMould = register(Itemlist::item,"cakemould");
        public static final RegistryObject<Item> findSugar = register(Itemlist::item,"finesugar");
        public static final RegistryObject<Item> glassCap = register(Itemlist::item,"glasscap");
        public static final RegistryObject<Item> iceCube = register(Itemlist::item,"icecube");
        public static final RegistryObject<Item> thinstick = register(Itemlist::item,"thinstick");
        public static final RegistryObject<Item> flour = register(Itemlist::item,"flour");
        public static final RegistryObject<Item> nail = register(Itemlist::item,"nail");
        public static final RegistryObject<Item> sweetsoda = register(Itemlist::item,"sweetsoda");
        public static final RegistryObject<Item> cappaste = register(Itemlist::item,"cappaste");
        public static final RegistryObject<Item> PlantAsh = register(Itemlist::item,"plantash");
        public static final RegistryObject<Item> hotter = register(Itemlist::item,"hotter");
        public static final RegistryObject<Item> book = register(Itemlist::item, "bookofcook");
        public static final RegistryObject<Item> box = register(Itemlist::MissingNo,"box");
        public static final RegistryObject<Item> oil = register(Itemlist::item, "oil");
        public static final RegistryObject<Item> pigOil = register(Itemlist::item, "pigoil");

        /* House Party */
        public static final RegistryObject<Item> appleJuice = register(()-> HPFood.drink(2,2,false,false,true),"applejuice");
        public static final RegistryObject<Item> pasta = register(HPItemlist::pasta,"pasta");
        public static final RegistryObject<Item> cheesepasta = register(()-> HPFood.bowl( 15, 20, false, false, true, UseAnim.EAT), "cheesepasta");
        public static final RegistryObject<Item> mushpasta = register(()-> HPFood.bowl( 15, 20, false, false, true, UseAnim.EAT), "mushpasta");
        public static final RegistryObject<Item> tomatopasta = register(()-> HPFood.bowl( 15, 20, false, false, true, UseAnim.EAT), "tomatopasta");
        public static final RegistryObject<Item> marshmallow = register(()-> HPFood.food(1,0,false,true,true),"marshmallow");
        public static final RegistryObject<Item> cream = register(()-> HPFood.food(1,0,false,true,true),"cream");
        public static final RegistryObject<Item> appleCube = register(()-> HPFood.food(1,0,false,false,true),"applecube");
        public static final RegistryObject<Item> appleJar = register(()-> HPFood.capfood(2,2,false,true,true, UseAnim.DRINK),"applejar");
        public static final RegistryObject<Item> goldenAppleJar = register(()-> HPFood.capfood(4,2,false,true,true, UseAnim.DRINK),"goldenapplejar");
        public static final RegistryObject<Item> coffeeBean = register(()-> HPFood.food(1,1,false,false,false),"coffeebean");
        public static final RegistryObject<Item> soda = register(HPItemlist::Soda, "soda");
        public static final RegistryObject<Item> waffles = register(()-> HPFood.food(2,1,false,true,true),"waffles");
        public static final RegistryObject<Item> muffin = register(()-> HPFood.capfood(4,2,false,true,true, UseAnim.EAT),"muffin");
        public static final RegistryObject<Item> eyeCream = register(()-> HPFood.food(6,4,false,false,true),"eye-cream");
        public static final RegistryObject<Item> bagel = register(()-> HPFood.food(2,4,false,true,true),"bagel");
        public static final RegistryObject<Item> cookies = register(()-> HPFood.food(1,0,false,true,true),"cookies");
        public static final RegistryObject<Item> tomato = register(()-> HPFood.food(1,1,false,false,false), "tomato");
        public static final RegistryObject<Item> corp = register(()-> HPFood.food(1,1,false,false,false), "corp");
        public static final RegistryObject<Item> WhiteGourd = register(HPItemlist::item,"whitegourd");
        public static final RegistryObject<Item> WhiteGourdSide = register(()-> HPFood.food(3,2,false,true,true),"whitegourdside");
        public static final RegistryObject<Item> PineapplePie = register(()-> HPFood.food(5,6,false,true,true),"pineapplepie");
        public static final RegistryObject<Item> creamCheese = register(()-> HPFood.DrinkE(1,0,false,true,true),"creamcheese");
        public static final RegistryObject<Item> creamcheesebagel = register(()-> HPFood.food(4,6,false,true,true),"creamcheesebagel");
        public static final RegistryObject<Item> cheesecream = register(HPItemlist::Cream,"cheesecream");
        public static final RegistryObject<Item> syrup = register(Itemlist::syrup,"syrup");
        public static final RegistryObject<Item> sodaWater = register(()-> HPFood.drink(2,2,false,true,true),"sodawater");
        public static final RegistryObject<Item> capSoda = register(()-> HPFood.DrinkE(1,0,false,false,true), "capsoda");
        public static final RegistryObject<Item> hotchoco = register(()-> HPFood.capfood(4,6,false,false,true, UseAnim.DRINK),"hotchoco");
        public static final RegistryObject<Item> leavetea = register(()-> HPFood.capfood(2,2,false,true,true, UseAnim.DRINK),"leavetea");
        public static final RegistryObject<Item> coffee = register(()-> HPFood.Cofe(4,1,true,false,true),"coffee");
        public static final RegistryObject<Item> jsSoda = register(HPItemlist::JsSoda, "jssoda"); //劲爽苏打
        public static final RegistryObject<Item> tsSoda = register(HPItemlist::TsSoda, "tssoda"); //提神苏打
        public static final RegistryObject<Item> Cider = register(()-> HPFood.sweet(2,5,false,true,true), "cider");
        public static final RegistryObject<Item> SodaCoffee = register(()-> HPFood.Cofe(2,5,false,false,true), "sodacoffee");
        public static final RegistryObject<Item> tealeave = register(HPItemlist::item, "tealeave");
        public static final RegistryObject<Item> pineapple = register(()-> HPFood.food(4,4,true,false,true), "pineapple");
        public static final RegistryObject<Item> pepper = register(()-> HPFood.food(1,1,false,false,true), "pepper");
        public static final RegistryObject<Item> drycream = register(()-> HPFood.food(1,0,false,true,true), "drycream");
        public static final RegistryObject<Item> corpersugar = register(HPItemlist::item,"corpersugar");
        public static final RegistryObject<Item> popover = register(()-> HPFood.food(1,0,false,false,true),"popover");
        public static final RegistryObject<Item> popo = register(()-> HPFood.food(4,4,true,false,true), "popo");
        public static final RegistryObject<Item> chocopopo = register(()-> HPFood.food(6,4,true,false,true), "chocopopo");
        public static final RegistryObject<Item> corpflour = register(HPItemlist::item,"corpflour");
        public static final RegistryObject<Item> corpbread = register(()-> HPFood.food(4,6,false,false,true),"corpbread");
        public static final RegistryObject<Item> creamcorpbread = register(()-> HPFood.food(8,6,false,false,true),"creamcorpbread");
        public static final RegistryObject<Item> cookcorp = register(()-> HPFood.food(4,2,false,false,true),"cookcorp");
        public static final RegistryObject<Item> tomatoso = register(()-> HPFood.food(1,0,false,false,true),"tomatoso"); //番茄沙司
        public static final RegistryObject<Item> tea = register(()-> HPFood.drink(4,2,false,false,true),"tea");
        public static final RegistryObject<Item> cocotea = register(()-> HPFood.drink(4,4,false,false,true),"cocotea");
        public static final RegistryObject<Item> salt = register(HPItemlist::item,"salt");
        public static final RegistryObject<Item> copp = register(HPItemlist::item,"copp"); //濾網
        public static final RegistryObject<Item> cofeflour = register(()-> HPFood.food(1,0,false,false,true), "cofeflour");
        public static final RegistryObject<Item> saltnut = register(()-> HPFood.food(4,2,false,true,true), "saltnut");
        public static final RegistryObject<Item> CheeseBall = register(()-> HPFood.food(6,2,false,true,true), "cheeseball");
        public static final RegistryObject<Item> Chicken = register(()-> HPFood.food(6,2,false,false,true), "chicken");
        public static final RegistryObject<Item> FreidChicken = register(()-> HPFood.food(6,2,false,false,true), "friedchicken");

        /* Dinner Party */
        public static final RegistryObject<Item> chikuwa = register(()-> DPFood.food(6,4,true,true,true), "chikuwa");
        public static final RegistryObject<Item> fishcake = register(()-> DPFood.food(4,4,true,true,true), "fishcake");
        public static final RegistryObject<Item> tofu = register (()-> DPFood.food(1,1,false,true,true),"tofu");
        public static final RegistryObject<Item> freezntofu = register (()-> DPFood.food(2,1,false,false,true),"freezntofu");
        public static final RegistryObject<Item> tofuMeat = register (()-> DPFood.food(4,2,true,false,true),"tofumeat");
        public static final RegistryObject<Item> cooktofu = register (()-> DPFood.food(8,4,false,false,true),"cooktofu");
        public static final RegistryObject<Item> cooktofumeat = register (()-> DPFood.food(10,6,true,false,true),"cooktofumeat");
        public static final RegistryObject<Item> bacinwithegg = register (()-> DPFood.food(10,6,true,false,true),"bacinwithegg");
        public static final RegistryObject<Item> shepsop = register (()-> DPFood.food(10,6,true,false,true),"sheepsop");
        public static final RegistryObject<Item> fastver = register (()-> DPFood.food(10,6,true,false,true),"fastver"); //蔬菜自熱火鍋
        public static final RegistryObject<Item> pigu = register(()-> DPFood.bowl(14,20,false,false,true, UseAnim.EAT), "pigu");

        /*NewYear Party*/
        public static final RegistryObject<Item> NewYearCake = register(()-> YPFood.food(10,10,false,false,true), "newyearcake");
        public static final RegistryObject<Item> Yuan = register(()-> YPFood.food(10,10,false,false,true), "yuan");
        public static final RegistryObject<Item> BowlsYearCake = register(()-> YPFood.food(30,30,false,false,true), "bowlyearcake");
        public static final RegistryObject<Item> CookYearCake = register(()-> YPFood.food(15,10,false,true,true),"cookyearcake");
        public static final RegistryObject<Item> fishmeat = register(YPFood::item, "fishmeatpiemix");
        public static final RegistryObject<Item> fishpie = register(()-> YPFood.food(20,20,true,false,true), "fishpie");
        public static final RegistryObject<Item> Stargazy = register(()->YPFood.food(20,20,false,false,true), "stargazy");
        public static final RegistryObject<Item> CheeseCake = register(()-> YPFood.food(15,10,false,true,true), "cheesecake");
        public static final RegistryObject<Item> pancake = register(()-> YPFood.food(2,1,false,true,true), "pancake");
        public static final RegistryObject<Item> SpringRoos = register(()-> YPFood.food(5,2,false,true,true), "springroos");//春卷
        public static final RegistryObject<Item> ChickenRoos = register(()-> YPFood.food(6,3,false,true,true), "chickenroos");//鸡卷
        public static final RegistryObject<Item> SaltyRicePudding = register(()-> YPFood.food(5,10,false,true,true), "saltyricepudding");//碗糕
        public static final RegistryObject<Item> SpringCake = register(()-> YPFood.food(5,3,false,false,true), "springcake");
        public static final RegistryObject<Item> paka = register(()-> YPFood.food(3,2,false,true,true), "paka");
        public static final RegistryObject<Item> tofuBuger = register(()-> YPFood.food(10,5,false,false,true), "tofubuger");
        public static final RegistryObject<Item> wolfsweet = register(()-> YPFood.food(2,2,true,true,true), "wolfsweet");
        public static final RegistryObject<Item> Takoyaki = register(()-> YPFood.food(5,5,false,false,true), "takoyaki");
        public static final RegistryObject<Item> pkm = register(()-> YPFood.food(5,2,false,true,true), "pumpkincake");
        public static final RegistryObject<Item> coffeePie = register(()-> YPFood.food(7,5,true,true,true), "coffeepie");
        public static final RegistryObject<Item> shepSope = register(()-> YPFood.food(15,16,false,false,true), "sesamecake");
        public static final RegistryObject<Item> TJP = register(YPFood::TJP, "tjp");
        public static final RegistryObject<Item> CTJP = register(YPFood::CTJP, "ctjp");
        public static final RegistryObject<Item> CTJ = register(()-> YPFood.food(10,10,true,false,true), "ctj");
        public static final RegistryObject<Item> bog = register(()-> YPFood.food(4,0,false,false,true), "hotdog");
        public static final RegistryObject<Item> redbBread = register(()-> YPFood.food(5,4,false,false,true), "redbeanbun");
        public static final RegistryObject<Item> npl = register(()-> YPFood.food(4,2,false,false,true), "crispypancake");
        public static final RegistryObject<Item> sunCake = register(()-> YPFood.food(2,2,false,false,true), "suncake");
        public static final RegistryObject<Item> redbeansp = register(()-> YPFood.food(2,2,false,false,true), "redbeansp");
       public static final RegistryObject<Item> pamcake = register(()-> YPFood.food(6,4,false,false,true), "pamcake");

        /* Daily Party */
        public static final RegistryObject<Item> softCake = register(()-> HDFood.food(2,2,false,false,true),"softcake");
        public static final RegistryObject<Item> chocSoda = register(()-> HDFood.drink(5,2,false,false,true), "sodachoco");
        public static final RegistryObject<Item> fruitCake = register(()-> HDFood.food(4,2,false,false,true),"fruitcake");

        //todo  They are in House party now,you should get they in they should stay.
        // Else
        /* Smell strange. */
        public static final RegistryObject<Item> spicy = register(Itemlist::sy,"spicy");


        //todo  There more of Party Project's Food should sign in.
        /**
         Party Project
         <br>
         Make time tight!
        */

        /**
        // Item for test.
        <br><br>
        public static final RegistryObject<Item> someoneice = register(HPItemlist::someoneice,"someoneice");
 <br>   public static final RegistryObject<Item> slb = register(()-> HPFood.drink(1,1F,false,false,true,UseAnim.DRINK),"slb");
        */

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}