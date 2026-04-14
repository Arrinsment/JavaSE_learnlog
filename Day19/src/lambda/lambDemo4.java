package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambDemo4 {
    public static void main(String[] args) {

        /*定义数组并存储一些字符串，利用 Arrays 中的 sort 方法进行排序。
        要求：
        按照字符串的长度进行排序，短的在前面，长的在后面（暂时不比较字符串里面的内容）。

        如果你需要，我可以给出实现这个要求的 Java 代码示例。*/


        //如果你要用集合的排序方法 那么数据类型必须是引用数据类型

        String[]arr={"a","aa","aaa","aaaa"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //因为这里是计算字符串 所以用o1.length-o2.length
                return o2.length()-o1.length();//这里我直接降序排序了

            }
        });

        //lambda 的标准格式
        Arrays.sort(arr, (String o1, String o2)-> {
                //因为这里是计算字符串 所以用o1.length-o2.length
                return o2.length()-o1.length();//这里我直接降序排序了
            }
        );


        //1.参数类型可以省略不写
        //2.如果只有一个参数,参数类型可以省略,同时()也可以省略.
        //3.如果lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略

        //lambda的简化格式
        Arrays.sort(arr, ( o1,  o2)-> o2.length()-o1.length());
                    //因为这里是计算字符串 所以用o1.length-o2.length
             //这里我直接降序排序了



        Arrays.sort(arr, ( o1,  o2)-> o2.length()-o1.length()  );
                    //因为这里是计算字符串 所以用o1.length-o2.length
                     //这里我直接降序排序了

        System.out.println(Arrays.toString(arr));//[aaaa, aaa, aa, a]



    }
}
