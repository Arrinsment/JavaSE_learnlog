package a01staticDemo1;

public class test {
    public static void main(String[] args) {

        //然后因为static这个静态关键字 public static  string teacher ;这是第一种调用方式: 类名调用
        // 是被说有人共享的所以多了个类名调用,现在所有学生的show方法中都有阿玮老师了
        // 直接在最上面加个 类.名 即可,比如这里是student.teacher="赋值的内容";
         student.teacher="阿玮老师";


        student s1=new student();
        s1.setAge(18);
        s1.setName("张三");
        s1.setGender("男");
       // s1.teacher="阿玮";
        //所以我们发现了,有2种调用方式 ,这是对象名调用
        System.out.println(s1.getName()+","+s1.getGender()+","+s1.getAge()+","+s1.teacher);//假如这里只在这里调用lteacher下面是s2这个对象是没有的


        student s2=new student();
        s2.setAge(18);
        s2.setName("小诗");
        s2.setGender("女");
        System.out.println(s2.getName()+","+s2.getGender()+","+s2.getAge());

        //因为我新建的teacher是用publlic去修饰的是公开的,所以可以直接调用对象,teache可以直接赋值

        //另外由于一个班的老师应该是被所有所有同学说共享的所以 在前面加student类中 teacher这个成员变量最前面加上static去修饰即可
        //这样 我s2哪怕没有调用teacher赋值也可以用

        //然后因为static这个静态关键字 是被说有人共享的所以多了个类名调用,直接在最上面加个 类.名 即可,比如这里是student.teacher="赋值的内容";


    }
}
