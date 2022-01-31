package com.someoneice.partyrecipes.Init;

import com.someoneice.partyrecipes.Client.TAB.partyblock;
import com.someoneice.partyrecipes.MissingNo.ItemBlock;
import com.someoneice.partyrecipes.partyrecipes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = partyrecipes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockRegistry {
    public static final DeferredRegister<Block> BlockList = DeferredRegister.create(Block.class, partyrecipes.MODID);

    public static final RegistryObject<Block> sodamachine = register(Blocklist.Soda(Material.STONE), "sodamachine");
    public static final RegistryObject<Block> icewolf = register(Blocklist.Icewolf(Material.WOOD), "icewolf");
    public static final RegistryObject<Block> cmlgj = register(Blocklist.dgjar(Material.GLASS), "cmlgj");
    public static final RegistryObject<Block> seedbag = register(Blocklist.seedbag(Material.PLANT), "seedbag");

    public static final RegistryObject<Block> tomatocrop = register(Blocklist.Corps(Material.PLANT), "tomatocrop");
    public static final RegistryObject<Block> corpcrop = register(Blocklist.Corps(Material.PLANT), "corpcrop");
    public static final RegistryObject<Block> teacrop = register(Blocklist.Corps(Material.PLANT), "teacrop");
    public static final RegistryObject<Block> beancrop = register(Blocklist.Corps(Material.PLANT), "beancrop");
    public static final RegistryObject<Block> pineapplecrop = register(Blocklist.Corps(Material.PLANT), "pineapplecrop");
    public static final RegistryObject<Block> peppercrop = register(Blocklist.Corps(Material.PLANT), "peppercrop");
    public static final RegistryObject<Block> peanut = register(Blocklist.Corps(Material.PLANT), "peanut");
    public static final RegistryObject<Block> rice = register(Blocklist.Corps(Material.PLANT), "rice");
    public static final RegistryObject<Block> redbeans = register(Blocklist.Corps(Material.PLANT), "redbeans");

    // Pizza
    public static final RegistryObject<Block> CheesePizza = register(Blocklist.pizza(Material.WOOL), "cheese_pizza");

    public static final RegistryObject<Block> BeefPizza = register(Blocklist.pizza(Material.WOOL), "beef_pizza");

    //public static final RegistryObject<Block> cakesoda = register(Blocklist.Cakesoda(), "cakesoda");

    public static RegistryObject<Block> register(@Nonnull Block block, @Nonnull String names) {
        ItemRegistry.register(() -> new ItemBlock(block, new Item.Properties().tab(partyblock.BK)), names);
        return registerBaseBlock(() -> block, names);
    }

    public static RegistryObject<Block> registerBaseBlock(@Nonnull Supplier<Block> initializer, @Nonnull String name) {
        return BlockList.register(name, initializer);
    }
}
