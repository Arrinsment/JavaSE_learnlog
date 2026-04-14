package extendsPractice2;

public class employee {

    //这里我们新建一个父类,标准的继承javabean类
    private String id;
    private String name;
    private int age;

    public employee() {
    }

    public employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
