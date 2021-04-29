public class Overload {
    public static void main(String[] args) {
        method method = new method();
        double q = method.Func(1);
        int w = method.Func(1,2);
        String e = method.Func("woiqaiaioma");

        double r = method.Func(1,2,3);

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);

        System.out.println(r);
    }
}

class  method {
    //Overload we need the method is the same name ,but the type sequence we pass is different; like int char , char int
    //or just different type numbers , like int , int double
    //different return but same type imported is banned
    public double Func(int a){
        return Math.pow(a,2);
    }

    public int Func(int a,int b){
        return a^2+b^2;
    }

    public String Func(String a){
        return a;
    }

    //many same type port in,in the method below nums can be pick as array
    //if the nums we port in have the same number in the method above , we run the method above
    public  int Func(int... nums){
        int sum =0;
        for (int i=0;i< nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }

    //the type nums  can be changed need to be put in the last, the max type that nums can be changed is one(eg.3
    //  public  int Func(String a,int... nums){         right
    //  public  int Func(int... nums,String a){         wrong
    // public  int Func(int... nums,String... a){       wrong
}