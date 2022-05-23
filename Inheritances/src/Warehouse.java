public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        setBalance(0);
        setCapacity(capacity);
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity <= 0)
            System.out.println("invalid capacity");
        else
            this.capacity = capacity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double howMuchSpaceLeft() {
        return Math.round((this.capacity - this.balance) * 10.0) / 10.0;
    }

    public void addToWarehouse(double amount) {
        setBalance(this.balance + amount);
        if (this.balance >= this.capacity)
            setBalance(this.capacity);
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0)
            return 0;
        else if (amount > balance) {
            double whatIsLeft = this.balance;
            setBalance(0);
            return whatIsLeft;
        } else
            setBalance(this.balance - amount);
        return amount;
    }

    public String toString() {
        return "balance = " + this.getBalance() + ", space left " + this.howMuchSpaceLeft();
    }
}