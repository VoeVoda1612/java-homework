package Task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите номер ключа - ");
        String key=input.next();
        DocumentWorker document;

        switch (key){
            case "expert":document=new ExpertDocumentWorker();
            break;
            case "pro": document=new ProDocumentWorker();
            break;
            default: document=new DocumentWorker();
            break;
        }

        document.openDocument();
        document.editDocument();
        document.saveDocument();

    }
}
