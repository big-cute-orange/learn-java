# Java 学习项目

中文 Java 入门课程，按天讲解。每天只包含三部分：**知识点、代码示例、注意事项**。

本仓库目前收录前两周的学习内容。每篇课程都包含完整代码、运行结果和代码解释，可以在同一篇里读完。从 [第一周第 1 天：Java 入门](week-01/lessons/day-01.md) 开始学习。

- [第一周目录](week-01/README.md)：Java 语言基础。
- [第二周目录](week-02/README.md)：方法、数组与面向对象入门。

## 第一周内容

| 学习日 | 主题 |
| --- | --- |
| [第 1 天](week-01/lessons/day-01.md) | Java 是什么、程序结构、编译运行、控制台输出 |
| [第 2 天](week-01/lessons/day-02.md) | 变量、常用类型、赋值、字符串拼接 |
| [第 3 天](week-01/lessons/day-03.md) | 算术运算、整数除法、类型转换、优先级 |
| [第 4 天](week-01/lessons/day-04.md) | 比较、逻辑运算、if 条件分支 |
| [第 5 天](week-01/lessons/day-05.md) | for 循环、执行顺序、累积变量 |
| [第 6 天](week-01/lessons/day-06.md) | while 循环、终止条件、与 for 的区别 |
| [第 7 天](week-01/lessons/day-07.md) | 通过一个完整示例串联基础知识 |

## 第二周内容

| 学习日 | 主题 |
| --- | --- |
| [第 1 天](week-02/lessons/day-01.md) | 方法声明、调用、参数、返回值 |
| [第 2 天](week-02/lessons/day-02.md) | 数组声明、索引、长度、默认值与引用 |
| [第 3 天](week-02/lessons/day-03.md) | 数组遍历、数组参数与累积计算 |
| [第 4 天](week-02/lessons/day-04.md) | String 常用方法 |
| [第 5 天](week-02/lessons/day-05.md) | 类、对象、字段与实例方法 |
| [第 6 天](week-02/lessons/day-06.md) | 构造方法与对象初始化 |
| [第 7 天](week-02/lessons/day-07.md) | 封装与状态约束 |

## 文件位置

```text
learn-java/
├─ README.md          课程入口
└─ week-01/           第一周
   ├─ README.md       课程目录
   ├─ lessons/        每天的讲解、代码和注意事项
   └─ examples/       完整 Java 示例
```

课程使用 Java 8 兼容语法。教学方式为：讲解知识、展示代码与结果、说明注意事项。

## 运行示例

在 PowerShell 中进入项目根目录：

```powershell
Set-Location 'D:\Desktop\learn-java'
```

以第一周第 1 天为例，先编译：

```powershell
javac -encoding UTF-8 week-01/examples/FirstProgram.java
```

编译成功通常没有提示，再运行：

```powershell
java -cp week-01/examples FirstProgram
```

- `javac` 编译源码，生成同目录下的 `.class` 文件。
- `java` 启动程序，`-cp` 指定寻找类文件的目录。
- 启动时写类名，不带 `.java` 或 `.class`。
- 修改源码后，先保存并重新编译；编译报错时先处理错误。
- 其他示例按相同方式替换文件路径和类名即可。
