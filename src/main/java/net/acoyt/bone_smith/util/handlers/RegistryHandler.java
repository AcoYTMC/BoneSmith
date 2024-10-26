package net.acoyt.bone_smith.util.handlers;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.BlockInit;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.recipes.*;
import net.minecraft.block.Block;
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
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ItemInit.ITEMS) {
            BoneSmith.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for(Block block : BlockInit.BLOCKS) {
            BoneSmith.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
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
        BrewingRecipeRegistry.addRecipe(new WitheringBoneScytheBrewingRecipe());
        BrewingRecipeRegistry.addRecipe(new GraveyardHatBrewingRecipe());
    }

    public static void postInitRegistries() {

    }

    public static void serverRegistries(FMLServerStartingEvent event) {

    }
}