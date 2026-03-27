
public class Cart {

    private Product[] products = new Product[5];  // array to hold max 5 products
    private int count = 0;                        // keeps track of how many I added

    public static int totalCartNumber = 0;   // counts how many carts were created

    public Cart() {
        totalCartNumber++;   // increases every time a cart is made
    }

    public void addProduct(Product p) {
        if (count < products.length) {   // making sure cart is not full
            products[count] = p;         // adding product to array
            count++;                    // moving to next spot
        } else {
            System.out.println("Cart is full"); // just in case
        }
    }

    public double calculateTotal() {
        double total = 0;   // starting at 0

        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();   // adding each product price
        }

        return total;   // returning total
    }

    public void showCart() {
        System.out.println("Cart Items:");   // title

        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName()); // printing each product name
        }

        System.out.println("Total: $" + calculateTotal()); // printing total
    }

    public static void printTotalCartNumber() {
        System.out.println("Total Carts: " + totalCartNumber); // shows cart count
    }
}