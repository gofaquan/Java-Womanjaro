package test13;

public class Student extends Person {
  private int stu_id;
    public void Study(){
        System.out.println("I swear, i'll study hard to get good scores!");
    }
    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, String sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("football");
    }
}
