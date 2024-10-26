package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.BlockInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(BlockInit.BONE_BRICKS), new ItemStack(BlockInit.CRACKED_BONE_BRICKS), 0.4F);
    }
}
