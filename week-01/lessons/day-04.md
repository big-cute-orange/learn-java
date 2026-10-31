# 第 4 天：条件判断

## 一、今天的知识点

### 1. 比较与逻辑运算

比较表达式产生 boolean 值：

| 运算符 | 含义 |
| --- | --- |
| `>`、`>=` | 大于、大于等于 |
| `<`、`<=` | 小于、小于等于 |
| `==`、`!=` | 相等、不相等 |
| `&&` | 两个条件都成立 |
| `\|\|` | 至少一个条件成立 |
| `!` | 对布尔值取反 |

例如 `temperatureC >= 10 && temperatureC < 25` 表示温度至少为 10 且小于 25。

### 2. if / else if / else

程序从上到下检查条件，执行第一个成立的分支。如果前面的条件都不成立，执行 `else`。一条这样的判断链只执行其中一个分支。

## 二、代码示例

源码：[WeatherDemo.java](../examples/WeatherDemo.java)。

```java
public class WeatherDemo {
    public static void main(String[] args) {
        int temperatureC = 18;

        if (temperatureC < 10) {
            System.out.println("Cold");
        } else if (temperatureC < 25) {
            System.out.println("Mild");
        } else {
            System.out.println("Hot");
        }
    }
}
```

运行结果：

```text
Mild
```

执行过程：18 小于 10 不成立；18 小于 25 成立，因此输出 `Mild`，不再进入最后的 `else`。

对应范围：

| 温度 | 分支 |
| --- | --- |
| 小于 10 | Cold |
| 大于等于 10 且小于 25 | Mild |
| 大于等于 25 | Hot |

第二个分支虽只写 `< 25`，但能执行到这里已经意味着第一个条件不成立，因此也隐含了“大于等于 10”。

## 三、注意事项

- `=` 是赋值，`==` 是相等比较，不能混为一谈。
- Java 的 if 条件必须是 boolean，不能直接用整数代替。
- 多个独立的 if 可以分别执行；if / else if / else 是一条互斥的分支链。
- `>` 和 `>=` 会在边界产生不同结果，例如本例中 10 属于 Mild，25 属于 Hot。
- 建议始终使用大括号，避免范围不清楚；条件后的分号也不能随意增加。
- `&&` 左侧为 false 时不会计算右侧；`||` 左侧为 true 时不会计算右侧，这叫短路求值。
- 字符串内容比较通常使用 `equals`，不要直接套用整数的 `==` 比较方式；对象相等性后续展开。

下一天：[for 循环](day-05.md)。
