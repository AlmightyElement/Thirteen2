package com.almightyelement.thirteen;

import org.apache.logging.log4j.Logger;

import com.almightyelement.thirteen.init.ModItems;
import com.almightyelement.thirteen.proxy.CommonProxy;
import com.almightyelement.thirteen.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID , name = Reference.NAME , version = Reference.VERSION)

public class Main {

	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	public static final CreativeTabs THIRTEEN = new ThirteenTab("thirteentab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}
	@EventHandler
	public static void Init(FMLInitializationEvent event) {

	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	
}
