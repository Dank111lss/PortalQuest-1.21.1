package com.portalquest;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PortalQuest.MODID)
public class PortalQuest {
    public static final String MODID = "portalquest"; // ← совпадает с mods.toml

    public PortalQuest() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Добавление инициализации при загрузке
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        System.out.println("✅ PortalQuest: common setup");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        System.out.println("🎨 PortalQuest: client setup");
    }
}
