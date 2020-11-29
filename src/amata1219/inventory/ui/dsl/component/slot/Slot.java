package amata1219.inventory.ui.dsl.component.slot;

import amata1219.inventory.ui.dsl.component.Icon;
import amata1219.inventory.ui.event.InventoryUIClickEvent;
import amata1219.inventory.ui.util.Constants;

import java.util.Optional;
import java.util.function.Consumer;

public class Slot {

    private Consumer<Icon> iconSettings = Constants.noOperation();
    private Consumer<InventoryUIClickEvent> actionOnClick = Constants.noOperation();

    public void icon(Consumer<Icon> settings) {
        iconSettings = settings;
    }

    public Consumer<InventoryUIClickEvent>  actionOnClick() {
        return actionOnClick;
    }

    public void onClick(Consumer<InventoryUIClickEvent> actionOnClick) {
        this.actionOnClick = actionOnClick;
    }

    public Icon buildIcon() {
        Icon icon = new Icon();
        iconSettings.accept(icon);
        return icon;
    }

}
