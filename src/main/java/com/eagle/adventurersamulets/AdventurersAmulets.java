package com.eagle.adventurersamulets;

import com.eagle.adventurersamulets.Dictionary.Core;
import com.eagle.adventurersamulets.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Core.MOD_ID, name = Core.MOD_NAME, version = Core.VERSION, dependencies = Core.DEPENDENCIES)
public class AdventurersAmulets {

  @SidedProxy(clientSide = Core.CLIENT_PROXY_CLASS, serverSide = Core.COMMON_PROXY_CLASS)
  public static CommonProxy proxy;

  @EventHandler
  public static void preInit(FMLPreInitializationEvent event) {
    proxy.initModels();
  }

  @EventHandler
  public static void init(FMLInitializationEvent event) {

  }

  @EventHandler
  public static void postInit(FMLPostInitializationEvent event) {

  }

}