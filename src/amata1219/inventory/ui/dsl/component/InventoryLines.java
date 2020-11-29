package amata1219.inventory.ui.dsl.component;

public enum InventoryLines {

    x1,
    x2,
    x3,
    x4,
    x5,
    x6;

    public final InventoryFormat format = new InventoryFormat(ordinal() + 1);

}
