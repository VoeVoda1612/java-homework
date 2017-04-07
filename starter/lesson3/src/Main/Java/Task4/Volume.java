package Task4;

import java.util.Scanner;

import static java.lang.Math.*;

public class Volume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double PI=Math.PI;

        System.out.print("Введите радиус цилиндра - ");
        int R=input.nextInt();

        System.out.print("\nВведите радиус высоту цилиндра - ");
        int h=input.nextInt();

        double V=PI*pow(R,2)*2;
        double S=2*PI*R*(R+h);

        System.out.printf("\nОбъём цилиндра - %1$1.3f \nПлощадь цилиндра - %2$1.3f",V,S);
    }
}
