# 第 7 天：封装：通过方法控制对象状态

## 一、今天的知识点

### 1. 封装的目的

封装把对象内部状态与外部使用方式分开。外部通过明确的方法访问对象，类内部负责维护规则，而不是允许任何代码随意修改字段。

### 2. private 与 public

private 字段用于限制外部直接访问。public 方法提供可使用的接口。本例将学习时长设为 private，让修改经过校验。

### 3. 读取与修改

getMinutes 返回当前状态；setMinutes 接收新值，合法时更新并返回 true，不合法时保留原值并返回 false。这是本示例选择的反馈方式，并不是所有 setter 都必须返回 boolean。

## 二、代码示例

源码：[EncapsulationDemo.java](../examples/EncapsulationDemo.java)。

```java
public class EncapsulationDemo {
    public static void main(String[] args) {
        StudySession session = new StudySession();

        System.out.println("Initial minutes: " + session.getMinutes());
        System.out.println("Accept 30: " + session.setMinutes(30));
        System.out.println("Accept -5: " + session.setMinutes(-5));
        System.out.println("Current minutes: " + session.getMinutes());
    }
}

class StudySession {
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public boolean setMinutes(int minutes) {
        if (minutes < 0) {
            return false;
        }
        this.minutes = minutes;
        return true;
    }
}
```

运行结果：

```text
Initial minutes: 0
Accept 30: true
Accept -5: false
Current minutes: 30
```

代码说明：

1. 新对象的 int 字段默认是 0，这也是本例允许的初始状态。
2. setMinutes(30) 通过校验，更新字段，返回 true。
3. setMinutes(-5) 在非法分支直接返回 false，后面的赋值不会执行。
4. 最后读取仍得到 30，说明对象阻止了不合法的状态变化。

## 三、注意事项

- 在本例的外部入口类中，不能直接通过 session.minutes 修改 private 字段，应调用公开方法。
- private 不等于不可变；本对象仍可以通过允许的方法改变状态。
- 封装不意味着给每个字段机械地生成 getter 和 setter；只暴露确实需要的操作。
- 本例允许 0，拒绝负数。范围规则是业务决定，不是 Java 语言规定。
- 调用可能失败的方法时，应关注返回结果；实际项目也可能通过异常表达失败，后续再介绍。
- 本节的重点是状态约束。继承、接口和多态放在后续课程继续讲解。
