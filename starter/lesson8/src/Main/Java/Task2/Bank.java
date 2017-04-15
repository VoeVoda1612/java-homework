package Task2;


import java.util.Scanner;

public class Bank {
    public static int pay(int sumPay, int credit){
        return credit - sumPay;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int credit=10000;
        int standartVolumePay=7;
        boolean flag=false;

        System.out.println("Кредит - "+credit+" Необходимо закрыть за "+standartVolumePay+" платежей");

        for (int i = 0; i < standartVolumePay; i++) {
            System.out.print("Введите сумму для погашения кредита - ");
            int sumPay=input.nextInt();

            credit=pay(sumPay,credit);

            if (credit>0){
                System.out.printf("Платёж %1$s.\n == Внесена сумма - %2$s.\n == Задолженоость по кредиту составляет - %3$s\n",i+1,sumPay,credit);
            }else if(credit<0){
                System.out.printf("Платёж %1$s.\n == Внесена сумма - %2$s.\n == Переплата по кредиту составляет - %3$s\n",i+1,sumPay,(credit*-1));
                flag=true;
                break;
            }else {
                System.out.printf("Платёж %1$s.\n == Внесена сумма - %2$s.\n == Кредит полностью закрыт\n",i+1,sumPay);
                flag=true;
                break;
            }
        }
        if (flag) System.out.println("Клиент выплатил кредит в срок");
        else System.out.println("Клиент НЕ выплатил кредит в срок");
    }
}
