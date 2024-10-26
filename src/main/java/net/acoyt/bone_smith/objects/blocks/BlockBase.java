package net.acoyt.bone_smith.objects.blocks;

import net.acoyt.bone_smith.BoneSmith;
import net.acoyt.bone_smith.init.BlockInit;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    public BlockBase(String name, Material blockMaterial, MapColor blockMapColor) {
        super(blockMaterial, blockMapColor);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(BoneSmith.BONESMITHTAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
