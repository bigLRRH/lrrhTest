---
description: 变量就像一个容器，用于存放数据。变量的内容是可以改变的。
---

# 变量定义和赋值

前文提到常用的数据类型有三种，数字，字符串和布尔值。因为变量是用于存放数据的，所以常用的变量也是这三种类型。

## 变量的定义

变量使用前需要定义，常用的两种数字类型是：`int`和`double`。`int`是英文单词 integer 的缩写，就是整数的意思。`double`用来表示小数。 `String`定义字符串，`boolean`定义布尔值。我们来看如何定义：

```java
int a;
double b;
```

上面这段代码定义了两个变量`a`和`b`，`a`是整型变量所以他只能存放整数，而`b`则可以存放小数。如果有较多同种类型的变量需要定义，可以缩写在一行上。比如`int e,f,g;`就可以一次性定义`e` `f` `g` 3个整型变量。

## 变量的赋值

前面定义了两个变量，定义完变量类型后，可以把需要的数据放入变量。下面的语句就可以实现:

```java
a=5;
b=2.333;
```

赋值的方式跟数学方程很像，就是令a=5的意思。

{% hint style="info" %}
注意 a=5 和 a==5 代表的含义不同。

前者表示令a等于5，而后者是判断a是否等于5。不要搞混。
{% endhint %}

有时候为了方便，可以在定义变量的同时赋值。

```java
int a=5;
double b=2.333;
```

根据这个结构，我们再看几组事例

```java
public class Test
{
    public static void main(String []args)。
    {
        int a=5;
        double b = 2.333;
        String s = "awsl";
        boolean p = True;
      
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(p);  
    }
}
```

输出结果：

```text
5
2.333
awsl
True
```

## 重新赋值变量

既然变量，那么就是改变的。比如看下面代码。

```java
public class Calculate
{
    public static void main(String []args)
    {
        
        int i;//定义一个变量i
        i = 1;//令i=1
        System.out,println(i);//输出此时的i
        i = 2;//令i=2
        System.out.println(i);//输出此时的i
    
    }
}
```

输出结果：

```text
1
2
```

可以看到，变量中存放的数据是可以随意改变，在需要的时候重新赋值。

