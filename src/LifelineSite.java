// LifelineSite.java
public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) {
        super(units, rate);
    }


    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    private double getBaseAmount() {
        return units * rate * 0.5;
    }
}
