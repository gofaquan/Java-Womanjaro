public class BinaryTest {
    public static void main(String[] args) {

        //  二进制
        int Binary2 = 0b1010;

        // 十进制
        int Binary10 = 1010;

        //八进制
        int Binary8 = 01010;

        //十六进制
        int Binary16 = 0x1010;


        // binary transformation

        //n进制转十进制
        //从最低位开始，将每个位上的数提取出来，乘以 n 的（位数-1）次方

        //十进制转n进制
        //将该十进制数不断除以n，直到商为0为止，然后将每步的余数倒过来，就是对应的二进制

        /*
          |__34_         0
             2 |__17_       1
              2 |__8_       0
               2 |__4_      0           ==>>>   100010 ==>> 0B100010
                2 |__2_     0
                      1     1
         */

        //二进制转八进制或十六进制
        //低位开始，每三位/四位换成一个数
        /*
        0b11010101 =   0325 / 0xD5
         */

        //八进制或者十六进制转二进制
        //每一位的数转三位或四位二进制数，即为上面的逆转



        //BinaryTest              位移运算
        int a = 1 >> 2;            //右移
        int b = -1 >> 2;
        int c = 1 << 2;             //左移
        int d = -1 << 2;
        int e = -1 >>> 2;           //算术右移


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
