public class ObjectMethod {
    public static void main(String[] args) {
        //usage of method
        Person p = new Person();
        p.speak();
       int sum = p.calc();
        System.out.println(sum);

        int sum1 = p.calc1(100);
        System.out.println(sum1);

        System.out.println(p.getSum(3,5));
    }
}

class Person {
    String name;
    int age;

    //public member method / func (in golang we called it func
    public void speak(){
        System.out.println("I wanna faq!");
    }
    //in java ,we can only return one result,its also different form golang
    public int calc(){
        int sum = 0;
        for (int i=1; i<101; i++){
            sum += i;
        }
        return sum;
    }

    public int calc1(int sum){
        int sum1 = 0;
        for (int i=1; i<=sum; i++){
            sum1 += i;
        }
        return sum1;
    }

    public int getSum(int a,int b){
        return a+b;
    }
}


