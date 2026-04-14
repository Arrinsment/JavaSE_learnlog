import java.util.ArrayList;

public class 集合的遍历 {
    public static void main(String[] args) {
        //用集合添加一个字符串,然后对他们进行遍历

        ArrayList<String> list = new ArrayList<>();
        //往里面添加一个元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        //然后对集合里面的元素进行遍历

        String S = "[";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
               S += list.get(i);
            } else {
                S += list.get(i) + ",";
            }
        }
        S+="]";
        System.out.println(S);
    }
}
