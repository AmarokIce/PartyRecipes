package club.someoneice.party_recipes.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CraftingItems extends Item {
    private ItemStack Items;
    private int DamageNumber;

    public CraftingItems(int MixStacks, int MixDamage, int DamageNumber, ItemStack getItem, CreativeModeTab tab) {
        super(new Properties().stacksTo(MixStacks).durability(MixDamage).tab(tab));
        this.Items = getItem;
        this.DamageNumber = DamageNumber;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack item = new ItemStack(this);
        item.setDamageValue(itemstack.getDamageValue() + DamageNumber);
        if (item.getDamageValue() >= item.getMaxDamage()) {
            return Items;
        }
        return item;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
}

