package net.hecco.bountifulcuisine.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.hecco.bountifulcuisine.BountifulCuisine;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWoodTypes {
    public static final WoodType HOARY = new WoodTypeBuilder().register(new Identifier(BountifulCuisine.MOD_ID, "hoary"), ModBlockSetTypes.HOARY);
    public static final WoodType WALNUT = new WoodTypeBuilder().register(new Identifier(BountifulCuisine.MOD_ID, "walnut"), ModBlockSetTypes.WALNUT);
}

