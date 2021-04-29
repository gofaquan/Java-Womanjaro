package encapsulation;

public class encapsulation_easy_try {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(133);
        person.setSalary(99999);
        person.setName("uzi");


        System.out.println(person.getAge());
        System.out.println(person.getSalary());
        System.out.println(person.getName());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 120) {
            System.out.println("your age is fake! now give it default value 18^^");
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public double getSalary() {
        //in further learning we'll give it some roles to get the salary, cuz it's important!
        //now we temporary set it in public to access^^
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 8 || name.length() <= 2){
            System.out.println("your name is too long or short,please print a name form 2~8 chars^^");
        }else {
            this.name = name;
        }
    }
}
