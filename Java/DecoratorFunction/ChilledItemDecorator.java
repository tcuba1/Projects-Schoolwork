public class ChilledItemDecorator extends ItemDisplayDecorator {

    //Constructor
    public ChilledItemDecorator(ItemDisplay decoratedItemDisplay) {
        super(decoratedItemDisplay);
    }

    //Display method
    @Override
    public void display(){
        System.out.println("[Chilled]");
        super.display();
    
    }
}