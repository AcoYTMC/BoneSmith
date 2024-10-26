package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemScythe extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.WEB);
    private static final Set<Enchantment> APPLICABLE = Sets.newHashSet(Enchantments.FIRE_ASPECT, Enchantments.SWEEPING, Enchantments.LOOTING);
    private static final Set<Enchantment> NOT_APPLICABLE = Sets.newHashSet(Enchantments.EFFICIENCY, Enchantments.FORTUNE, Enchantments.SILK_TOUCH);

    protected ItemScythe(Item.ToolMaterial material) {
        super(material, EFFECTIVE_ON);
        this.attackSpeed = -2.7F;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment.type.canEnchantItem(stack.getItem());
    }
}
