package reflect2;

public class Student {

    private  String name;
    private  int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    protected Student(int age) {
        this.age = age;//这里被protect修饰后,在不同包的他的子类,可以利用super去调用,但构造方法不能继承(你自己不觉得继承很奇怪吗?怎么我在调用子类传参得时候还要管父类的名字?
               /// ),意思你要手动去写(可以利用alt+ins),只有成员变量和成员方法可以继承
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
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
