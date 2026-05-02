package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class streamDemo9 {
    public static void main(String[] args) {

        //void forEach(Consumer action)     // 遍历
        //long count()                      // 统计
        //toArray()                         // 收集
        //collect(Collector collector)      // 收集


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //一.void forEach(Consumer action)    遍历

        //Consumer的泛型：表示流中数据的类型
        //accept方法的形参s：依次表示流里面的每一个数据
        //方法体：对每一个数据的处理操作（打印）
       /* list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //下面我们使用lamda表达式去简化
        list.stream().forEach(s -> System.out.print(s+" "));

        System.out.println();



        //二.long count()                      // 统计
        long count = list.stream().count();
        System.out.println(count);//9



        //三.toArray    收集流中的数据放在指定数组中去
        Object[] obj = list.stream().toArray();
        System.out.println(Arrays.toString(obj));//[张无忌, 周芷若, 赵敏, 张强, 张三丰, 张翠山, 张良, 王二麻子, 谢广坤]

        //去指定特定的数组
        //IntFunction的泛型：具体类型的数组
        //apply的形参：流中数据的个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组

        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        //toArray方法的返回值：是一个装着流里面所有数据的数组

        //所有自定义的泛型必须都要一致:

        String[] S = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                //value代表元素中的个数:
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(S));//[张无忌, 周芷若, 赵敏, 张强, 张三丰, 张翠山, 张良, 王二麻子, 谢广坤]

        //去使用lamda表达式的简化形式:
        list.stream().toArray(value -> new String[value]);


    }
}
