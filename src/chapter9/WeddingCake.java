package chapter9;

public class WeddingCake extends Cake{
    protected int tiers;

    public WeddingCake(String flavor){
        super(flavor);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public double calculatePrice(){
        return price * tiers;
    }

    @Override
    public void print(){
        System.out.println("this is a Wedding Cake! it's flavor: " + getFlavor()
                + " it's price $" + calculatePrice() +"it contains " + getTiers() +" Tires ");
    }
}
