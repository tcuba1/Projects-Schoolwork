public class Main {
    public static void main(String[] args) {

        //Initialize inventory
        Inventory testInventory = new Inventory("test inventory");

        //Create Item objects
        Item apple = new Item(0, "apple", 100);
        Item banana = new Item(0, "banana", 100);
        Item chips = new Item(0, "chips", 100);
        Item iceCream = new Item(0, "ice cream", 100);
        Item chicken = new Item(0, "chicken", 100);

        //Convert Item objects to ItemDisplay objects
        ItemDisplay appleDisplay = new BasicItemDisplay(apple);
        ItemDisplay bananaDisplay = new BasicItemDisplay(banana);
        ItemDisplay chipsDisplay = new BasicItemDisplay(chips);
        ItemDisplay iceCreamDisplay = new BasicItemDisplay(iceCream);
        ItemDisplay chickenDisplay = new BasicItemDisplay(chicken);

        //Apply decorator to ItemDisplay objects
        ItemDisplay frozenIceCream = new FrozenItemDecorator(iceCreamDisplay);
        ItemDisplay chilledChicken = new ChilledItemDecorator(chickenDisplay);

        //Add items to the inventory
        testInventory.addItem(appleDisplay);
        testInventory.addItem(bananaDisplay);
        testInventory.addItem(chipsDisplay);
        testInventory.addItem(frozenIceCream);
        testInventory.addItem(chilledChicken);
        testInventory.displayInventory();

        //Delete "chips" item from inventory
        testInventory.deleteItem(chipsDisplay.getItemName());
        testInventory.displayInventory();

        //Update "ice cream" item's stock
        testInventory.updateItem(frozenIceCream.getItemName(), 50);
        testInventory.displayInventory();

    }
}