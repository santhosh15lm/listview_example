package msrit.santhosh.list_view_example;
// class representing every object in the custom layout.
public class product {
    private String title;
    private String description;
    private String type;
    private double price;
    private boolean sale;

    public product(String title, String description, String type, double price, boolean sale) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSale() {
        return sale;
    }
}
