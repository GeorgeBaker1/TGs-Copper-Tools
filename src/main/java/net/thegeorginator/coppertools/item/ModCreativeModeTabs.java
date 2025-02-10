package net.thegeorginator.coppertools.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thegeorginator.coppertools.TGCopperTools;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TGCopperTools.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COPPER_TOOLS_TAB = CREATIVE_MODE_TABS.register("copper_tools_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_SWORD.get()))
            .title(Component.translatable("creativetab.copper_tools_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.COPPER_SWORD.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
