package Task1;


import java.util.Scanner;

public class Arithmetics {
    public static void add(int a,int b){
        System.out.printf("Сложение %1$s+%2$s=%3$s",a,b,a+b);
    }

    public static void sub(int a,int b){
        System.out.printf("Вычитание %1$s-%2$s=%3$s",a,b,a-b);
    }

    public static void mul(int a,int b){
        System.out.printf("Умножение %1$s*%2$s=%3$s",a,b,a*b);
    }

    public static void div(int a,int b){
        if (b!=0){
            System.out.printf("Деление %1$s*%2$s=%3$1.3f",a,b,(double)a/(double)b);
        }
        else {
            System.out.println("Деление на ноль запрещено");
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите a - ");
        int a=input.nextInt();

        System.out.print("Введите b - ");
        int b=input.nextInt();

        System.out.print("Введите оператор (+,-,*,/) - ");
        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                add(a,b);
                break;
            case '-':
                sub(a,b);
                break;
            case '*':
                mul(a,b);
                break;
            case '/':
                div(a,b);
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
    }
}
