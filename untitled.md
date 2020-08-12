---
description: 本章将用分支结构和循环结构输出1到100内的偶数
---

# 程序示例——输出1到100内的偶数

首先分析一下这次的问题：  
1到100我们需要用循环结构来输出，使用计数器  
我们需要输出偶数，就需要判断一个数是不是偶数，要用到分支结构

如何判断一个数是不是偶数，这就要利用到偶数的性质——所有偶数除以2，余数为0，我们可以用到取余符号%

接下来是示例程序：

```java
public class LastGuide{
    public static void main(String []args){
        
        int i = 1;//计数器
        while(i <= 100){
            if(i%2==0){
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
```

