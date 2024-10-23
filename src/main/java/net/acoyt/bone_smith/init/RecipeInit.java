package net.acoyt.bone_smith.init;

import net.acoyt.bone_smith.recipes.BoneHelmetBrewingRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeInit {
    public static final List<BrewingRecipe> BREWING_RECIPES = new ArrayList<BrewingRecipe>();

    //Brewing Recipes
    public static final BrewingRecipe BONE_HELMET = new BrewingRecipe(new ItemStack(Items.DIAMOND_HELMET), new ItemStack(ItemInit.FOSSIL), new ItemStack(ItemInit.HELMET_BONE_INFUSED));
    public static final BrewingRecipe BONE_CHESTPLATE = new BrewingRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(ItemInit.FOSSIL), new ItemStack(ItemInit.CHESTPLATE_BONE_INFUSED));
    public static final BrewingRecipe BONE_LEGGINGS = new BrewingRecipe(new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(ItemInit.FOSSIL), new ItemStack(ItemInit.LEGGINGS_BONE_INFUSED));
    public static final BrewingRecipe BONE_BOOTS = new BrewingRecipe(new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(ItemInit.FOSSIL), new ItemStack(ItemInit.BOOTS_BONE_INFUSED));
}
