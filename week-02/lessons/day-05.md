# 第 5 天：类与对象：把数据和行为放在一起

## 一、今天的知识点

### 1. 类是定义，对象是具体实例

可以把类理解为一种事物的定义，对象是按这个定义创建的具体实例。Book 类定义书有什么数据和行为，实际创建的两本书是两个对象。

### 2. 字段与实例方法

字段保存对象状态，例如书名。实例方法描述对象可以执行的行为，可以读取当前对象的字段。

### 3. new 与点号

new Book() 创建对象；变量保存指向对象的引用值。book.title 访问字段，book.describe() 调用方法。

main 是静态方法，示例通过先创建对象，再调用对象的实例方法。

## 二、代码示例

源码：[ClassBasicsDemo.java](../examples/ClassBasicsDemo.java)。

```java
public class ClassBasicsDemo {
    public static void main(String[] args) {
        Book first = new Book();
        first.title = "Java Basics";
        first.pages = 120;

        Book second = new Book();
        second.title = "Java Collections";
        second.pages = 200;

        first.describe();
        second.describe();
    }
}

class Book {
    String title;
    int pages;

    void describe() {
        System.out.println(title + " - " + pages + " pages");
    }
}
```

运行结果：

```text
Java Basics - 120 pages
Java Collections - 200 pages
```

代码说明：

1. 本文件包含两个类。公开入口类是 ClassBasicsDemo，Book 是帮助说明对象的类。
2. 两次 new 分别创建两个 Book 对象，每个对象拥有自己的 title 和 pages 字段。
3. first.describe() 读取第一个对象的数据，second.describe() 读取第二个对象的数据。
4. Book 没有显式声明构造方法时，编译器会为这个类提供默认的无参构造方法，因此可以使用 new Book()。

## 三、注意事项

- 类名不等于对象，声明 Book 类型的变量也不等于已经创建对象。
- Book other = first 会复制引用值，使它们访问同一个对象，并不会创建一本新书。
- 实例字段属于每个对象；static 字段属于类。本例字段不加 static，否则会改变共享关系。
- 字段有默认值，本例的 String 字段初始为 null，int 字段初始为 0；局部变量仍然需要先赋值再使用。
- 本例字段使用默认的包访问权限，方便先讲清概念；如何用 private 保护状态，在第 7 天介绍。
- 一个源码文件可以包含多个顶层类，但本课程每个文件只声明一个 public 顶层类，文件名与它一致。

下一天：[构造方法与 this](day-06.md)。
