package abstractInterfacePractice1;


//现在来看,你直接调用person 去创建对象是没有意义的
//所以我们直接把person这个类,变成抽象类,即可,然后别人就没有办法直接创建对象了

public abstract class person {
    private int age;
    private String name;

    public person() {
    }

    public person(int age, String name) {
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

}
