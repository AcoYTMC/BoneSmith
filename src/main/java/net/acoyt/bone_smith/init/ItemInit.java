package net.acoyt.bone_smith.init;

import net.acoyt.bone_smith.objects.items.BoneBoosterItem;
import net.acoyt.bone_smith.objects.items.ItemBase;
import net.acoyt.bone_smith.objects.items.armor.ArmorBase;
import net.acoyt.bone_smith.objects.items.cosmetics.SepulchreSanguine;
import net.acoyt.bone_smith.objects.items.cosmetics.WearableHat;
import net.acoyt.bone_smith.objects.items.tools.BoneAnchorItem;
import net.acoyt.bone_smith.objects.items.tools.BoneScytheItem;
import net.acoyt.bone_smith.objects.items.tools.ToolSword;
import net.acoyt.bone_smith.objects.items.tools.WitheringBoneScytheItem;
import net.acoyt.bone_smith.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial TOOL_PLUSH = EnumHelper.addToolMaterial("tool_plush", 0, 100, 0.0f, -3.9f, 0);
    public static final ToolMaterial TOOL_BONE = EnumHelper.addToolMaterial("tool_bone", 1, 275, 6.0f, 0.0f, 7);
    public static final ToolMaterial TOOL_SCYTHE = EnumHelper.addToolMaterial("tool_scythe", 3, 1561, 8.0F, 0.0F, 10);
    public static final ToolMaterial TOOL_ANCHOR = EnumHelper.addToolMaterial("tool_anchor", 3, 432, 9.0F, 0.0f, 22);
    public static final ArmorMaterial ARMOR_BONE_INFUSED = EnumHelper.addArmorMaterial("armor_bone_infused", Reference.MOD_ID + ":bone_infused", 1500, new int[] {5, 8, 10, 5}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    //Tools
    public static final Item BONE_SWORD = new ToolSword("bone_sword", TOOL_BONE);
    public static final Item BONE_SCYTHE = new BoneScytheItem("bone_scythe", TOOL_SCYTHE);
    public static final Item WITHERING_BONE_SCYTHE = new WitheringBoneScytheItem("withering_bone_scythe", TOOL_SCYTHE);
    public static final Item BONE_ANCHOR = new BoneAnchorItem("bone_anchor", TOOL_ANCHOR);

    //Items
    public static final Item FOSSIL = new ItemBase("fossil");
    public static final Item WITHERED_FOSSIL = new ItemBase("withered_fossil");
    public static final Item SHARP_BONE = new ItemBase("sharp_bone");

    //Armor
    public static final Item HELMET_BONE_INFUSED = new ArmorBase("helmet_bone_infused", ARMOR_BONE_INFUSED, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_BONE_INFUSED = new ArmorBase("chestplate_bone_infused", ARMOR_BONE_INFUSED, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_BONE_INFUSED = new ArmorBase("leggings_bone_infused", ARMOR_BONE_INFUSED, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_BONE_INFUSED = new ArmorBase("boots_bone_infused", ARMOR_BONE_INFUSED, 1, EntityEquipmentSlot.FEET);

    //Extras
    public static final Item BONE_BOOSTER = new BoneBoosterItem("bone_booster");
    public static final Item SEPULCHRE_SANGUINE = new SepulchreSanguine("sepulchre_sanguine", TOOL_PLUSH);
    public static final Item GRAVEYARD_HAT = new WearableHat("graveyard_hat");
}
