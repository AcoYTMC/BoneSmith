package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class BoneScytheItem extends ItemScythe {
    private final ToolMaterial material;
    public BoneScytheItem(String name, ToolMaterial material) {
        super(material, 1.4D);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 10.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        attacker.playSound(BoneSoundsHandler.SCYTHE_HIT, 1, 1);
        return true;
    }
}