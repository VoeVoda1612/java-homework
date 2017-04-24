package Task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements IMyList<T>{

    private List<T> list=new ArrayList<T>();



    public List<T> getList() {
        return list;
    }

    @Override
    public void addElement(T t) {
        this.list.add(t);

    }

    @Override
    public T getElementByIndex(int index) {
        return list.get(index);
    }

    @Override
    public int count() {
        return list.size();
    }


}
