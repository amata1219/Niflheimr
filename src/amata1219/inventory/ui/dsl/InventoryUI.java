package amata1219.inventory.ui.dsl;

import amata1219.inventory.ui.dsl.component.InventoryFormat;
import amata1219.inventory.ui.dsl.component.InventoryLayout;
import org.bukkit.entity.Player;

import java.util.function.Consumer;

public interface InventoryUI {

    InventoryLayout layout(Player holder);

    default InventoryLayout build(InventoryFormat format, Consumer<InventoryLayout> settings) {
        InventoryLayout layout = new InventoryLayout(format);
        settings.accept(layout);
        return layout;
    }

    default void openInventory(Player player) {
    }

}
