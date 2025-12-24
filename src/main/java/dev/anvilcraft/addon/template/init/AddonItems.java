package dev.anvilcraft.addon.template.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import dev.anvilcraft.addon.template.item.DoomFistItem;
import dev.dubhe.anvilcraft.AnvilCraft;
import net.minecraft.world.item.Item;

import static dev.anvilcraft.addon.template.AnvilCraftAddonTemplate.REGISTRATE;

public class AddonItems {
    static {
        AnvilCraft.REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.getKey());
    }

    public static final ItemEntry<Item> EXAMPLE_ITEM = REGISTRATE
        .item("example_item", Item::new)
        .register();

    public static final ItemEntry<DoomFistItem> DOOM_FIST = REGISTRATE
        .item("doom_fist", DoomFistItem::new)
        .properties(properties -> properties.stacksTo(1))
        .model((ctx, provider) -> {
        })
        .register();


    public static void register() {
    }
}
