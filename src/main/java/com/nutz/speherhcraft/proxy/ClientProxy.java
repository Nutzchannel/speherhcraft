package com.nutz.speherhcraft.proxy;

import com.nutz.speherhcraft.init.SpeherhItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		SpeherhItems.registerRenders();
	}
}
