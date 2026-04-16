package SetDemo1;

import java.util.Objects;


//这里我们已经确定了具体的泛型了:Student所以不用写成 Student<E> implements  Comparable<E>
public class Student implements  Comparable<Student>{
    private String name;
    private  int age;



    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


 //这里的这个 从写的这个equals 方法是比较2个对象的内容是不是相同,然后比较的不是地址值了
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    //this.表示当前存在的元素
    //O:表示已经在红黑树中存在的元素
    //如果是负数,比如this.getAge-O.getAge,放在节点的左边即可
    //如果是正数,比如this.getAge-O.getAge,放在节点的右边即可
    //O表示当前的元素已经存在,舍弃即可

    public int compareTo(Student O) {

        //指定排序规则
        //按照年龄的升序进行排序
        return this.getAge()-O.getAge();
    }


}
