package dev.anvilcraft.addon.template.init;

import dev.anvilcraft.addon.template.AnvilCraftAddonTemplate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AddonSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = 
        DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, AnvilCraftAddonTemplate.MOD_ID);
    
    // 火箭重拳蓄力音效
    public static final Supplier<SoundEvent> DOOM_FIST_CHARGE = register("doom_fist_charge");
    
    // 火箭重拳突刺音效
    public static final Supplier<SoundEvent> DOOM_FIST_DASH = register("doom_fist_dash");
    
    private static Supplier<SoundEvent> register(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(AnvilCraftAddonTemplate.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }
}
