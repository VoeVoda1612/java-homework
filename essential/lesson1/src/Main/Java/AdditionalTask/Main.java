package AdditionalTask;

public class Main {
    public static void main(String[] args) {
        Address address=new Address();

        address.setIndex(111000);
        address.setCountry("Russian Federation");
        address.setCity("Saint-Petersburg");
        address.setStreet("Проспект Просвещения");
        address.setHouse("14/Б");
        address.setApartment("39");

        System.out.println(address);
    }
}
