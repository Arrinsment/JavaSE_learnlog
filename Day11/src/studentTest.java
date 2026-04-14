import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {

        //一.这是我们自己输入的数据
       /* student s1=new student("张小明","heima001");
        student s2=new student("杨一一","heima002");
        student s3=new student("白诗韵","heima003");

        //创建一个集合,并往里面添加元素
        ArrayList<student>list=new ArrayList<>();
         list.add(s1);
         list.add(s2);
         list.add(s3);
         //遍历
        for (int i = 0; i < list.size(); i++) {
            student res=list.get(i);
            System.out.println("姓名:"+res.getName()+" "+"ID:"+res.getID());
        }*/

        //二.单纯用户想自己录入数据,假如我们要输入三个数据
        ArrayList<student>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
         student s =new student();
         System.out.println("请输入你想添加的名字");
         String name=sc.next();
         s.setName(name);
         System.out.println("请输入你想添加的ID");
         String ID=sc.next();
         s.setID(ID);
         list.add(s);
         //现在这个学生对象的姓名和ID 都有了现在我们直接把这个数组对象放入集合里面即可
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            student res=list.get(i);
            System.out.println("姓名:"+res.getName()+" "+"ID:"+res.getID());
        }

        //这里一个点:就是你创建了一个集合,如果上面元素也不添加 那么你打印的长度是为0的
    }
}
