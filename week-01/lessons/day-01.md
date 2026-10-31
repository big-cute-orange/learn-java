# 第 1 天：Java 程序与基本结构

## 一、今天的知识点

### 1. Java 是什么

Java 是一门编程语言，用于描述数据和处理步骤，例如统计信息、处理订单和提供后端服务。源码是开发者编写的文本，通常保存在 `.java` 文件中。

### 2. JDK、JVM 与字节码

- **JDK（Java Development Kit）**：开发工具包，包含编译器和运行程序所需的组件。
- **JVM（Java Virtual Machine）**：执行 Java 字节码的虚拟机，并提供内存管理等运行时服务。
- **字节码**：源码编译后的指令，通常保存在 `.class` 文件中。

常见执行路径：

```text
源码 .java → javac 编译 → 字节码 .class → JVM 执行 → 程序输出
```

不同操作系统需要对应的兼容 JVM。典型 JVM 也会在运行中对热点代码进行即时编译；上图是入门层面的简化过程。

### 3. 类、入口与语句

类是 Java 组织代码的重要单位。下面示例中的 `main` 是程序入口，方法体中的语句从上到下执行。`System.out.println` 在控制台输出内容，并在末尾换行。

## 二、代码示例

源码：[FirstProgram.java](../examples/FirstProgram.java)。

```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("This is my first program.");
    }
}
```

运行结果：

```text
Hello, Java!
This is my first program.
```

代码说明：

| 代码 | 含义 |
| --- | --- |
| `public class FirstProgram` | 声明一个名为 FirstProgram 的公开类 |
| `public static void main(String[] args)` | 本例的入口方法，启动时执行这里的代码 |
| `System.out.println(...)` | 输出括号中的内容，然后换行 |
| `"Hello, Java!"` | 用双引号表示的字符串文字 |
| `;` | 结束这类语句 |
| `{ ... }` | 划定类或方法的代码范围 |

入口声明中：`public` 表示公开；`static` 让本例入口可以不先创建对象就被调用；`void` 表示没有返回值；`String[] args` 用于接收命令行参数。本周先认识这套写法，相关细节会在后续课程展开。

从项目根目录编译、运行：

```powershell
javac -encoding UTF-8 week-01/examples/FirstProgram.java
java -cp week-01/examples FirstProgram
```

第一条生成字节码，第二条启动程序。`-cp` 指定寻找类文件的目录。两条命令应分别执行，编译成功后再运行。

## 三、注意事项

- 本例文件名必须是 `FirstProgram.java`，与公开类名的大小写一致。
- Java 区分大小写，`System` 不能写成 `system`。
- 代码里的括号、分号和引号使用英文符号。
- 字符串使用双引号；单引号不能代替字符串的双引号。
- `.class` 是编译产物，通常无需手动编辑。
- 修改源码后需要重新编译。编译成功不代表业务结果一定正确。
- 当前 Java 8 环境使用先编译、再运行的方式，不支持直接运行 `.java` 源文件。

下一天：[变量与常用数据类型](day-02.md)。
