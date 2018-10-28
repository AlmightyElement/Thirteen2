package com.almightyelement.thirteen.items;

import com.almightyelement.thirteen.Main;
import com.almightyelement.thirteen.init.ModItems;
import com.almightyelement.thirteen.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.THIRTEEN);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	

}
