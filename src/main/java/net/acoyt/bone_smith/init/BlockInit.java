package net.acoyt.bone_smith.init;

import net.acoyt.bone_smith.objects.blocks.BlockBase;
import net.acoyt.bone_smith.objects.blocks.extras.BigSkullBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Normal Blocks
    public static final Block BONE_BRICKS = new BlockBase("bone_bricks", Material.ROCK, MapColor.CLOTH);
    public static final Block BONE_TILES = new BlockBase("bone_tiles", Material.ROCK, MapColor.CLOTH);
    public static final Block BURROWED_BONE = new BlockBase("burrowed_bone", Material.ROCK, MapColor.CLOTH);
    public static final Block CRACKED_BONE_BRICKS = new BlockBase("cracked_bone_bricks", Material.ROCK, MapColor.CLOTH);
    public static final Block MARBLED_BONE = new BlockBase("marbled_bone", Material.ROCK, MapColor.CLOTH);
    public static final Block POLISHED_BONE = new BlockBase("polished_bone", Material.ROCK, MapColor.CLOTH);

    //Extra Blocks
    public static final Block BIG_SKELETON_SKULL = new BigSkullBlock("big_skeleton_skull", Material.ROCK, MapColor.CLOTH);
}
