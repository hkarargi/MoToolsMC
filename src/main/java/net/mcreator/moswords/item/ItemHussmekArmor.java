
package net.mcreator.moswords.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moswords.ElementsMoSwords;

@ElementsMoSwords.ModElement.Tag
public class ItemHussmekArmor extends ElementsMoSwords.ModElement {
	@GameRegistry.ObjectHolder("moswords:hussmekarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moswords:hussmekarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moswords:hussmekarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moswords:hussmekarmorboots")
	public static final Item boots = null;
	public ItemHussmekArmor(ElementsMoSwords instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HUSSMEKARMOR", "moswords:hussmek", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("hussmekarmorhelmet")
				.setRegistryName("hussmekarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("hussmekarmorbody")
				.setRegistryName("hussmekarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hussmekarmorlegs")
				.setRegistryName("hussmekarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("hussmekarmorboots")
				.setRegistryName("hussmekarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moswords:hussmekarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moswords:hussmekarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moswords:hussmekarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moswords:hussmekarmorboots", "inventory"));
	}
}
