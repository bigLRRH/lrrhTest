# 更高级的循环结构

首先介绍一条语句，非常常见

`i++;`

这句语句与`i = i + 1;`意思相同，写起来更加方便

1、之前我们介绍了这种循环结构：

```java
while(){

}
```

2、下面介绍输出1到100的新方法：

```java
public class guide
{
    public static void main(String []args)
    {
        for(int i = 1;i <= 100;i++)
        {
            System.out.println(i);
        }
    }
}
```

这是for循环，我们可以看到括号里用分号隔出了三块区域，这样就完成了输出1到100  
与下面用while的程序相同：

```java
public class guide
{
    public static void main(String []args)
    {
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
}
```

for循环用一行完成了计数器的任务，看起来更清晰直观，使用一些简单的循环时，建议使用for循环。

当然，while循环相对比较简单，可以用来实现一些更复杂的任务，这里就恕不介绍了



3、Java还有一种循环结构：do......while循环

直接看两段代码来体会一下do while循环和while循环的区别

do......while循环：

```java
public class guide
{
    public static void main(String []args)
    {
        int i = 1;
        do{
            System.out.print(i);
            i++;
        }while(i<=3)
    }
}
```

输出：

```text
1
2
3
4
```

while循环：

```java
public class guide
{
    public void main(String []args)
    {
        int i = 1;
        while(i<=3)
        {
            System.out.println(i);
            i++;
        }
    }
}
```

输出：

```text
1
2
3
```

上面两段代码大体相同，输出不同，这是因为程序结构的不同

while循环是先判断，再执行程序  
dowhile循环是先执行程序，再进行判断  
请大家自行感悟。。。



\*循环套循环  
有的时候我们会发现一个循环无法解决我们的问题，这个时候我们就可以在循环里加上循环。  
下面使用看起来比较方便的for循环来演示一下：

```java
for(int i=0;i<2;i++)
{
    for(int j=0;j<2:j++)
    {
        System.out.println(j);
    }
}
```

加上两个外套之后的输出：

```text
0
1
0
1
```

