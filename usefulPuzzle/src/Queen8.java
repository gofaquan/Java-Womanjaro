//八皇后问题的解法
//说明：用一个一维数组即可表示棋盘，例如 一种解法为：arr = {0,4,7,5,2,6,1,3}，对应的arr下标表示第 (下标+1)行，也表示第 (下标+1)个皇后
//如 arr[i] = val    表示 第(i+1)个皇后 放在第 (i+1) 行, 第 (val+1) 列
//在虚拟机中，引用类型的变量是存放在堆中的，因此在递归时，每个方法共享引用类型的变量，即 array
public class Queen8 {

    //定义一个max 表示一共有几个皇后
    int max = 8;
    //定义一个数组array, 保持皇后放置位置的结果, 比如arr = {0,4,7,5,2,6,1,3}
    int[] array = new int[max];
    static int cnt = 0;

    public static void main(String[] args){

        Queen8 queen = new Queen8();
        queen.check(0); //表示从 第1个皇后开始放
        System.out.println("一共有解法： " + cnt);
    }

    //编写一个方法，放置第n个皇后
    //注意：check是 每一次递归时，进入到check中都有一套循环 for(int i=0; i<max; i++)，因此会有回溯
    private void check(int n){
        //先写递归退出条件
        if(n == max){ // n = 8 时，是第九个皇后，8个皇后已然放好
            print();
            return;
        }

        //再写靠近递归退出的情况
        //依次放入皇后 ，并判断是否冲突
        for(int i=1; i<=max; i++){
            //先把当前皇后n ，放到该行的第1列（此时 i=0）
            array[n] = i;
            //判断当放置第n个皇后到 i 列时，是否冲突
            if(judge(n)){ //说明返回true，与前面的位置不冲突
                //接着放第n+1个皇后，即开始递归
                check(n+1); //
            }
            //如果冲突（返回false，与前面的位置冲突），就继续该循环，继续执行array[n] = i ; 此时 i++了, 即将第n个皇后，放置在本行的后移的一个位置
        }
    }

    //查看当我们放置第 n 个皇后时，就去检测该皇后是否和前面已经摆放的皇后冲突
    /**
     *
     * @param n 表示第n个皇后，也表示放在 第n+1行上
     * @return
     */
    private boolean judge(int n){
        for(int i=0; i<n; i++){
            //说明：1.array[i] == array[n] 表示判断 第 n 个皇后是否和前面 n-1 个皇后在同一列
            //2.Math.abs(n-i) == Math.abs(array[n]-array[i]  表示判断 第 n 个皇后是否和第 i 个皇后在同一斜线，斜率
            //3.此算法，没有必要判断是否在同一列，因为数组索引表示行，肯定不在同一行，n每次都会递增
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    //打印皇后位置
    private void print(){
        cnt++;
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
