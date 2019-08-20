---
description: 方法是程序中非常重要的一部分内容，在有足够的训练之后，就能体会到方法的好处了
---

# 7  方法（选修）

先看一个不太简短也不太聪明的程序：

```java
public class Method
{
    public static void main (String []args)
    {
        int i = 1;
        Shuchu(i);
    }
    
    static void Shuchu(int a)
    {
        System.out.println(a);
    }
    
}
```

输出结果：

`1`

上面的程序主要是为了讲解方法的用法，于是就把一段简单的代码复杂化了。

在这段程序中，我们定义了一个方法Shuchu\(\)，小括号里是数据类型，大括号里是要执行的代码



我们来算一个简单的数学题  
直接使用System.out.print\(\);需要打14个字母  
创建Shuchu方法需要打37个字母，使用Shuchu方法输出需要打6个字母

从上面的数学题可以发现，当我们需要打重复率高的代码时，方法能更直观地、更方便地完成繁重的任务。

\(持续更新ing\)



