package test04;

public class test04 {

}


class Employee{
    private String name;
    private double daySal;
    private int days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Employee(String name, double daySal, int days) {
        this.name = name;
        this.daySal = daySal;
        this.days = days;
    }

    public void getSal(){
        System.out.println(daySal*days*1.0);
    }
}

class worker extends Employee {
    private double grade;

    public worker(String name, double daySal, int days, double grade) {
        super(name, daySal, days);
        this.grade = grade;
    }

    @Override
    public void getSal() {
        System.out.println(getDaySal()*getDays()*grade);
    }
}

class manager extends Employee {
    private double grade;
    private double bonus;
    public manager(String name, double daySal, int days, double grade) {
        super(name, daySal, days);
        this.grade = grade;
    }

    @Override
    public void getSal() {
        System.out.println(bonus+getDaySal()*getDays()*grade);
    }
}   