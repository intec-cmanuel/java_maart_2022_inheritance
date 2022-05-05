package be.intecbrussel.lesson.shapes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class PolymorphismApp {
    public static void main(String[] args) throws IOException {
        Rectangle r1 = new Rectangle(10,12);
        Rectangle r2 = new Rectangle(11,30);
        Rectangle r3 = new Rectangle(5,6);

        Square s1 = new Square(20);

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);

        Circle[] cArr = new Circle[]{c1,c2};
        Rectangle[] rArr = new Rectangle[]{r1,r2,r3};
        Square[] sArr = new Square[]{s1};

        Shape[] shapeArray = new Shape[]{r1, r2, r3, s1, c1, c2};

        for(Shape shape : shapeArray) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.setSide(500);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.setHeight(100);
                rectangle.setLength(200);
            } else if (shape instanceof Circle) {
                ((Circle) shape).setRadius(11);
            }
        }

        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }


    }
}































