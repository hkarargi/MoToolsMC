package net.mcreator.moswords.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.moswords.gui.GuiHussmekBagUI;
import net.mcreator.moswords.MoSwords;
import net.mcreator.moswords.ElementsMoSwords;

@ElementsMoSwords.ModElement.Tag
public class ProcedureHussmeksBagRightClickedInAir extends ElementsMoSwords.ModElement {
	public ProcedureHussmeksBagRightClickedInAir(ElementsMoSwords instance) {
		super(instance, 66);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HussmeksBagRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HussmeksBagRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HussmeksBagRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HussmeksBagRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HussmeksBagRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(MoSwords.instance, GuiHussmekBagUI.GUIID, world, x, y, z);
	}
}
