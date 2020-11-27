package amata1219.inventory.ui.dsl.component.slot;

import amata1219.inventory.ui.dsl.component.Icon;
import amata1219.inventory.ui.util.Constants;
import net.md_5.bungee.api.chat.ClickEvent;

import java.util.function.Consumer;
import java.util.function.Function;

public class Slot {

    private final Consumer<Icon> iconSettings;
    public Consumer<ClickEvent> actionOnClick = Constants.noOperation();

    public Slot(Consumer<Icon> iconSettings) {
        this.iconSettings = iconSettings;
    }

    public Icon build() {
        Icon icon = new Icon();
        iconSettings.accept(icon);
        return icon;
    }

}
