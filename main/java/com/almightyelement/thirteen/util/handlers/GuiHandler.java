package com.almightyelement.thirteen.util.handlers;

import com.almightyelement.thirteen.objects.container.ContainerCopperChest;
import com.almightyelement.thirteen.objects.container.ContainerLogStripper;
import com.almightyelement.thirteen.objects.gui.GuiCopperChest;
import com.almightyelement.thirteen.objects.gui.GuiLogStripper;
import com.almightyelement.thirteen.objects.tileentity.TileEntityCopperChest;
import com.almightyelement.thirteen.objects.tileentity.TileEntityLogStripper;
import com.almightyelement.thirteen.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_LOG_STRIPPER) return new ContainerLogStripper(player.inventory, (TileEntityLogStripper)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_COPPER_CHEST) return new ContainerCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);

		return null;

	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		if(ID == Reference.GUI_LOG_STRIPPER) return new GuiLogStripper(player.inventory, (TileEntityLogStripper)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_COPPER_CHEST) return new GuiCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);

		return null;

	}
}

