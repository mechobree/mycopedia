package net.mechobree.mycopedia.item;

import net.mechobree.mycopedia.Mycopedia;
import net.mechobree.mycopedia.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mycopedia.MOD_ID);

    public static  final RegistryObject<CreativeModeTab> MYCOPEDIA_TAB = CREATIVE_MODE_TABS.register("mycopedia",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MISSING_TEXTURE_BLOCK.get()))
                    .title(Component.translatable("creativetab.mycopedia"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Items added to creative tab
                        output.accept(ModItems.MYCOPEDIA_GUIDE.get());
                        output.accept(ModItems.MISSING_TEXTURE.get());
                        output.accept(ModItems.EVIL_MISSING_TEXTURE.get());

                        // Blocks added to creative tab
                        output.accept(ModBlocks.MISSING_TEXTURE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
