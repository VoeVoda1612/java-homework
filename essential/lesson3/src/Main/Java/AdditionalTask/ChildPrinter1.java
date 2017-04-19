package AdditionalTask;


public class ChildPrinter1 extends Printer {
    @Override
    public void print(String string) {
        System.out.println((char) 27 + "[31m"+string);
    }
}
