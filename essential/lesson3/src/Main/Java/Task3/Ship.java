package Task3;

public class Ship extends Vehicle{
    private  int passengers;
    private String port;

    public Ship(int price, int age, int speed, int passengers, String port) {
        super(price, age, speed);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public void showInfo(){
        System.out.println("Яхта"+
                         "\nЦена             - "+getPrice()+
                         "\nДата выпуска     - "+getAge()+
                         "\nСкорость         - "+getSpeed()+
                         "\nЧисло пассажиров - "+passengers+
                         "\nВысота           - "+port);
    }

    public int getPassengers() {return passengers;}

    public void setPassengers(int passengers) {this.passengers = passengers;}

    public String getPort() {return port;}

    public void setPort(String port) {this.port = port;}
}
