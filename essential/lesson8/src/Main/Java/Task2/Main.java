package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers=new Worker[5];
        Scanner input=new Scanner(System.in);
        try{
            workers[0]=new Worker("Иванов И.И","Директор",2005);
            workers[1]=new Worker("Сидоров С.С","Зам директора",2010);
            workers[2]=new Worker("Кузнецов К.К","Работник",2010);
            workers[3]=new Worker("Андреев А.А","Работник",2010);
            workers[4]=new Worker("Петров П.П","Работник",2013);

//            for (int i = 0; i < workers.length; i++) {
//                System.out.print("Введите инициалы работника - ");
//                String fullName=input.nextLine();
//
//                System.out.print("Введите должность работника - ");
//                String position=input.nextLine();
//
//                System.out.print("Введите год поступления на работу - ");
//                int year=input.nextInt();
//
//                workers[i]=new Worker(fullName,position,year);
//            }

            for(Worker worker:workers){
                System.out.println(worker);
            }

            workers=Worker.sortWorkers(workers);

            System.out.println("--------------------");

            for(Worker worker:workers){
                System.out.println(worker);
            }

            System.out.println("--------------------");

            System.out.println("Работник с наибольшем стажем\n"+Worker.olderWorker(workers));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }
}
