package modifier;

public class test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.say();

        String c = new String("qwe") ;
        String d = "qwe";
        System.out.println(c==d);
    }
}
