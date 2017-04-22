package Task3;


public class Price {
    private String nameProduct;
    private String nameShop;
    private int price;

    @Override
    public String toString() {
        return "Товар - "+nameProduct+" Магазин - "+nameShop+" Цена - "+price;
    }

    public Price(String nameProduct, String nameShop, int price) {
        this.nameProduct = nameProduct;
        this.nameShop = nameShop;
        this.price = price;
    }

    public static Price[] findByShop(String shop, Price[] prices){
        Price[] tempPrices=new Price[prices.length];
        int index=0;
        for (int i = 0; i < prices.length; i++) {
            if(shop.equals(prices[i].getNameShop())){
                tempPrices[index]=prices[i];
                index++;
            }
        }

            if (index>0){
                return tempPrices;
            }
            else return null;


    }


    public static Price[] sortByShops(Price[] prices){
        for (int i = 0; i < prices.length; i++) {

            for (int j = i; j < prices.length; j++) {

                char indexI=prices[i].getNameShop().charAt(0);
                char indexJ=prices[j].getNameShop().charAt(0);

                if(indexJ<indexI){
                    Price tempPriceI=prices[i];
                    Price tempPriceJ=prices[j];

                    prices[i]=tempPriceJ;
                    prices[j]=tempPriceI;
                }
            }
        }
        return prices;
    }
    public String getNameProduct() {return nameProduct;}
    public void setNameProduct(String nameProduct) {this.nameProduct = nameProduct;}
    public String getNameShop() {return nameShop;}
    public void setNameShop(String nameShop) {this.nameShop = nameShop;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
}
