package claude.Encapsulation;

public class Product {
    private String name;
    private int price;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("비어있으면 안돼");
        }
        this.name = name;
    }
    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("0이하면 안돼");
        }
        this.price = price;
    }

}
