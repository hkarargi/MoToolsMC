
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
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moswords.creativetab.TabBlueTab;
import net.mcreator.moswords.ElementsMoSwords;

@ElementsMoSwords.ModElement.Tag
public class ItemBlueArmor extends ElementsMoSwords.ModElement {
	@GameRegistry.ObjectHolder("moswords:bluearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moswords:bluearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moswords:bluearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moswords:bluearmorboots")
	public static final Item boots = null;
	public ItemBlueArmor(ElementsMoSwords instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLUEARMOR", "moswords:blue", 15, new int[]{400, 450, 500, 450}, 99,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bluearmorhelmet")
				.setRegistryName("bluearmorhelmet").setCreativeTab(TabBlueTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bluearmorbody")
				.setRegistryName("bluearmorbody").setCreativeTab(TabBlueTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("bluearmorlegs")
				.setRegistryName("bluearmorlegs").setCreativeTab(TabBlueTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("bluearmorboots")
				.setRegistryName("bluearmorboots").setCreativeTab(TabBlueTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moswords:bluearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moswords:bluearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moswords:bluearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moswords:bluearmorboots", "inventory"));
	}
}
