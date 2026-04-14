package extendsDemo2;

public class dog {

    //这里继承涉及到 方法的重写,就是子类的方法名一样但内容不一样,本质上就是虚方法表的覆盖
    //当父类的内容无法满足子类的要求,就要对父类的内容进行重写

    public void eat(){
        System.out.println("狗吃狗粮");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
    public void drink(){
        System.out.println("狗在喝水");
    }

}
