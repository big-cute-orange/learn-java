# 第 3 天：数组遍历与方法组合

## 一、今天的知识点

### 1. 遍历数组

遍历就是按顺序处理数组中的元素。普通 for 使用索引，便于同时访问位置和元素；增强 for 直接取出每个元素，更适合只关心元素值的场景。

`for (int score : scores)` 的含义是：每轮从 scores 中取出一个元素值，赋给本轮的 score。

### 2. 将数组传给方法

形参写成 int[]，表示接收一个 int 数组的引用值。方法可以通过这个参数访问数组，完成求和等工作。

### 3. 从总和得到平均值

先累积，再除以元素数量。为了得到浮点结果，应在除法之前把一个操作数转换成 double。本例假设数组非空，且元素总和在 int 范围内。

## 二、代码示例

源码：[ArrayTraversalDemo.java](../examples/ArrayTraversalDemo.java)。

```java
public class ArrayTraversalDemo {
    public static void main(String[] args) {
        int[] scores = {60, 80, 100};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + i + ": " + scores[i]);
        }

        int total = sum(scores);
        double average = (double) total / scores.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
```

运行结果：

```text
Score 0: 60
Score 1: 80
Score 2: 100
Total: 240
Average: 80.0
```

代码说明：

1. main 中的普通 for 使用索引 0、1、2 输出成绩。
2. sum 接收 scores 的引用值，增强 for 依次取得 60、80、100，累加得到 240。
3. sum 返回结果后，main 将总和转换成 double 再除以数组长度，得到 80.0。
4. main 和 sum 中的 total 是各自方法内的局部变量，名字相同不会相互覆盖。

## 三、注意事项

- 普通 for 的常见条件是 i < array.length，写成 <= 会访问越界。
- 对增强 for 中的 int 变量重新赋值，不会自动修改原数组元素；要修改元素，通常需要使用索引。
- 数组参数仍然是值传递，只是复制的值是引用。方法通过它修改元素，调用方可以观察到；给形参重新赋一个数组，不会替换调用方变量保存的引用。
- 空数组的平均值需要另定处理规则，不能直接照搬非空数组示例。浮点数 0.0 / 0 会得到 NaN，不能把它当作合理平均值。
- 数组为 null 时，遍历或访问 length 会失败。

下一天：[字符串：内容、常用方法与不可变性](day-04.md)。
