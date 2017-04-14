package AdditionalTask;

import java.util.Scanner;

public class Calculator {
    public static double calculator(int a,int b, int c){

        return ((double)a+(double)b+(double)c)/3;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите a - ");
        int a=input.nextInt();
        System.out.print("Введите b - ");
        int b=input.nextInt();
        System.out.print("Введите c - ");
        int c=input.nextInt();
        System.out.printf("Среднее арифметическое %1$s,%2$s,%3$s - %4$1.3f",a,b,c,calculator(a,b,c));
    }
}
