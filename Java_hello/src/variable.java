public class variable {
    public static void main(String[] args) {
        int a = 1;          //define a variable named "a",and its value is 1
        System.out.println(a);

        int c = a;          //send the variable to another
        c = 9999;           //define the variable to another value
        System.out.println(c);

        int b;
        b = 999999;   //initialize the variable
        System.out.println(b);

        double score = 88;
        char gg = 'a';
        String hh = "what are u doing?";

        System.out.println(score);
        System.out.println(gg);
        System.out.println(hh);

        long qq = 2L;
        System.out.println(qq);

        //char    本质是一个字符，输出unicode中对应的字符            unicode是ASCII的拓展
        char w = 'a';
        char w1 = '马';           //print the result reflected in unicode
        char ww = 39532;
        char w2 = '\n';
        char w3 = 99;
        System.out.println(w);
        System.out.println(w1);
        System.out.println(ww);
        System.out.println(w2);
        System.out.println(w3);       //print the char which reflected in ASCII

        //char can be calculated
        char n = 'a'+1;
        System.out.println(n);


        //type transformation

    }
}


//redundant adj.多余的，被裁减的，不需要的
//initializer n.初始化器
//initialize  v.初始化