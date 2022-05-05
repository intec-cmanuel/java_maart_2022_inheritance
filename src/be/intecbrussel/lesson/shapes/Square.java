package be.intecbrussel.lesson.shapes;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setHeight(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
