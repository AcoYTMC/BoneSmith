package net.acoyt.bone_smith.objects.items.armor;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {
    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
    }
}
