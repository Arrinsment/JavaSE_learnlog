package SetDemo1;

public class Student2 implements  Comparable<Student2> {


    private  String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    //然后这里我们直接鼠标右键进行 然后去点击ptg to Javabean

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        //这个o是表示红黑树中已经存在的元素

        ///* 需求：创建5个学生对象
        //属性：(姓名,年龄,语文成绩,数学成绩,英语成绩),
        //按照总分从高到低输出到控制台
        //如果总分一样，按照语文成绩排
        //如果语文一样，按照数学成绩排
        //如果数学成绩一样，按照英语成绩排
        //如果英文成绩一样，按照年龄排
        //如果年龄一样，按照姓名的字母顺序排
        //如果都一样，认为是同一个学生，不存。

        //然后这里我们去手写规则即可
        //具体我们计算的这个差值这个规则是和之前student1一样,相同不管,负数左边,正数放在右边

        //先去获取总分,传入进去这个元素的
        int sum=this.chinese+this.english+this.math;

        //先去获取总分,红黑树中存在这个元素的
        int sum2=o.chinese+o.english+o.math;

        int i=sum-sum2;
        i= i==0?this.chinese-o.chinese:i;
        i= i==0?this.math-o.math:i;
        i= i==0?this.english-o.english:i;
        i= i==0?this.age-o.age:i;

        //然后最后当我们是按照,如果年龄一样，按照姓名的字母顺序排,但这个是一个字符串所以我们直接用String 的comparaTo去调用即可

        i= i==0?this.name.compareTo(o.name):i;

        return i;
    }
}
