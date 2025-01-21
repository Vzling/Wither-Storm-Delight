package show.wsd.mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class GoldCommandBlockKnife extends KnifeItem {
    public GoldCommandBlockKnife() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 17f;
            }

            public float getAttackDamageBonus() {
                return -0.5f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 31;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1, -0.8f, new Properties().rarity(Rarity.EPIC));
    }
}
