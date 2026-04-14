package extendPractice1;

public class test {
    public static void main(String[] args) {
        manager p1=new manager("001","yangyi",28,50000);
        p1.work();
        p1.eat();
        System.out.println("ID:"+p1.getId()+"名字"+p1.getName()+"年龄"+p1.getAge()+"奖金"+p1.getBouns());
        System.out.println("-----------------------------------------------");
        chef p2=new chef("100","shuiyi",44);
        p2.work();
        p2.eat();
        System.out.println("ID:"+p2.getId()+"名字"+p2.getName()+"年龄"+p2.getAge());
    }

}
