
package net.mcreator.moswords.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moswords.ElementsMoSwords;

import java.util.Set;
import java.util.HashMap;

@ElementsMoSwords.ModElement.Tag
public class ItemHussmekHoe extends ElementsMoSwords.ModElement {
	@GameRegistry.ObjectHolder("moswords:hussmekhoe")
	public static final Item block = null;
	public ItemHussmekHoe(ElementsMoSwords instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("HUSSMEKHOE", 16, 18000, 20f, 2f, 60)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 16);
				return ret.keySet();
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setUnlocalizedName("hussmekhoe").setRegistryName("hussmekhoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("moswords:hussmekhoe", "inventory"));
	}
}
