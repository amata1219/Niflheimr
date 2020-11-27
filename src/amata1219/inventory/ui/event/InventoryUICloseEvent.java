package amata1219.inventory.ui.event;

import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public class InventoryUICloseEvent {

    public final Inventory inventory;

    public InventoryUICloseEvent(InventoryCloseEvent event) {
        inventory = event.getInventory();
    }

}
