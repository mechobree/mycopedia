package net.mechobree.mycopedia.item;

import net.mechobree.mycopedia.Mycopedia;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MISSING_TEXTURE.get()))
                    .title(Component.translatable("creativetab.mycopedia"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MISSING_TEXTURE.get());
                        output.accept(ModItems.EVIL_MISSING_TEXTURE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
