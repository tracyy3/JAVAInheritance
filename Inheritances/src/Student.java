public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = credits;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Study Credits: " + this.credits();
    }
}