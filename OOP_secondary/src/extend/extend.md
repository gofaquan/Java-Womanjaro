# 继承

继承可以解决代码复用，让我们的编程更靠近人类思维，提高拓展性和维护性，当多个类存在相同的属性（变量）和方法时，可以从这些类中抽象出父类，在父类中定义这些相同的属性和方法，所以的子类不需要重新定义这些属性和方法，只需要通过 ***extends*** 是声明继承父类



#### **继承的细节**

- 子类继承了所有的属性和方法，但是私有属性和方法不能在子类直接访问，要通过***public*** 的方法访问
- 子类必须调用父类的构造器，完成父类的初始化，当创建子类对象时，不管使用哪个构造器，默认情况都会调用父类的无参构造器，如果父类没有无参构造器，则必须在子类的构造器中用  ***super***  去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不通过
- 如果希望指定去调用父类的某个构造器，则显示的调用一下
- ***super()***  ,***this()***  在使用时，需要放在构造器的第一行，因此这两个方法不能共存在一个构造器中
- ***Java*** 所有类都是 ***Object*** 类的子类，父类构造器的调用不限于直接父类，可一直继承至顶级父类
- 继承只能单继承，不能继承多个同级

##### super和this的比较

| 区别点     | this                             | super                                          |
| ---------- | -------------------------------- | ---------------------------------------------- |
| 访问属性   | 访问本类中的属性，本类没有->父类 | 从父类中开始查找属性                           |
| 调用方法   | 访问本类中的方法，本类没有->父类 | 从父类中开始查找方法                           |
| 调用构造器 | 调用本类构造器，本类没有->父类   | 调用父类构造器，***必须在子类构造器的第一行*** |
| 特殊       | 表示当前对象                     | 子类中访问父类对象                             |

