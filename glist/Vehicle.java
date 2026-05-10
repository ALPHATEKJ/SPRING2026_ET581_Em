
public abstract class Vehicle {
    String brand, model; [cite: 7]
    int year; [cite: 7]

    // Constructor initializes all fields [cite: 7]
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Concrete method [cite: 8, 10]
    void start() {
        System.out.println("Vehicle is starting...");
    }

    // Abstract methods [cite: 9, 11]
    abstract void drive();
    abstract void stop();
}