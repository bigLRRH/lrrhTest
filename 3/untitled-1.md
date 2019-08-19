---
description: 写了这么多我差点忘了这是一个固定词组教程，这里先看几个固定词组再解释变量
---

# 3.2  变量

```java
public class Guide//改了个名字
{
    public static void main(String []args)//是不是从来没变过
    {        
        int a = 1;
        System.out.println(a);
        
        int b;
        b = 2;
        System.out.println(b);
    }
}
```

输出结果：

```text
1
2
```



在这段程序里，我们都做了些什么呢？

`int a = 1；`

首先，我们定义了一个**变量a**，a是这个变量的**名字**

int是前面我们学过的内置数据类型

我们通过等于号将1赋值给了a

最后，在`System.out.println(a);` 里，我们将变量a打印出来

输出了一个1

暂时可以这么理解。。。或是用代数的方法理解



根据这个结构，我们再看几组事例

```java
public class Test//改了个名字
{
    public static void main(String []args)//我写不下去了。。。
    {
        double b = 2.333;
        String s = "awsl";
        boolean p = True;
      
        
        System.out.println(b);
        System.out.println(s);
        System.out.println(p);  
    }
}
```

输出结果：

```text
2.333
awsl
True
```

