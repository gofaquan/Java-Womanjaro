package extend;

public class Pupil extends student {
    public void testing(){
        System.out.println("primary student"+name+getScore());
    }//getScore method can access the score ,because the score is private,we need to use this method.
}
