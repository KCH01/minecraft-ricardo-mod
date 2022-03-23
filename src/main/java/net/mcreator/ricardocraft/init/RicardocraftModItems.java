
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ricardocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ricardocraft.item.RicardoSwordItem;
import net.mcreator.ricardocraft.item.RicardoShovelItem;
import net.mcreator.ricardocraft.item.RicardoPickaxeItem;
import net.mcreator.ricardocraft.item.RicardoHoeItem;
import net.mcreator.ricardocraft.item.RicardoGemItem;
import net.mcreator.ricardocraft.item.RicardoAxeItem;
import net.mcreator.ricardocraft.item.RicardoArmorItem;
import net.mcreator.ricardocraft.item.MREItem;
import net.mcreator.ricardocraft.item.DancinDiscItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RicardocraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RICARDO_BLOCK = register(RicardocraftModBlocks.RICARDO_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item RICARDO_GEM = register(new RicardoGemItem());
	public static final Item RICARDO_PICKAXE = register(new RicardoPickaxeItem());
	public static final Item RICARDO_AXE = register(new RicardoAxeItem());
	public static final Item RICARDO_SWORD = register(new RicardoSwordItem());
	public static final Item RICARDO_SHOVEL = register(new RicardoShovelItem());
	public static final Item RICARDO_HOE = register(new RicardoHoeItem());
	public static final Item DANCIN_DISC = register(new DancinDiscItem());
	public static final Item RICARDO_ARMOR_HELMET = register(new RicardoArmorItem.Helmet());
	public static final Item RICARDO_ARMOR_CHESTPLATE = register(new RicardoArmorItem.Chestplate());
	public static final Item RICARDO_ARMOR_LEGGINGS = register(new RicardoArmorItem.Leggings());
	public static final Item RICARDO_ARMOR_BOOTS = register(new RicardoArmorItem.Boots());
	public static final Item MRE = register(new MREItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
