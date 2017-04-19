package AdditionalTask;

public class Printer {
    public void print(String string) {
        System.out.println((char) 27 + "[30m"+string);
    }
}
