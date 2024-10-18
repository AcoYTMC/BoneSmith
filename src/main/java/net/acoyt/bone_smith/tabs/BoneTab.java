package net.acoyt.bone_smith.tabs;

import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BoneTab extends CreativeTabs {
    public BoneTab(String label) {
        super("bonesmithtab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.FOSSIL);
    }
}
