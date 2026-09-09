public abstract class ItemDisplayDecorator implements ItemDisplay {
    
    //Variable to hold ItemDisplay data for decorator
    protected ItemDisplay decoratedItemDisplay;

    //Constructor
    public ItemDisplayDecorator(ItemDisplay decoratedItemDisplay) {
        this.decoratedItemDisplay = decoratedItemDisplay;
    }

    //Display method
    @Override
    public void display() {
        decoratedItemDisplay.display();
    }

            //Getter methods
            @Override
            public int getItemID() {
                return decoratedItemDisplay.getItemID();
            }
        
            @Override
            public String getItemName() {
                return decoratedItemDisplay.getItemName();
            }
        
            @Override
            public int getItemStock() {
                return decoratedItemDisplay.getItemStock();
            }
        
            //Setter Methods
            @Override
            public void setItemID(int id) {
                decoratedItemDisplay.setItemID(id);
            }
        
            @Override
            public void setItemName(String name) {
                decoratedItemDisplay.setItemName(name);
            }
        
            @Override
            public void setItemStock(int stock) {
                decoratedItemDisplay.setItemStock(stock);
            }
}