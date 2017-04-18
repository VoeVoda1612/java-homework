package Task2;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car(2016,"Black");

        System.out.println("(Машина 1) год - "+car1.getYear()+" цвет - "+car1.getColor());
        System.out.println("(Машина 2) год - "+car2.getYear()+" цвет - "+car2.getColor());
    }
}
