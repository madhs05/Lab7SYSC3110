// Site.java
public abstract class Site {
    protected int units;
    protected double rate;

    public static double TAX_RATE;

    public Site(int units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public abstract double getBillableAmount();
}
