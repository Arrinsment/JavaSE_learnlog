package Exercise;

public class Girl {

     //这里是对exersise 的girl类的重写

     private String name;
     private  int  age;
     private  double height;


     public Girl(String name, int age, double height) {
          this.name = name;
          this.age = age;
          this.height = height;
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

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }


     @Override
     public String toString() {
          return "name:"+name+","+"age"+age+","+"heihtg"+height;
     }

}
