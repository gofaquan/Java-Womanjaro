package override.exercise;

public class Student extends Person {
    private int id;
    private int score;


    public Student(String name, int age, int id, int score) {
        super(name, age);
        setId(id);
        setScore(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void Say(){
        super.Say();
        System.out.println("mina ohayo~ wa ta xi"+ getName()+"dei si"+getAge()+"years old^^"+"score:"+getScore());
    }
}
