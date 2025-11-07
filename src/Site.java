// Site.java
public abstract class Site {
    protected int units;
    protected double rate;

    public static double TAX_RATE;

    public Site(int units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount() {
        double base = units * rate;
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }

    protected abstract double getTaxAmount();
    protected abstract double getBaseAmount();
}
