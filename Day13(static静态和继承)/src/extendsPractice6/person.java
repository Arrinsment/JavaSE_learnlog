package extendsPractice6;

public class person  {
    private String name;
    private int  age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void KeepPet(dog dog1,String something){
        System.out.println("颜色为"+dog1.getColor()+"的"+dog1.getAge()+
                "岁的狗在吃"+dog1.eat(something));
    }

    public void KeepPet(cat cat1,String something){
        System.out.println("颜色为"+cat1.getColor()+"的"+cat1.getAge()+
                "岁的猫在吃"+cat1.eat(something));
        //返回值为void无法直接拼接
    }
}
