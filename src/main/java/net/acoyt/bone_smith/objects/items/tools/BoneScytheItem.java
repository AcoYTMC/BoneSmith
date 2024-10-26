package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class BoneScytheItem extends ItemScythe {
    private final ToolMaterial material;
    public BoneScytheItem(String name, ToolMaterial material) {
        super(material, 1.4D);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 8.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        stack.damageItem(2, player);
        player.playSound(BoneSoundsHandler.SCYTHE_HIT, 0.73f, 1);
        return false;
    }
}