package net.thegeorginator.coppertools.util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.thegeorginator.coppertools.TGCopperTools;

import static net.minecraft.tags.TagEntry.tag;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("needs_copper_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create((new ResourceLocation(TGCopperTools.MOD_ID, name)));
        }
    }

    public static class Items {
        public static final TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TGCopperTools.MOD_ID, name));

        }



    }
}
