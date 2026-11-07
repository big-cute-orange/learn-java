# 第 1 天：方法：把一段逻辑起一个名字

## 一、今天的知识点

### 1. 方法的作用

方法把一段有明确职责的逻辑集中起来，调用名字就能执行。`main` 本身也是方法；它负责启动流程，其他方法负责具体工作。

### 2. 声明与调用

`static int add(int left, int right)` 声明了名为 add 的静态方法。返回值类型是 int，两个 int 参数用于接收调用时传入的数据。`add(20, 25)` 是一次调用。

声明中的 left 和 right 叫形参，调用中的 20 和 25 叫实参。调用时，实参的值传给形参；执行到 return 时，将结果交给调用位置，然后结束这次方法执行。

### 3. void 和 static

void 表示没有返回值，输出内容与返回数据是两种不同的行为。static 表示方法属于类；本节先用静态方法，让 main 可以直接调用。实例方法会在第 5 天讲解。

## 二、代码示例

源码：[MethodsDemo.java](../examples/MethodsDemo.java)。

```java
public class MethodsDemo {
    public static void main(String[] args) {
        printTopic("Methods");
        int total = add(20, 25);
        System.out.println("Total: " + total);
    }

    static void printTopic(String topic) {
        System.out.println("Topic: " + topic);
    }

    static int add(int left, int right) {
        return left + right;
    }
}
```

运行结果：

```text
Topic: Methods
Total: 45
```

代码说明：

1. main 先调用 printTopic，把字符串 Methods 传给 topic，方法输出后回到 main。
2. add 接收 20 和 25，return 将它们的和 45 返回。
3. main 把返回值赋给 total，再输出。add 自己并没有输出结果。

## 三、注意事项

- 方法声明放在类里，不能嵌套声明在 main 的方法体里。
- 声明方法不会自动执行方法，只有执行流程调用它时才会运行。
- 有返回值的方法，所有正常完成的执行路径都要返回兼容类型的值；return 后不能继续执行本次方法中的语句。
- 形参和方法内部的局部变量只在相应范围内可用。
- Java 使用值传递。传入 int 时，修改形参不等于修改调用方的变量。
- 这里的静态方法可以写在 main 后面，源码位置不决定调用顺序。

下一天：[数组：保存一组同类型的数据](day-02.md)。
