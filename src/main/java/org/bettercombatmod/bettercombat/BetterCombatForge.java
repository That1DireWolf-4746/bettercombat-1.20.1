package org.ecnumc.ecnu;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.bettercombatmod.bettercombat.common.BetterCombatMod;

/**
 * Mod Main Class
 * @author liudongyu
 */
@SuppressWarnings("java:S1118")
@Mod(ECNUForge.MODID)
public class BetterCombatForge {
	public static final String MODID = "bettercombat";

	public BetterCombatForge() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		BetterCombatMod.modConstruction(modBus);
	}
}
