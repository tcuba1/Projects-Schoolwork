public class BasicItemDisplay implements ItemDisplay {
    
    //Variable to hold Item data for display
    private Item item;

    //Constructor
    public BasicItemDisplay(Item item) {
        this.item = item;
    }

    //Display method
    @Override
    public void display() {
        System.out.println("Item ID: " + item.getItemID() + " | Item Name: " + item.getItemName() + " | Item Stock: " + item.getItemStock());
    }

    //Getter methods
    @Override
    public int getItemID() {
        return item.getItemID();
    }

    @Override
    public String getItemName() {
        return item.getItemName();
    }

    @Override
    public int getItemStock() {
        return item.getItemStock();
    }

    //Setter Methods
    @Override
    public void setItemID(int id) {
        item.setItemID(id);
    }

    @Override
    public void setItemName(String name) {
        item.setItemName(name);
    }

    @Override
    public void setItemStock(int stock) {
        item.setItemStock(stock);
    }
}
