import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double[]  hens = {3,5,1,3.4,2,5.0};

        for (int i= 0; i< hens.length; i++){
            System.out.println(hens[i]);
        }

        //dynamic initialize array
//        int a[] = new int[5];
//        int[] b  = new int[5];
//        Scanner score = new Scanner(System.in);
//
//        for (int i = 0;i< a.length;i++){
//            System.out.println("print a"+i);
//            a[i] = score.nextInt();
//            System.out.println("print b"+i);
//            b[i] = score.nextInt();
//        }

        //static initialize array
        int c[]={2,5,6,7,8,89,56,32,22};



        //array test
        //print A~Z
        char Alp[] = new char[26];
        for (int i=0; i< 26; i++){
            Alp[i]= (char)('A'+ i) ;
        }

        for (int i =1 ; i< 26; i++){
            System.out.println(Alp[i]);
        }



        //array1 give its values to array2, both will be influenced by each other
        int[]   array1 = {1,2,3};
        int[]   array2 = array1;
        array2[1] = 999 ;
        System.out.println(array1[1]);         //999

        //ArrayReverse
        // make a new array or use a temp variable


        //auto reduce
        Scanner yor = new Scanner(System.in);
        int[]  currentArray = {1,2,3,4,5,6};
     while (true) {
         int[] newArray = new int[currentArray.length - 1];
         if (newArray.length == 0  ){
             System.out.println("this array is no more fucking zone");
             break;
         }
         for (int i = 0; i < newArray.length; i++) {
             newArray[i] = currentArray[i];
         }

         currentArray = newArray;

         System.out.print("currentArray is");
         for (int i=0; i< currentArray.length; i++){
             System.out.print(currentArray[i]);
         }
         System.out.println("");

         System.out.println("continue? y/n");
         if (yor.next().charAt(0) == 'n') {
             break;
         }
     }
    }
}
