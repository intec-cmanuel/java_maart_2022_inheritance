package be.intecbrussel.lesson.fruits;

public class Bananana extends Fruit{
    public static int amountCreated;
    public String description;

    {
        this.description = "This is a Banana";
        amountCreated++;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static int getAmountCreated() {
        return amountCreated;
    }

    public int getAmount() {
        return amountCreated;
    }
}
