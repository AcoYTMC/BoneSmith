package net.acoyt.bone_smith.objects.items.cosmetics;

import net.acoyt.bone_smith.objects.items.WearableItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class GraveyardHatCosmetic extends WearableItem {
    public GraveyardHatCosmetic(String name, ItemArmor.ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
        super(name, material, equipmentSlot);
        equipmentSlot = EntityEquipmentSlot.HEAD;
    }
}
