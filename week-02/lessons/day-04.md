# 第 4 天：字符串：内容、常用方法与不可变性

## 一、今天的知识点

### 1. String 保存文字

String 用来表示字符串。它是引用类型，并提供读取和处理文本的方法，例如 length()、substring()。

### 2. 常见方法

| 方法 | 含义 |
| --- | --- |
| length() | 获取长度，按 UTF-16 代码单元计数 |
| charAt(index) | 获取指定位置的 char |
| substring(begin, end) | 截取从 begin 到 end 之前的内容 |
| equals(other) | 比较字符串内容 |
| trim() | 去除两端字符值不大于 U+0020 的字符，包括常见空格 |
| replace(old, replacement) | 返回替换后的字符串 |

char 是单个 UTF-16 代码单元类型，字符字面量使用单引号，例如 'J'；字符串字面量使用双引号。

### 3. 字符串不可变

String 对象创建后，其内容不能原地修改。trim、replace 等方法返回处理结果，不会改变原字符串对象。

## 二、代码示例

源码：[StringBasicsDemo.java](../examples/StringBasicsDemo.java)。

```java
public class StringBasicsDemo {
    public static void main(String[] args) {
        String raw = "  Java Basics  ";
        String title = raw.trim();

        System.out.println("Original: [" + raw + "]");
        System.out.println("Title: " + title);
        System.out.println("Length: " + title.length());
        System.out.println("First character: " + title.charAt(0));
        System.out.println("Prefix: " + title.substring(0, 4));
        System.out.println("Same content: " + title.equals("Java Basics"));

        String renamed = title.replace("Java", "Core");
        System.out.println("Renamed: " + renamed);
        System.out.println("Title again: " + title);
    }
}
```

运行结果：

```text
Original: [  Java Basics  ]
Title: Java Basics
Length: 11
First character: J
Prefix: Java
Same content: true
Renamed: Core Basics
Title again: Java Basics
```

代码说明：

1. raw 中保存两端带空格的文本，trim 的返回值赋给 title，raw 的内容保持不变。
2. title 长度为 11，索引 0 对应 J，substring(0, 4) 包含索引 0～3 的内容。
3. equals 比较完整文本内容，得到 true。
4. replace 的结果赋给 renamed，title 仍表示 Java Basics。

## 三、注意事项

- 字符串长度是 text.length()；数组长度是 array.length，两者写法不同。
- 字符串内容比较使用 equals；== 判断引用是否相同，不能用来替代内容比较。
- text 为 null 时不能调用它的方法。已知字面量在前的 "Java".equals(text) 可以避免这次比较因 text 为 null 而失败。
- charAt 和 substring 都有合法索引范围；substring 的结束位置不包含在结果中。
- length() 不一定等于用户看到的字符数量，例如某些 emoji 占两个 UTF-16 代码单元。
- trim() 并不处理所有 Unicode 空白。字符串方法返回结果，需要使用该结果才能保存处理后的文本。

下一天：[类与对象：把数据和行为放在一起](day-05.md)。
