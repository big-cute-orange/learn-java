# 第 6 天：构造方法与 this

## 一、今天的知识点

### 1. 构造方法负责初始化

构造方法在创建对象时执行，用于设定对象的初始状态。它与类同名，不声明返回类型，连 void 也不写。

new Course("Java", 30) 创建对象时，使用对应构造方法，把主题和时长作为初始化数据传入。

### 2. this 表示当前对象

this.topic 表示当前对象的 topic 字段。字段和形参同名时，使用 this 可以明确区分两者。

### 3. 构造方法不是普通方法

它参与对象创建，不能像普通实例方法那样在已有对象上用点号再次调用。后续对象状态变化应通过适当的方法处理。

## 二、代码示例

源码：[ConstructorDemo.java](../examples/ConstructorDemo.java)。

```java
public class ConstructorDemo {
    public static void main(String[] args) {
        Course course = new Course("Java", 30);
        course.describe();
    }
}

class Course {
    String topic;
    int minutes;

    Course(String topic, int minutes) {
        this.topic = topic;
        this.minutes = minutes;
    }

    void describe() {
        System.out.println(topic + ": " + minutes + " minutes");
    }
}
```

运行结果：

```text
Java: 30 minutes
```

代码说明：

1. 创建 Course 对象时，字符串 Java 和整数 30 传给构造方法的形参。
2. this.topic = topic 中，左侧是对象字段，右侧是传进来的参数。
3. 构造方法结束后，course 保存新对象的引用。
4. describe 是实例方法，读取初始化后的字段并输出。

## 三、注意事项

- 构造方法如果写成 void Course(...)，就变成了普通方法，不再承担构造职责。
- 当类声明了构造方法后，编译器不再自动提供默认的无参构造方法。本例直接 new Course() 会编译失败。
- topic = topic 只会把同名形参赋给自己，不会初始化对象字段。
- static 方法没有当前实例，不能直接使用 this。
- 构造方法也应维护有效状态；本例假设主题和时长已经合法，更完整的失败处理会在异常课程讲解。

下一天：[封装：通过方法控制对象状态](day-07.md)。
