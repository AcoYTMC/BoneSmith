package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;

public class BoneScytheItem extends ItemScythe {
    private final ToolMaterial material;
    public BoneScytheItem(String name, ToolMaterial material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 9.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
    }
}