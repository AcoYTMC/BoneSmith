package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.Multimap;
import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.interfaces.IHasModel;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    public static final Item block = null;
    private final float attackDamage;
    private final ToolMaterial material;
    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
        this.attackDamage = 3.0F + material.getAttackDamage();
        this.material = material;
        this.maxStackSize = 1;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) 2.5, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4, 0));
        }

        return multimap;
    }

    @Override
    public void registerModels() {
        BoneSmith.proxy.registerItemRenderer(this, 0, "bone_smith");
    }
}
