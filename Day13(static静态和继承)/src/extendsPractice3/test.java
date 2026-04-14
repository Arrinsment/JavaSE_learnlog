package extendsPractice3;

public class test {
    public static void main(String[] args) {
        student p1=new student(21,"yangyi");
        p1.lookClassTable();
        System.out.println("年龄"+p1.getAge()+"名字"+p1.getName());
        System.out.println("----------------------------------------");

        techer p2 = new techer(18,"zhouxiaoyun");
        p2.lookClassTable();
        System.out.println("年龄"+p2.getAge()+"名字"+p2.getName());
    }
}
