package com.almightyelement.thirteen.init;

import java.util.ArrayList;
import java.util.List;

import com.almightyelement.thirteen.Main;
import com.almightyelement.thirteen.items.BlockBase;
import com.almightyelement.thirteen.items.BlockCopperChest;

import com.almightyelement.thirteen.objects.machines.stripper.BlockLogStripper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	

	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block COPPER_CHEST = new BlockCopperChest("copper_chest");
	public static final Block LOG_STRIPPER = new BlockLogStripper("log_stripper");
}
