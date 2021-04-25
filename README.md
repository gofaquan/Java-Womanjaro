# Java-Womanjaro

# This repositories is used to learn java in Manjaro by guofaquan


## Knowledge

#### 原码，反码和补码
````
1. 二进制的最高位是符号位：0表示正数，1表示负数
2. 正数的原码，反码，补码都一样
3. 负数的反码 = 它的符号位不变，其它位取反  
4. 负数的补码 = 负数的反码 + 1
5. 0的反码补码都是0
6. java中都是有符号数
7. 计算机运算是以补码的方式进行计算的
8. 我们看到的结果是看数的原码 
````
`Math.abs(a-b)  //计算绝对值`

`取模运算的实质是 a - a/b × b    // 10 % -3 = 1`

变量先声明后使用，使用期间类型不能换

自动类型大换小不行，而数值传递如果可以大放进小则可以自动转换
````
基本数据类型
1 byte = 8 bit
整数类型 , byte 1字节，short 2字节, int 4字节,long  8字节      


|类型|占用存储空间|范围
--|:--:|---:
byte|1字节| -128～127
short|2字节| -2^15 ~ 2^15-1
int|4字节| -2^31 ~ 2^31-1
long|8字节| -2^63 ~ 2^63-1

整数类型默认int，声明long型常量需要后加'l'或'L'  // int a = 1L;报错 L => int   long b = 2;这样是int 2 传入

浮点型 float 4字节， double 8字节
|类型|占用存储空间|范围
--|:--:|---:
float|4字节| -3.0403E38～3.0403E38
double|8字节| -1.798E308 ~ 1.798E308
在机器中的存放形式为符号位+指数位+尾数位，且尾数位可能丢失，造成精度损失（小数都是近似值
浮点型默认double,通常情况使用double， 声明float一定需要后加'f'或'F'
十进制： 5.12,5.12f
科学计数法：5.12E-2 //5.12x10^-2 => 0.0512



字符型 char 2字节      //存放单字符如'a'，'马',99
存取形式：
        存储： 'a' => 97 => 1100001 => 存储完成
        读取： 1100001 => 97 => 'a' =>显示完成
boolean 不参与转换        
自动转换 char - int - long - float - double        
自动转换 byte - short - int - long - float - double          
        

布尔型 boolean 1字节   // true or false
在java里面不能用0或非0来表示false或者true，只能是ture或者false

````
强制类型转换,（只对最近的操作数有效，可以括号扩选），可能造成精度溢出或降低，可能造成损失       //(int)1.9  
````
引用数据类型
类 class
接口 interface
数组 []
````


## English word
`redundant adj.多余的，被裁减的，不需要的`

````

initializer n.初始值; 初始化程序; 初始化语句; 初始化式; 初始化器``

initialize v.初始化

````
`convert v.转变，转换，转化; 可转变为; 可变换成`




