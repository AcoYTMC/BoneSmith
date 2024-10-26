package net.acoyt.bone_smith.objects.items.cosmetics;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WearableHat extends Item {
    public WearableHat(String name) {
        super();
        setTranslationKey(name);
        setRegistryName(name);
        maxStackSize = 1;
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
        return (armorType == EntityEquipmentSlot.HEAD);
    }
}