public class user {

    private String user_name;
    private int dish_id;
    private int count;
    private Boolean flag;


    public user() {
    }

    public user(String user_name, int dish_id, int count, Boolean flag) {
        this.user_name = user_name;
        this.dish_id = dish_id;
        this.count = count;
        this.flag = flag;
    }

    /**
     * 获取
     * @return user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * 设置
     * @param user_name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * 获取
     * @return dish_id
     */
    public int getDish_id() {
        return dish_id;
    }

    /**
     * 设置
     * @param dish_id
     */
    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 获取
     * @return flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String toString() {
        return "用户名:"+user_name+" "+"下单编号:"+dish_id+" "+"份数:"+count+" "+"是否下单:"+flag;
    }
}