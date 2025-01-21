package show.wsd.mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class CommandBlockKnife extends KnifeItem {
    public CommandBlockKnife() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 9f;
            }

            public float getAttackDamageBonus() {
                return 5.5f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 21;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1, -2f, new Properties().rarity(Rarity.EPIC));
    }
}
