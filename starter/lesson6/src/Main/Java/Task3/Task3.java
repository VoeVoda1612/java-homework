package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int height,width;

        System.out.print("Введите высоту - ");
        height=input.nextInt();

        System.out.print("Введите ширину - ");
        width=input.nextInt();

        //Прямоугольник
        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //Прямоугольниый треугольник
        for(int i=0;i<height;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //Равносторонний треугольник
        for(int i=0;i<height;i++){
            for (int j=i+1;j<height;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i*2;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        System.out.print("\n");

        //Ромб
        for(int i=0;i<height-1;i++){
            for (int j=i+1;j<height;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i*2;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
        for(int i=height;i>0;i--){
            for (int j=i;j<height;j++){
                System.out.print(" ");
            }
            for (int j=i*2;j>1;j--){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
