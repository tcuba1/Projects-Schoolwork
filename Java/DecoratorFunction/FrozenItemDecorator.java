public class FrozenItemDecorator extends ItemDisplayDecorator {

    //Constructor
    public FrozenItemDecorator(ItemDisplay decoratedItemDisplay) {
        super(decoratedItemDisplay);
    }

    //Display method
    @Override
    public void display(){
        System.out.println("[Frozen]");
        super.display();
    }

}