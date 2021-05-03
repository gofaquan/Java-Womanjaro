package poly.test;

public class test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.Say();

        animal = new Cat();
        animal.Say();

        animal = new Animal();
        animal.Say();
    }
}
