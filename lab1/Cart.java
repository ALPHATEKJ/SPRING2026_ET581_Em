public class Cart {

    private Product[] products = new Product[5];   // holds up to 5 products
    private int count = 0;                         // keeps track of how many were added

    public static int totalCartNumber = 0;   // counts how many carts were created

    public Cart() {
        totalCartNumber++;   // every time I make a cart, this goes up
    }

    public void addProduct(Product p) {
        if (count < products.length) {   // makes sure cart is not full
            products[count] = p;         // adds the product into the array
            count++;                     // moves to the next spot
        } else {
            System.out.println("Cart is full");   // just in case more than 5 are added
        }
    }

    public double calculateTotal() {
        double total = 0;   // starting total at 0

        for (int i = 0; i < count; i++) {
            if (products[i] != null) {   // checking the slot is not empty
                total += products[i].getPrice();   // adding the product price
            }
        }

        return total;   // returns final total
    }

    public void showCart() {
        System.out.println("Cart Items:");   // title for the cart

        for (int i = 0; i < count; i++) {
            if (products[i] != null) {   // only print real products
                System.out.println(products[i].getName());   // shows product name
            }
        }

        System.out.println("Total: $" + calculateTotal());   // shows total price
    }

    public static void printTotalCartNumber() {
        System.out.println("Total Carts: " + totalCartNumber);   // prints total carts made
    }
}