package Task3;

public class Main {
    public static void main(String[] args) {
        Price[] prices=new Price[4];

        prices[0]=new Price("Продукт 1","АМагазин 1",1000);
        prices[1]=new Price("Продукт 2","ЕМагазин 1",1000);
        prices[2]=new Price("Продукт 3","ДМагазин 1",1000);
        prices[3]=new Price("Продукт 4","ЕМагазин 1",1000);

        try {
            for (Price price:prices) {
                System.out.println(price);
            }
            System.out.println();

            prices=Price.sortByShops(prices);

            for (Price price:prices) {
                System.out.println(price);
            }

            System.out.println();

            prices=Price.findByShop("Магазин 1",prices);

            if (prices.equals(null)) throw new NullPointerException("Товаров по данному магазину нет");

            for (Price price:prices) {
                System.out.println(price);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
