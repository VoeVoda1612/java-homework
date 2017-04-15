package Task3;


import java.util.Scanner;

public class Delivery {

    public static int delivery(int N){
        if (N>0)return N*delivery(N-1);
        else if(N<0)return 0;
        else return 1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите количество точек доставки - ");
        int points=input.nextInt();

        System.out.println("Вариантов маршрута - "+delivery(points));
    }
}
