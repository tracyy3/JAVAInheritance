public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        setName(productName);
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    @Override
    public String toString() {
        return this.productName
                + ": balance = "
                + this.getBalance()
                + ", space left "
                + this.howMuchSpaceLeft();
    }
}