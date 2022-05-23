import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> History;

    public ChangeHistory() {
        this.History = new ArrayList<>();
    }

    public void add(double status) {
        this.History.add(status);
    }

    public void clear() {
        this.History.clear();
    }

    public double maxValue() {
        return Collections.max(History);
    }

    public double minValue() {
        return Collections.min(History);
    }

    public double average() {
        double sum = 0;
        for (Double inv : History) {
            sum += inv;
        }

        return sum / History.size();
    }

    @Override
    public String toString() {
        return History.toString();
    }

}