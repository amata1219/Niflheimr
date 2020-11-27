package amata1219.inventory.ui;

import amata1219.inventory.ui.enchantment.GleamEnchantment;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        Field acceptingNew = null;
        try {
            acceptingNew = Enchantment.class.getDeclaredField("acceptingNew");
            acceptingNew.setAccessible(true);
            acceptingNew.set(null, true);
            Enchantment.registerEnchantment(GleamEnchantment.INSTANCE);
            acceptingNew.set(null, false);
            acceptingNew.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(this);
    }

    public static Main instance() {
        return instance;
    }
}
