package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemScythe extends ItemSword {

    protected ToolMaterial material;
    protected float attackDamage = 9.5f;
    protected double attackSpeed = 0.0D;

    protected ItemScythe(Item.ToolMaterial materialIn, double weaponSpeed) {
        super(materialIn);
        attackSpeed = weaponSpeed;
        material = materialIn;
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();
        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon Modifier", this.attackSpeed - 4.0D, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon Modifier", this.attackDamage, 0));
        }
        return multimap;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }
}
