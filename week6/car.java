public class car {
    protected int speed;
    protected double regularPrice;
    protected String color;

    public car(int speed, double regularPrice, String color) {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }

    public double getSalePrice(){
        return this.regularPrice;
    }
}
