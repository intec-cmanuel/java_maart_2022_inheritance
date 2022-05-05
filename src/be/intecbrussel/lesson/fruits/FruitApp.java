package be.intecbrussel.lesson.fruits;

public class FruitApp {
    public static void main(String[] args) {
        Fruit realFruit = new Fruit();
        Bananana realBanana = new Bananana();
        Fruit bananaFruit = new Bananana();

//        System.out.println(realFruit.getDescription());
//        System.out.println(realBanana.getDescription());
//        // Late binding
//        System.out.println(bananaFruit.getDescription());
//
//        System.out.println(realFruit.description);
//        System.out.println(realBanana.description);
//        // No Late Binding
//        System.out.println(bananaFruit.description);

//        System.out.println(Fruit.amountCreated);
//        System.out.println(Bananana.amountCreated);

//        System.out.println(Fruit.getAmountCreated());
//        System.out.println(Bananana.getAmountCreated());

//        System.out.println(realFruit.getAmountCreated());
//        System.out.println(realBanana.getAmountCreated());
//        // Also no late binding
//        System.out.println(bananaFruit.getAmountCreated());

        System.out.println(realFruit.getAmount());
        System.out.println(realBanana.getAmount());
        // non static method --> late binding
        System.out.println(bananaFruit.getAmount());
    }
}
