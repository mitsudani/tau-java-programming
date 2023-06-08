package inheritance;

public class WeddingCake extends Cake {

    public int tiers;

    public WeddingCake(String flavor) {
        super(flavor);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
