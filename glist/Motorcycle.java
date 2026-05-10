// Subclass Motorcycle [cite: 17]
public class Motorcycle extends Vehicle {
    boolean hasSidecar; [cite: 18]

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle is speeding on the highway."); [cite: 19]
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped safely."); [cite: 20]
    }
}