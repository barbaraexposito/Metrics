package metrix;

public abstract class Metric {
    private double value;

    protected Metric(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
}
