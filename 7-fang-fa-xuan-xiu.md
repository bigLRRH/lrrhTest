---
description: 函数是程序中非常重要的一部分内容，在有足够的训练之后，就能体会到方法的好处了。
---

# 7  函数

（使用在线编译器运行问题不大，可能会比较慢。

先看一个不太简短也不太聪明的程序：

```java
public class Method
{
    public static void main (String []args)
    {
        int i = 1;
        Shuchu(i);
        Shuchu(2);
    }
    
    static void Shuchu(int a)
    {
        System.out.println(a);
    }
    
}
```

输出结果：

```text
1
2
```

上面的程序主要是为了讲解函数的用法，于是就把一段简单的代码复杂化了。

在这段程序中，我们定义了一个方法Shuchu\(\)，小括号里是数据类型，大括号里是要执行的代码



我们来算一个简单的数学题  
直接使用System.out.print\(\);需要打14个字母  
创建Shuchu\(\)函数需要打37个字母，使用Shuchu方法输出需要打6个字母

从上面的数学题可以发现，当我们需要打重复率高的代码时，函数能更直观地、更方便地完成繁重的任务。

### 函数是什么？

其实，我们早在数学中就已经学过函数了，比如说正比例函数y=k\*x,其中y是因变量（也叫函数，这里叫返回值），k是常数，x是自变量（这里叫参数），于是我们每输入一个x就会对应一个y。当然，函数也可以更复杂，比如说y=p\*a+q\*b+r\*c（y是返回值，p、q、r是常数，a、b、c是参数，这样每输入一组a、b、c就能输出一个y。

在程序中，函数也是一样的，通过函数，可以使我们的程序更加简洁，对检查程序或是以后对程序的维护和使用都是一大捷径。因此，对函数的学习是十分必要的。

### 创建一个函数的语法结构：

```java
修饰符 返回值类型 函数名(参数类型 参数名){
    ...
    函数体
    ...
    return 返回值;
}
```

返回值类型：与一般的数据类型一样  
这里只提醒一种返回值类型：void  
英文单词：void（n.空白）  
像示例程序一样，有的时候我们只需要执行函数的内容，不需要返回值，这时我们就可以在返回值类型上填void。  
同样的，当不需要参数时，参数一栏可以直接空着。

返回值：就简单的理解成，y=f\(x\),这里的f就是一个函数，x是传入的参数，也就是数学中的自变量，而函数的返回值，就赋予了y，也就是因变量。

想了想，直接上一个脚本程序

1、这里直接把[第四章](3.3-wo-na-100-yuan-zhao-hy-mai-yi-ping-3-yuan-de-ke-le-ta-zhao-le-wo-200-dui-bu-dui.md)的_**下面的**_示例程序搬过来。（没有返回值，没有参数，完完全全的脚本）

```java
public class Guide{
    static void main(String []args){
        panDuan();
        panDuan();
        panDuan();
    }
    static void panDuan(){//就是这个脚本方法
         if(2>1){
            System.out.println("果然还是2比较大吗");
        }else{
            System.out.println("果然还是1比较大吗");
        }
    }
}
```

输出：

```text
果然还是2比较大吗
果然还是2比较大吗
果然还是2比较大吗
```



2、下面简单介绍一个判断误差的方法。  
我们的机器人在进行比赛时，会有很多误差，下面先使用条件结构来判断误差。（看一看即可）

我们想要判断a与b相等，但是a与b相差了0.5,

```java
public class Guide{
    public static void main(String []args){
        float a = 2.0f;
        float b = 2.5f;
        boolean flag = false;
        if(Math.abs(a-b)<1.0f){//abs（）方法，参数为数字类型，返回值为输入数字的绝对值
        //前面的Math表示abs（）方法所在的地址
            flag = true;
        }
        while(flag){
            System.out.println("helloworld");
            break;
        }
    }
}
```

输出：

```text
helloworld
```

在机器人的程序中，判断误差的的程序我们可能会多次用到，于是我们就可以为它写一个函数。

这个函数的参数为两个float类型，返回值为boolean类型。

```java
public class Guide{
    public static void main(String []args){
        float a = 2.0f;
        float b = 1.5f;
        if(wuCha(a,b)){
            //a与b相差0.5，差值在1以内，于是wuCha（）函数返回了true
            System.out.println("helloworld");
        }
        if(wuCha(1.0f,3.0f)){
            //1.0f与3.0f相差2，超过了1，于是wuCha（）函数返回了flase
            System.out.println("helloworld");
        }
    }
    static boolean wuCha(float a,float b){//这是我们要使用的方法
        if(Math.abs(a-b)<1.0f){
            return true;//通过ruturn来返回一个值，类型为前面设置的返回值类型
        }else{
            return false;
        }
    }
}
```

输出：

```text
helloworld
```

3、一道题目：一个函数为max的函数，参数为两个int类型的数，返回值为两个数中较大的那个数，如果两个数一样大，返回0。

```java
public class Guide{
    public static void main(){
        max(1,2);
    }
    //判断较大的数的函数
    static int max(int a,int b){//返回值是int类型，所以前面用了int
        if(a>b){
            return a;
        }else if(b>a){
            return b;
        }else{
            return 0;
        }
    }
}
```

输出:

```text
2
```

\*\*一道小题目：写一个名为jueDuiZhi\(\)的方法，参数、返回值都为为int类型，返回参数的绝对值。  
在主方法中输出绝对值。（不能使用abs（）函数）

