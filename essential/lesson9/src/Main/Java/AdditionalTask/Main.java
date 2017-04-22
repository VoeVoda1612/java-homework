package AdditionalTask;

public class Main {
    public static void main(String[] args) {
        Animal cat1=new Animal("Мурзик",5,true);
        Animal cat2=new Animal("Мурзик",5,true);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1==cat2);
        System.out.println(cat1.hashCode()+" "+cat2.hashCode());
    }
}
