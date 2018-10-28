package com.almightyelement.thirteen.objects.machines.stripper;

import java.util.Map;

import com.almightyelement.thirteen.init.ModBlocks;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class LogStripperRecipes {

	private static final LogStripperRecipes INSTANCE = new LogStripperRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static LogStripperRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private LogStripperRecipes() 
	{
		addLogStripperRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(ModBlocks.COPPER_CHEST), 5.0F);
	}

	
	public void addLogStripperRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getLogStripperResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getLogStripperResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getSinteringExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
