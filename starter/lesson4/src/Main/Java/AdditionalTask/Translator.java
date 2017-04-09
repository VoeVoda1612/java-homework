package AdditionalTask;


import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word=input.next();

        switch (word){
            case "ветер":
                System.out.println("ветер - wind");
                break;
            case "буря":
                System.out.println("буря - storm");
                break;
            case "град":
                System.out.println("град - hail");
                break;
            case "дождь":
                System.out.println("дождь - rain");
                break;
            case "мороз":
                System.out.println("мороз - frost");
                break;
            case "солнечно":
                System.out.println("солнечно - sunny");
                break;
            case "облачно":
                System.out.println("облачно - cloudy");
                break;
            case "снегопад":
                System.out.println("снегопад - snowfall");
                break;
            case "ливень":
                System.out.println("ливень - shower, downpour");
                break;
            case "туман":
                System.out.println("туман - fog, mist");
                break;
            default:
                System.out.println("Перевод данного слова отсутствует");
                break;
        }
    }
}
