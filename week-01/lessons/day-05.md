# 第 5 天：for 循环

## 一、今天的知识点

### 1. 循环用于重复执行

当一段操作需要按规则重复时，可以用循环表达。for 常用于有明确计数范围的场景。

基本结构：

```java
for (初始化; 条件; 更新) {
    // 重复执行的语句
}
```

执行顺序是：初始化一次 → 判断条件 → 执行循环体 → 更新 → 再次判断。条件不成立时退出。

### 2. 计数器与累积变量

计数器跟踪当前轮次；累积变量保存跨越多轮的结果。`i++` 在本例中使 i 增加 1；`sum += i` 表示把 i 加到 sum 上，与这里的 `sum = sum + i` 作用相同。

## 二、代码示例

源码：[ForLoopDemo.java](../examples/ForLoopDemo.java)。

```java
public class ForLoopDemo {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 3; i++) {
            sum += i;
            System.out.println("Round " + i + ": sum = " + sum);
        }

        System.out.println("Final sum: " + sum);
    }
}
```

运行结果：

```text
Round 1: sum = 1
Round 2: sum = 3
Round 3: sum = 6
Final sum: 6
```

状态变化：

| 判断时 i 的值 | 条件 i <= 3 | 循环体执行后的 sum |
| --- | --- | --- |
| 1 | true | 1 |
| 2 | true | 3 |
| 3 | true | 6 |
| 4 | false | 不执行循环体，仍为 6 |

`sum` 声明在循环外，能保存各轮结果，循环结束后仍可以访问。`i` 声明在 for 的初始化部分，只能在这条 for 语句的范围内使用。

## 三、注意事项

- `i < 3` 和 `i <= 3` 的循环次数不同，边界应与含义一致。
- for 括号后误加分号，可能让本来想重复执行的代码变成循环之外的代码。
- 累积变量若在循环体里每轮重新初始化，会丢失前面的结果。
- 更新方向必须能让循环走向结束；如果条件永远成立，程序可能一直重复。
- 本例循环结束后不能再直接访问 i，但仍可以访问 sum，这是作用域的区别。

下一天：[while 循环](day-06.md)。
