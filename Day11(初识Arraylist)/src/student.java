
public class student {
    private  String Name;
    private  String ID;

    public student() {
    }

    public student(String name, String ID) {
        this.Name = name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
