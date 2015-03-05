package com.nutz.speherhcraft.block;
//package|import
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
//import|class
public class genericBlock extends Block
{
	public genericBlock (Material material)
	{
		super(material);
		final Block GenericBlock = new genericBlock(Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundTypeGravel)
		.setUnlocalizedName("GenericBlock").setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(GenericBlock, "GenericBlock");
	}
}
