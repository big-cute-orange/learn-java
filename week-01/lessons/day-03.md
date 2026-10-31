# 第 3 天：运算符与类型转换

## 一、今天的知识点

### 1. 算术运算

| 符号 | 含义 | 示例结果 |
| --- | --- | --- |
| `+` | 加法 | `7 + 2` 是 `9` |
| `-` | 减法 | `7 - 2` 是 `5` |
| `*` | 乘法 | `7 * 2` 是 `14` |
| `/` | 除法 | 整数运算 `7 / 2` 是 `3` |
| `%` | 余数 | `7 % 2` 是 `1` |

### 2. 整数除法与类型转换

两个整数相除时进行整数除法，商向零截断。`7 / 2` 得到 `3`，`-7 / 2` 得到 `-3`。

如果先把其中一个操作数转换成 `double`，就会进行浮点除法。`(double) total` 表示将 `total` 的值转换为 double 后参与表达式，不会修改原变量的类型。

### 3. 优先级

`*`、`/`、`%` 的优先级高于 `+`、`-`，括号可以改变顺序。复杂表达式用括号表达意图，通常更易读。

## 二、代码示例

源码：[OperatorsDemo.java](../examples/OperatorsDemo.java)。

```java
public class OperatorsDemo {
    public static void main(String[] args) {
        int total = 11;
        int groups = 4;

        int quotient = total / groups;
        int remainder = total % groups;
        double truncated = total / groups;
        double average = (double) total / groups;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Truncated: " + truncated);
        System.out.println("Average: " + average);
        System.out.println("Precedence: " + (2 + 3 * 4));
        System.out.println("Parentheses: " + ((2 + 3) * 4));
    }
}
```

运行结果：

```text
Quotient: 2
Remainder: 3
Truncated: 2.0
Average: 2.75
Precedence: 14
Parentheses: 20
```

代码说明：

- `11 / 4` 产生整数商 2，`11 % 4` 产生余数 3。
- `truncated` 虽然是 double，右侧仍然先进行整数除法，得到 2，再转换为 2.0。
- `average` 的右侧先把 11 转成 double，再相除，因此得到 2.75。
- `2 + 3 * 4` 先乘后加；`(2 + 3) * 4` 先算括号内的加法。

## 三、注意事项

- `%` 是余数运算，不是计算百分比。
- 不能只看接收结果的变量类型来判断除法行为，要看操作数类型。
- 整数除以零会抛出运行时异常；如果除数是变量，需要考虑它是否可能为零。
- 整数运算可能溢出，不会自动变成任意大的整数。
- 把 double 强制转换为 int 会截去小数部分，不是四舍五入；也需要考虑范围问题。

下一天：[条件判断](day-04.md)。
