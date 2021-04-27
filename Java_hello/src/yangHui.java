public class yangHui {
    public static void main(String[] args) {

        int[][] yangHui = new int[10][];
        for (int i=0; i< yangHui.length; i++){

            // core: create zone for array
             yangHui[i] = new int[i+1];

             for (int j=0; j< yangHui[i].length;j++){
                 if (j==0 || j==yangHui[i].length-1 ){
                     yangHui[i][j] = 1;
                 }else {
                     yangHui[i][j]= yangHui[i-1][j]+yangHui[i-1][j-1];
                 }
            }
        }


        for (int a=0; a< yangHui.length;a++){
            for (int b=0; b<yangHui[a].length; b++){
                System.out.print(yangHui[a][b]+"\t");
            }
            System.out.print("\n"+"-----------------------"+"\n");
        }
    }




}
