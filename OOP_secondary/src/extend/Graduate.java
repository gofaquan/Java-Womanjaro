package extend;

public class Graduate extends student{

    public Graduate(String A) {
        System.out.println(" class is running"+A);
    }

    public Graduate() {
    }

    public void testing() {
        System.out.println("graduate student"+name + getScore());
    } //getScore method can access the score ,because the score is private,we need to use this method
}


