package amata1219.inventory.ui.dsl.component;

import org.bukkit.event.inventory.InventoryType;

public class InventoryFormat {

    public final int size;
    public final InventoryType type;

    public InventoryFormat(int lines) {
        size = lines * 9;
        type = InventoryType.CHEST;
    }

    public InventoryFormat(InventoryType type) {
        size = 0;
        this.type = type;
    }

}
