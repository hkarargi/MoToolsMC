
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
public class ItemBlueShovel extends ElementsMoSwords.ModElement {
	@GameRegistry.ObjectHolder("moswords:blueshovel")
	public static final Item block = null;
	public ItemBlueShovel(ElementsMoSwords instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("BLUESHOVEL", 8, 9000, 10f, 6f, 30)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("blueshovel").setRegistryName("blueshovel").setCreativeTab(TabBlueTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("moswords:blueshovel", "inventory"));
	}
}
