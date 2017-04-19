package Task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler document1=new DOCHandler();
        AbstractHandler document2=new TXTHandler();
        AbstractHandler document3=new XMLHandler();

        document1.open();
        document1.create();
        document1.change();
        document1.save();
        System.out.println("--------------");
        document2.open();
        document2.create();
        document2.change();
        document2.save();
        System.out.println("--------------");
        document3.open();
        document3.create();
        document3.change();
        document3.save();
    }
}
