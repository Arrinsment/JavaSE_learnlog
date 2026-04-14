package extendsPractice5;

public class student extends person {
    private String schoolName;
    private String stuNumber;

     public student(){

     }

    public student(String schoolName, String stuNumber) {
        this.schoolName = schoolName;
        this.stuNumber = stuNumber;
    }

    public student(String name, String gender, int age, String nationality, String schoolName, String stuNumber) {
        super(name, gender, age, nationality);
        this.schoolName = schoolName;
        this.stuNumber = stuNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习!");
    }
}
