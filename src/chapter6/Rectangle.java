package chapter6;

public class Rectangle {
    private double length;
    private  double width;

    public Rectangle(){
        length =0 ;
        width =0;
    }

    public Rectangle(double length , double width){
        setLength(length); // or this.length = length
        setWidth(width);
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width =width;
    }

    public double getWidth(){
        return width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width ;
    }
}
