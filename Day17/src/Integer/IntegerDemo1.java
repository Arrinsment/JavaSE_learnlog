package Integer;

public class IntegerDemo1 {

    public static void main(String[] args) {

        //注意我们用valueof 直接去获取integer的时候得到的地址相同,不用重复去创建对象的范围是(-128-127)
        //3. 这两种方式获取对象的区别（掌握）
        //然后这里的Integer是int的包装类,包装类说白了就是把基本数据类型变成引用数据类型的方式
        //底层原理：
        //因为在实际开发中，-128~127之间的数据，用的比较多。
        //如果每次使用都是new对象，那么太浪费内存了
        //所以，提前把这个范围之内的每一个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象。
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7); // true
        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9); // false
        //因为看到了new关键字，在Java中，每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来，地址值不一样。
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);//这里打了红线代表是已经过时了的含义
        System.out.println(i10 == i11); // false


    }
}
