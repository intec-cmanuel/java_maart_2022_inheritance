package be.intecbrussel.lesson.personapp;

public class Person {
    private String name;
    private int age;

    public Person() {
        this("NO NAME", -1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void presentYourself() {
        System.out.printf("Hello, I am %s, I am %d years old. I am a regular person.%n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
