package 数组对象的练习;

public class Goods {
     private int id;
     private String name;
     private int price;
     private int count;

     public Goods(){

     }
     public Goods(int id,String name,int price,int count){
         this.id=id;
         this.name=name;
         this.price=price;
         this.count=count;
     }
     public void setName(String name){
         this.name=name;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
