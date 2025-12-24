package dev.anvilcraft.addon.template.event;

import dev.anvilcraft.addon.template.item.DoomFistItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber
public class PlayerTickHandler {
    
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        // 调用DoomFistItem的静态方法来维持突进速度
        DoomFistItem.tickDashingPlayer(player);
    }
    
    @SubscribeEvent
    public static void onEntityTick(EntityTickEvent.Post event) {
        // 检测被击退生物是否撞墙
        if (event.getEntity() instanceof LivingEntity entity) {
            DoomFistItem.tickKnockbackEntity(entity);
        }
    }
}
