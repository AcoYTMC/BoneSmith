package net.acoyt.bone_smith.objects.items;

import com.google.common.collect.Maps;
import net.acoyt.bone_smith.BoneSmith;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

import java.util.Map;

public class MegalovaniaAtHomeRecord extends ItemRecord {
    private static final Map<SoundEvent, ItemRecord> RECORDS = Maps.<SoundEvent, ItemRecord>newHashMap();
    private final SoundEvent sound;
    private final String displayName;

    public MegalovaniaAtHomeRecord(String recordName, SoundEvent soundIn) {
        super(recordName, soundIn);
        this.displayName = "item.record." + recordName + ".desc";
        this.sound = soundIn;
        this.maxStackSize = 1;
        this.setCreativeTab(BoneSmith.BONESMITHTAB);
        RECORDS.put(this.sound, this);
    }
}
