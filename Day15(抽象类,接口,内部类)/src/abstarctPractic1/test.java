package abstarctPractic1;

public class test {

    public static void main(String[] args) {
        //对了,在abstract类中你是没有办法直接去创建对象去访问的,但它的子类 ,你是可以正常创建对象去访问的

        Dog d1=new Dog();
        d1.setAge(1);
        d1.setName("乖乖");
        System.out.println("一只"+d1.getAge()+"个月叫"+d1.getName()+"的小狗");;
        d1.eat();

    }
}
