package homeWork1;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void S(){
        double S=length*width;
        double C=2*length*width;
        System.out.println("长方形面积是:"+S+"长方形周长是"+C);

    }

}