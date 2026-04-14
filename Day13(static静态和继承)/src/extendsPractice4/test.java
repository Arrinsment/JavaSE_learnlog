package extendsPractice4;

public class test {
    public static void main(String[] args) {
        Phone p1=new Phone("苹果",5999);
        p1.size=600000;
        System.out.println(p1.getPrice()+","+p1.getBrand()+","+p1.size);
        p1.show();

        Phone p2=new Phone("小米",6999);
                p2.show();


        System.out.println("--------------------------");
        System.out.println(p1.size);
    }
}
