import java.util.List;
import java.util.LinkedList;

public class FindRVTest {

    public static void main(String[] args) {
        // Set up the inventory
        RVInventory inventory = new RVInventory();
        initializeInventory(inventory);

        RV whatJohnLikes = new RV("", // Doesn't really care about stock number
                getManufacturerEnum("XLR"),//RVManufacturer.COACHMEN, // He's a fan of Coachmen company
                "", // Doesn't really care about the model
                25000, // John wants to spend 25000 or less
                "", // He doesn't care about the type
                25, // John wants it to be 25 feet or less
                5000); // It's gotta weigh 5000 lbs or less

        List<RV> matchingRVs = inventory.search(whatJohnLikes);

        if (matchingRVs != null) {
            System.out.println("RVs matching the description:\n");
            for(RV rv : matchingRVs) {
                System.out.println("Stock Number: " + rv.getStockNumber() + "\n"
                        + "Manufacturer: " + rv.getManufacturer() + "\n" + "Model: " + rv.getModel() + "\n" + "Price: "
                        + "$ " + rv.getPrice() + "\n" + "Type: " + rv.getType() + "\n" + "Length: " + rv.getLength()
                        + " ft\n" + "Weight: " + rv.getWeight() + " lbs\n");
            } 
        } else {
            System.out.println("I don't have anything like that. \n" + "You must be picky!\n" + "Go somewhere else!\n");
        }
        
    }

    private static RVManufacturer getManufacturerEnum(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null; // or you could return a default value like RVManufacturer.COACHMAN
        }
        try {
            return RVManufacturer.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + name + " is not found in our database\n");
            return null;
        }
    }

    private static void initializeInventory(RVInventory inventory) {
        // stock # manufacturer model price type length weight
        inventory.addRV("6026", RVManufacturer.COACHMEN, "Apex 289TBSS", 30975, "Travel Trailer", 25, 5720);
        inventory.addRV("6086", RVManufacturer.COACHMEN, "V-Trec VC", 19475, "Popup", 23, 3217);
        inventory.addRV("6090", RVManufacturer.COACHMEN, "Leprechaun", 96975, "Class C", 31, 14500);
        inventory.addRV("6284A", RVManufacturer.TIFFIN, "Allegro", 69900, "Class A", 34, 18621);
        inventory.addRV("6293A", RVManufacturer.STARCRAFT, "Travel Star", 8900, "Hybrid", 17, 2997);
        inventory.addRV("6028", RVManufacturer.XLR, "Hyperlite", 37475, "Toy Hauler", 25, 5322);
        inventory.addRV("6218A", RVManufacturer.FOREST_RIVER, "Artic Wolf", 31900, "Fifth Wheel", 29, 8131);
        inventory.addRV("6291A", RVManufacturer.FOUR_WINDS, "Classic", 9900, "Fifth Wheel", 32, 8064);
    }
}
