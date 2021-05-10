package test01;

public class test01 {
    public static void main(String[] args) {
        Person[] persons  = new Person[3];
        Person temp;
        persons[0] = new Person("xiao_a",25,"da_gong");
        persons[1] = new Person("xiao_b",250,"da_pao");
        persons[2] = new Person("xiao_c",125,"da_qIan");

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length-i-1; j++) {
                if (persons[j].getAge()  <= persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j]  = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}


class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
