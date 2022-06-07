package club.someoneice.party_recipes.common.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraft.world.level.Level;

public class ReturnItems extends Item {
    private Item getItem;

    public ReturnItems(Item.Properties Properties, Item getItem) {
        super(Properties);
        this.getItem = getItem;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity living) {
        if (living instanceof Player) {
            Player player = (Player) living;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(getItem));
        }
        return super.finishUsingItem(item, LV, living);
    }

}
