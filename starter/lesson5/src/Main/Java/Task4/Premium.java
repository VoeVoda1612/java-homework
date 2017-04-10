package Task4;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите заработную плату сотруника - ");
        double salary=input.nextInt();

        System.out.print("Введите выслугу лет сотрудника - ");
        int years=input.nextInt();

        if (years<5) System.out.println("Премия сотрудника составляет - "+salary*0.1);
        else if ((years>=5)&&(years<10)) System.out.println("Премия сотрудника составляет - "+salary*0.15);
        else if ((years>=10)&&(years<15)) System.out.println("Премия сотрудника составляет - "+salary*0.25);
        else if ((years>=15)&&(years<20)) System.out.println("Премия сотрудника составляет - "+salary*0.35);
        else if ((years>=20)&&(years<25)) System.out.println("Премия сотрудника составляет - "+salary*0.45);
        else System.out.println("Премия сотрудника составляет - "+salary*0.50);

    }
}
