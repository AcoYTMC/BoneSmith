package net.acoyt.bone_smith.objects.items.tools;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.interfaces.IHasModel;

public class BoneScytheItem extends ItemScythe implements IHasModel {
    private final ToolMaterial material;
    public BoneScytheItem(String name, ToolMaterial material, float speed) {
        super(material, speed);
        setTranslationKey(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 7.5F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
        this.attackSpeed = -2.7F;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
    }

    @Override
    public void registerModels() {
        BoneSmith.proxy.registerItemRenderer(this, 0, "inventory");
    }
}