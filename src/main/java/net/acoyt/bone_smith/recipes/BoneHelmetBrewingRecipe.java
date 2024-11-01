package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

public class BoneHelmetBrewingRecipe extends BrewingRecipe {
    private static ItemStack INPUT = new ItemStack(Items.DIAMOND_HELMET);
    private static ItemStack REAGENT = new ItemStack(ItemInit.FOSSIL);
    private static ItemStack OUTPUT = new ItemStack(ItemInit.HELMET_BONE_INFUSED);

    public BoneHelmetBrewingRecipe() {
        super(INPUT, REAGENT, OUTPUT);
    }
}