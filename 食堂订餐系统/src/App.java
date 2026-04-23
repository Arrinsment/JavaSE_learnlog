import java.util.ArrayList;
import java.util.Scanner;

public class App {
           static  ArrayList<dish>list=new ArrayList<>();
           static  ArrayList<user>list1=new ArrayList<>();

           static {
               list.add(new dish(1,"黄焖鸡米饭",25,10,"堂食"));
               list.add(new dish(2,"黄瓜皮蛋汤",26,11,"堂食"));
               list.add(new dish(3,"鸡蛋汤",21,12,"堂食"));
               list.add(new dish(4,"锅包肉",15,9,"堂食"));
           }

    public static void main(String[] args) {

        while (true) {
            System.out.println("------------欢迎来到食堂订餐系统-----------");
            System.out.println("----------------- 1.主菜单展示-------------------"); //展示主菜单
            System.out.println("----------------- 2.菜品管理-------------------"); //添加菜品  查询id错误  判断
            System.out.println("------------------3.下单-----------------------");
            System.out.println("------------------4.取消订单--------------------");
            System.out.println("------------------5.查看订单--------------------");
            System.out.println("------------------6.结算------------------------");
            System.out.println("------------------7.退出系统---------------------");
            Scanner sc = new Scanner(System.in);

                String choose = sc.next();

                switch (choose) {
                    case "1" -> look_dish();
                    case "2" -> dish_manage(list);
                    case "3" -> dish_order(list1);
                    case "4" -> remove_dish_order(list1);
                    case "5" -> Look_order1(list1);
                    case "6" ->getSum(list1,list);
                    case "7" -> System.exit(0);
                    default -> System.out.println("输入错误，请输入1-6之间的数字！");
                }


        }
    }



     public static  void dish_manage(ArrayList<dish> list){


        System.out.println("-----------1.添加菜品---------------");
        System.out.println("-----------2.查询菜品----------------");
        System.out.println("-----------3.修改菜品----------------");
        System.out.println("-----------4.删除菜品----------------");

       while (true) {
           System.out.println("请输入你的选择");
           Scanner sc = new Scanner(System.in);
           String choose = sc.next();

           switch (choose) {
               case "1":
                   add_dish(list);
                   break;
               case "2":
                   query_dish(list);
               case "3":
                   revise_dish(list);
                   break;
               case "4":
                   remove_dish(list);
                   break;
               default:
                   System.out.println("输入错误,请重新去输入");
           }
       }

    }


     public static void add_dish(ArrayList<dish>list){
         Scanner sc=new Scanner(System.in);
         System.out.println("1.添加菜品");
         dish di = new dish();//11  1
         int a=0; boolean flag=false;
         while (true) {

             System.out.println("请输入你要添加得菜品编号");

              a = sc.nextInt();

             for (int i = 0; i < list.size(); i++) {
                 if (a == list.get(i).getID()) {
                     System.out.println("该订单编号有错误,请重新输入");
                     break;
                 }
                 flag=true;

             }
            if(flag){
                break;
            }
         }

         System.out.println("请输入你要添加菜品得名称");
         String dish_name =  sc.next();
         di.setName(dish_name);
         System.out.println("请输入你要添加菜品得价格");
         Double  dish_price  =  sc.nextDouble();
         di.setPrice(dish_price);
         System.out.println("请输入菜品的库存");
         int  dish_remain =  sc.nextInt();
         di.setRemain(dish_remain);
         System.out.println("恭喜你,添加成功");
         list.add(di);
         return;

     }

     public static void query_dish(ArrayList<dish> list){
         System.out.println("-------- 1.查询所有菜品-------------");
         System.out.println("---------2.编号查询单个菜品----------");
         System.out.println("请输入你的选择");
         Scanner sc=new Scanner(System.in);
         String  choose=sc.next();
         switch (choose){
             case "1":
                 get_arr(list);//遍历数组
             break;

             case "2":
                 querry_id(list);//通过id去查询数组

             default:
                 System.out.println("输入错误,没有这个选项");
         }

     }

     public static  void revise_dish(ArrayList<dish>list){

               Scanner sc =new Scanner(System.in);
         System.out.println("请输入你要修改商品的Id");
         int id=sc.nextInt();
         int count =-1;

         for(int i=0;i<list.size();i++){
             if (id==list.get(i).getID()){
                 count=i;
             }
         }

         if(count==-1){
             System.out.println("输入错误,请重新输入");
             return ;
         }
         list.get(count).setID(id);
         System.out.println("请输入你要修改商品名字");
         String name =sc.next();
         list.get(count).setName(name);
         System.out.println("请输入你要修改的商品价钱");
         double price=sc.nextDouble();
         list.get(count).setPrice(price);
         System.out.println("请输入你要修改商品的余量");
         int co=sc.nextInt();
         list.get(co).setRemain(co);
         System.out.println("请输入你要修改商品类型");
         String t=sc.next();
         list.get(count).setDish_type(t);
         System.out.println("恭喜你修改成功");

     }
     public static  void remove_dish(ArrayList<dish>list){
         System.out.println("请输入你要删除的商品编号");
         Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           int count =-1;

           for (int i=0;i<list.size();i++){
               if(a==list.get(i).getID()){
                   count=i;
               }
           }
           if(count ==-1){
               System.out.println("输入错误请重新输入");
           }
           else {
               list.remove(count);
           }

     }

      public static void  get_arr(ArrayList<dish>list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(  "食物ID"+list.get(i).getID()+" "+ " 食物名称:"+ list.get(i).getName()+" "+"食物库存" +list.get(i).getRemain()+" "+"食物的价格"+list.get(i).getPrice());
        }
      }
      public static void querry_id(ArrayList<dish>list){
        System.out.println("请输入你要查询的id");
        Scanner sc=new Scanner(System.in);
        int ID=sc.nextInt();
        int count =0;
        boolean flag=false;

        for (dish dish : list) {
            if(dish.getID()==ID){
                flag =true;
            }
            count++;
        }
        if(!flag){
            System.out.println("编号不存在,请想好后重新去输入");
        }
        else{
            System.out.println("食物ID:"+list.get(count-1).getID()+" "+"食物名称:"+list.get(count-1).getName()+" "+"食物价格"+list.get(count-1).getPrice()+" "+"食物库存"+list.get(count-1).getRemain());
        }
        
    }

     public static void dish_order(ArrayList<user>list1){
        Scanner sc=new Scanner(System.in);

        while (true) {
            user u1 = new user();
            System.out.println("这是目前本店中有的食物,你看看您要去购买什么:");

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }

            System.out.println("请输入你的用户名");
            String name = sc.next();
            u1.setUser_name(name);

            System.out.println("请输入你要添加的订单编号");
            int id = sc.nextInt();

            int count = -1;
            boolean flag = false;

            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getID()) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("没有这个编号,无法去下单,请重新输入");
                continue;
            }

            u1.setDish_id(id);


            System.out.println("请输入你要添加的份数");
            int c = sc.nextInt();
            u1.setCount(c);

            u1.setFlag(true);
            list1.add(u1);

            //知道添加c和id
            int cou =0;
            for (int i = 0; i < list.size(); i++) {
                if(id==list.get(i).getID()){
                    cou=list.get(i).getRemain();
                }
            }
            int res=cou-c;

            for (int i = 0; i < list.size(); i++) {
                if(id==list.get(i).getID()){
                  list.get(i).setRemain(res);
                }
            }


            System.out.println("恭喜你添加成功等待骑手配送");
            break;
        }
       }

     public static void remove_dish_order(ArrayList<user>list1){

               if(list1.size()==0){
                   System.out.println("您还没有购买,请先去下单");
                   return;
               }

         while(true) {

             System.out.println("请输入你要取消的订单:下面的是你的订单");
             for (int i = 0; i < list1.size(); i++) {
                 System.out.println(list1.get(i));
             }
             Scanner sc = new Scanner(System.in);
             int id = sc.nextInt();
             int count = -1;
             boolean flag = false;

             for (int i = 0; i < list1.size(); i++) {
                 if (id == list1.get(i).getDish_id()) {
                     count = i;
                     flag = true;
                     break;
                 }

             }
             if (!flag) {
                 System.out.println("输入错误,没有这个订单编号,请重新输入");
             }

             if(flag){
                 list1.remove(count);
                 System.out.println("恭喜你已经取消订单");
             }
                  return;
         }

     }

     public  static void Look_order1(ArrayList<user>list){
         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
         }

     }

     public  static void  look_dish(){
               return ;
     }

     public static void getSum(ArrayList<user>list1,ArrayList<dish>list) {
         int sum = 0;

         for (int i = 0; i < list1.size(); i++) {
             int id = list.get(i).getID();
             sum += (list.get(id).getID() * list.get(id).getPrice());
         }
         if (sum == 0) {
             System.out.println("没有下单,骑手不会配送");
         } else {
             System.out.println("您的订餐价格:" + sum + "元");
         }


     }

}
