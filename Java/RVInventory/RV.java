// import java.util.EnumSet;

public class RV {

    /**
     * our inventory ID number for this RV
     */
    private String stockNumber;

    /**
     * The company that makes this RV. Example possible values: Coachman, Coleman,
     * Fleetwood, Forest River, Four Winds, Jayco, Keystone
     */
    private RVManufacturer manufacturer;

    /**
     * The model name for this RV. Freeform text
     */
    private String model;

    /**
     * The dealer's asking price for this RV. In dollars, no cents
     */
    private int price;

    /**
     * The "type" (a.k.a. "class") of this RV. Example possible values: Class A -
     * motorhome built on a heavy duty frame - e.g. on a bus or commercial truck
     * chassis Class B - motorhome built on an automotive class van chassis Class C
     * - motorhome built on a heavier chassis than Class B (e.g. truck chassis)
     * Fifth Wheel - travel trailer with raised front, designed to be towed by a
     * pickup truck Travel Trailer - hard sided travel trailer without raised front,
     * designed to be towed on a hitch Popup - camper trailer with collapsible
     * (usually canvas) living and sleeping area Hybrid - blend between hard-sided
     * and popup - sleeping areas usually pop out and are canvas Toy Hauler - camper
     * trailer with large ramp door (usually in the back) for loading ATVs or
     * similar
     */
    private String type;

    /**
     * RV length in feet
     */
    private int length;

    /**
     * Unloaded towing weight in pounds a.k.a Dry Weight
     */
    private int weight;

    public RV(String stockNumber, RVManufacturer manufacturer, String model, int price, String type, int length, int weight) {
        this.stockNumber = stockNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.type = type;
        this.length = length;
        this.weight = weight;
    }

    public String getStockNumber() {
        return this.stockNumber;
    }

    public RVManufacturer getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }

    public double getLength() {
        return this.length;
    }

    public int getWeight() {
        return this.weight;
    }
}

// public enum RVManufacturer {
//     Coachman, Coleman, Fleetwood, Forest_River, Four_Winds, Jayco, Keystone;

//     public static String RVManufacturerLookup(string name) {
//         return RVManufacturer.valueOf(name.toUpperCase());
//     }

//     public static String allowedValues() {
//         EnumSet<RVManufacturer> all = EnumSet.allOf(RVManufacturer.class);
//         return all.toString();
//     }
// }