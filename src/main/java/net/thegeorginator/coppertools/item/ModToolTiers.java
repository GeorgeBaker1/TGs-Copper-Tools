package net.thegeorginator.coppertools.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.thegeorginator.coppertools.TGCopperTools;
import net.thegeorginator.coppertools.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 200, 5f, 2f, 7,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(TGCopperTools.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());
}
