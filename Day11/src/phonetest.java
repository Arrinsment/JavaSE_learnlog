import java.util.ArrayList;

public class phonetest {
    public static void main(String[] args) {
        //这里题目要求是新建三个手机对象
        //小米 1111 苹果9999 华为 2000 ,找到小于 3000的手机并返回
        phone p1 = new phone("小米", 9999);
        phone p2 = new phone("华为", 2000);
        phone p3 = new phone("苹果", 9999);

        //新建造一个集合对象,把手机对象都放进去
        ArrayList<phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<phone> resultlist = compare(list);
        for (int i = 0; i < resultlist.size(); i++) {
            System.out.println(resultlist.get(i).getName()+resultlist.get(i).getPrice());
        }
    }
    //新建一个方法进行比较
    public static ArrayList<phone> compare(ArrayList<phone>list){//这里的引用数据类型是 ArrayList<phone> 后面的lsit 是名字
        ArrayList<phone>list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price=list.get(i).getPrice();
            if(price<=3000){
                list1.add(list.get(i));
            }
        }
        return list1;

    }
}
