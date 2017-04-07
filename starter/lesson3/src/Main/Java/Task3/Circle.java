package Task3;
import java.util.Scanner;

import static java.lang.Math.*;


public class Circle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        final double PI=Math.PI;

        System.out.print("Введите радиус круга - ");
        int r=input.nextInt();

        double result=PI*pow(r,2);

        System.out.printf("Площадь круга - %1$1.3f",result);

    }
}
