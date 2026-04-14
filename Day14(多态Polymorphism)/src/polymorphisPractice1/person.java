package polymorphisPractice1;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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

     public void keepPet(Animal a,String something){
        if(a instanceof Dog d) {
            System.out.println("年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只" + a.getColor() + "颜色的" + a.getColor() + "岁的狗");
            a.eat(something);
        }
        else if(a instanceof  Cat c){
            System.out.println("年龄为" + this.getAge() + "岁的" + this.getName() + "养了一只" + a.getColor() + "颜色的" + a.getColor() + "岁的猫");
            a.eat(something);
        }

    }

}
