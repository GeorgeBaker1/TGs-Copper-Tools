package net.thegeorginator.coppertools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;
import net.thegeorginator.coppertools.TGCopperTools;
import net.thegeorginator.coppertools.item.ModItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TGCopperTools.MOD_ID, existingFileHelper);
    };

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.SWORDS).add(ModItems.COPPER_SWORD.get());
        this.tag(ItemTags.AXES).add(ModItems.COPPER_AXE.get());
        this.tag(ItemTags.PICKAXES).add(ModItems.COPPER_PICKAXE.get());
        this.tag(ItemTags.SHOVELS).add(ModItems.COPPER_SHOVEL.get());
        this.tag(ItemTags.HOES).add(ModItems.COPPER_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get(),
                        ModItems.COPPER_CHESTPLATE.get(),
                        ModItems.COPPER_LEGGINGS.get(),
                        ModItems.COPPER_BOOTS.get());
    }
}
