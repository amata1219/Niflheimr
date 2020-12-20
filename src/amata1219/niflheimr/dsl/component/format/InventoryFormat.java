package amata1219.niflheimr.dsl.component.format;

import amata1219.niflheimr.dsl.component.InventoryLayout;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public interface InventoryFormat {

    Inventory createInventoryWith(InventoryLayout layout);

    Inventory createInventoryWith(InventoryLayout layout, String title);

}
