package test02;

public class test02 {
    public static void main(String[] args) {
        Professor professor = new Professor("xiao_a", "DA_JIA", 9999, 150000, 1.9);

        System.out.println(professor);
    }
}

class Teacher {
    private String name;
    private String post;
    private int age;
    private double salary;

    public Teacher(String name, String post, int age, double salary) {
        this.name = name;
        this.post = post;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Professor extends Teacher {
    double salaryLevel ;

    public Professor(String name, String post, int age, double salary, double salaryLevel) {
        super(name, post, age, salary);
        this.salaryLevel = salaryLevel;
    }


    @Override
    public String toString() {
        return "Professor{"+
        "name='" + getName() + '\'' +
                ", post='" + getPost() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}'+
                "salaryLevel=" + salaryLevel +
                '}';
    }
}
