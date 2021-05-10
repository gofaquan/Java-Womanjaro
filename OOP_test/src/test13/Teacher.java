package test13;

public class Teacher extends Person {
    private int work_age;


    public void teach(){
        System.out.println("I swear, i'll teach carefully to get good scores!");
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("chess");
    }
}
