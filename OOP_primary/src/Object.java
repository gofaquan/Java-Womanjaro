public class Object {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "xiao_bai";
        cat1.age = 99;
        cat1.color= "yellow";


        //when cat1/cat2 change ; cat2/cat1 also change its value,it's different form golang
        Cat cat2 = cat1;
        cat2.age = 99999;
        System.out.println(cat1.age);

        //make cat1 become null ,but cat2 is also can be used successfully
        cat1 = null;
        //cat2.age can be printed
        System.out.println(cat2.age);

//ERROR now cat1 no element named age, it's null
        System.out.println(cat1.age);

    }
}

class Cat {
    String name;
    int  age;
    String color;
}

