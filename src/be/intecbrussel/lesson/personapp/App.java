package be.intecbrussel.lesson.personapp;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Jean-Jaque", 33);
        Client client = new Client("SHOPPER123", new String[]{"Fish", "Salad"});
        Employee employee = new Employee("IWORKHERE222", 2, "Jean-Boss");

        Client client2 = new Client("Benoit", 55, "BOBCARD", new String[]{"shaving cream"});


//        System.out.println("Name: " + client.getName().toLowerCase());
//        System.out.println("Age: " + client.getAge());
//        System.out.println("Client Card: " + client.getClientCard());
//        System.out.println("Shopping Cart: " + Arrays.toString(client.getShoppingCart()));
//
//        System.out.println("-----------------");
//        client.presentYourself();
//        person.presentYourself();
//        client2.presentYourself();
//        employee.presentYourself();

        Person example = new Person();
        System.out.println(example);
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
    }
}

























