import java.util.ArrayList;
import java.util.List;

public class Inventory {

    //Variables for Inventory objects
    private String name;
    public List<ItemDisplay> inventory = new ArrayList<>();

    //Constructor 
    public Inventory(String name) {
        this.name = name;
    }

    //Method to add items
    public void addItem(ItemDisplay itemDisplay) {
        inventory.add(itemDisplay);
        this.updateItemIDs();
    }

    //Method to update item IDs
    public void updateItemIDs() {
        int i = 1;
        for (ItemDisplay item : inventory) {
            item.setItemID(i);
            ++i;
        }
    }

    //Method to delete items
    public void deleteItem(String itemName) {
        ItemDisplay item = searchInventory(itemName);
        if (item != null) {
            inventory.remove(item);
            System.out.println("Item " + item.getItemName() + " has been deleted");
        }
        this.updateItemIDs();
    }

    //Method to search for a given item in the inventory
    public ItemDisplay searchInventory(String itemName) {
        for (ItemDisplay item : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    //Method to update an item's stock
    public void updateItem(String itemName, int newStock) {
        ItemDisplay item = searchInventory(itemName);
        if (item != null) {
            item.setItemStock(newStock);
            System.out.println("Item " + item.getItemName() + " stock has been updated");
        } else {
            System.out.println("Item not found");
        }
    }

    //Method to output items in the inventory
    public void displayInventory() {
        System.out.println("Inventory: " + this.name);
        for (ItemDisplay item : inventory) {
            item.display();
        }
        System.out.println();
    }
}