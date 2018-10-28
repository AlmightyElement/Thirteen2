package com.almightyelement.thirteen.util.handlers;

import com.almightyelement.thirteen.Main;
import com.almightyelement.thirteen.init.ModBlocks;
import com.almightyelement.thirteen.init.ModItems;
import com.almightyelement.thirteen.objects.animation.RenderCopperChest;
import com.almightyelement.thirteen.objects.tileentity.TileEntityCopperChest;
import com.almightyelement.thirteen.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new RenderCopperChest());
		
	}
	
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		Main.proxy.registerModel(Item.getItemFromBlock(ModBlocks.COPPER_CHEST), 0);
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries()
	{
	}
	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
}
