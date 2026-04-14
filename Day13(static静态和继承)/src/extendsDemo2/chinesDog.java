package extendsDemo2;

public class chinesDog extends dog {
    //这里我们发现dog中的eat方法于父类不一样了,因为土狗只吃剩饭
     @Override
    public void eat(){
        System.out.println("土狗在吃剩饭");
    }
}
