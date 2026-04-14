package GenericsTest1;

public class Taidi extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"X岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
