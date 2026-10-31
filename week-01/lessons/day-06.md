# 第 6 天：while 循环

## 一、今天的知识点

### 1. 条件成立就继续

while 在每一轮开始前检查条件，成立则执行循环体，不成立则退出。初始化和状态更新通常由程序分别写出。

```java
while (条件) {
    // 重复执行的语句
}
```

如果初始条件就不成立，循环体一次也不执行。

### 2. 与 for 的区别

| for | while |
| --- | --- |
| 常用于计数范围清楚的重复操作 | 常用于围绕某个状态是否成立进行重复操作 |
| 初始化、条件、更新通常集中在括号中 | 初始化和更新通常放在括号以外 |
| 在每轮循环体前判断条件 | 同样在每轮循环体前判断条件 |

很多场景可以用两者表达，选择更符合含义、容易阅读的形式即可。

## 二、代码示例

源码：[WhileLoopDemo.java](../examples/WhileLoopDemo.java)。

```java
public class WhileLoopDemo {
    public static void main(String[] args) {
        int remaining = 3;

        while (remaining > 0) {
            System.out.println("Remaining before processing: " + remaining);
            remaining--;
        }

        System.out.println("Finished. Remaining: " + remaining);
    }
}
```

运行结果：

```text
Remaining before processing: 3
Remaining before processing: 2
Remaining before processing: 1
Finished. Remaining: 0
```

代码说明：

- `remaining` 初始为 3，表示待处理数量。
- 每轮先检查它是否大于 0，成立时输出处理前的数量。
- `remaining--` 在这里将数量减少 1。
- 数量变成 0 后，条件不成立，跳出循环，执行最后一条输出。

## 三、注意事项

- 如果漏掉状态更新，且没有其他退出方式，条件可能始终成立。
- 条件使用的变量需要在循环范围内可见，不能依赖已经超出作用域的局部变量。
- 先判断再执行意味着 while 可以执行零次。
- 把减法放到输出前面会改变输出内容，语句顺序属于程序逻辑的一部分。
- 本例是有限循环；实际程序中，是否继续也可能取决于输入、任务状态等其他信息。

下一天：[基础知识串联示例](day-07.md)。
