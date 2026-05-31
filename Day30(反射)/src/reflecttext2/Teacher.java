package reflecttext2;

public class Teacher {
    private  String name;
    private  int slary;

    public Teacher() {
    }

    public Teacher(String name, int slary) {
        this.name = name;
        this.slary = slary;
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
     * @return slary
     */
    public int getSlary() {
        return slary;
    }

    /**
     * 设置
     * @param slary
     */
    public void setSlary(int slary) {
        this.slary = slary;
    }
    public void teach(){
        System.out.println("老师在教书");
    }

    public String toString() {
        return "Teacher{name = " + name + ", slary = " + slary + "}";
    }
}
