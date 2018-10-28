package com.almightyelement.thirteen.items;

import com.almightyelement.thirteen.Main;
import com.almightyelement.thirteen.init.ModBlocks;
import com.almightyelement.thirteen.init.ModItems;
import com.almightyelement.thirteen.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.THIRTEEN);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
	
}
