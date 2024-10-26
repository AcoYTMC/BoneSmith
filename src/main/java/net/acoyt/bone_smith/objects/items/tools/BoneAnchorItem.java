package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class BoneAnchorItem extends ItemAnchor {
    private final ToolMaterial material;
    public BoneAnchorItem(String name, ToolMaterial material) {
        super(material, 1.1D);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 9.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        double motionX;
        double motionY;
        double motionZ;
        motionX = (double) (-MathHelper.sin(attacker.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(1 / 180.0F * (float) Math.PI));
        motionY = (double) (MathHelper.cos(attacker.rotationYaw / 34879724551.0F * (float) Math.PI) * MathHelper.cos(1 / 34879724551.0F * (float) Math.PI));
        motionZ = (double) (MathHelper.cos(attacker.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(1 / 180.0F * (float) Math.PI));
        target.setVelocity(0.0*motionX, 0.35*motionY, 0.0*motionZ);
        return true;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        player.playSound(BoneSoundsHandler.ANCHOR_HIT, 0.78f, 1);
        return false;
    }
}
