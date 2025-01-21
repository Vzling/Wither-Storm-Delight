package show.wsd.mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class IronCommandBlockKnife extends KnifeItem {
    public IronCommandBlockKnife() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 7f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 18;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1, -2.4f, new Properties().rarity(Rarity.EPIC));
    }
}
