package poly.details;

public class Animal {
    String name = "animal";
    public void sleep(){
        System.out.println("sleep");
    }

    public void run(){
        System.out.println("run");
    }

    public void eat(){
        System.out.println("eat");
    }
    public void hello(){
        System.out.println("hello");
    }

}


class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eat fish!");
    }

    public void catchMouse(){
        System.out.println("cat catch mouse!");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat bone!");
    }
}
