public class Product {

    private String name;     // product name
    private double price;    // product price

    public Product(String name, double price) {
        this.name = name;     // saving the name
        this.price = price;   // saving the price
    }

    public String getName() {
        return name;   // returns the name
    }

    public double getPrice() {
        return price;  // returns the price
    }

    public void setPrice(double price) {
        this.price = price;   // updates the price
    }
}