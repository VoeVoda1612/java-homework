package AdditionalTask;


public class Calculator {
    public static void sum(int a,int b){
        System.out.println("Сложение  - "+(a+b));
    }
    public static void sub(int a,int b){
        System.out.println("Вычитание - "+(a-b));
    }

    public static void mul(int a,int b){
        System.out.println("Умножение - "+(a*b));
    }

    public static void div(int a,int b){
        if (b!=0)System.out.println("Деление   - "+((double)a/(double) b));
        else System.out.println("Деление на ноль запрещено");
    }
}
