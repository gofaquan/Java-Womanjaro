import java.util.Scanner;

public class for_circle {
    public static void main(String[] args) {
            if (1==2){
                System.out.println("what are u doing?");
            } else  {
                System.out.println("I wanna faq !");
            }


            //if - else Test
        Scanner mbg = new Scanner(System.in);

        System.out.println("马保国筒子，请输入您的芝麻信用分分数");
        int score  = mbg.nextInt();


        if (score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80) {
                System.out.println("信用优秀");
            } else if (score > 60) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("你真的是在认真填？");
        }


        //switch test
        Scanner sw = new Scanner(System.in);
        char a = sw.next().charAt(0);

        switch (a){
            case 'a':
                System.out.println(1);
                break;

            case 'b':
            System.out.println(2);
            break;

            case 'c':
                System.out.println(3);
                break;
        }


        //for test
        for (int i = 1; i<11; i++){
            System.out.println("hspJioYu");
        }
    }
}
