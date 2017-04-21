package AdditionalTask;


public enum Vehicles {
    BMW(35000,"White"),Bently(320000,"Black"),Lada(10000,"Gray"),Toyota(20000,"Red"),Nissan(21500,"Blue");

    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" Стоимость - "+price+" Цвет - "+color;
    }
}
