package net.hecco.bountifulcuisine.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(Item.class)
public class PlantTooltipMixin {
    @Inject(method = "appendTooltip", at = @At("TAIL"))
    protected void plantTooltips(ItemStack stack, World world, List<Text> tooltip, TooltipContext context, CallbackInfo ci) {
        if (Screen.hasShiftDown()) {
            if (stack.getItem() == Items.GLOW_BERRIES) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.glow_berries"));
            }
            if (stack.getItem() == Items.APPLE) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.apple"));
            }
            if (stack.getItem() == Items.CARROT) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.carrot"));
            }
            if (stack.getItem() == Items.POTATO) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.potato"));
            }
            if (stack.getItem() == Items.POISONOUS_POTATO) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.potato"));
            }
            if (stack.getItem() == Items.WHEAT) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.potato"));
            }
            if (stack.getItem() == Items.PUMPKIN) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.pumpkin"));
            }
            if (stack.getItem() == Items.CARVED_PUMPKIN) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.pumpkin"));
            }
            if (stack.getItem() == Items.PUMPKIN_SEEDS) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.pumpkin"));
            }
            if (stack.getItem() == Items.MELON) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.melon"));
            }
            if (stack.getItem() == Items.MELON_SEEDS) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.melon"));
            }
            if (stack.getItem() == Items.SWEET_BERRIES) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.sweet_berries"));
            }
            if (stack.getItem() == Items.PITCHER_POD) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.pitcher_plant"));
            }
            if (stack.getItem() == Items.PITCHER_PLANT) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.pitcher_plant"));
            }
            if (stack.getItem() == Items.TORCHFLOWER_SEEDS) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.torchflower"));
            }
            if (stack.getItem() == Items.TORCHFLOWER) {
                tooltip.add(Text.translatable("tooltip.bountifulcuisine.torchflower"));
            }
        }
    }
}