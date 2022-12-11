package chapter9;

public class InheritanceTester {
    public static void main(String args[]){
        // test sub & super classes constructor
       /**Employee employee = new Employee();*/
        // test square override
        /**Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter()); */

        // test overloading in square class
        /**Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("overloading method in square class");**/

        // test chain of inheritance
        Mother mom = new Mother();
        mom.setName("so");

        System.out.println(mom.getName() +" is a " + mom.getGender());

    }
}
