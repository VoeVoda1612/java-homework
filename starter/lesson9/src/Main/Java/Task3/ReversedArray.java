package Task3;


import java.util.Scanner;

public class ReversedArray {
    public static int[] myReverse(int [] array){
        int[] newArray=new int[array.length];

        int count=0;

        for (int i = array.length-1; i>=0 ; i--) {
            newArray[count]=array[i];
            count++;
        }

        return newArray;
    }

    public static int[]  subArray(int [] array, int index, int count){

        int[] newArray=new int[count];


        for (int i = 0; i <count ; i++) {
            if ((i>array.length-1)||(index>array.length-1)){
                newArray[i]=1;
            }
            else {
                newArray[i]=array[index];
                index++;
            }
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

        int[] myNewArray=myReverse(array);
        System.out.println("\nМетод myReverse");
        for (int i = 0; i <  myNewArray.length; i++) {
            System.out.print(myNewArray[i]+" ");
        }

        System.out.println("\nМетод subArray");
        myNewArray=subArray(array,0,10);
        for (int i = 0; i <  myNewArray.length; i++) {
            System.out.print(myNewArray[i]+" ");
        }
    }
}
