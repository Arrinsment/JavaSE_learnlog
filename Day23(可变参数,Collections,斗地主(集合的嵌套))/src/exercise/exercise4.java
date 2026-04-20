package exercise;

import java.util.*;

public class exercise4 {
    public static void main(String[] args) {

          /* 需求
           定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
           添加完毕后，遍历结果格式如下：
           江苏省 = 南京市、扬州市、苏州市、无锡市、常州市
           湖北省 = 武汉市、孝感市、十堰市、宜昌市、鄂州市
           河北省 = 石家庄市、唐山市、邢台市、保定市、张家口市*/

        //一.没有特殊需求就创建效率的HashMap即可
        HashMap<String, ArrayList<String>>hm=new HashMap();

        //往值的集合中添加元素,当然是有多个值的
         ArrayList<String>city1=new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市","无锡市","常州市");

        ArrayList<String>city2=new ArrayList<>();
        Collections.addAll(city2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");

        ArrayList<String>city3=new ArrayList<>();
        Collections.addAll(city3,"石家庄市","唐山市","邢台市","保定市","张家口市");

        hm.put("江苏省",city1);
        hm.put("湖北省",city2);
        hm.put("河北省",city3);


        //开始去遍历
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
                String key=  entry.getKey();
               ArrayList<String>RES=entry.getValue();
            StringJoiner sj=new StringJoiner(",","","");
            for (String re : RES) {

                 sj.add(re);
            }
            System.out.println(key+" = "+sj.toString());
            //其实这个toString 可写可不写,在输出的时候,会把非字付串变为支付串

        }


    }
}
