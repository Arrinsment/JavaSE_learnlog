public class dish {

    private int ID;
    private  String name;
    private double price;
    private  int remain;
    private  String dish_type;


    public dish() {
    }

    public dish(int ID, String name, double price, int remain, String dish_type) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.remain = remain;
        this.dish_type = dish_type;
    }

    /**
     * 获取
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return remain
     */
    public int getRemain() {
        return remain;
    }

    /**
     * 设置
     * @param remain
     */
    public void setRemain(int remain) {
        this.remain = remain;
    }

    /**
     * 获取
     * @return dish_type
     */
    public String getDish_type() {
        return dish_type;
    }

    /**
     * 设置
     * @param dish_type
     */
    public void setDish_type(String dish_type) {
        this.dish_type = dish_type;
    }

    public String toString() {
        return "名字:"+name+" "+"ID:"+ID+" "+"价钱:"+price+" "+"库存:"+remain+" "+"类型:"+dish_type;
    }
}
