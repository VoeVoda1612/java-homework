package Task2;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double operand1, operand2;

        System.out.print("Введите число a - ");
        operand1=input.nextDouble();

        System.out.print("Введите число b - ");
        operand2=input.nextDouble();

        System.out.print("Введите знак арифметической операции (+,-,*,/) - ");
        String sign=input.next();

        switch (sign){
            case "+":
                System.out.println("результат - "+(operand1+operand2));
                break;
            case "-":
                System.out.println("результат - "+(operand1-operand2));
                break;
            case "*":
                System.out.println("результат - "+(operand1*operand2));
                break;
            case "/":
                if (operand2 == 0) System.out.println("На ноль деление запрещено");
                else System.out.println("результат - "+(operand1/operand2));
                break;
            default:
                System.out.println("Ошибка. Данный знак арифметической операции отсутсвует");
        }

    }
}
