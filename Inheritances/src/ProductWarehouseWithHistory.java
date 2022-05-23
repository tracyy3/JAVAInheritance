public class ProductWarehouseWithHistory extends ProductWarehouse {

    double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        new ChangeHistory();
        setBalance(initialBalance);
    }

    public String history() {
        return null;
    }

    public void printAnalysis() {
    }
}