// ResidentialSite.java
public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    protected double getBaseAmount() {
        return units * rate;
    }
}
