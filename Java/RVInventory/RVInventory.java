import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class RVInventory {
    private List<RV> rvs;

    public RVInventory() {
        rvs = new LinkedList<RV>();
    }

    public void addRV(String stockNumber, RVManufacturer manufacturer, String model, int price, String type, int length,
            int weight) {

        RV rv = new RV(stockNumber, manufacturer, model, price, type, length, weight);
        rvs.add(rv);
    }

    public RV getRV(String stockNumber) {
        for (Iterator<RV> i = rvs.iterator(); i.hasNext();) {
            RV rv = i.next();
            if (rv.getStockNumber().equals(stockNumber)) {
                return rv;
            }
        }
        return null;
    }

    public List<RV> search(RV searchRV) {
        List<RV> matchingRVs = new LinkedList<>();

        for (RV rv : rvs) {

            // Ignore stock number

            // if rv's price is more than searchRV's price,
            // move on to another rv in the inventory
            if (rv.getPrice() > searchRV.getPrice()) {
                continue;
            }

            // if rv's manufacturer doesn't match the searchRV's manufacturer,
            // move on to another rv in the inventory
            RVManufacturer manufacturer = searchRV.getManufacturer();
            if ((manufacturer != null) && !manufacturer.equals(rv.getManufacturer())) {
                continue;
            }

            // if rv's model doesn't match the searchRV's model,
            // move on to another rv in the inventory
            String model = searchRV.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(rv.getModel()))) {
                continue;
            }

            // if rv's type doesn't match the searchRV's type, 
            // move on to another rv in the inventory
            String type = searchRV.getType();
            if ((type != null) && (!type.equals("")) && (!type.equalsIgnoreCase(rv.getType()))) {
                continue;
            }

            // if rv's length is more than the searchRV's length
            // move on to another rv in the inventory
            if (rv.getLength() > searchRV.getLength()) {
                continue;
            }

            // if rv's weight is more than the searchRV's weight
            // move on to another rv in the inventory
            if (rv.getWeight() > searchRV.getWeight()) {
                continue;
            }

            // if we get here, then everything from the searchRV "matches" the
            // current inventory rv we are looking at. So return it.
            matchingRVs.add(rv);
        }

        // if we get here, then we've checked all the RVs in our inventory and haven't
        // found a match. Return null to indicate nothing found.
        if (matchingRVs.isEmpty()) {
            return null;
        }

        return matchingRVs;
    }
}
