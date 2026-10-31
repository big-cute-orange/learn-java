# 第 7 天：把基础知识串起来

## 一、今天的知识点

今天通过一个包裹摘要示例，串联前面讲过的知识，不增加新的语法。

- **变量**保存目的地、数量、单件重量。
- **表达式**计算总重量。
- **条件**根据总重量决定输出内容。
- **循环**逐个输出包裹编号。
- **顺序执行与作用域**决定当前使用哪个值、哪些变量可以访问。

阅读这样的程序时，可以按照“定义数据 → 计算 → 判断 → 重复输出”的顺序理解。

## 二、代码示例

源码：[DeliverySummaryDemo.java](../examples/DeliverySummaryDemo.java)。

```java
public class DeliverySummaryDemo {
    public static void main(String[] args) {
        String destination = "Library";
        int parcelCount = 3;
        int weightPerParcelKg = 4;
        int totalWeightKg = parcelCount * weightPerParcelKg;

        System.out.println("Destination: " + destination);
        System.out.println("Total weight (kg): " + totalWeightKg);

        if (totalWeightKg <= 15) {
            System.out.println("Within limit");
        } else {
            System.out.println("Over limit");
        }

        for (int parcelNumber = 1; parcelNumber <= parcelCount; parcelNumber++) {
            System.out.println("Parcel " + parcelNumber);
        }
    }
}
```

运行结果：

```text
Destination: Library
Total weight (kg): 12
Within limit
Parcel 1
Parcel 2
Parcel 3
```

逐段说明：

1. 前三个变量保存输入数据，示例假设包裹数量和重量均为合法的正整数。
2. `parcelCount * weightPerParcelKg` 得到总重量 12，单位仍为千克。
3. 两条输出显示目的地和总重量。
4. `12 <= 15` 成立，输出 `Within limit`，跳过 else 分支。
5. for 循环把编号从 1 增加到 3，分别输出三条包裹信息。
6. 编号增加到 4 时，循环条件不成立，main 执行结束。

## 三、注意事项

- `totalWeightKg` 保存的是计算当时的结果。之后即使修改数量，也不会自动重新计算它，需要再次执行赋值表达式。
- 变量名和输出标签应带有足够的含义，特别要说明单位。
- 判断阈值、数据合法性是业务规则；本示例为讲解基础语法，明确假设输入合法。
- 源码从上到下阅读，不表示运行时每条语句只执行一次：分支可能跳过，循环可能重复。
- 普通数值变量之间的赋值不建立自动联动关系；循环内声明的计数器也不能在循环外随意访问。
- 编译检查语法和类型等规则，程序运行结果是否符合实际需求仍取决于逻辑。
