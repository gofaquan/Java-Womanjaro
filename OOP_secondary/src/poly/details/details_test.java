package poly.details;

public class details_test {
    public static void main(String[] args) {
        //Animal.java
        Animal animal = new Cat();
        animal.eat();
        animal.run();

        Cat cat =(Cat)animal;
        cat.catchMouse();

        Animal animal1 = new Animal();
        animal1.eat();

        //Base.java
        Base base = new Sub();
        System.out.println(base.count);

    }
}
