package net.acoyt.bone_smith.objects.items;

import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BoneBoosterItem extends Item {
    public BoneBoosterItem(String name) {
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        double motionX;
        double motionY;
        double motionZ;
        motionX = (double) (-MathHelper.sin(playerIn.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(1 / 180.0F * (float) Math.PI));
        motionY = (double) (MathHelper.cos(playerIn.rotationYaw / 34879724551.0F * (float) Math.PI) * MathHelper.cos(1 / 34879724551.0F * (float) Math.PI));
        motionZ = (double) (MathHelper.cos(playerIn.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(1 / 180.0F * (float) Math.PI));
        playerIn.setVelocity(1.7*motionX, 0.8*motionY, 1.7*motionZ);
        playerIn.fallDistance = 0.0F;
        playerIn.getCooldownTracker().setCooldown(this, 70);
        playerIn.playSound(BoneSoundsHandler.DASH, 1, 1);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
