package Day16.src.myapiObject;

import java.util.StringJoiner;

public class user implements Cloneable {
    //这个cloneavle 里面是没有抽象方法的,表示一个标记性接口
    //如果实现了,表示可以被克隆
    //如果没有被实现,表示不可以被克隆

    private int id;//游戏角色
    private String name;//用户名
    private String passworld;//密码
    private  String path;//游戏图片
    private  int[] data;

    public user() {
    }

    public user(int id, String name, String passworld, String path, int[] data) {
        this.id = id;
        this.name = name;
        this.passworld = passworld;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }


    //对里面的属性值进行修改
    @Override
    public String toString() {
        //意思是如果我用System.out.println(对象名)输出对象的话,然后在控制台上输出的就是return 后面的结果
        return "id:"+id+","+"name:"+name+","+"passworld:"+passworld+","+"path:"+path+ arrToString();
    }

    //方法重写父类Object的方法,就是让java给我们克隆一个对象,并把克隆的对象返回
    //然后这里还要在上面implements一个接口cloneable,



    /*//浅克隆:
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/



     //深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {

        //他默认的是浅克隆,我们自己进行深克隆即可

        //原来的数组
        int[]data=this.data;
        //新创建一个数组
        int[]newdata=new int[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            newdata[i]=data[i];
        }

        user u=(user)super.clone();

        //这里的深克隆 我创建了一个新对象和原来的对象内容是相同的,但我把新对象的地址值传递过去
        u.data=newdata;
        return u;
    }

    public String arrToString(){
       StringJoiner sj=new StringJoiner(",","[","]");
       for (int i = 0; i < data.length; i++) {
           sj.add(i+"");//sj里面只能加字符串
       }
        return sj.toString();
   }

}
