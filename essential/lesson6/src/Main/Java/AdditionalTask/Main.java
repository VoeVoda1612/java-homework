package AdditionalTask;
import java.util.Scanner;

import static AdditionalTask.Calculator.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите a - ");
        int a=input.nextInt();
        System.out.print("Введите b - ");
        int b=input.nextInt();
        sum(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);

    }
}
