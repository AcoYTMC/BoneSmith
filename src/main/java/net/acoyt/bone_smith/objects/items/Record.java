package net.acoyt.bone_smith.objects.items;

import com.google.common.collect.Maps;
import net.acoyt.bone_smith.BoneSmith;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

import java.util.Map;

public class Record extends ItemRecord {
    private static final Map<SoundEvent, ItemRecord> RECORDS = Maps.<SoundEvent, ItemRecord>newHashMap();
    private final SoundEvent sound;
    private final String displayName;

    public Record(String recordName, SoundEvent sound) {
        super(recordName, sound);
        this.displayName = "item.record." + recordName + ".desc";
        this.sound = sound;
        this.maxStackSize = 1;
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
        RECORDS.put(this.sound, this);
    }
}
