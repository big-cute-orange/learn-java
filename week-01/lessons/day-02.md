# 第 2 天：变量与常用数据类型

## 一、今天的知识点

### 1. 变量与赋值

变量是程序中有名字的存储位置。声明时写明类型和名字，通过 `=` 赋值。

```java
int count = 3;
count = 5;
```

第一行声明变量并赋初始值；第二行修改这个变量的值。`=` 在这里表示赋值，而不是数学等式。

### 2. 常见类型

| 类型 | 含义 | 例子 |
| --- | --- | --- |
| `int` | 整数 | `3` |
| `double` | 双精度浮点数 | `1.5` |
| `boolean` | 布尔值 | `true`、`false` |
| `String` | 字符串 | `"Library"` |

前三个是基本类型，`String` 是引用类型。Java 还有其他类型，后续逐步学习。

### 3. 字符串拼接

`+` 可以连接字符串和其他值。`"Count: " + count` 会把标签和变量值拼成一段文字；`"count"` 本身则只是一段固定文字。

## 二、代码示例

源码：[ParcelDemo.java](../examples/ParcelDemo.java)。

```java
public class ParcelDemo {
    public static void main(String[] args) {
        int parcelCount = 3;
        double weightKg = 1.5;
        boolean fragile = true;
        String destination = "Library";

        System.out.println("Destination: " + destination);
        System.out.println("Parcel count: " + parcelCount);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Fragile: " + fragile);
    }
}
```

运行结果：

```text
Destination: Library
Parcel count: 3
Weight (kg): 1.5
Fragile: true
```

代码说明：

- `parcelCount` 保存包裹数量，`weightKg` 保存重量，`fragile` 保存是否易碎，`destination` 保存目的地。
- 变量声明后，下面的输出语句使用它们当前保存的值。
- 变量名放在引号外，固定标签放在引号内。
- `weightKg` 的名称和输出标签都说明重量单位是千克。

## 三、注意事项

- `int` 不能直接保存 `1.5`；`boolean` 的 `true` 和字符串 `"true"` 也不是同一种数据。
- `String` 以大写 S 开头；变量名通常采用小驼峰命名，如 `parcelCount`。
- 方法内的局部变量必须先赋值，再使用；同一作用域中不能重复声明同名变量。
- `int` 的范围是 -2147483648 到 2147483647，超出范围需要考虑其他类型。
- `double` 不能精确表示所有十进制小数，金额计算不能不加考虑地使用它。
- `"Items: " + 2 + 3` 得到 `Items: 23`；`"Items: " + (2 + 3)` 得到 `Items: 5`。括号会先计算数值加法。

下一天：[运算符与类型转换](day-03.md)。
