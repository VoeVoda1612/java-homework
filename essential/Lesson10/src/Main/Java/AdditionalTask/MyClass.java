package AdditionalTask;


public class MyClass<T> {

    public static <T> void factoryMethod(T t){
        System.out.println(t.toString());
    }
}
