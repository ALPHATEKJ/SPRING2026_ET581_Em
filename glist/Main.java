

public class Main {
    public static void main(String[] args) {

        // -------- Problem 1 --------
        Employee e1 = new Employee("Alice", 5000.0);   // first employee
        Employee e2 = new Employee("Bob", 6500.0);     // second employee
        Employee e3 = new Employee("Charlie", 5500.0); // third employee

        System.out.println("Employee Details:");
        e1.display();
        e2.display();
        e3.display();

        System.out.println("\nAfter updating Alice's salary:");
        e1.setSalary(5200.0);
        e1.display();

        Employee.printTotalEmployees();

        System.out.println(); // spacing

        // -------- Problem 2 --------
        Product p1 = new Product("Laptop", 1200.0);    // first product
        Product p2 = new Product("Phone", 800.0);      // second product
        Product p3 = new Product("Mouse", 50.0);       // third product
        Product p4 = new Product("Keyboard", 100.0);   // fourth product

        Cart cart1 = new Cart();   // first cart
        Cart cart2 = new Cart();   // second cart

        cart1.addProduct(p1);
        cart1.addProduct(p3);

        cart2.addProduct(p2);
        cart2.addProduct(p4);

        cart1.showCart();
        cart2.showCart();

        Cart.printTotalCartNumber();

        System.out.println("Original Laptop price: $" + p1.getPrice());
        p1.setPrice(1000.0);
        System.out.println("Updated Laptop price: $" + p1.getPrice());
    }
}