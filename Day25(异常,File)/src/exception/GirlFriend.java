package exception;

public class GirlFriend {

    private int age;
    private String name ;

    public GirlFriend() {
    }

    public GirlFriend(int age, String name) {
        this.age = age;
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
        if(age>40||age<10){
            throw  new ageException(age+"年龄有错误");
        }
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
        if(name.length()<3||name.length()>10){
            throw new  nameException(name+"名字有错误");
        }
        this.name = name;
    }

    public String toString() {
        return "GirlFriend{age = " + age + ", name = " + name + "}";
    }
}
