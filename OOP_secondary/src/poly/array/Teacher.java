package poly.array;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+ "salary"+salary;
    }

    public void Teaching(){
        System.out.println("teacher  "+ getName()+"  is teaching!!!");
    }
}
