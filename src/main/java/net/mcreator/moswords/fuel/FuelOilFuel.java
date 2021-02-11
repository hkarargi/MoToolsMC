
package net.mcreator.moswords.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.moswords.block.BlockOil;
import net.mcreator.moswords.ElementsMoSwords;

@ElementsMoSwords.ModElement.Tag
public class FuelOilFuel extends ElementsMoSwords.ModElement {
	public FuelOilFuel(ElementsMoSwords instance) {
		super(instance, 49);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockOil.block, (int) (1)).getItem())
			return 800000;
		return 0;
	}
}
