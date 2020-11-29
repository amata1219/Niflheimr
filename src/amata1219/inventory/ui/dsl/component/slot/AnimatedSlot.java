package amata1219.inventory.ui.dsl.component.slot;

import amata1219.inventory.ui.dsl.component.Icon;
import amata1219.inventory.ui.event.InventoryUICloseEvent;
import amata1219.inventory.ui.event.InventoryUIOpenEvent;
import amata1219.inventory.ui.util.Constants;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

public class AnimatedSlot extends Slot {

    protected ArrayList<Consumer<Icon>> differences = new ArrayList<>();
    private Consumer<InventoryUIOpenEvent> actionOnOpen = Constants.noOperation();
    private Consumer<InventoryUICloseEvent> actionOnClose = Constants.noOperation();

    public AnimatedSlot append(Consumer<Icon> difference) {
        differences.add(difference);
        return this;
    }

    public Consumer<InventoryUIOpenEvent>  actionOnOpen() {
        return actionOnOpen;
    }

    public void onOpen(Consumer<InventoryUIOpenEvent> actionOnOpen) {
        this.actionOnOpen = actionOnOpen;
    }

    public Consumer<InventoryUICloseEvent>  actionOnClose() {
        return actionOnClose;
    }

    public void oClose(Consumer<InventoryUICloseEvent> actionOnClose) {
        this.actionOnClose = actionOnClose;
    }

}
