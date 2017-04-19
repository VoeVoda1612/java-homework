package AdditionalTask;


public class ChildPrinter2 extends Printer{
    @Override
    public void print(String string) {
        System.out.println((char) 27 + "[32m"+string);
    }
}
