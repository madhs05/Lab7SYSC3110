// ResidentialSite.java
public class ResidentialSite extends Site {
    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }

    // duplicated structure vs LifelineSite
    public double getBillableAmount() {
        double base = units * rate ;
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }
}
