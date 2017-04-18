package Task3;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car(2016,"Black");
        Car car3=new Car(2015,"Blue",200);
        Car car4=new Car(2016,"Green",300,2600);

        System.out.println("(Машина 1) год - "+car1.getYear()+" цвет - "+car1.getColor()+" скорость - "+car1.getSpeed()+" вес - "+car1.getWeight());
        System.out.println("(Машина 2) год - "+car2.getYear()+" цвет - "+car2.getColor()+" скорость - "+car2.getSpeed()+" вес - "+car2.getWeight());
        System.out.println("(Машина 3) год - "+car3.getYear()+" цвет - "+car3.getColor()+" скорость - "+car3.getSpeed()+" вес - "+car3.getWeight());
        System.out.println("(Машина 4) год - "+car4.getYear()+" цвет - "+car4.getColor()+" скорость - "+car4.getSpeed()+" вес - "+car4.getWeight());
    }
}
