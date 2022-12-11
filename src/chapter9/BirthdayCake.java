package chapter9;

public class BirthdayCake extends Cake {
    protected int candles ;

    public BirthdayCake (String flavor){
        super(flavor);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public double calculatePrice(){
        return price + (candles*0.25);
    }

    @Override
    public void print(){
        System.out.println("this is a Birthday Cake! it's flavor: " + getFlavor()
        + "it's price $" + calculatePrice()+ " it has " + getCandles() +" Candles ");
    }
}
