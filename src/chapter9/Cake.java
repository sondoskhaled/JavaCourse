package chapter9;

public class Cake {
    protected String flavor ;
    protected  double price ;

    public  Cake (String flavor){
        setFlavor(flavor);
        setPrice(50);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void print(){
        System.out.println("Cake flavor is "+getFlavor() +" price is $" +getPrice());
    }
}
