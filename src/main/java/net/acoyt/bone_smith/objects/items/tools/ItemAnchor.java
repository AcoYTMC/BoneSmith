package net.acoyt.bone_smith.objects.items.tools;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.Set;

public class ItemAnchor extends ItemSword {
    protected float efficiency;
    protected float attackDamage;
    protected double attackSpeed;
    protected Item.ToolMaterial toolMaterial;

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);

    protected ItemAnchor(Item.ToolMaterial material, double weaponSpeed) {
        super(material);
        this.attackSpeed = weaponSpeed;
        this.attackDamage = 11.5F;
        this.efficiency = 4.0F;
        this.toolMaterial = material;
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        Block block = blockIn.getBlock();

        if (block == Blocks.OBSIDIAN) {
            return this.toolMaterial.getHarvestLevel() == 3;
        }
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE) {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK) {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE) {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE) {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE) {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE) {
                                Material material = blockIn.getMaterial();

                                if (material == Material.ROCK) {
                                    return true;
                                }
                                else if (material == Material.IRON) {
                                    return true;
                                }
                                else {
                                    return material == Material.ANVIL;
                                }
                            }
                            else {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        }
                        else {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    }
                    else {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                }
                else {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            }
            else {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        }
        else {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        attacker.playSound(BoneSoundsHandler.ANCHOR_HIT, 1, 1);
        return true;
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
