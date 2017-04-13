package Task2;


import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите A - ");
        int A=input.nextInt();

        System.out.print("Введите B - ");
        int B=input.nextInt();

        int sum1=0,sum2=0;

        for (int i=A;i<B;i++){
            sum1+=(i%2==0)?i:0;
            sum2+=(i%2!=0)?i:0;
        }

        System.out.println("Сумма всех чётных чисел   - "+sum1);
        System.out.println("Сумма всех нечётных чисел - "+sum2);
    }
}
