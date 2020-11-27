package amata1219.inventory.ui.dsl.component.slot;

import amata1219.inventory.ui.dsl.component.Icon;

import java.util.ArrayList;
import java.util.function.Consumer;

public abstract class AnimatedSlot extends Slot {

    private final ArrayList<Consumer<Icon>> differences = new ArrayList<>();

    public AnimatedSlot(Consumer<Icon> basedIconSettings) {
        super(basedIconSettings);
    }

    public AnimatedSlot append(Consumer<Icon> difference) {
        differences.add(difference);
        return this;
    }

    public abstract void animate();

}
