package Task3;

import java.util.Scanner;

public class Conversion {
    public static double сonversion(int lots, double price){
        return price*(double)lots;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите курс конвертируемой валюты - ");
        double price=input.nextDouble();

        System.out.print("Введите количество требуемой валюты - ");
        int lots=input.nextInt();

        System.out.printf("Для полкупки объёма %1$s д.е., по курсу %2$s, вам необходимо %3$s д.е.",lots,price,сonversion(lots,price));
    }
}
