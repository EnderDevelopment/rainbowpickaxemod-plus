package com.enderdevelopment.rainbowpickaxe;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public final class ModEvents {
    private ModEvents() {
    }

    public static void init() {
        UseItemCallback.EVENT.register((player, world, hand) -> {
            if (hand == InteractionHand.MAIN_HAND) {
                ItemStack stack = player.getItemInHand(hand);
                if (stack.getItem() == ModItems.RAINBOW_PICKAXE) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1));
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0));
                    return InteractionResultHolder.success(stack);
                }
            }
            return InteractionResultHolder.pass(player.getItemInHand(hand));
        });
    }
}