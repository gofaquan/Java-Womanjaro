public class MethodTest {
    public static void main(String[] args) {
        AA a = new AA();
        System.out.println(a.isOdd(1));
        a.print(4,8,'#');
    }
}


class AA {
    public boolean isOdd(int num){
        return num % 2 != 0;
    }

    public void print(int col,int row,char character){
        for (int i=0; i< col; i++){
            for (int j=0; j<row; j++){
                System.out.print(character);
            }

            System.out.println("");
        }
    }
}