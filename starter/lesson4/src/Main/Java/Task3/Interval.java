package Task3;


import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите число - ");
        int number=input.nextInt();

        if (number>=0&&number<=14) System.out.println("Промежуток [0-14]");
        else if(number>=15&&number<=35) System.out.println("Промежуток [15-35]");
        else if(number>=36&&number<=50) System.out.println("Промежуток [36-50]");
        else if(number>=50&&number<=100) System.out.println("Промежуток [50-100]");
        else System.out.println("Введённое число в заданный промежуток не входит");
    }
}
