import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        //本题目的要求是输入一个ID,判断是否存在,然后根据id查找用户信息,判断是否存在
        student s1 = new student("张小明", "heima001");
        student s2 = new student("杨一一", "heima002");
        student s3 = new student("白诗韵", "heima003");

        //创建一个集合对象
        ArrayList<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        boolean flag = idCheck(list);
        int  num =idCheckr(list);
        System.out.println(num);
        if (flag) {
            System.out.println("找到了");
        } else {
            System.out.println("没有找到");
        }
    }
        //开始查找ID,这里我还是定义一个方法 找到了返回true 没有找到返回false
        //在方法内定义的变量只在方法内部才有效,出了方法便无效了

        public static boolean idCheck(ArrayList<student>list) {
           /* Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的ID");
            String s = sc.next();
            for (int i = 0; i < list.size(); i++) {
                String res = list.get(i).getID();
                if (s.equals(res)) {
                    return true;//这里找到true了就返回 不会往下面走了
                }
            }
            return false;*/

            //另外你看本题的2个方法都可以返回1相当于true,-1相当于false,所以上面的代码我都可以省略
            return idCheckr(list)>0;//大于0则为true 小于0则为false
        }
    public static int idCheckr(ArrayList<student>list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的ID");
        String s = sc.next();
        for (int i = 0; i < list.size(); i++) {
            String res = list.get(i).getID();
            if (s.equals(res)) {
                return 1;//这里找到true了就返回 不会往下面走了
            }
        }
        return -1;
    }

}