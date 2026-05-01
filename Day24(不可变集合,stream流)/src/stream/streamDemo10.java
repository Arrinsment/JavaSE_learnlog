package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamDemo10 {
    public static void main(String[] args) {

        // collect(Collector collector)    收集流中的数据，放到集合中 (List Set Map)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");


        //一.收集List集合当中
        //需求：
        //我要把所有的男性收集起来
        List<String> list2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());//这里有个专门的工具类Collecctors调用了方法:toList
        System.out.println(list2);


        //二.收集到set集合中去
        //需求：
        //我要把所有的男性收集起来
        Set<String> list3 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());//这里有个专门的工具类Collecctors调用了方法:toSet
        System.out.println(list3);


        //三.收集到Map集合里面去

       /*

         在第一个new中Function中表示:第一个参数表示:Stream流中数据类型,第二个表述键的数据类型
         在第二个new中Function中表示:第一个参数表示:Stream流中数据类型,第二个表述值的数据类型

          toMap ：参数一表示键的生成规则
                参数二表示值的生成规则


        参数一：
        Function泛型一：表示流中每一个数据的类型
        泛型二：表示Map集合中键或者值的数据类型


        * 方法apply形参：依次表示流里面的每一个数据
                * 方法体：生成键的代码
                * 返回值：已经生成的键

                * 参数二：
  * Function泛型一：表示流中每一个数据的类型
                * 泛型二：表示Map集合中值的数据类型

                * 方法apply形参：依次表示流里面的每一个数据
                * 方法体：生成值的代码
                * 返回值：已经生成的值
*/

        //Map集合中,键不能重复
        Map<String, Integer> map1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String,/*键*/   String>() {
            @Override
            public String apply(String s) {
                //先去搞 键的
                return s.split("-")[0];
            }

        }, new Function<String, /*值 */Integer>() {
            @Override
            public Integer apply(String s) {
                //然后去搞生成值的
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(map1);//{张强=20, 张良=35, 张翠山=40, 王二麻子=37, 张三丰=100, 张无忌=15, 谢广坤=41}
        System.out.println("---------------------------------");

        //lamda表达式的形式:
        Map<String, Integer> map2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);//{张强=20, 张良=35, 张翠山=40, 王二麻子=37, 张三丰=100, 张无忌=15, 谢广坤=41}


         /*  小结:
           1. Stream流的作用
                   结合了Lambda表达式，简化集合、数组的操作

                   2. Stream的使用步骤
                   - 获取Stream流对象
                   - 使用中间方法处理数据
                   - 使用终结方法处理数据

                   3. 如何获取Stream流对象
                   - 单列集合：Collection中的默认方法stream
                   - 双列集合：不能直接获取
                   - 数组：Arrays工具类型中的静态方法stream
                   - 一堆零散的数据：Stream接口中的静态方法of

                   4. 常见方法
                   - **中间方法**：filter, limit, skip, distinct, concat, map
                   - **终结方法**：forEach, count, collect*/


    }
}