public class Fibonacci {
    public static void main(String[] args) {
        //1,1,2,3,5,7,12,19.......   a1 = 1,a2 =2 an = a(n-1) + a(n-2)
        Calc1 fibonacci = new Calc1();
        int result = fibonacci.Fibonacci(8);

        System.out.println(result);

    }
}


class Calc1 {
    public int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
