import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        //BubbleSort
        int[] Array = {1,5,668,9,56,23,26,52,6532,66,65,545,26,98,256,6,893,2365,540,98,453};
        int temp   = 0 ;
        int outerCircle = Array.length-1;

         //circle, made the biggest one in last position
        for (int i=0; i< outerCircle; i++){

            //core number of the bubble sort
            int innerCircle = Array.length-1-i;
           //core code
            for (int j=0; j< innerCircle; j++){
                    if (Array[j] > Array[j+1]){
                        temp = Array[j];
                        Array[j] = Array[j+1];
                        Array[j+1] = temp;
                    }
            }
        }

        for (int k=0; k < Array.length;k++){
            System.out.print(Array[k]+"  ");
        }



        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------");



        //SeqSearch
        Scanner scanner = new Scanner(System.in);
        String[]  Array1 = {"1","2","3","xiaoYi"};
        System.out.println("print the number you wanna find^^");
        // u cant make below define in for circle, cause it would make u print many times
        String a = scanner.next();
        //make it easier to judge if element in array
        int index = -1;


        //
        for (int i=0; i< Array1.length; i++){
            if (a.equals(Array1[i])){
                System.out.println("you got it in array's index "+i);
                index = i;
                break;
            }
        }
        //judge the element if in array
        if (index == -1){
            System.out.println("no such element^^");
        }

    }
}
