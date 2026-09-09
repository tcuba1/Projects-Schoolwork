public interface ItemDisplay {
    
    //Display method
    void display();
    
    //Getter methods
    int getItemID();
    String getItemName();
    int getItemStock();

    //Setter methods
    void setItemID(int id);
    void setItemName(String name);
    void setItemStock(int stock);
    
}