package com.someoneice.partyrecipes.Client;

import com.someoneice.partyrecipes.Init.BlockRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TypeInit {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.tomatocrop.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.corpcrop.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.teacrop.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.beancrop.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.pineapplecrop.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.peanut.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.seedbag.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.rice.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.cmlgj.get(), RenderType.cutout());
        });
    }
}
