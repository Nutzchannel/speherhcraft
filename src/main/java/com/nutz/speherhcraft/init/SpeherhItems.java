package com.nutz.speherhcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nutz.speherhcraft.Reference;
import com.nutz.speherhcraft.item.ItemHashtag;

public class SpeherhItems {
	public static Item hashtag;
	
	public static void init()
	{
		hashtag = new ItemHashtag().setUnlocalizedName("hashtag");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(hashtag, hashtag.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(hashtag);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
