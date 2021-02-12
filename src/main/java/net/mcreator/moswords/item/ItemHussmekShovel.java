
package net.mcreator.moswords.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moswords.creativetab.TabBlueTab;
import net.mcreator.moswords.ElementsMoSwords;

import java.util.Set;
import java.util.HashMap;

@ElementsMoSwords.ModElement.Tag
public class ItemHussmekShovel extends ElementsMoSwords.ModElement {
	@GameRegistry.ObjectHolder("moswords:hussmekshovel")
	public static final Item block = null;
	public ItemHussmekShovel(ElementsMoSwords instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("HUSSMEKSHOVEL", 16, 18000, 20f, 21f, 60)) {
			{
				this.attackSpeed = -1f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 16);
				return ret.keySet();
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setUnlocalizedName("hussmekshovel").setRegistryName("hussmekshovel").setCreativeTab(TabBlueTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("moswords:hussmekshovel", "inventory"));
	}
}
