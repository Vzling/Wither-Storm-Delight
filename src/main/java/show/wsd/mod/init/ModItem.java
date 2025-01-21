package show.wsd.mod.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import show.wsd.mod.WSDFoodValues;
import show.wsd.mod.WitherStormDelightMod;
import show.wsd.mod.item.*;
import vectorwing.farmersdelight.common.item.CookingPotItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.MushroomColonyItem;

import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WitherStormDelightMod.MOD_ID);

    public static final RegistryObject<Item> COOKED_WITHERED_FLESH = ITEMS.register("cooked_withered_flesh",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(0.4f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> WITHERED_FLESH_PATTY = ITEMS.register("withered_flesh_patty",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(0.6f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> MINCED_WITHERED_FLESH = ITEMS.register("minced_withered_flesh",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(0.5f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> WITHERED_CABBAGE_ROLLS = ITEMS.register("withered_cabbage_rolls",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.6f)
                            .build())));

    public static final RegistryObject<Item> TAINTED_ESSENCE = ITEMS.register("tainted_essence",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> WITHERED_TOMATO_SAUCE = ITEMS.register("withered_tomato_sauce",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.WITHERED_TOMATO_SAUCE),
                    false));

    public static final RegistryObject<Item> GOLDEN_APPLE_STEW_LARGE_BOWL = ITEMS.register("large_bowl_of_golden_apple_stew",
            () -> new GoldenAppleConsumableItem(bowlFoodItem(WSDFoodValues.GOLDEN_APPLE_STEW_LARGE_BOWL).rarity(Rarity.RARE),
                    true));


    public static final RegistryObject<Item> WITHERED_BONE_BROTH = ITEMS.register("withered_bone_broth",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.WITHERED_BONE_BROTH),
                    true));

    public static final RegistryObject<Item> TAINTED_PUMPKIN_SLICE = ITEMS.register("tainted_pumpkin_slice",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(0.2f)
                            .build())));

    public static final RegistryObject<Item> WITHER_STORM_TENTACLE = ITEMS.register("wither_storm_tentacle",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> WITHER_STOVE = ITEMS.register("wither_stove",
            () -> new BlockItem(ModBlock.WITHER_STOVE.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> TAINTED_CABINET = ITEMS.register("tainted_cabinet",
            () -> new BlockItem(ModBlock.TAINTED_CABINET.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> COMMAND_BLOCK_FRAGMENT = ITEMS.register("command_block_fragment",
            () -> new Item(new Item.Properties()
                    .rarity(WitherStormDelightMod.COMMAND)));

    public static final RegistryObject<Item> FORMIDIEGG = ITEMS.register("formidiegg", Formidiegg::new);

    public static final RegistryObject<Item> SUPER_EGG = ITEMS.register("super_egg", SuperEgg::new);

    public static final RegistryObject<Item> SUPER_FRIED_EGG = ITEMS.register("super_fried_egg",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(2.5f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> FORMIDIFRIED_EGG = ITEMS.register("formidifried_egg", FormidifriedEgg::new);

    public static final RegistryObject<Item> TAINTED_EYE = ITEMS.register("tainted_eye",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> SYMBIONT_EYE = ITEMS.register("the_eye_of_symbiont",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(WitherStormDelightMod.SYMBIONT)));

    public static final RegistryObject<Item> COMMAND_COOKING_POT = ITEMS.register("command_cooking_pot",
            () -> new CookingPotItem(ModBlock.COMMAND_COOKING_POT.get(), basicItem()
                    .stacksTo(1)
                    .rarity(WitherStormDelightMod.COMMAND)));

    public static final RegistryObject<BlockItem> STORM_DINNER_BLOCK = ITEMS.register("storm_dinner_block",
            () -> new BlockItem(ModBlock.STORM_DINNER_BLOCK.get(), basicItem()
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<BlockItem> GOLDEN_APPLE_STEW_BLOCK = ITEMS.register("cooking_pot_of_golden_apple_stew",
            () -> new BlockItem(ModBlock.GOLDEN_APPLE_STEW_BLOCK.get(), basicItem()
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> STORM_DINNER = ITEMS.register("storm_dinner",
            () -> new GoldenAppleConsumableItem(bowlFoodItem(WSDFoodValues.STORM_DINNER).rarity(Rarity.EPIC),
                    true));

    public static final RegistryObject<BlockItem> STUFFED_TAINTED_PUMPKIN_BLOCK = ITEMS.register("stuffed_tainted_pumpkin_block",
            () -> new BlockItem(ModBlock.STUFFED_TAINTED_PUMPKIN_BLOCK.get(), basicItem()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STUFFED_TAINTED_PUMPKIN = ITEMS.register("stuffed_tainted_pumpkin",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.STUFFED_TAINTED_PUMPKIN).rarity(Rarity.UNCOMMON),
                    true));

    public static final RegistryObject<Item> BIG_MAC_BURGER_BLOCK = ITEMS.register("big_mac_burger_block",
            () -> new BlockItem(ModBlock.BIG_MAC_BURGER_BLOCK.get(), basicItem()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> BIG_MAC_BURGER = ITEMS.register("big_mac_burger",
            () -> new WSDConsumableItem(foodItem(WSDFoodValues.BIG_MAC_BURGER).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<BlockItem> STUFFED_COMMAND_BLOCK_BLOCK = ITEMS.register("stuffed_command_block_block",
            () -> new BlockItem(ModBlock.STUFFED_COMMAND_BLOCK_BLOCK.get(), basicItem()
                    .rarity(WitherStormDelightMod.COMMAND)));

    public static final RegistryObject<Item> STUFFED_COMMAND_BLOCK = ITEMS.register("stuffed_command_block",
            () -> new GoldenAppleConsumableItem(bowlFoodItem(WSDFoodValues.STUFFED_COMMAND_BLOCK).rarity(WitherStormDelightMod.COMMAND),
                    true));

    public static final RegistryObject<BlockItem> COOKED_ZOMBIE_BLOCK = ITEMS.register("cooked_tainted_zombie_block",
            () -> new BlockItem(ModBlock.COOKED_ZOMBIE_BLOCK.get(), basicItem()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> COOKED_ZOMBIE = ITEMS.register("cooked_tainted_zombie",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.COOKED_ZOMBIE).rarity(Rarity.UNCOMMON),
                    true));

    public static final RegistryObject<Item> WITHER_BARBECUE = ITEMS.register("wither_barbecue_stick",
            () -> new WSDConsumableItem(stickFoodItem(WSDFoodValues.WITHER_BARBECUE).rarity(Rarity.UNCOMMON),
                    false));

    public static final RegistryObject<Item> STORM_SANDWICH = ITEMS.register("storm_sandwich",
            () -> new WSDConsumableItem(foodItem(WSDFoodValues.STORM_SANDWICH).rarity(Rarity.UNCOMMON),
                    false));

    public static final RegistryObject<Item> EYES_PORRIDGE = ITEMS.register("eyes_porridge",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.EYES_PORRIDGE).rarity(Rarity.UNCOMMON),
                    true));

    public static final RegistryObject<Item> FRIED_RICE = ITEMS.register("fried_withered_rice",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.FRIED_RICE).rarity(Rarity.UNCOMMON),
                    true));

    public static final RegistryObject<Item> SALAD = ITEMS.register("withered_salad",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.SALAD).rarity(Rarity.UNCOMMON),
                    true));

    public static final RegistryObject<Item> COOKED_RICE = ITEMS.register("cooked_withered_rice",
            () -> new WSDConsumableItem(bowlFoodItem(WSDFoodValues.COOKED_RICE),
                    true));

    public static final RegistryObject<Item> STORM_PIE_SLICE = ITEMS.register("storm_pie_slice",
            () -> new WSDConsumableItem(foodItem(WSDFoodValues.PIE_SLICE).rarity(Rarity.UNCOMMON),
                    false));

    public static final RegistryObject<Item> STORM_PIE = ITEMS.register("storm_pie",
            () -> new BlockItem(ModBlock.STORM_PIE.get(), basicItem()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STORM_POPSICLE = ITEMS.register("storm_popsicle",
            () -> new WSDConsumableItem(stickFoodItem(WSDFoodValues.STORM_POPSICLE).rarity(Rarity.UNCOMMON),
                    false));


    public static final RegistryObject<Item> TAINTED_MUSHROOM_COLONY = ITEMS.register("tainted_mushroom_colony",
            () -> new MushroomColonyItem(ModBlock.TAINTED_MUSHROOM_COLONY.get(), basicItem()
                    .rarity(Rarity.UNCOMMON)));

    //Crops
    public static final RegistryObject<Item> WITHERED_CABBAGE = ITEMS.register("withered_cabbage",
            () -> new Item(foodItem(WSDFoodValues.WITHERED_CABBAGE)));

    public static final RegistryObject<Item> WITHERED_TOMATO = ITEMS.register("withered_tomato",
            () -> new Item(foodItem(WSDFoodValues.WITHERED_TOMATO)));

    public static final RegistryObject<Item> WITHERED_CABBAGE_LEAF = ITEMS.register("withered_cabbage_leaf",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(0.2f)
                            .build())));

    public static final RegistryObject<Item> WITHERED_RICE_PANICLE = ITEMS.register("withered_rice_panicle",
            () -> new Item(basicItem()));

    public static final RegistryObject<Item> WITHERED_RICE = ITEMS.register("withered_rice",
            () -> new WitheredRiceItem(ModBlock.WITHERED_RICE_CROP.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_CABBAGE_SEEDS = ITEMS.register("withered_cabbage_seeds",
            () -> new ItemNameBlockItem(ModBlock.WITHERED_CABBAGE_CROP.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_TOMATO_SEEDS = ITEMS.register("withered_tomato_seeds",
            () -> new ItemNameBlockItem(ModBlock.BUDDING_WITHERED_TOMATO_CROP.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_ONION = ITEMS.register("withered_onion",
            () -> new ItemNameBlockItem(ModBlock.WITHERED_ONION_CROP.get(), foodItem(WSDFoodValues.WITHERED_ONION)));

    //Crate
    public static final RegistryObject<Item> WITHERED_CABBAGE_CRATE = ITEMS.register("withered_cabbage_crate",
            () -> new BlockItem(ModBlock.WITHERED_CABBAGE_CRATE.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_TOMATO_CRATE = ITEMS.register("withered_tomato_crate",
            () -> new BlockItem(ModBlock.WITHERED_TOMATO_CRATE.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_ONION_CRATE = ITEMS.register("withered_onion_crate",
            () -> new BlockItem(ModBlock.WITHERED_ONION_CRATE.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_RICE_BALE = ITEMS.register("withered_rice_bale",
            () -> new BlockItem(ModBlock.WITHERED_RICE_BALE.get(), basicItem()));

    public static final RegistryObject<Item> WITHERED_RICE_BAG = ITEMS.register("withered_rice_bag",
            () -> new BlockItem(ModBlock.WITHERED_RICE_BAG.get(), basicItem()));

    //Knifes
    public static final RegistryObject<Item> COMMAND_BLOCK_KNIFE = ITEMS.register("command_block_knife", CommandBlockKnife::new);

    public static final RegistryObject<Item> IRON_COMMAND_BLOCK_KNIFE = ITEMS.register("iron_command_block_knife", IronCommandBlockKnife::new);

    public static final RegistryObject<Item> GOLD_COMMAND_BLOCK_KNIFE = ITEMS.register("gold_command_block_knife", GoldCommandBlockKnife::new);

    public static final RegistryObject<Item> FLINT_COMMAND_BLOCK_KNIFE = ITEMS.register("flint_command_block_knife", FlintCommandBlockKnife::new);

    public static final RegistryObject<Item> NETHERITE_COMMAND_BLOCK_KNIFE = ITEMS.register("netherite_command_block_knife", NetheriteCommandBlockKnife::new);

    //Drinks
    public static final RegistryObject<Item> WITHER_ROSE_PETAL_TEA = ITEMS.register("wither_rose_petal_tea",
            () -> new DrinkableItem(drinkItem(WSDFoodValues.WITHER_ROSE_PETAL_TEA).rarity(Rarity.UNCOMMON),
                    true, false));
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties()
                .food(food)
                .craftRemainder(Items.BOWL)
                .stacksTo(16);
    }
    public static Item.Properties drinkItem(FoodProperties food) {
        return new Item.Properties()
                .food(food)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16);
    }
    public static Item.Properties stickFoodItem(FoodProperties food) {
        return new Item.Properties()
                .food(food)
                .craftRemainder(Items.STICK)
                .stacksTo(16);
    }
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties()
                .food(food);
    }
}
