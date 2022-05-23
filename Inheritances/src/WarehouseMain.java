public class WarehouseMain {
    public static void main(String[] args) {

        // // -- 1 ---
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);

        // // -- 2 --
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);

        // /// -- 5 --
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice",
        // 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);
        // System.out.println(juice.history());

        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice",
        // 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // juice.addToWarehouse(1.0);
        // juice.printAnalysis();
    }
}