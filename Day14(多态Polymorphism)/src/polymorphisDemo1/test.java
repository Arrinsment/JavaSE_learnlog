package polymorphisDemo1;

public class test {
    public static void main(String[] args) {

     //不知道你是怎么理解多态的我是这样理解的?
     //多态就是一个榨汁机 你放苹果就榨苹果汁,你放梨子,就榨梨子汁
     //而Java中的多态榨汁机 就是他们的父类,你传过来的是苹果,我就调用苹果的方法


        //这里我们新建一个测试类
        teacher p1=new teacher();
        //p1.setAge(21);
       // p1.setName("王建国");
        register(p1);

        student p2=new student();
        //p2.setAge(18);
        //p2.setName("yangyi");
        register(p2);

        adminssor p3=new adminssor();
       // p3.setAge(22);
        //p3.setName("yangyi");
        register(p3);

    }

    public static void register(person p){
        //你传过来的是p是苹果 我就调用苹果的show,是梨子我就调用梨子的show方法即可
        p.show();
        //这里的多态,就是父类直接接收方法重写后的内容
    }
}
