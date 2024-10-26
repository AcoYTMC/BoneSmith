package net.acoyt.bone_smith.util.handlers;

import net.acoyt.bone_smith.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BoneSoundsHandler {
    public static SoundEvent SCYTHE_HIT;
    public static SoundEvent ANCHOR_HIT;
    public static SoundEvent DASH;
    public static SoundEvent PLUSH_HIT;

    public static void registerSounds() {
        SCYTHE_HIT = registerSound("weapons.hit.scythe_hit");
        ANCHOR_HIT = registerSound("weapons.hit.anchor_hit");
        DASH = registerSound("tools.bone_booster.dash");
        PLUSH_HIT = registerSound("cosmetic.sepulchre_sanguine.squeak");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
