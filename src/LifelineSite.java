// LifelineSite.java
public class LifelineSite extends Site {
    public LifelineSite(int units, double rate) {
        super(units, rate);
    }

    // duplicated structure vs ResidentialSite
    public double getBillableAmount() {
        double base = units * rate*0.5;
        double tax  = base * Site.TAX_RATE*0.2;
        return base + tax;
    }
}
