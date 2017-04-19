package Task3;


public class Vehicle {
    private int price;
    private int age;
    private int speed;

    public Vehicle(int price, int age, int speed) {
        this.price = price;
        this.age = age;
        this.speed = speed;
    }

    public void showInfo(){
        System.out.println("Транспортное средство"+
                         "\nЦена         - "+price+
                         "\nДата выпуска - "+age+
                         "\nСкорость     - "+speed);
    }

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {this.speed = speed;}
}




