package com.alonzovr.bbqmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent OVERCOOKED_BEEF = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).meat().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600), 0.8f).build();
}