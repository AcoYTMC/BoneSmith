package net.acoyt.bone_smith.recipes;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

public class GraveyardHatBrewingRecipe extends BrewingRecipe {
    private static ItemStack INPUT = new ItemStack(Items.LEATHER_HELMET);
    private static ItemStack REAGENT = new ItemStack(ItemInit.WITHERED_FOSSIL);
    private static ItemStack OUTPUT = new ItemStack(ItemInit.GRAVEYARD_HAT);

    public GraveyardHatBrewingRecipe() {
        super(INPUT, REAGENT, OUTPUT);
    }
}