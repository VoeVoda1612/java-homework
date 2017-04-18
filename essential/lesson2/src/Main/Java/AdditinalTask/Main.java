package AdditinalTask;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите радиус окружности - ");
        int r=input.nextInt();
        System.out.println("Площадь круга составляет - "+MyArea.areaOfCircle(r));
    }
}
