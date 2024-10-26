package net.acoyt.bone_smith.objects.items.cosmetics;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WearableItem extends Item {
    private final EntityEquipmentSlot slot;

    private final ItemArmor.ArmorMaterial material;
    public WearableItem(String name, ItemArmor.ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
        super();
        setTranslationKey(name);
        setRegistryName(name);
        this.material = material;
        this.slot = equipmentSlot;
        maxStackSize = 1;
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public EntityEquipmentSlot getEquipmentSlot() {
        return this.slot;
    }
}