package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.Sets;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
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
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        attacker.playSound(BoneSoundsHandler.SCYTHE_HIT, 1, 1);
        return true;
    }
}
