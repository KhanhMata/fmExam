package formosTest;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    static List<SmoothieIngredients> inventoryOfIngredents = new ArrayList<SmoothieIngredients>();

    private static final int INVENTORY_OF_MILK = 1000;
    private static final int INVENTORY_OF_ICE = 1000;
    private static final int INVENTORY_OF_SUGAR = 1000;
    private static final int INVENTORY_OF_BANANA = 1000;
    private static final int INVENTORY_OF_MANGO = 1000;
    private static final int INVENTORY_OF_STRAWBERRIES = 1000;
    
    static {
        inventoryOfIngredents.add(new Milk(INVENTORY_OF_MILK));
        inventoryOfIngredents.add(new Ice(INVENTORY_OF_ICE));
        inventoryOfIngredents.add(new Sugar(INVENTORY_OF_ICE));
        inventoryOfIngredents.add(new Banana(INVENTORY_OF_BANANA));
        inventoryOfIngredents.add(new Mango(INVENTORY_OF_MANGO));
        inventoryOfIngredents.add(new Strawberries(INVENTORY_OF_STRAWBERRIES));
    }
}
