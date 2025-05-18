package net.mechobree.mycopedia.item;

import net.mechobree.mycopedia.Mycopedia;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mycopedia.MOD_ID);

    public static final RegistryObject<Item> MISSING_TEXTURE = ITEMS.register("missing_texture",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVIL_MISSING_TEXTURE = ITEMS.register("evil_missing_texture",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
