package polymorphisPractice1;

public class test {


    public static void main(String[] args) {
        person p1=new person("老王",30);
        Dog d1 =new Dog(2,"黑");
        p1.keepPet(d1,"屎");
        Cat c1=new Cat(1,"黄");
        p1.keepPet(c1,"小鱼干");

        //好现在我创建了不只  一只猫和狗,而是有无穷个动物请问阁下应该如何应对
        //为此我选择使用多态的知识,多态的本质,一套方法,通用实现
    }
}
