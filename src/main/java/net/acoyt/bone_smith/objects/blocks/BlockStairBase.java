package net.acoyt.bone_smith.objects.blocks;

import net.acoyt.bone_smith.init.BlockInit;
import net.acoyt.bone_smith.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockStairBase extends BlockStairs {
    public BlockStairBase(String name, IBlockState modelState, CreativeTabs tab, float hardness, float resistance, SoundType sound, String toolClass, int level) {
        super(modelState);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);
        setLightOpacity(8);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
