package amata1219.niflheimr;

import amata1219.niflheimr.enchantment.GleamEnchantment;
import amata1219.niflheimr.dsl.InventoryOperationListener;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.Objects;

public class Niflheimr extends JavaPlugin {

    private static Niflheimr instance;

    @Override
    public void onEnable() {
        instance = this;

        Field acceptingNew;
        try {
            acceptingNew = Enchantment.class.getDeclaredField("acceptingNew");
            acceptingNew.setAccessible(true);
            acceptingNew.set(null, true);
            Enchantment.registerEnchantment(GleamEnchantment.INSTANCE);
            acceptingNew.set(null, false);
            acceptingNew.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException ignored) {

        }

        getServer().getPluginManager().registerEvents(new InventoryOperationListener(), this);
    }

    @Override
    public void onDisable() {
        for (Player player : getServer().getOnlinePlayers()) {
            if (InventoryOperationListener.tryExtractInventoryLayout(player.getInventory()) != null)
                player.closeInventory();
        }

        HandlerList.unregisterAll(this);
    }

    public static Niflheimr instance() {
        return instance;
    }
}
