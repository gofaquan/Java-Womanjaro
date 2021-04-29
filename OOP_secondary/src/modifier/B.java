package modifier;

public class B {
    public void say(){
        A a = new A();
        //in the same package,public,protected,default ok
        //private cant access
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
//        System.out.println(a.n4);
    }
}
