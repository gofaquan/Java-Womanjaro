package poly.array.examine;

public class ordinary_employee extends Employee {
    public ordinary_employee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(getName()+ " is working!!!!!");
    }

    @Override
    public void getAnnual() {
        super.getAnnual();
    }
}
