package be.intecbrussel.lesson.personapp;

public class Client extends Person {
    private String clientCard; // code van zijn kaart
    private String[] shoppingCart; // {"apple", "pear", "spaghetti"}

    {
        System.out.println("A client has been created!");
    }


    public Client(String clientCard, String[] shoppingCart) {
        this.clientCard = clientCard;
        this.shoppingCart = shoppingCart;
    }

    public Client(String name, int age, String clientCard, String[] shoppingCart) {
        super(name, age);
        this.clientCard = clientCard;
        this.shoppingCart = shoppingCart;
    }

    public String getClientCard() {
        return clientCard;
    }

    public void setClientCard(String clientCard) {
        this.clientCard = clientCard;
    }

    public String[] getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(String[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void presentYourself() {
        System.out.println("Hello, I am a client. I like shopping");
    }
}
