package com.almightyelement.thirteen.objects.machines.stripper.slots;

import com.almightyelement.thirteen.objects.tileentity.TileEntityLogStripper;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotLogStripperFuel extends Slot
{
	public SlotLogStripperFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityLogStripper.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}

