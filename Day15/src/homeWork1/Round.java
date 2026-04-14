package homeWork1;

public class Round {
    private int r;
    final double PI=3.14;

    public Round() {
    }

    public Round(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPi() {
        return PI;
    }
    public void S(){
        double s=PI*r;
        System.out.println("圆的面积是:"+s);
    }

    public void C(){
        Double C=2*PI*r;
        System.out.println("圆的周长是:"+C);
    }

}

