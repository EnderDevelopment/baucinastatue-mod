package com.fabryolc05.baucinastatuemod.registry;

import com.fabryolc05.baucinastatuemod.BaucinastatueMod;
import com.fabryolc05.baucinastatuemod.block.BaucinastatueBlock;
import com.fabryolc05.baucinastatuemod.entity.BaucinastatueEntity;
import com.fabryolc05.baucinastatuemod.item.BaucinastatueItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModRegistries {
    public static final EntityType<BaucinastatueEntity> BAUCINASTATUE_ENTITY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            BaucinastatueMod.MOD_ID + ":baucinastatue_entity",
            EntityType.Builder.of(BaucinastatueEntity::new, MobCategory.MISC).sized(1.0f, 2.0f).build("baucinastatue_entity")
    );

    public static final Block BAUCINASTATUE_BLOCK = Registry.register(
            BuiltInRegistries.BLOCK,
            BaucinastatueMod.MOD_ID + ":baucinastatue_block",
            new BaucinastatueBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.5f).noOcclusion())
    );

    public static final Item BAUCINASTATUE_ITEM = Registry.register(
            BuiltInRegistries.ITEM,
            BaucinastatueMod.MOD_ID + ":baucinastatue_item",
            new BlockItem(BAUCINASTATUE_BLOCK, new Item.Properties())
    );
}