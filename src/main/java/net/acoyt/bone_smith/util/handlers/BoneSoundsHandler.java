package net.acoyt.bone_smith.util.handlers;

import net.acoyt.bone_smith.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BoneSoundsHandler {
    public static SoundEvent TOO_MUCH_COCAINE;
    public static SoundEvent MEGALOVANIA;
    public static SoundEvent MEGALOVANIA_AT_HOME;

    public static void registerSounds() {
        TOO_MUCH_COCAINE = registerSound("bone_smith:records.megalovania");
        MEGALOVANIA = registerSound("bone_smith:records.megalovania");
        MEGALOVANIA_AT_HOME = registerSound("bone_smith:records.megalovania_at_home");

    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
