package mytext;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 3191573770351401499L;

    //这里先去创建对象完成后,然后去写版本号

    private String student ;
    private  int age;


    public Student() {
    }

    public Student(String student, int age) {
        this.student = student;
        this.age = age;
    }

    /**
     * 获取
     * @return student
     */
    public String getStudent() {
        return student;
    }

    /**
     * 设置
     * @param student
     */
    public void setStudent(String student) {
        this.student = student;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{student = " + student + ", age = " + age + "}";
    }
}
