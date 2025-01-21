package show.wsd.mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class FlintCommandBlockKnife extends KnifeItem {
    public FlintCommandBlockKnife() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 3.5f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1, -2f, new Properties().rarity(Rarity.EPIC));
    }
}
