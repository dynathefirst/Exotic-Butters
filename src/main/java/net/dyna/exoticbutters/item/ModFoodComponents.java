package net.dyna.exoticbutters.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent EXOTIC_BUTTER = new FoodComponent.Builder().hunger(5).saturationModifier(0.3F).snack().build();
    public static final FoodComponent BASKET_OF_EXOTIC_BUTTERS = new FoodComponent.Builder().hunger(8).saturationModifier(1.5F).build();
}
