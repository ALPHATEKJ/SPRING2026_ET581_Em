//Subclass Car [cite: 13]
public class Car extends Vehicle {
    int numberOfDoors; [cite: 14]

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void drive() {
        System.out.println("Car is driving smoothly."); [cite: 15]
    }

    @Override
    void stop() {
        System.out.println("Car stopped at the traffic light."); [cite: 16]
    }
}