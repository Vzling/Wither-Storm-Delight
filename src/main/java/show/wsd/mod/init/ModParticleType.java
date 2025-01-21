package show.wsd.mod.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import show.wsd.mod.WitherStormDelightMod;

public class ModParticleType {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WitherStormDelightMod.MOD_ID);

    public static final RegistryObject<SimpleParticleType> WIRHER_FLAME = PARTICLE_TYPES.register("wither_flame",
            () -> new SimpleParticleType(false));
}
