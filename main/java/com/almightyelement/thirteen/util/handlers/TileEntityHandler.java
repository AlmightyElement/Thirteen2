package com.almightyelement.thirteen.util.handlers;

import com.almightyelement.thirteen.objects.tileentity.TileEntityCopperChest;
import com.almightyelement.thirteen.objects.tileentity.TileEntityLogStripper;
import com.almightyelement.thirteen.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCopperChest.class, new ResourceLocation(Reference.MOD_ID + ":copper_chest"));
		GameRegistry.registerTileEntity(TileEntityLogStripper.class, new ResourceLocation(Reference.MOD_ID + ":log_stripper"));


	}
}