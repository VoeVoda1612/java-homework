package Task3;

public class Car extends Vehicle {
    public Car(int price, int age, int speed) {
        super(price, age, speed);
    }
    public void showInfo(){
        System.out.println("Автомобиль"+
                         "\nЦена         - "+getPrice()+
                         "\nДата выпуска - "+getAge()+
                         "\nСкорость     - "+getSpeed());
    }
}
