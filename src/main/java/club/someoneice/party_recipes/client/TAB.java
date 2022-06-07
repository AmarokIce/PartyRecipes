package club.someoneice.party_recipes.client;

import club.someoneice.party_recipes.init.ItemRegsiter;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class TAB {
    public static final CreativeModeTab MAIN = new CreativeModeTab("main") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegsiter.PINEAPPLE.get());
        }
    };
    public static final CreativeModeTab BLOCK = new CreativeModeTab("block") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegsiter.PINEAPPLE.get());
        }
    };

    public static final CreativeModeTab SEED = new CreativeModeTab("seed") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegsiter.PINEAPPLE.get());
        }
    };

    public static final CreativeModeTab FRUIT = new CreativeModeTab("fruit") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegsiter.PINEAPPLE.get());
        }
    };
}
