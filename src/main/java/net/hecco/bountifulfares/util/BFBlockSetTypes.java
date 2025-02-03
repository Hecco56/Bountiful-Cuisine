package net.hecco.bountifulfares.util;

import net.hecco.bountifulfares.sounds.BFSounds;
import net.minecraft.block.BlockSetType;

public class BFBlockSetTypes {
    public static final BlockSetType HOARY = BFBlockSetTypes.register(new BlockSetType("hoary"));
    public static final BlockSetType WALNUT = BFBlockSetTypes.register(new BlockSetType("walnut"));
    public static final BlockSetType CERAMIC = BFBlockSetTypes.register(new BlockSetType("ceramic",
            true,
            true,
            true,
            BlockSetType.ActivationRule.EVERYTHING,
            BFSounds.CERAMIC_DECORATION,
            BFSounds.CERAMIC_DOOR_TOGGLE,
            BFSounds.CERAMIC_DOOR_TOGGLE,
            BFSounds.CERAMIC_DOOR_TOGGLE,
            BFSounds.CERAMIC_DOOR_TOGGLE,
            BFSounds.CERAMIC_DECORATION_PLACE,
            BFSounds.CERAMIC_DECORATION_PLACE,
            BFSounds.CERAMIC_DECORATION_PLACE,
            BFSounds.CERAMIC_DECORATION_PLACE
    ));


    private static BlockSetType register(BlockSetType blockSetType) {
        return blockSetType;
    }
}