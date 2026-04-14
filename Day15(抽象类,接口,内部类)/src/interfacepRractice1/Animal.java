package interfacepRractice1;

public abstract class Animal {
    //现在有三种动物,dog,rabbit and frog,if you want to let their father both to swim,It not possbile
     //because the rabbit cann`t swim,so you only can use the interface ,if you create the interface
    //you can use it to implement the result ,but 你必须在接口中使用抽象方法,相当于直接限制死l

    private int age;
    private  String name;

    public Animal() {
    }

    public Animal(int age, String name) {
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

    public  void  drink(){
        System.out.println("the animals are drinking");
    }

    //we can use the abstract method which is called swim,and I guess only the dog and frog can use the mehod,so 我要把它限制死

    public abstract  void  eat();
}
