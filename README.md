# IntelliJ IDEA 快捷键练习题

## 准备工作
- Fork `https://github.com/dulong/shortcuts-contest.git`
- 克隆Fork的项目到本地
- 使用 IntelliJ IDEA 打开
- import maven dependencies
- Make Project (⌘F9/Ctrl+F9)

## 题目1：TDD（测试驱动开发），实现从无序数组中查找最小值
- 测试用例
  - 用例1: 从X长度的数组中找出最小值
    - 方法名：`minOfWithSomeElements`
  - 用例2: 从0长度数组中找出最小值(抛出异常，需要验证异常信息符合要求)
    - 方法名：`minOfWithNoElements`
    - 异常类型：`IllegalArgumentException`
    - 异常信息规则：`No element provided`
- 被测主类
  - 类名：`StatsCalculator` 
  - 最小值方法命名：`minOf` 
- 3分20秒内可完成

## 题目2：根据建表SQL生成对应的Java class
- 建表SQL文件 `sqltrace_data_entity.sql`
- 根据SQL文件中的表，生成对应 Java 类 `com.github.dulong.service.domain.SqltraceDataEntity` 
- 表的每个字段对应一个成员变量
- 成员变量名与原sql文件中字段名匹配（请勿任意修改成员变量名）
- 成员变量满足camel case要求（例如：last_name -> lastName）
- 类型匹配
  - bigint -> long
  - int -> int
  - float -> float
  - text -> String
  - varchar -> String
  - timestamp -> long
- 成员变量应为private
- 类名可从`SqlTraceDataEntityReflectionTest`复制 
- 运行`SqlTraceDataEntityReflectionTest`验证测试通过 
- 1分30秒内可完成

## 题目3：重构CoffeeMaker及其测试用例，使其与CoffeeType解耦
- 每个咖啡类型对应一个外部类
- 所有咖啡类实现同一个接口 `CoffeeProvider`
- `CoffeeMaker.makeCoffee` 传入`CoffeeProvider`类型对象作为参数
- `CoffeeMaker`不引入任何`CoffeeType`
- `CoffeeMaker`中没有任何 if else
- 测试必须通过
- 6分钟内可完成