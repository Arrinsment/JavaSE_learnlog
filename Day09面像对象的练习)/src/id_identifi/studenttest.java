package id_identifi;

public class studenttest {
    public static void main(String[] args) {
        student s1=new student(001,"小花花",18);
        student s2=new student(002,"heima",19);
        student s3=new student(003,"小爱爱",20);
        student []arr=new student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
         // arr[2]=s3;
        student s4=new student(001,"小玮",21);
           boolean flag  =  getid(arr,s4.getId() );
           if(!flag){
               System.out.println("输入错误,请重新输入");
           }
        //添加对象前对学号进行判断用来防止出现重复
        //对添加的原来数组进行判断,以及最后添加数组
        int count = getcount(arr);


        //满了
        if(count==arr.length){
            //开辟一个新数组,把原来的数组和s4加入进去
            student [] newarr=new student[4];
            getnewarr(arr,newarr,s4);
           // getprint(newarr);
        }
        //没有满,那就直接添加进去
        else{
            arr[count]=s4;
            //添加完了,直接进行打印
            //getprint(arr);
        }


        // 删除学生id,给一个id然后把id删除,那么首先要知道索引index(如果存在的话)

           int index=  getindex(arr,002);//这里不能传入newarr 因为作用域的问题
           if(index!=-1) {
             int a = arr[index].getAge() + 1;
                 arr[index].setAge(a);
               getprint(arr);
           }
           else{
               System.out.println("没有找到");
           }
    }
        public static int getindex(student[] arr,int id){
            for (int i = 0; i < arr.length; i++) {
                student s1 = arr[i];
                if(s1.getId()==id){
                    return i;
                }
            }
                return -1;
        }

      public static void getprint(student []arr){
          for (int i = 0; i < arr.length; i++) {
              if(arr[i]!=null) {
                  student student = arr[i];
                  System.out.println(student.getId() + "," + student.getAge() + "," + student.getName());
              }
          }
      }

       public static boolean getid(student[]arr,int id) {
           for (int i = 0; i < arr.length; i++) {
               student s = arr[i];
               //这里null 看网课的时候要仔细看看
               //老师讲得是不是null才去判断
               if(s!=null){
                   if(s.getId() == id) {
                       return false;
                   }
               }
           }
           return true;
       }
       public static int getcount(student[]arr){
                int count =0;
           for (int i = 0; i < arr.length; i++) {
               if(arr[i]!=null){//1 2 3
                   count++;
               }
           }
             return count;
           }
       public  static void getnewarr(student [] arr,student[] newarr,student id){
           for (int i = 0; i < arr.length; i++) {
               newarr[i]=arr[i];
           }
           newarr[arr.length]=id;
       }
    }

