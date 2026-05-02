package Function;

public class Student {


    private String name;
    private  int    age;


    public Student() {
    }


    //这里我们去写一个构造方法,方便别人去使用

    public Student(String s){//这里的s表示流中的数据
      this.name = s.split(",")[0];
      this.age=Integer.parseInt(s.split(",")[1]);
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String TOYIQI(){
        return name+"-"+age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
