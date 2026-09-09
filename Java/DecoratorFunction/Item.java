public class Item {

    //Item Variables
    private int itemID;
    private String itemName;
    private int itemStock;

    // constructor
    public Item(int itemID, String itemName, int itemStock) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemStock = itemStock;
    }

    //-- Getter methods --
    //ItemID
    public int getItemID() {
        return itemID;
    }

    //ItemName
    public String getItemName() {
        return itemName;
    }

    //ItemStock
    public int getItemStock() {
        return itemStock;
    }

    //-- Setter methods --
    //ItemID
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    //ItemName
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //ItemStock
    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }
}