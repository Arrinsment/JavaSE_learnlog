package extendsPractice3;

public class joiner {
    //定义一个角色类,父类
    private int age;
    private  String name;


    public joiner() {
    }
    public joiner(int age, String name) {
        this.age = age;
        this.name = name;
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

    public void lookClassTable(){
        System.out.println("看课表");
    }
}
