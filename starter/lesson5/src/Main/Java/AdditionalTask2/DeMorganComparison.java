package AdditionalTask2;


public class DeMorganComparison {
    public static void main(String[] args) {

        int A=0;
        int B=0;

        int result=A|B;
        System.out.println("Резульатат A|B - "+result);

        result=~(~A&~B);
        System.out.println("Резульатат ~(~A&~B) - "+result);
    }
}
