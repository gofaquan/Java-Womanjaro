public class constructor   {
    public static void main(String[] args) {
        Person1 person1 = new Person1("????",18);

        System.out.println(person1.name);
        System.out.println(person1.age);
    }
}


class Person1 {
    String name;
    int  age;

    //default constructor
    Person1(){}

    //constructor defined by user
    public Person1(String n1ame,int a1ge){
        name = n1ame;
        age = a1ge;
    }
}
