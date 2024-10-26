package net.acoyt.bone_smith.objects.items;

import com.google.common.base.Predicates;
import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class WearableItem extends Item {
    public final EntityEquipmentSlot armorType;
    private final ItemArmor.ArmorMaterial material;
    public WearableItem(String name, ItemArmor.ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
        super();
        setTranslationKey(name);
        setRegistryName(name);
        this.material = material;
        armorType = equipmentSlot;
        maxStackSize = 1;
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
    }

    public static final IBehaviorDispenseItem DISPENSER_BEHAVIOR = new BehaviorDefaultDispenseItem() {
        protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
            ItemStack itemstack = ItemArmor.dispenseArmor(source, stack);
            return itemstack.isEmpty() ? super.dispenseStack(source, stack) : itemstack;
        }
    };

    public static ItemStack dispenseArmor(IBlockSource blockSource, ItemStack stack) {
        BlockPos blockpos = blockSource.getBlockPos().offset((EnumFacing)blockSource.getBlockState().getValue(BlockDispenser.FACING));
        List<EntityLivingBase> list = blockSource.getWorld().<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(blockpos), Predicates.and(EntitySelectors.NOT_SPECTATING, new EntitySelectors.ArmoredMob(stack)));

        if (list.isEmpty()) {
            return ItemStack.EMPTY;
        }
        else {
            EntityLivingBase entitylivingbase = list.get(0);
            EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(stack);
            ItemStack itemstack = stack.splitStack(1);
            entitylivingbase.setItemStackToSlot(entityequipmentslot, itemstack);

            if (entitylivingbase instanceof EntityLiving) {
                ((EntityLiving)entitylivingbase).setDropChance(entityequipmentslot, 2.0F);
            }

            return stack;
        }
    }

    @SideOnly(Side.CLIENT)
    public EntityEquipmentSlot getEquipmentSlot() {
        return this.armorType;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
        ItemStack itemstack1 = player.getItemStackFromSlot(entityequipmentslot);

        if (itemstack1.isEmpty()) {
            player.setItemStackToSlot(entityequipmentslot, itemstack.copy());
            itemstack.setCount(0);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        }
        else {
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        }
    }
}
