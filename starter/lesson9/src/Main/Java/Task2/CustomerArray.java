package Task2;


import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите размерность массива - ");
        int N=input.nextInt();

        int [] array=new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)((Math.random()*200)-100);
            System.out.print(array[i]+" ");
        }

        int maxValue=array[0];
        int minValue=array[0];
        int sumElemets=0;

        System.out.print("\nНечётные значения - ");

        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxValue) maxValue=array[i];
            else if(array[i]<minValue) minValue=array[i];

            sumElemets+=array[i];

            if(array[i]%2!=0) System.out.print(array[i]+" ");
        }

        System.out.println("\nСумма всех элементов - "+sumElemets);
        System.out.println("Наибольшее значение - "+maxValue);
        System.out.println("Наименьшее значение - "+minValue);
        System.out.println("Среднее арифметическое всех элементов - "+sumElemets/array.length);
    }
}
