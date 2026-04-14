package polymorphisDemo3;

public class test {
    //这里主要讲下继承的弊端和优势

    //优势:便于解耦合,业务需求改了我用全部都改,只用改右边的即可
    //如 Animal a=new Dog() ,我只用把右边的创建对象的部分改了就可以了
    //a.work

    public static void main(String[] args) {
        //先按照多态的格式 Fu f=new zi();创建一个对象
        Animal a=new Dog();
        a.eat();//狗在吃屎

        //主要讲下多态的缺点,由于多态 执行成员方法的时候是按照 编译看左边,运行看右边的,所以只能执行父类的方法(名字相同的)但子类特定的方法不能执行
        //比如这里的a.lookhome 执行了就会报错


        //怎么解决,很简单因为我们是创建对象是给左边的a的,我们想办法把a变回 子类类型 Dog不就可以了吗?
        //大转小,要强制类型转换
        Dog d1 =(Dog) a;
        //此时执行 d1.lookHome 就不会报错了

        //但这里有个小细节,假如这里我明明创建的是Dog对象但我把这里的Dog变成了cat怎么办?
        //为了防止出现错误 我们可以用一个 instanceof 关键字


        if(a instanceof Dog d){ //这里已经包含了 2层意思 问a是不是Dog类型 第二`种是把a转换成 转换成了 Dog d的类型(Dog d=(Dog)a)
            d.lookHome();
        }
        else if(a instanceof  cat c){
            c.eat(); //但假如最后你并不知道是什么类型  你要用多用几个else if
        }
        else {
            System.out.println("没有这个类型");
        }


    }
}
