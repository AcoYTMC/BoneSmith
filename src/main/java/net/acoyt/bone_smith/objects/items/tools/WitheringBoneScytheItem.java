package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class WitheringBoneScytheItem extends ItemScythe {
    private final ToolMaterial material;
    private final String displayName;
    public WitheringBoneScytheItem(String name, ToolMaterial material) {
        super(material, 1.4D);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 8.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);

        this.displayName = "item.withering_bone_scythe.desc";
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
        target.setVelocity(-0.4*motionX, 0.2*motionY, -0.4*motionZ);
        target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 80, 5));
        return true;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        player.playSound(BoneSoundsHandler.SCYTHE_HIT, 0.73f, 1);
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(this.getDescLocal());
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }

    @SideOnly(Side.CLIENT)
    public String getDescLocal() {
        return I18n.translateToLocal(this.displayName);
    }
}
