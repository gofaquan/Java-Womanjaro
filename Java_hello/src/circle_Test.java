import java.util.Scanner;

public class circle_Test {
    public static void main(String[] args) {

        //money 100000 ; if money > 50000 cross a road -5% ; <50000 -1000
        //how many times can we come across?
//        double money = 100000;
//        int  count = 0;
//        do {
//            if (money >= 1000) {
//                if (money > 50000) {
//                    money *= 0.95;
//                } else {
//                    money -= 1000;
//                }
//                count++;
//
//            }else{
//                break;
//            }
//            }while (money >= 0) ;
//        System.out.println(count);

//        //Narcissistic number
//        Scanner InputNumber = new Scanner(System.in);
//        System.out.println("Input what you want to calculate!!!");
//        int  number = InputNumber.nextInt();
//
//        int number1 = number / 100 ;
//        int number2 = number / 10 - 10*number1;
//        int number3 = number % 100 - 10*number2;
//        int temp1 = number1;
//        int temp2 = number2;
//        int temp3 = number3;
//        for (int i=1; i<3; i++){
//            number1 *= temp1;
//            number2 *= temp2;
//            number3 *= temp3;
//        }
//
//        if (number == number1+number2+number3){
//            System.out.println("a Narcissistic number!");
//        }else  {
//            System.out.println("It is not a Narcissistic number!");
//        }

        //get array sum

        int number = 1;
        int sum = 1;
        for (int i=2; i<=100; i++){
            number += i;
            sum += number;
        }

        System.out.println(sum);

    }
}
