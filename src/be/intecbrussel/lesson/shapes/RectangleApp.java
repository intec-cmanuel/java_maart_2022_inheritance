package be.intecbrussel.lesson.shapes;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        Rectangle rectangle1 = new Rectangle(10,15);

//        System.out.println(rectangle);
//        System.out.println(rectangle1);
//
//        System.out.print("rectangle == rectangle1: ");
//        System.out.println(rectangle == rectangle1);
//
//        System.out.print("rectangle.equals(rectangle1): ");
//        System.out.println(rectangle.equals(rectangle1));


        rectangle.printCoordinates();
    }
}
