package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

import javax.annotation.Nonnull;

public class BoneHelmetBrewingRecipe extends BrewingRecipe {

    private static ItemStack INPUT = new ItemStack(Items.DIAMOND_HELMET);
    private static ItemStack REAGENT = new ItemStack(ItemInit.FOSSIL);
    private static ItemStack OUTPUT = new ItemStack(ItemInit.HELMET_BONE_INFUSED);

    public BoneHelmetBrewingRecipe(@Nonnull ItemStack start, @Nonnull ItemStack input, @Nonnull ItemStack output) {

        super(INPUT, REAGENT, OUTPUT);
        INPUT = start;
        REAGENT = input;
        OUTPUT = output;
    }
}
