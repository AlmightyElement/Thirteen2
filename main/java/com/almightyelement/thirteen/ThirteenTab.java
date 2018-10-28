package com.almightyelement.thirteen;

import com.almightyelement.thirteen.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ThirteenTab extends CreativeTabs {

	public ThirteenTab(String label) { super("thirteentab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.SEMEN);}
	
}
