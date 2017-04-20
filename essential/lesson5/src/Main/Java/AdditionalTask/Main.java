package AdditionalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Учитель 1");
        arrayList.add("Учитель 2");
        arrayList.add("Учитель 3");
        arrayList.add("Учитель 4");
        arrayList.add("Учитель 5");

        System.out.println("Лучший учитель - "+arrayList.get(0));
        System.out.println("Худший учитель - "+arrayList.get(3));
        System.out.println("Список учителей - "+arrayList);
    }
}
