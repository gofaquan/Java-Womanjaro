package poly.array.examine;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

   public void manage(){
       System.out.println(getName()+"   is managing!!");
   }

    @Override
    public void getAnnual() {
        super.getAnnual();
        System.out.println("additional salary is"+bonus);
    }
}
