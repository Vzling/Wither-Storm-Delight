package show.wsd.mod.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import show.wsd.mod.item.Formidiegg;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @Inject(method = "render", at = @At("HEAD"))
    private void startRender(ItemStack p_115144_, ItemDisplayContext p_270188_, boolean p_115146_, PoseStack p_115147_, MultiBufferSource p_115148_, int p_115149_, int p_115150_, BakedModel p_115151_, CallbackInfo ci) {
        p_115147_.pushPose();
        if (p_115144_.getItem() instanceof Formidiegg && p_270188_ != ItemDisplayContext.GUI) {
            p_115147_.scale(1F, 1F, 1F);
            p_115147_.translate(0F, 0F, 0F);
        }
        p_115147_.popPose();
    }
}
