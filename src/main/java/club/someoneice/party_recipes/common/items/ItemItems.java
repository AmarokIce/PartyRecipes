package club.someoneice.party_recipes.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemItems extends Item {
    public ItemItems(Item getItem, int stacks, CreativeModeTab tab) {
        super(new Item.Properties().stacksTo(stacks).craftRemainder(getItem).tab(tab));
    }
}
