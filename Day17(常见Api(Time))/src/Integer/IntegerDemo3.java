package Integer;

public class IntegerDemo3 {
    public static void main(String[] args) {

        //在JDK5中提出了一个 自动拆箱和自动封箱的理论


         Integer i=new Integer(10);

        //它在底层还是创建了一个对象Integer a=new Intger(i);或者利用valueof Integer a=Intger.valueof()
        //自动装箱
        Integer i1=5;

        //自动拆箱,利用intvalue
        int i2=i;

        //所以在JDK5以后 int 和integer可以看做是同一个东西,因为可以相互转化
        //所以以后我们直接用integer就行了,因为他在内部会自动进行
        //自动拆箱和封箱
        Integer a=10;
        Integer b=20;
        Integer c=a+b;
        System.out.println(c);//30


    }
}
