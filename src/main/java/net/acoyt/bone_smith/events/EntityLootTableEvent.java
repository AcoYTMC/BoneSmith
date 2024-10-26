package net.acoyt.bone_smith.events;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class EntityLootTableEvent {
    @SubscribeEvent
    public void lootTableDrop(LivingDropsEvent event) {
        Random random = new Random();
        if (event.getEntityLiving() instanceof EntitySkeleton) {
            if (random.nextInt(20) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.FOSSIL), 0.0f);
            }
            if (random.nextInt(10) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.SHARP_BONE), 0.0f);
            }
        }
        if (event.getEntityLiving() instanceof EntitySkeletonHorse) {
            if (random.nextInt(4) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.FOSSIL), 0.0F);
            }
        }
        if (event.getEntityLiving() instanceof EntityWitch) {
            if (random.nextInt(5) == 0) {
                event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHERED_FOSSIL), 0.0F);
            }
        }
    }
}
