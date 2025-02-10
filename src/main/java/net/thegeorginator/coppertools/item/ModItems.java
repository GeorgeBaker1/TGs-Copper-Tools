package net.thegeorginator.coppertools.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thegeorginator.coppertools.TGCopperTools;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TGCopperTools.MOD_ID);

//    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
//            () -> new Item(new Item.Properties().stacksTo(1).defaultDurability(200)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
        () -> new SwordItem(ModToolTiers.COPPER, 3, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 5, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 1, 2, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
