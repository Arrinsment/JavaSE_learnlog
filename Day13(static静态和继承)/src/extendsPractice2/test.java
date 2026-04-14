package extendsPractice2;

public class test {
    //这里我们新建一个测试类进行测试
    public static void main(String[] args) {
        lecture e1=new lecture("001","yiyi",23);
        e1.work();
        System.out.println("年龄"+e1.getAge()+"名字"+e1.getName()+"ID"+e1.getId());
        System.out.println("-----------------------------------------------------");

        Tutor e2=new Tutor ("002","nini",22);
        e2.work();
        System.out.println("年龄"+e2.getAge()+"名字"+e2.getName()+"ID"+e2.getId());
        System.out.println("-----------------------------------------------------");

        maintainer e3=new maintainer("003","zizi",24);
        e3.work();
        System.out.println("年龄"+e3.getAge()+"名字"+e3.getName()+"ID"+e3.getId());
        System.out.println("-----------------------------------------------------");

        buyer e4=new buyer("001","yiyi",23);
        e4.work();
        System.out.println("年龄"+e4.getAge()+"名字"+e4.getName()+"ID"+e4.getId());
        System.out.println("-----------------------------------------------------");

    }
}
