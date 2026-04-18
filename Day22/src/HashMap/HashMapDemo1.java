package HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {

        //这里我们讲讲Map的实现类:HashMap

        /*HashMap的特点:
        1.HashMap是Map里面的一个实现类。
        2.没有额外需要学习的特有方法，直接使用Map里面的方法就可以了。
        3. 特点都是由键决定的：无序、不重复、无索引
        4.HashMap跟HashSet底层原理是一模一样的，都是哈希表结构*/


        //1. HashMap底层是哈希表结构的
        //2. 依赖hashCode方法和equals方法保证 键的唯一(意思是我们只用去算键的哈希值,不用去管值的哈希值)
        //3. 如果键存储的是自定义对象，需要重写hashCode和equals方法
        //   如果值存储自定义对象，不需要重写hashCode和equals方法
        //底层和hashSet差不多





    }
}
