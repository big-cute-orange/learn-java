# 第 2 天：数组：保存一组同类型的数据

## 一、今天的知识点

### 1. 数组是什么

数组用来存储固定数量、相同元素类型的数据。`int[] scores` 表示变量 scores 引用一个 int 数组；`{70, 80, 90}` 是数组初始化内容。

### 2. 索引与长度

数组索引从 0 开始，scores[0] 是第一个元素。length 表示数组长度。长度为 3 时，有效索引为 0、1、2。

### 3. 数组变量保存的是引用

数组是对象，数组变量保存用于访问它的引用值。把数组变量赋给另一个变量，不会自动复制整组元素；两个变量可能访问同一个数组。

`new int[2]` 创建包含两个元素的数组，元素默认值为 0。数组对象的长度创建后固定，但它的元素可以修改。

## 二、代码示例

源码：[ArrayBasicsDemo.java](../examples/ArrayBasicsDemo.java)。

```java
public class ArrayBasicsDemo {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        scores[1] = 85;

        int[] alias = scores;
        alias[0] = 75;

        int[] emptyScores = new int[2];

        System.out.println("Length: " + scores.length);
        System.out.println("First: " + scores[0]);
        System.out.println("Second: " + scores[1]);
        System.out.println("Default value: " + emptyScores[0]);
    }
}
```

运行结果：

```text
Length: 3
First: 75
Second: 85
Default value: 0
```

代码说明：

1. scores 最初引用一个有三个成绩的数组，第二个成绩被改为 85。
2. alias = scores 复制引用值，alias 与 scores 访问同一个数组。
3. 通过 alias 修改第一个元素后，通过 scores 读取也得到 75。
4. emptyScores 是另一个数组，未单独赋值的 int 元素默认为 0。

## 三、注意事项

- 访问负数索引或大于等于 length 的索引，会产生数组越界异常。
- 数组长度写成 array.length，没有小括号。
- 空数组长度可以是 0，因此不能假设总能访问第一个元素。
- 未初始化的局部数组变量不能使用；引用为 null 时，也不能访问元素或 length。
- new int[2] 的默认元素值，与局部变量必须先赋值再使用，并不矛盾。
- alias = scores 不是数组复制；数组复制的方法后续介绍。

下一天：[数组遍历与方法组合](day-03.md)。
