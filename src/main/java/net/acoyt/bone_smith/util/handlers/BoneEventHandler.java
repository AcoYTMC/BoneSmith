package net.acoyt.bone_smith.util.handlers;

import net.acoyt.bone_smith.events.EntityLootTableEvent;
import net.minecraftforge.common.MinecraftForge;

public class BoneEventHandler {
    public static void registerEvents() {
        EntityLootTableEvent lootTableEvent = new EntityLootTableEvent();

        MinecraftForge.EVENT_BUS.register(lootTableEvent);
    }
}
