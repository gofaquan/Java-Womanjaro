public class MethodNumPass {
    public static void main(String[] args) {
        //in method we change a value in value type, it wont be change,
        // but in quote type it would be change
        valueTest testValue = new valueTest();


        // value type, doesnt change
        int a =0;
        testValue.test(a);
        System.out.println(a);       //0


        //quote type ,   changed
        int[] arr = {1,2,3};
        testValue.arrayTest(arr);
        System.out.println(arr[0]);   //515


        //same value
        person p = new person();
        p.name = " maewiq";
        person pp = testValue.hh(p);
        pp.name = " qimawie";
        System.out.println(p.name);

        //different value
        person ppp = testValue.qq(p);
        ppp.name = "woyaoqianmq";
        System.out.println(p.name);
        System.out.println(ppp.name);


        //print hashCode to identify them if they're same
        System.out.println(ppp.hashCode());
        System.out.println(pp.hashCode());    //same as p
        System.out.println(p.hashCode());
    }
}

class person {
    String name;
}

class valueTest  {
    public void test(int a){
        a = 99;
    }

    public  void arrayTest (int[] array){
        array[0] = 515;

    }

    public person hh(person p ){
        return p;
    }
    public person qq(person p ){
        person p2 = new person();
        p2.name = p.name;
        return p2;
    }
}