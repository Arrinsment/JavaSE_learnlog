package extendPractice1;

public class employee {
    //定义一个标准的继承javaeBean类

      private String id;
      private String name;
      private int age;


    public employee() {
    }

    public employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void work(){
        System.out.println("study");
    }

    public void eat(){
        System.out.println("吃米饭");
    }


}
