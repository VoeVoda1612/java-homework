package Task2;


import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите число для проверки на чётность - ");
        int a=input.nextInt();

        //Способ 1
        if((a%2)==0){
            System.out.println("Способ 1 - число чётное");
        }
        else {
            System.out.println("Способ 2 - число нечётное");
        }

        //Способ 2
        if((a^1)>a){
            System.out.println("Способ 2 - число чётное");
        }
        else {
            System.out.println("Способ 2 - число нечётное");
        }

        //Способ 3
        if((a<<31)==0){
            System.out.println("Способ 3 - число чётное");
        }
        else {
            System.out.println("Способ 3 - число нечётное");
        }

        //Способ 4
        if((a&1)==0){
            System.out.println("Способ 4 - число чётное");
        }
        else {
            System.out.println("Способ 4 - число нечётное");
        }
    }
}
