package show.wsd.mod.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import show.wsd.mod.WitherStormDelightMod;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class NetheriteCommandBlockKnife extends KnifeItem {
    public NetheriteCommandBlockKnife() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 13f;
            }

            public float getAttackDamageBonus() {
                return 6.75f;
            }

            public int getLevel() {
                return 5;
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1, -1.8f, new Properties().rarity(WitherStormDelightMod.COMMAND));
    }
}