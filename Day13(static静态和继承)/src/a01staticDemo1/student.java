package a01staticDemo1;

public class student {
    //定义一个 姓名,年龄,性别
    //不要偷懒,老师敲一个代码,你就自己敲一个,无论是practice 还是Demo演示,然后把知识点和注释写好
    private String name;
    private  int  age;
    private  String gender;
    //假如我这里要新创建一个老师的名字我先用 public 去修饰
    public  static String  teacher;

    public student() {
    }

    public student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(this.name+"正在学习");
    }

    public void show(){
        System.out.println(this.name+","+this.age+","+this.gender+","+this.teacher);
    }



}
