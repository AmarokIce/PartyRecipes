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
        public static final RegistryObject<Item> Plant_Ash = register(Itemlist::item,"plantash");
        public static final RegistryObject<Item> hotter = register(Itemlist::item,"hotter");
        public static final RegistryObject<Item> book = register(Itemlist::item, "book_of_cook");
        public static final RegistryObject<Item> box = register(Itemlist::item,"box");
        public static final RegistryObject<Item> oil = register(Itemlist::item, "oil");
        public static final RegistryObject<Item> pigOil = register(Itemlist::item, "pig_oil");

        /* House Party */
        public static final RegistryObject<Item> appleJuice = register(()-> HPFood.drink(2,2F,false,false,true),"applejuice");
        public static final RegistryObject<Item> pasta = register(HPItemlist::pasta,"pasta");
        public static final RegistryObject<Item> cheesepasta = register(()-> HPFood.bowl( 15, 20F, false, false, true, UseAnim.EAT), "cheesepasta");
        public static final RegistryObject<Item> mushpasta = register(()-> HPFood.bowl( 15, 20F, false, false, true, UseAnim.EAT), "mushpasta");
        public static final RegistryObject<Item> tomatopasta = register(()-> HPFood.bowl( 15, 20F, false, false, true, UseAnim.EAT), "tomatopasta");
        public static final RegistryObject<Item> marshmallow = register(()-> HPFood.food(1,0.2F,false,true,true),"marshmallow");
        public static final RegistryObject<Item> cream = register(()-> HPFood.food(1,0F,false,true,true),"cream");
        public static final RegistryObject<Item> appleCube = register(()-> HPFood.food(1,0.5F,false,false,true),"applecube");
        public static final RegistryObject<Item> appleJar = register(()-> HPFood.capfood(2,2F,false,true,true, UseAnim.DRINK),"applejar");
        public static final RegistryObject<Item> goldenAppleJar = register(()-> HPFood.capfood(4,2F,false,true,true, UseAnim.DRINK),"goldenapplejar");
        public static final RegistryObject<Item> coffeeBean = register(()-> HPFood.food(1,1,false,false,false),"coffeebean");
        public static final RegistryObject<Item> soda = register(HPItemlist::item, "soda");
        public static final RegistryObject<Item> waffles = register(()-> HPFood.food(2,1F,false,true,true),"waffles");
        public static final RegistryObject<Item> muffin = register(()-> HPFood.capfood(4,2F,false,true,true, UseAnim.EAT),"muffin");
        public static final RegistryObject<Item> eyeCream = register(()-> HPFood.food(6,4F,false,false,true),"eye-cream");
        public static final RegistryObject<Item> bagel = register(()-> HPFood.food(2,4F,false,true,true),"bagel");
        public static final RegistryObject<Item> cookies = register(()-> HPFood.food(1,0.5F,false,true,true),"cookies");
        public static final RegistryObject<Item> tomato = register(()-> HPFood.food(1,1,false,false,false), "tomato");
        public static final RegistryObject<Item> corp = register(()-> HPFood.food(1,1,false,false,false), "corp");
        public static final RegistryObject<Item> WhiteGourd = register(HPItemlist::item,"whitegourd");
        public static final RegistryObject<Item> WhiteGourdSide = register(()-> HPFood.food(3,2.5F,false,true,true),"whitegourdside");
        public static final RegistryObject<Item> PineapplePie = register(()-> HPFood.food(5,6.5F,false,true,true),"pineapplepie");
        public static final RegistryObject<Item> creamCheese = register(()-> HPFood.DrinkE(1,0F,false,true,true),"creamcheese");
        public static final RegistryObject<Item> creamcheesebagel = register(()-> HPFood.food(4,6F,false,true,true),"creamcheesebagel");
        public static final RegistryObject<Item> cheesecream = register(HPItemlist::Cream,"cheesecream");
        public static final RegistryObject<Item> syrup = register(Itemlist::syrup,"syrup");
        public static final RegistryObject<Item> sodaWater = register(()-> HPFood.drink(2,2F,false,true,true),"sodawater");
        public static final RegistryObject<Item> capSoda = register(()-> HPFood.DrinkE(1,0.5F,false,false,true), "capsoda");
        public static final RegistryObject<Item> hotchoco = register(()-> HPFood.capfood(4,6F,false,false,true, UseAnim.DRINK),"hotchoco");
        public static final RegistryObject<Item> leavetea = register(()-> HPFood.capfood(2,2F,false,true,true, UseAnim.DRINK),"leavetea");
        public static final RegistryObject<Item> coffee = register(()-> HPFood.Cofe(4,1.5F,true,false,true),"coffee");
        public static final RegistryObject<Item> jsSoda = register(HPItemlist::JsSoda, "jssoda"); //劲爽苏打
        public static final RegistryObject<Item> tsSoda = register(HPItemlist::TsSoda, "tssoda"); //提神苏打
        public static final RegistryObject<Item> Cider = register(()-> HPFood.sweet(2,5F,false,true,true), "cider");
        public static final RegistryObject<Item> SodaCoffee = register(()-> HPFood.Cofe(2,5F,false,false,true), "sodacoffee");
        public static final RegistryObject<Item> tealeave = register(HPItemlist::item, "tealeave");
        public static final RegistryObject<Item> pineapple = register(()-> HPFood.food(4,4,true,false,true), "pineapple");
        public static final RegistryObject<Item> pepper = register(()-> HPFood.food(1,1,false,false,true), "pepper");
        public static final RegistryObject<Item> drycream = register(()-> HPFood.food(1,0F,false,true,true), "drycream");
        public static final RegistryObject<Item> corpersugar = register(HPItemlist::item,"corpersugar");
        public static final RegistryObject<Item> popover = register(()-> HPFood.food(1,0F,false,false,true),"popover");
        public static final RegistryObject<Item> popo = register(()-> HPFood.food(4,4,true,false,true), "popo");
        public static final RegistryObject<Item> chocopopo = register(()-> HPFood.food(6,4,true,false,true), "chocopopo");
        public static final RegistryObject<Item> corpflour = register(HPItemlist::item,"corpflour");
        public static final RegistryObject<Item> corpbread = register(()-> HPFood.food(4,6F,false,false,true),"corpbread");
        public static final RegistryObject<Item> creamcorpbread = register(()-> HPFood.food(8,6F,false,false,true),"creamcorpbread");
        public static final RegistryObject<Item> cookcorp = register(()-> HPFood.food(4,2F,false,false,true),"cookcorp");
        public static final RegistryObject<Item> tomatoso = register(()-> HPFood.food(1,0F,false,false,true),"tomatoso"); //番茄沙司
        public static final RegistryObject<Item> tea = register(()-> HPFood.drink(4,2F,false,false,true),"tea");
        public static final RegistryObject<Item> cocotea = register(()-> HPFood.drink(4,4F,false,false,true),"cocotea");
        public static final RegistryObject<Item> salt = register(HPItemlist::item,"salt");
        public static final RegistryObject<Item> copp = register(HPItemlist::item,"copp"); //濾網
        public static final RegistryObject<Item> cofeflour = register(()-> HPFood.food(1,0F,false,false,true), "cofeflour");
        public static final RegistryObject<Item> saltnut = register(()-> HPFood.food(4,2F,false,true,true), "saltnut");
        public static final RegistryObject<Item> CheeseBall = register(()-> HPFood.food(6,2F,false,true,true), "cheeseball");
        public static final RegistryObject<Item> Chicken = register(()-> HPFood.food(6,2F,false,false,true), "chicken");
        public static final RegistryObject<Item> FreidChicken = register(()-> HPFood.food(6,2F,false,false,true), "fried_chicken");

        /* Dinner Party */
        public static final RegistryObject<Item> chikuwa = register(()-> DPFood.food(6,4F,true,true,true), "chikuwa");
        public static final RegistryObject<Item> fish_cake = register(()-> DPFood.food(4,4F,true,true,true), "fishcake");
        public static final RegistryObject<Item> tofu = register (()-> DPFood.food(1,1.1F,false,true,true),"tofu");
        public static final RegistryObject<Item> freezntofu = register (()-> DPFood.food(2,1.5F,false,false,true),"freezntofu");
        public static final RegistryObject<Item> tofuMeat = register (()-> DPFood.food(4,2.5F,true,false,true),"tofumeat");
        public static final RegistryObject<Item> cooktofu = register (()-> DPFood.food(8,4.6F,false,false,true),"cooktofu");
        public static final RegistryObject<Item> cooktofumeat = register (()-> DPFood.food(10,6F,true,false,true),"cooktofumeat");
        public static final RegistryObject<Item> bacinwithegg = register (()-> DPFood.food(10,6F,true,false,true),"bacinwithegg");
        public static final RegistryObject<Item> shepsop = register (()-> DPFood.food(10,6F,true,false,true),"sheepsop");
        public static final RegistryObject<Item> fastver = register (()-> DPFood.food(10,6F,true,false,true),"fastver"); //蔬菜自熱火鍋
        public static final RegistryObject<Item> pigu = register(()-> DPFood.bowl(14,20F,false,false,true, UseAnim.EAT), "pigu");

        /*NewYear Party*/
        public static final RegistryObject<Item> NewYearCake = register(()-> YPFood.food(10,10,false,false,true), "new_year_cake");
        public static final RegistryObject<Item> Yuan = register(()-> YPFood.food(10,10,false,false,true), "yuan");
        public static final RegistryObject<Item> BowlsYearCake = register(()-> YPFood.food(30,30,false,false,true), "bowl_year_cake");
        public static final RegistryObject<Item> CookYearCake = register(()-> YPFood.food(15,10,false,true,true),"cook_year_cake");
        public static final RegistryObject<Item> fish_meat = register(YPFood::item, "fish_meat_pie_mix");
        public static final RegistryObject<Item> fishpie = register(()-> YPFood.food(20,20,true,false,true), "fish_pie");
        public static final RegistryObject<Item> FishMeatPie = register(()->YPFood.food(20,20,false,false,true), "fish_pie");
        public static final RegistryObject<Item> CheeseCake = register(()-> YPFood.food(15,10,false,true,true), "cheese_cake");
        public static final RegistryObject<Item> pancake = register(()-> YPFood.food(2,1,false,true,true), "pancake");
        public static final RegistryObject<Item> SpringRoos = register(()-> YPFood.food(5,2,false,true,true), "spring_roos"); //春卷
        public static final RegistryObject<Item> ChickenRoos = register(()-> YPFood.food(6,3,false,true,true), "chicken_roos"); //鸡卷
        public static final RegistryObject<Item> SaltyRicePudding = register(()-> YPFood.food(5,10,false,true,true), "salty_rice_pudding"); //碗糕
        public static final RegistryObject<Item> SpringCake = register(()-> YPFood.food(5,3,false,false,true), "spring_cake");
        public static final RegistryObject<Item> paka = register(()-> YPFood.food(3,2,false,true,true), "paka");//面排叉
        public static final RegistryObject<Item> tofuBuger = register(()-> YPFood.food(10,5,false,false,true), "tofu_buger");
        public static final RegistryObject<Item> wolf_sweet = register(()-> YPFood.food(2,2,true,true,true), "wolf_sweet");
        public static final RegistryObject<Item> pmdr = register(()-> YPFood.food(5,5,false,false,true), "pmdr"); //帕尔木丁 新疆特色
        public static final RegistryObject<Item> pkm = register(()-> YPFood.food(5,2,false,true,true), "pkm"); //南瓜泥
        public static final RegistryObject<Item> coffeePie = register(()-> YPFood.food(7,5,true,true,true), "coffee_pie");
        public static final RegistryObject<Item> shepSope = register(()-> YPFood.food(15,16,false,false,true), "S_SP");
        public static final RegistryObject<Item> TJP = register(YPFood::TJP, "tjp");//土腌鸡
        public static final RegistryObject<Item> CTJP = register(YPFood::CTJP, "ctjp");//吊烤鸡
        public static final RegistryObject<Item> CTJ = register(()-> YPFood.food(10,10,true,false,true), "ctj");//土烤鸡
        public static final RegistryObject<Item> XKZP = register(()-> YPFood.food(10,10,true,false,true), "xkzp"); //香炒猪肉片
        public static final RegistryObject<Item> bog = register(()-> YPFood.food(4,0,false,false,true), "bog"); //包子
        public static final RegistryObject<Item> redbBread = register(()-> YPFood.food(5,4,false,false,true), "rb_bread"); //红豆面包
        public static final RegistryObject<Item> npl = register(()-> YPFood.food(4,2,false,false,true), "npl"); //拿破仑 酥饼
        public static final RegistryObject<Item> sunCake = register(()-> YPFood.food(2,2,false,false,true), "sun_cake"); //太阳饼-台湾地区小吃

        /* Daily Party */
        public static final RegistryObject<Item> softCake = register(()-> HDFood.food(2,2F,false,false,true),"softcake");
        public static final RegistryObject<Item> chocSoda = register(()-> HDFood.drink(5,2F,false,false,true), "sodachoco");
        public static final RegistryObject<Item> fruitCake = register(()-> HDFood.food(4,2F,false,false,true),"fruitcake");

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