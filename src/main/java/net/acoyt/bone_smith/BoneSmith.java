package net.acoyt.bone_smith;

import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.proxy.CommonProxy;
import net.acoyt.bone_smith.tabs.BoneTab;
import net.acoyt.bone_smith.util.Reference;
import net.acoyt.bone_smith.util.handlers.BoneEventHandler;
import net.acoyt.bone_smith.util.handlers.BoneSoundsHandler;
import net.acoyt.bone_smith.util.handlers.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

import java.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BoneSmith {
    public static SimpleNetworkWrapper network;
    public static File config;

    public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("bone_smith:a");

    @Instance
    public static BoneSmith instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs BONESMITHTAB = new BoneTab("bonesmithtab");

    @SubscribeEvent
    protected void registerItems(RegistryEvent.Register<Item> event) {
    }

    @SubscribeEvent
    protected void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries(event);
        network = NetworkRegistry.INSTANCE.newSimpleChannel(Tags.MOD_ID);
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistries();
        BoneSoundsHandler.registerSounds();
        BoneEventHandler.registerEvents();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.postInitRegistries();
    }
    @EventHandler
    public void serverInit(FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }
}
