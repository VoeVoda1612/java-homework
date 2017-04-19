package Task3;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle(10000,2016,150);
        Vehicle vehicle2=new Car(15000,2015,240);
        Vehicle vehicle3=new Plane(3000000,2005,1000,130,5);
        Vehicle vehicle4=new Ship(10000000,2017,120,70,"Севастополь");

        vehicle1.showInfo();
        vehicle2.showInfo();
        vehicle3.showInfo();
        vehicle4.showInfo();
    }
}
