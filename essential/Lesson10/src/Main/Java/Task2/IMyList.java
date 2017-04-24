package Task2;

public interface IMyList<T> {

    void addElement(T t);
    T getElementByIndex(int index);
    int count();
}
