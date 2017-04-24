package Task2;


public class Main {
    public static void main(String[] args) {
        MyList<String> myList=new MyList<>();
        myList.addElement("Hello");
        myList.addElement("World");
        System.out.println(myList.getElementByIndex(0));
        System.out.println(myList.getElementByIndex(1));
        System.out.println(myList.getList());
    }
}
