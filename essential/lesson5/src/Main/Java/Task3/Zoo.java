package Task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(0,"Слон");
        arrayList.add(1,"Жираф");
        arrayList.add(2,"Медведь");
        arrayList.add(3,"Лев");
        arrayList.add(4,"Носорог");
        arrayList.add(5,"Тигр");
        arrayList.add(6,"Бегемот");
        arrayList.add(7,"Куница");

        arrayList.remove(7);
        arrayList.remove(5);
        arrayList.remove(3);

        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
