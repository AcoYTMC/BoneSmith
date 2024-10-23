package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

public class BoneLeggingsBrewingRecipe extends BrewingRecipe {
    private static ItemStack INPUT = new ItemStack(Items.DIAMOND_LEGGINGS);
    private static ItemStack REAGENT = new ItemStack(ItemInit.FOSSIL);
    private static ItemStack OUTPUT = new ItemStack(ItemInit.LEGGINGS_BONE_INFUSED);

    public BoneLeggingsBrewingRecipe() {
        super(INPUT, REAGENT, OUTPUT);
    }
}