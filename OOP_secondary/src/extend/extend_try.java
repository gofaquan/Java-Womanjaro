package extend;

public class extend_try {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xiao_ming";
        pupil.age = 99;
        pupil.setScore(100);
        pupil.testing();


        Graduate graduate = new Graduate();
        Graduate graduate2 = new Graduate("qwe");
        graduate.name= "xiao_hong";
        graduate.age = 999;
        graduate.setScore(60);
        graduate.testing();
    }
}

