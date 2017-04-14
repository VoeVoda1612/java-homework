package Task4;

import java.util.Scanner;

public class NumbersCheck {

    public static void numbersCheck(int number){
        if (number>0){
            System.out.println("Число положительное");
        }else if(number<0){
            number*=-1;
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число ноль!!");
            return;
        }

        int j=0;

        for (int i = 1; i <=number ; i++) {
            j+=(number%i==0)?1:0;
        }

        if (j>2){
            System.out.println("Число не простое");
            System.out.printf("Делится на 2 - %1$s\n",number%2==0);
            System.out.printf("Делится на 5 - %1$s\n",number%5==0);
            System.out.printf("Делится на 3 - %1$s\n",number%3==0);
            System.out.printf("Делится на 6 - %1$s\n",number%6==0);
            System.out.printf("Делится на 9 - %1$s\n",number%9==0);
        }
        else System.out.println("Число простое");


    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите число для проверки - ");
        int number=input.nextInt();
        numbersCheck(number);

    }
}
