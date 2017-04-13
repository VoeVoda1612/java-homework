package AdditionalTask;


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int height,width;

        System.out.print("Введите высоту - ");
        height=input.nextInt();

        System.out.print("Введите ширину - ");
        width=input.nextInt();

        for(int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
