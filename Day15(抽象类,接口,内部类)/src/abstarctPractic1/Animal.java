package abstarctPractic1;

public abstract   class Animal {

    //这里我们新建了一个抽象类,换句话说去学习抽象类与抽象方法
    //为什么要去学习这个?假如你写了一个父类,然后有个方法叫work,然后你的同事去写子类,叫它重写子类这个方法,人家就不写,你怎么办?
    //这时候就用抽象类 逼迫他去重写方法

    //我把work 定义为抽象方法,那么我的类就是抽象类,但反过来,有抽象类不一定有抽象方法,这是我的同事假如它写了子类,那么,因为我创建了抽象方法,那么他就必须重写


    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  drink(){
        System.out.println("动物在喝水");}

    //这里每个动物吃的东西都不一样,所以我们可以用抽象方法类,强迫别人方法重写

    public abstract void eat();//写了抽象方法,类必须变成抽象类

}
