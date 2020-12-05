package mounderfod.foodgloriousfood;

import io.github.foundationgames.mealapi.api.MealItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FGFFoodItems {
    public static final Item CHEESE_WHEEL = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*30), 1.0f).build()).maxCount(1));
    public static final Item CHEESE_SLICE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build()));
    public static final Item RAW_BACON = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*5), 1.0f).build()));
    public static final Item COOKED_BACON = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item RAW_SAUSAGE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*5), 1.0f).build()));
    public static final Item COOKED_SAUSAGE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()));
    public static final Item PEAR = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item CHERRY = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item ORANGE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item BANANA = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item CHERRY_PIE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(20).saturationModifier(1.0f).build()));
    public static final Item APPLE_PIE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(20).saturationModifier(1.0f).build()));
    public static final Item BEEF_MINCE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*5), 1.0f).build()));
    public static final Item RAW_PATTY = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*5), 1.0f).build()));
    public static final Item COOKED_PATTY = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()));
    public static final Item PLAIN_BURGER = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(20).saturationModifier(1.0f).build()));
    public static final Item CHEESE_BURGER = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(20).saturationModifier(1.0f).build()));
    public static final Item BREAD_SLICE = new Item(new FabricItemSettings().group(FGFMain.FGF_ITEMS).food(new FoodComponent.Builder().hunger(1).build()));


    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("fgf", "cheese_wheel"), CHEESE_WHEEL);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cheese_slice"), CHEESE_SLICE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier("fgf", "raw_sausage"), RAW_SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cooked_sausage"), COOKED_SAUSAGE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "pear"), PEAR);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cherry"), CHERRY);
        Registry.register(Registry.ITEM, new Identifier("fgf", "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cherry_pie"), CHERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "beef_mince"), BEEF_MINCE);
        Registry.register(Registry.ITEM, new Identifier("fgf", "raw_patty"), RAW_PATTY);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cooked_patty"), COOKED_PATTY);
        Registry.register(Registry.ITEM, new Identifier("fgf", "plain_burger"), PLAIN_BURGER);
        Registry.register(Registry.ITEM, new Identifier("fgf", "cheese_burger"), CHEESE_BURGER);
        Registry.register(Registry.ITEM, new Identifier("fgf", "bread_slice"), BREAD_SLICE);




        MealItemRegistry.register(CHERRY_PIE, ((player, stack) -> {
            return 50;
        }));
        MealItemRegistry.register(APPLE_PIE, ((player, stack) -> {
            return 50;
        }));
        MealItemRegistry.register(PLAIN_BURGER, ((player, stack) -> {
            return 75;
        }));
        MealItemRegistry.register(CHEESE_BURGER, ((player, stack) -> {
            return 100;
        }));

    }
}
