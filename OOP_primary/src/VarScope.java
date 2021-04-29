public class VarScope {
    public static void main(String[] args) {

    }
}
//variable's value according to the position that nearer
//global variable can be added  access modifier, but local cant
class Cat1{
    //global variable can be used in all the class,and own default value
    String sex;  //global variable
    int age =10; // global variable,and it is defined value

    public void Say(){
        //when method run out , local variable also disappear
        //below variables can be only used in Say method , and no default value
        int n =99;    // local variable
        String name= "faq";  // local variable
        System.out.println(age);                    //global variable used in method
    }
}
