package dappercore.cactusleather;

import dappercore.cactusleather.armor.CactusArmorMaterial;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CactusLeather implements ModInitializer{

    public static final String MODID = "cactusleather";

    public static final Item CACTUS_PULP = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CACTUS_LEATHER = new Item(new Item.Settings().group(ItemGroup.MISC));


    public static final Item CACTUS_HELMET = new ArmorItem(CactusArmorMaterial.CACTUS, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CACTUS_CHESTPLATE = new ArmorItem(CactusArmorMaterial.CACTUS, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CACTUS_LEGGINGS = new ArmorItem(CactusArmorMaterial.CACTUS, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item CACTUS_BOOTS = new ArmorItem(CactusArmorMaterial.CACTUS, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "cactus_leather"), CACTUS_LEATHER);
        Registry.register(Registry.ITEM, new Identifier(MODID, "cactus_pulp"), CACTUS_PULP);

        Registry.register(Registry.ITEM,new Identifier(MODID,"cactus_cap"), CACTUS_HELMET);
        Registry.register(Registry.ITEM,new Identifier(MODID,"cactus_tunic"), CACTUS_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(MODID,"cactus_pants"), CACTUS_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(MODID,"cactus_boots"), CACTUS_BOOTS);

    }
}
