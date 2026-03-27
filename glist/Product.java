
public class Product {

    private String name;     // product name
    private double price;    // product price

    public Product(String name, double price) {
        this.name = name;     // setting name
        this.price = price;   // setting price
    }

    public String getName() {
        return name;   // returns name so we can print it
    }

    public double getPrice() {
        return price;  // returns price
    }

    public void setPrice(double price) {
        this.price = price;   // updates price
    }
}