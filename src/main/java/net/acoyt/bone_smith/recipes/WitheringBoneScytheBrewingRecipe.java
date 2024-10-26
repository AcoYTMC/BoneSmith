package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

public class WitheringBoneScytheBrewingRecipe extends BrewingRecipe {
    private static ItemStack INPUT = new ItemStack(ItemInit.BONE_SCYTHE);
    private static ItemStack REAGENT = new ItemStack(ItemInit.WITHERED_FOSSIL);
    private static ItemStack OUTPUT = new ItemStack(ItemInit.WITHERING_BONE_SCYTHE);

    public WitheringBoneScytheBrewingRecipe() {
        super(INPUT, REAGENT, OUTPUT);
    }
}