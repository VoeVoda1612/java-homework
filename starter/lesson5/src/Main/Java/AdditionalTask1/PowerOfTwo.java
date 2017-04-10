package AdditionalTask1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите число для проверки - ");
        int a=input.nextInt();

        int result=a&(a-1);

        if(result==0){
            System.out.println("Указанное число является степенью двойки");
        }
        else {
            System.out.println("Указанное число НЕ является степенью двойки");
        }

    }
}
