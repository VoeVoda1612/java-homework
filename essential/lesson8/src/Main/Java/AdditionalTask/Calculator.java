package AdditionalTask;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int operand1, operand2;

        try {
        System.out.print("Введите число a - ");
        operand1=input.nextInt();

        System.out.print("Введите число b - ");
        operand2=input.nextInt();

        System.out.print("Введите знак арифметической операции (+,-,*,/) - ");
        char sign=input.next().charAt(0);

        double result;

            switch (sign) {
                case '+':
                    result=operand1 + operand2;
                    System.out.println("результат - " + result);
                    break;
                case '-':
                    result=operand1 - operand2;
                    System.out.println("результат - " + result);
                    break;
                case '*':
                    result=operand1 * operand2;
                    System.out.println("результат - " + result);
                    break;
                case '/':
                    try {
                        result=(double)operand1 /(double)operand2;
                        System.out.println("результат - " + result);
                    }
                    catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                        System.out.println("На ноль деление запрещено");
                    }
                    break;
                default:
                    throw new InputMismatchException("Ошибка. Данный знак арифметической операции отсутсвует");
            }
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода данных");

        }


    }
}
