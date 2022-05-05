package be.intecbrussel.lesson.fruits;

public class Fruit {
    public static int amountCreated;
    public String description;

    //Initialisatie blok
    {
        this.description = "This is a fruit";
        amountCreated++;
    }

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
