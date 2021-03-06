package com.velocity.sunyata.item;

import com.velocity.sunyata.Sunyata;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Sunyata.MOD_ID);

    public static final RegistryObject<Item> ODD_STONE = ITEMS.register("odd_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUNYATA_TAB)));

    public static final RegistryObject<Item> WILTING_BOUQUET = ITEMS.register("wilting_bouquet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUNYATA_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
