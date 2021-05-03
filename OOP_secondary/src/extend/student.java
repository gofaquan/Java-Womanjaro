package extend;

public class student {
    public String name;
    public int  age;

    public student() {
        System.out.println("father class is running");
    }

    //cant be accessed by simply use
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
