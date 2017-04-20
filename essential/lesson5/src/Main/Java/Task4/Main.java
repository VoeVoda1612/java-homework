package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        ListIterator listIterator=arrayList.listIterator();
        while (listIterator.hasNext()){
            int i=listIterator.nextIndex();
            arrayList.set(i,i+1);
            listIterator.next();
        }
        System.out.println(arrayList);


    }
}
