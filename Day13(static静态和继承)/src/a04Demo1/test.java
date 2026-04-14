package a04Demo1;

public class test {
    public static void main(String[] args) {
        student.teachername="阿玮老师";


        //创建了第一个学生对象
        student S1=new student();
        System.out.println("s1"+S1);
        S1.setAge(19);
        S1.setName("XI");
        S1.setGender("男");
        S1.show();





        //创建了第二个学生对象
        student S2=new student();
        System.out.println("S2"+S2);
        S2.setAge(19);
        S2.setName("XI");
        S2.setGender("男");
        S2.show();




    }
}
