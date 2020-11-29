package amata1219.inventory.ui.listener;

import amata1219.inventory.ui.dsl.component.InventoryLayout;
import amata1219.inventory.ui.event.InventoryUIClickEvent;
import amata1219.inventory.ui.event.InventoryUICloseEvent;
import amata1219.inventory.ui.event.InventoryUIOpenEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;

public class InventoryOperationListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Inventory inventory = event.getClickedInventory();
        if (inventory == null) return;

        InventoryLayout layout = (InventoryLayout) event.getInventory().getHolder();
        if (layout != null) layout.actionOnClick().accept(new InventoryUIClickEvent(event));
    }

    @EventHandler
    public void onOpen(InventoryOpenEvent event) {
        InventoryLayout layout = (InventoryLayout) event.getInventory().getHolder();
        if (layout != null) layout.actionOnOpen().accept(new InventoryUIOpenEvent(event));
    }

    @EventHandler
    public void onClose(InventoryCloseEvent event) {
        InventoryLayout layout = (InventoryLayout) event.getInventory().getHolder();
        if (layout != null) layout.actionOnClose().accept(new InventoryUICloseEvent(event));
    }

}
