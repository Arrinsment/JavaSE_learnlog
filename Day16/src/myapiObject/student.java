package myapiObject;

import java.util.Objects;

public class student {
    private String name;
    private int  age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这里我们直接把所有类的父类 Object 中的toString 进行方法重写即可

    @Override
    public String toString() {
        return "name:"+name+","+"age:"+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;//被比较对象强转换为了student类了
        return age == student.age && Objects.equals(name, student.name);
        //当确实都比较正确返回true,不然返回false
    }


}
