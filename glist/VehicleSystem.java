// PROBLEM 1: Abstract Class
abstract class Vehicle {
    String brand, model;                    // These store the name and type of vehicle
    int year;                               // Stores the year it was made

    public Vehicle(String brand, String model, int year) {     // This sets up the vehicle's info when we first create it
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }

    abstract void drive();                          // We don't know HOW a generic vehicle drives or stops, 
                                                         // so we leave these empty for the subclasses to finish.
    abstract void stop();
}

class Car extends Vehicle {                                 // A Car is a type of Vehicle
    int numberOfDoors;
    public Car(String b, String m, int y, int d) {
        super(b, m, y);
        this.numberOfDoors = d;
    }
    @Override void drive() { System.out.println("Car is driving smoothly."); }
    @Override void stop() { System.out.println("Car stopped at the traffic light."); }
}

class Motorcycle extends Vehicle {                          // A Motorcycle is also a type of Vehicle
    boolean hasSidecar;
    public Motorcycle(String b, String m, int y, boolean s) {
        super(b, m, y);
        this.hasSidecar = s;
    }
    @Override void drive() { System.out.println("Motorcycle is speeding on the highway."); }
    @Override void stop() { System.out.println("Motorcycle stopped safely."); }
}

// PROBLEM 2: Interface
interface Playable {
    void play();
    void pause();
    void stop();                            // This is for stopping the music/video
}

class MusicPlayer implements Playable {
    public void play() { System.out.println("Playing music..."); }
    public void pause() { System.out.println("Pausing music..."); }
    public void stop() { System.out.println("Stopping music."); }
}

class VideoPlayer implements Playable {
    public void play() { System.out.println("Playing video..."); }
    public void pause() { System.out.println("Pausing video..."); }
    public void stop() { System.out.println("Stopping video."); }
}

// PROBLEM 3: SmartVehicle
class SmartVehicle extends Vehicle implements Playable {
    public SmartVehicle(String b, String m, int y) {
        super(b, m, y);
    }

    @Override
    void drive() { System.out.println("SmartVehicle is driving autonomously."); }

    // This MUST be public to satisfy the Playable interface
    @Override
    public void stop() { 
        System.out.println("SmartVehicle has stopped safely."); 
    }

    public void play() { System.out.println("SmartVehicle is playing media."); }
    public void pause() { System.out.println("SmartVehicle media paused."); }
    
    // Separate method for media-specific stopping if needed
    public void stopMedia() { System.out.println("SmartVehicle media stopped."); }
}

// THE RUNNER CLASS
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", "Camry", 2022, 4),
            new Motorcycle("Harley", "Iron 883", 2021, false),
            new SmartVehicle("Tesla", "Model S", 2024)
        };

        System.out.println("--- Testing Vehicles ---");
        for (Vehicle v : vehicles) {
            v.start();
            v.drive();
            v.stop();
            System.out.println();
        }

        Playable[] players = {
            new MusicPlayer(),
            (Playable) vehicles[2] // The Tesla as a media player
        };

        System.out.println("--- Testing Media ---");
        for (Playable p : players) {
            p.play();
            p.pause();
            p.stop();
            System.out.println();
        }
    }
}