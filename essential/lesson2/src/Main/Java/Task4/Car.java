package Task4;

public class Car {
    private int year;
    private String color;
    private double speed;
    private int weight;




    public Car() {
        this(2017);
    }

    public Car(int year) {
        this(year,"White");
    }

    public Car(int year, String color) {
        this(year,color,250);
    }

    public Car(int year, String color, double speed) {
        this(year,color,speed,2500);
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double getSpeed() {return speed;}

    public void setSpeed(double speed) {this.speed = speed;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
