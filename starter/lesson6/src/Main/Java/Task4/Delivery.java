package Task4;


import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите число клиентов - ");
        int N=input.nextInt();
        int variants=1;
        do{
            variants*=N;
            N--;
        }while (N>0);
        System.out.println("Количество вариантов доставки - "+variants);
    }
}
