package task03.app;

public class Food {

    private String name;
    private Double netPrice;
    private Boolean isSale;

    public Food(String name, Double netPrice, Boolean isSale) {
        this.name = name;
        this.netPrice = netPrice;
        this.isSale = isSale;
    }

    public String getName() {
        return name;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public Boolean isSale() {
        return isSale;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", netPrice=" + netPrice + ", isSale=" + isSale + "]";
    }

    public Double getDiscountedPrice() {
        return isSale ? netPrice * 0.9 : netPrice;
    }
}
