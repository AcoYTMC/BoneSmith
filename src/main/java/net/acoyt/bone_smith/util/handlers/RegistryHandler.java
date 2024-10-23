package net.acoyt.bone_smith.util.handlers;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.recipes.BoneBootsBrewingRecipe;
import net.acoyt.bone_smith.recipes.BoneChestplateBrewingRecipe;
import net.acoyt.bone_smith.recipes.BoneHelmetBrewingRecipe;
import net.acoyt.bone_smith.recipes.BoneLeggingsBrewingRecipe;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            BoneSmith.proxy.registerItemRenderer(item, 0, "inventory");
        }
    }

    public static void preInitRegistries(FMLPreInitializationEvent event) {

    }

    public static void initRegistries() {
        BoneSmith.proxy.render();
        BrewingRecipeRegistry.addRecipe(new BoneHelmetBrewingRecipe());
        BrewingRecipeRegistry.addRecipe(new BoneChestplateBrewingRecipe());
        BrewingRecipeRegistry.addRecipe(new BoneLeggingsBrewingRecipe());
        BrewingRecipeRegistry.addRecipe(new BoneBootsBrewingRecipe());
    }

    public static void postInitRegistries() {

    }

    public static void serverRegistries(FMLServerStartingEvent event) {

    }
}