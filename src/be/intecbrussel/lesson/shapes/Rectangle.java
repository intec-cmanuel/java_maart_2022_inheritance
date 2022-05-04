package be.intecbrussel.lesson.shapes;

import java.util.Objects;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public final void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }

    @Override
    public void printCoordinates() {
        System.out.println("The rectangle has coordinates: " + super.getxCoordinate() + " - " + super.getyCoordinate());
    }
}
