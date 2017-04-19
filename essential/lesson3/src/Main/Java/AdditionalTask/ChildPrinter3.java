package AdditionalTask;


public class ChildPrinter3 extends Printer {

    @Override
    public void print(String string) {
        System.out.println((char) 27 + "[33m"+string);
    }
}
