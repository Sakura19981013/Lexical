# 词法规则

## 一、C++语言的字符集（同C语言）
###  1.大小写英文字 
       a~z(国际ASCII码为97~122）和A~Z(国际ASCII码为65~90)
###  2.数字字符
     0~9（国际ASCII码为48~57）
###  3.其他字符
     空格  ！ #  %  ^   &  *   _(下划线)  -   +   =    ~   <   >  /   \   |   .   ,  :   ;   ?   ’   "   ()   {}   []
## 二、单词和词法规则

###  1.标识符
      标识符是程序员用来命名程序中一些实体的一种单词。
      
     标识符是由大小写字母，数字字符和下划线组成的，并以字母和下划线开头的字符集合。
      标识符是用来定义函数名，类名，对象名，变量名，常量名，类型名和语句标号名等。
      注意：大小写字母区别，长度不受限制，不得用用系统已预定义的关键字和设备字作标识符。
###  2.关键字
      关键字是系统中已预定义的单词，它们在程序中表达特定的含义。
      关键字       意义
       auto            声明自动变量，缺省时编译器一般默认为 auto
      int             声明整型变量
      double      声明双精度变量
      long          声明长整型变量
      char          声明字符型变量
      float          声明浮点型变量
      short         声明短整型变量
          signed       声明有符号类型变量
      unsigned   声明无符号类型变量
      struct         声明结构体变量
      union         声明联合数据类型
      enum         声明枚举类型
      static         声明静态变量
      switch        用于开关语句
          case          开关语句分支
      default      开关语句中的“其他”分支
      break         跳出当前循环
      register       声明寄存器变量
      const         声明常量类型
      volatile        说明变量在程序执行中可被隐含地改变
      typedef      用以给数据类型取别名(当然还有其他作用)
      extern         声明变量是在其他文件正声明(也可以看
      return        子程序返回语句(可以带参数，也可不带）
      void            声明函数无返回值或无参数，声明空类
      continue       结束当前循环，开始下一轮循环
      do               循环语句的循环体
      while           循环语句的循环条件
      if                 条件语句
      else             条件语句否定分支(与 if 连用)
      for               一种循环语句(可意会不可言传)
      goto            无条件跳转语句
      sizeof          计算对象所占内存空间大小
      define         声明宏定义命令
      undef          用来取消宏定义命令
      include       声明文件包含命令
      ifdef           声明条件编译命令
      ifndef         声明条件编译命令
      endif          声明结束条件编译命令
      bool           声明布尔型变量
      true            声明逻辑真值
      false          声明逻辑假值
      cin             标准键盘输入
      cout          标准屏幕输出
      endl          声明换行符
      inline      声明内联函数
## 三、运算符
     运算符是一些用来进行某种操作的单词，它实际上是系统预定义的函数名。
       运算符是由一个或多个字符组成的单词。也可以重载。
### 1.算术运算符 
       -  +  *  /   %   ++  --
### 2.关系 运算符  
       >  <  >=  <=   ==   !=  
### 3.逻辑运算符   
       ！  &&  ||   
### 4.位操作运算符   
       <<   >>
### 5.赋值运算符  
       =  +=  -=   *=  /=   %=   <<=   >>=  &=   |=  ^=  
### 6.三目运算符
       d1?d2:d3
### 7.逗号运算符 
       ，
### 8.sizeof运算符
### 9.运算符（）和运算符【】
## 四、分隔符
     分隔符被称为程序中的标点符号，它是用来分隔单词和程序正文的。
### 1.空格符：用作单词之间的分隔符。
### 2.逗号：用作变量之间或对象之间的分隔符，或者用作函数的多个参数之间的分隔符。
### 3.分号：用于for循环语句中，作为关键字for后面括号内的三个表达式之间的分隔符。
### 4.冒号：用作语句标号和语句间的分隔符，以及switch语句中case与语句序列之间的分隔符。
## 五、常量
     常量分为数字常量，字符常量和字符串常量。
     使用关键字const来定义各种不同类型的常量。
## 六、注释符
     注释符在程序中起到对程序的注解和说明的作用。
### 1.使用“/*”和“*/”括起来进行注释。
### 2.使用“//”，从“//"后面的字符开始，直到它所在行的行尾（只能放在某一语句的后边）
--------------------- 
