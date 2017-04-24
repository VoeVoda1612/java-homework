package Task3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer,String> myDictionary=new MyDictionary<>();
        myDictionary.addElement(1,"Hello");
        myDictionary.addElement(2,"World");
        System.out.println(myDictionary.getElement(1)+" "+myDictionary.getElement(2));
    }

}
