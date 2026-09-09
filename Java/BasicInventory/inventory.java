import java.util.ArrayList;
import java.util.List;

public class item {

    public int itemID;
    public string itemName;
    public int itemStock;

    // constructor
    public item(int itemID, string itemName, int itemStock) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemStock = itemStock;
    }

}

public class inventory {

    public List<item> inventory = new ArrayList<>();

    public void addItem(string itemName, int itemStock) {
        item newItem = item(getNextID(), itemName, itemStock);
        inventory.add(newItem);
    }

    public int getNextID() {
        if (inventory.isEmpty()) {
            return 0;
        } else {
            return inventory.length() + 1;
        }
    }

    public void deleteItem(string itemName) {
        item = searchInventory(itemName);
        if (item != null) {
            inventory.remove(item);
        }
    }

    public item searchInventory(string itemName) {
        for (item item : inventory) {
            if (item.iteName.equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public List<item> updateItem(string itemName, int newStock) {
        item item = searchInventory(itemName);
        if (item != null) {
            item.itemStock = newStock;
            System.out.println("Item " + item.itemName + " stock has been updated");
        } else {
            System.out.println("Item not found");
        }
    }

    public void displayInventory() {
        for (item item : inventory) {
            System.out.println(
                    "Item ID: " + item.itemID + " Item Name: " + item.itemName + " Item Stock: " + item.itemStock);
        }
    }
}

public static void main(String[] args) {

    inventory testInventory;

    testInventory.addItem(new item(apple, 100));
    testInventory.addItem(new item(banana, 75));
    testInventory.addItem(new item(chips, 80));
    testInventory.addItem(new item(chicken, 150));
    testInventory.addItem(new item(beef, 300));
    testInventory.displayInventory();

    testInventory.updateItem(beef, 125);
    testInventory.displayInventory();

    testInventory.deleteItem(chips);
    testInventory.displayInventory();

}
