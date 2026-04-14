package a04Demo1;

public class student {

    //不要偷懒,老师每写一个demo,你自己也要跟着写,然后把笔记和注释写好,现在慢下来了,以后才会快起来
    //这里 有个关键的知识点

    // 静态 的只能调用 静态的,且静态的没有this关键字
    //非静态的不仅可以调用非静态的,也可以调用静态的,因为有(非静态有this关键字,只不过这个this关键字被虚拟机隐藏起来 详细去看测试类)

    private int age;
    private String name;
    private String gender;
    public  static String teachername;

    public student() {
    }

    public student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void  show(student this){ //这里的student this,就非静态 隐藏的this关键字
        System.out.println("this"+this);

        //注意这里的show 是非静态的所以里面 有个隐藏的this关键字
        //这个this关键字表示 谁 去调用的,那个谁的地址
        //然后在测试类中,我们用了 s1.show(),s2.show(),那么这里的就是 this地址就是s1和s2的
        //这里是,我是说在 本student类中隐藏的 就是this关键字 (具体就是student this)
        //然后如果你要打印的话,如果是s1调用的show方法 那么s1的地址和隐藏的 this关键字的地址是完全相同的

        //然后你换个角度来想 这里的this.name 的this 是从哪里来的,不就是 student this这个隐藏的吗?
        System.out.println(this.name+","+this.age+","+this.gender+","+teachername);

        this.show2();
        //这里的this 就是刚刚使用 s1.show() 的this关键字的地址
    }

    //假如我又在下面定义了一个方法
    public   void show2(){
        System.out.println(" ");
    }


    //静态方法里面没有this 关键字// 静态方法是共享的,公交车,人人都可以用的,所以没有this关键字
    //然后非静态方法是特定的,对于特定对象的是有this 关键字的,自然用隐藏的 this关键字 就都可以去调用无论你是什么



    //也可以从内存的角度去想,假如我一直不创建对象,那么就没有 非静态一说,只有静态,所以静态之间可以互相访问的
}
