import java.util.EnumSet;

public enum RVManufacturer {
    COACHMEN, COLEMAN, FLEETWOOD, FOREST_RIVER, FOUR_WINDS, JAYCO, KEYSTONE, TIFFIN, STARCRAFT, XLR;

    public static RVManufacturer RVManufacturerLookup(String name) {
        return RVManufacturer.valueOf(name.toUpperCase());
    }

    public static String allowedValues() {
        EnumSet<RVManufacturer> all = EnumSet.allOf(RVManufacturer.class);
        return all.toString();
    }
}