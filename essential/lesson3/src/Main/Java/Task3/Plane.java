package Task3;


public class Plane extends Vehicle {
    private  int passengers;
    private int height;


    public Plane(int price, int age, int speed, int passengers, int height) {
        super(price, age, speed);
        this.passengers = passengers;
        this.height = height;
    }

    @Override
    public void showInfo(){
        System.out.println("Самолёт"+
                         "\nЦена             - "+getPrice()+
                         "\nДата выпуска     - "+getAge()+
                         "\nСкорость         - "+getSpeed()+
                         "\nЧисло пассажиров - "+passengers+
                         "\nВысота           - "+height);
    }

    public int getPassengers() {return passengers;}

    public void setPassengers(int passengers) {this.passengers = passengers;}

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}
}
