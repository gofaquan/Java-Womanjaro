package override.exercise;

public class Person {
    private String   name;
    private int     age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Say(){
        System.out.println("mina ohayo~ wa ta xi"+ getName()+"dei si"+getAge()+"years old^^");
    }
}
