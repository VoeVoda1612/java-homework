package AdditionalTask;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer();
        Printer printer1=new ChildPrinter1();
        Printer printer2=new ChildPrinter2();
        Printer printer3=new ChildPrinter3();
        printer.print("Hello World");
        printer1.print("Hello World");
        printer2.print("Hello World");
        printer3.print("Hello World");
    }
}
