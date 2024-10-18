package net.acoyt.bone_smith.init;

import net.acoyt.bone_smith.objects.items.ItemBase;
import net.acoyt.bone_smith.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial TOOL_BONE = EnumHelper.addToolMaterial("tool_bone", 1, 275, 6.0f, 0.0f, 7);
    public static final ToolMaterial TOOL_SCYTHE = EnumHelper.addToolMaterial("tool_scythe", 1, 250, 4.0f, 3.5f, 10);

    //Items
    public static final Item FOSSIL = new ItemBase("fossil");

    //Tools
    public static final Item BONE_SWORD = new ToolSword("bone_sword", TOOL_BONE);
    public static final Item BONE_SCYTHE = new ToolSword("bone_scythe", TOOL_SCYTHE);
}
