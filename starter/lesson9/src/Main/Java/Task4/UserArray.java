package Task4;


import java.util.Scanner;

public class UserArray {
    public static int[] incrementArray(int [] array){
        int[] newArray=new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }

    public static int[] methodTask4(int [] array,int value){
        int[] newArray=incrementArray(array);

        newArray[0]=value;

        for (int i = 0; i <array.length ; i++) {
            newArray[i+1]=array[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Введите размерность массива - ");
        int n=input.nextInt();

        int [] array=new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)((Math.random()*200)-100);
            System.out.print(array[i]+" ");
        }

        int[] myNewArray=incrementArray(array);
        System.out.println("\nМетод incrementArray");
        for (int i = 0; i <  myNewArray.length; i++) {
            System.out.print(myNewArray[i] + " ");
        }

        System.out.println("\nМетод subArray");
        myNewArray=methodTask4(array,1000);
        for (int i = 0; i <  myNewArray.length; i++) {
            System.out.print(myNewArray[i]+" ");
        }



    }
}
