import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // get the result that user print

        // 创建Scanner对象，new创建一个对象，其中 faq 就是Scanner 的对象
        Scanner faq = new Scanner(System.in);

        System.out.println("print your name");
        //使用方法接收用户输入
        String Name = faq.next();

        System.out.println("print your salary");
        int Salary = faq.nextInt();

        System.out.println("your information is "+Name+"\n"+
                Salary+"/month!");
    }
}
