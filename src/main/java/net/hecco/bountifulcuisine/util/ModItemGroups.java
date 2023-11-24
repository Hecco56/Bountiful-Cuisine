package net.hecco.bountifulcuisine.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.hecco.bountifulcuisine.BountifulCuisine;
import net.hecco.bountifulcuisine.block.ModBlocks;
import net.hecco.bountifulcuisine.item.ModItems;
import net.hecco.bountifulcuisine.potion.ModPotions;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup BOUNTIFUL_CUISINE = Registry.register(Registries.ITEM_GROUP, new Identifier(BountifulCuisine.MOD_ID, "bountiful_cuisine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bountiful_cuisine"))
                    .icon(() -> new ItemStack(ModBlocks.PASSION_FRUIT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.APPLE_LOG);
                        entries.add(ModBlocks.APPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_APPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_APPLE_WOOD);
                        entries.add(ModBlocks.APPLE_LEAVES);
                        entries.add(ModBlocks.FLOWERING_APPLE_LEAVES);
                        entries.add(Items.APPLE);
                        entries.add(ModBlocks.APPLE_BLOCK);
                        entries.add(ModBlocks.APPLE_SAPLING);
                        entries.add(ModBlocks.ORANGE_LOG);
                        entries.add(ModBlocks.ORANGE_WOOD);
                        entries.add(ModBlocks.STRIPPED_ORANGE_LOG);
                        entries.add(ModBlocks.STRIPPED_ORANGE_WOOD);
                        entries.add(ModBlocks.ORANGE_LEAVES);
                        entries.add(ModBlocks.FLOWERING_ORANGE_LEAVES);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModBlocks.ORANGE_BLOCK);
                        entries.add(ModBlocks.ORANGE_SAPLING);
                        entries.add(ModBlocks.LEMON_LOG);
                        entries.add(ModBlocks.LEMON_WOOD);
                        entries.add(ModBlocks.STRIPPED_LEMON_LOG);
                        entries.add(ModBlocks.STRIPPED_LEMON_WOOD);
                        entries.add(ModBlocks.LEMON_LEAVES);
                        entries.add(ModBlocks.FLOWERING_LEMON_LEAVES);
                        entries.add(ModItems.LEMON);
                        entries.add(ModBlocks.LEMON_BLOCK);
                        entries.add(ModBlocks.LEMON_SAPLING);
                        entries.add(ModBlocks.PLUM_LOG);
                        entries.add(ModBlocks.PLUM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PLUM_LOG);
                        entries.add(ModBlocks.STRIPPED_PLUM_WOOD);
                        entries.add(ModBlocks.PLUM_LEAVES);
                        entries.add(ModBlocks.FLOWERING_PLUM_LEAVES);
                        entries.add(ModItems.PLUM);
                        entries.add(ModBlocks.PLUM_BLOCK);
                        entries.add(ModBlocks.PLUM_SAPLING);
                        entries.add(ModItems.HOARY_SEEDS);
                        entries.add(ModBlocks.HOARY_APPLE_SAPLING);
                        entries.add(ModBlocks.HOARY_LOG);
                        entries.add(ModBlocks.HOARY_WOOD);
                        entries.add(ModBlocks.STRIPPED_HOARY_LOG);
                        entries.add(ModBlocks.STRIPPED_HOARY_WOOD);
                        entries.add(ModBlocks.HOARY_PLANKS);
                        entries.add(ModBlocks.HOARY_STAIRS);
                        entries.add(ModBlocks.HOARY_SLAB);
                        entries.add(ModBlocks.HOARY_FENCE);
                        entries.add(ModBlocks.HOARY_FENCE_GATE);
                        entries.add(ModBlocks.HOARY_DOOR);
                        entries.add(ModBlocks.HOARY_TRAPDOOR);
                        entries.add(ModBlocks.HOARY_PRESSURE_PLATE);
                        entries.add(ModBlocks.HOARY_BUTTON);
                        entries.add(ModItems.HOARY_SIGN);
                        entries.add(ModItems.HOARY_HANGING_SIGN);
                        entries.add(ModItems.HOARY_BOAT);
                        entries.add(ModItems.HOARY_CHEST_BOAT);
                        entries.add(ModBlocks.HOARY_LEAVES);
                        entries.add(ModItems.HOARY_APPLE);
                        entries.add(ModBlocks.HOARY_APPLE_BLOCK);
                        entries.add(ModBlocks.GOLDEN_APPLE_BLOCK);
                        entries.add(ModBlocks.TRELLIS);
                        entries.add(ModBlocks.PASSION_FRUIT);
                        entries.add(ModBlocks.ELDERBERRIES);
                        entries.add(ModItems.LAPISBERRY_SEEDS);
                        entries.add(ModBlocks.LAPISBERRIES);
                        entries.add(ModBlocks.WILD_CARROTS);
                        entries.add(ModBlocks.WILD_POTATOES);
                        entries.add(ModBlocks.WILD_WHEAT);
                        entries.add(ModBlocks.WILD_BEETROOTS);
                        entries.add(ModBlocks.WILD_GOOSEBERRIES);
                        entries.add(ModItems.MAIZE_SEEDS);
                        entries.add(ModItems.MAIZE);
                        entries.add(ModItems.GOOSEBERRY_SEEDS);
                        entries.add(ModItems.GOOSEBERRIES);
                        entries.add(ModItems.FELDSPAR);
                        entries.add(ModBlocks.FELDSPAR_BLOCK);
                        entries.add(ModBlocks.TINGED_GLASS);
                        entries.add(ModItems.CERAMIC_CLAY);
                        entries.add(ModBlocks.CERAMIC_CLAY_BLOCK);
                        entries.add(ModItems.CERAMIC_TILE);
                        entries.add(ModBlocks.CERAMIC_TILES);
                        entries.add(ModBlocks.CERAMIC_TILE_STAIRS);
                        entries.add(ModBlocks.CERAMIC_TILE_SLAB);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILES);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILE_STAIRS);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILE_SLAB);
                        entries.add(ModBlocks.CERAMIC_PRESSURE_PLATE);
                        entries.add(ModBlocks.CERAMIC_BUTTON);
                        entries.add(ModBlocks.FERMENTATION_VESSEL);
                        entries.add(ModItems.ELDERBERRY_WINE_BOTTLE);
                        entries.add(ModBlocks.GRISTMILL);
                        entries.add(ModBlocks.SPONGEKIN_SPROUT);
                        entries.add(ModItems.SPONGEKIN_SEEDS);
                        entries.add(ModBlocks.SPONGEKIN);
                        entries.add(ModItems.SPONGEKIN_SLICE);
                        entries.add(ModBlocks.PRISMARINE_BLOSSOM);
                        entries.add(ModItems.TEA_BERRIES);
                        entries.add(ModItems.TEA_LEAVES);
                        entries.add(ModItems.DRIED_TEA_LEAVES);
                        entries.add(ModBlocks.CHAMOMILE_FLOWERS);
                        entries.add(ModBlocks.HONEYSUCKLE);
                        entries.add(ModBlocks.VIOLET_BELLFLOWER);
                        entries.add(ModItems.GREEN_TEA_BLEND);
                        entries.add(ModItems.BLACK_TEA_BLEND);
                        entries.add(ModItems.CHAMOMILE_TEA_BLEND);
                        entries.add(ModItems.HONEYSUCKLE_TEA_BLEND);
                        entries.add(ModItems.BELLFLOWER_TEA_BLEND);
                        entries.add(ModItems.TORCHFLOWER_TEA_BLEND);
                        entries.add(ModItems.GREEN_TEA_BOTTLE);
                        entries.add(ModItems.BLACK_TEA_BOTTLE);
                        entries.add(ModItems.CHAMOMILE_TEA_BOTTLE);
                        entries.add(ModItems.HONEYSUCKLE_TEA_BOTTLE);
                        entries.add(ModItems.BELLFLOWER_TEA_BOTTLE);
                        entries.add(ModItems.TORCHFLOWER_TEA_BOTTLE);
                        entries.add(ModBlocks.GREEN_TEA_CANDLE);
                        entries.add(ModBlocks.BLACK_TEA_CANDLE);
                        entries.add(ModBlocks.CHAMOMILE_CANDLE);
                        entries.add(ModBlocks.HONEYSUCKLE_CANDLE);
                        entries.add(ModBlocks.BELLFLOWER_CANDLE);
                        entries.add(ModBlocks.TORCHFLOWER_CANDLE);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.CITRIC_ACID);
                        entries.add(ModItems.CANDIED_ORANGE);
                        entries.add(ModItems.CANDIED_LEMON);
                        entries.add(ModItems.CANDY);
                        entries.add(ModItems.PIQUANT_CANDY);
                        entries.add(ModItems.SOUR_CANDY);
                        entries.add(ModItems.BITTER_CANDY);
                        entries.add(ModItems.SUN_HAT);
                        if (FabricLoader.getInstance().isModLoaded(BountifulCuisine.ELS_AND_LS_DYES_MOD_ID)) {
                            entries.add(ModBlocks.WHITE_JACK_O_STRAW);
                            entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
                            entries.add(ModBlocks.GRAY_JACK_O_STRAW);
                            entries.add(ModBlocks.BLACK_JACK_O_STRAW);
                            entries.add(ModBlocks.ACORN_JACK_O_STRAW);
                            entries.add(ModBlocks.BROWN_JACK_O_STRAW);
                            entries.add(ModBlocks.MAROON_JACK_O_STRAW);
                            entries.add(ModBlocks.RED_JACK_O_STRAW);
                            entries.add(ModBlocks.PEACH_JACK_O_STRAW);
                            entries.add(ModBlocks.VERMILION_JACK_O_STRAW);
                            entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
                            entries.add(ModBlocks.AMBER_JACK_O_STRAW);
                            entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
                            entries.add(ModBlocks.BANANA_JACK_O_STRAW);
                            entries.add(ModBlocks.ARTICHOKE_JACK_O_STRAW);
                            entries.add(ModBlocks.MOLD_JACK_O_STRAW);
                            entries.add(ModBlocks.LIME_JACK_O_STRAW);
                            entries.add(ModBlocks.SAGE_JACK_O_STRAW);
                            entries.add(ModBlocks.SAP_JACK_O_STRAW);
                            entries.add(ModBlocks.GREEN_JACK_O_STRAW);
                            entries.add(ModBlocks.SHAMROCK_JACK_O_STRAW);
                            entries.add(ModBlocks.MINT_JACK_O_STRAW);
                            entries.add(ModBlocks.CYAN_JACK_O_STRAW);
                            entries.add(ModBlocks.CERULEAN_JACK_O_STRAW);
                            entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
                            entries.add(ModBlocks.NAVY_JACK_O_STRAW);
                            entries.add(ModBlocks.BLUE_JACK_O_STRAW);
                            entries.add(ModBlocks.PERIWINKLE_JACK_O_STRAW);
                            entries.add(ModBlocks.GRAPE_JACK_O_STRAW);
                            entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
                            entries.add(ModBlocks.INDIGO_JACK_O_STRAW);
                            entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
                            entries.add(ModBlocks.MAUVE_JACK_O_STRAW);
                            entries.add(ModBlocks.VELVET_JACK_O_STRAW);
                            entries.add(ModBlocks.FUCHSIA_JACK_O_STRAW);
                            entries.add(ModBlocks.PINK_JACK_O_STRAW);
                        } else {
                            entries.add(ModBlocks.WHITE_JACK_O_STRAW);
                            entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
                            entries.add(ModBlocks.GRAY_JACK_O_STRAW);
                            entries.add(ModBlocks.BLACK_JACK_O_STRAW);
                            entries.add(ModBlocks.BROWN_JACK_O_STRAW);
                            entries.add(ModBlocks.RED_JACK_O_STRAW);
                            entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
                            entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
                            entries.add(ModBlocks.LIME_JACK_O_STRAW);
                            entries.add(ModBlocks.GREEN_JACK_O_STRAW);
                            entries.add(ModBlocks.CYAN_JACK_O_STRAW);
                            entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
                            entries.add(ModBlocks.BLUE_JACK_O_STRAW);
                            entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
                            entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
                            entries.add(ModBlocks.PINK_JACK_O_STRAW);
                        }
                        entries.add(ModBlocks.ARTISAN_BREAD);
                        entries.add(ModBlocks.PASSION_FRUIT_TART);
                        entries.add(ModBlocks.ELDERBERRY_TART);
                        entries.add(ModBlocks.GLOW_BERRY_TART);
                        entries.add(ModBlocks.SWEET_BERRY_TART);
                        entries.add(ModBlocks.LAPISBERRY_TART);
                        entries.add(ModBlocks.APPLE_PIE);
                        entries.add(ModBlocks.ORANGE_PIE);
                        entries.add(ModBlocks.LEMON_PIE);
                        entries.add(ModBlocks.PLUM_PIE);
                        entries.add(ModBlocks.CHOCOLATE_CAKE);
                    }).build());
    public static void registerItemGroups() {
        BountifulCuisine.LOGGER.info("Registering Item Group Entries for " + BountifulCuisine.MOD_ID);
    }
}
