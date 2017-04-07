package AdditionalTask;

import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        double myVariable1,myVariable2;
        Scanner input=new Scanner(System.in);

        System.out.print("Введите значение №1 ");
        myVariable1=input.nextDouble();

        System.out.print("Введите значение №2 ");
        myVariable2=input.nextDouble();

        try {

        double result=myVariable1+myVariable2;
        System.out.printf("Сложение - %1$s\n",result);

        result=myVariable1-myVariable2;
        System.out.printf("Вычитание - %1$s\n",result);

        result=myVariable1*myVariable2;
        System.out.printf("Умножение - %1$s\n",result);

        if (myVariable2==0) throw new Exception("Div by Zero exception");

        result=myVariable1/myVariable2;
        System.out.printf("Деление - %1$s\n",result);

        result=myVariable1%myVariable2;
        System.out.printf("Остаток от деления - %1$s\n",result);

        }catch (Exception e){
            System.out.printf("Деление - ОШИБКА!!! деление на ноль невозможно (%1$s)\n",e.getMessage());
            System.out.printf("Остаток от деления - ОШИБКА!!! деление на ноль невозможно (%1$s)\n",e.getMessage());
        }




    }
}
