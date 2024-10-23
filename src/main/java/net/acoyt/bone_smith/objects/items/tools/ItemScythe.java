package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemScythe extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.WEB);

    protected ItemScythe(Item.ToolMaterial material) {
        super(material, EFFECTIVE_ON);
        this.attackSpeed = -2.7F;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, net.minecraft.enchantment.Enchantment enchantment) {
        return enchantment.type.canEnchantItem(stack.getItem());
    }
}
