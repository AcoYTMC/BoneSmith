package net.acoyt.bone_smith.objects.items;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.ItemInit;
import net.acoyt.bone_smith.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(BoneSmith.BONESMITHTAB);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        BoneSmith.proxy.registerItemRenderer(this, 0, "bone_smith");
    }
}