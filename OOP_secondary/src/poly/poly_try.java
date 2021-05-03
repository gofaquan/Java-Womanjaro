package poly;

public class poly_try {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        //overload => poly
        System.out.println(b.sum(1,2));
        System.out.println(b.sum(1,2,3));

        //override => poly
        a.Say();
        b.Say();
    }
}

class A {
    public void Say(){
        System.out.println("A class running!");
    }
}

class B extends A{

    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }



    public void Say(){
        System.out.println("B class running!");
    }
}