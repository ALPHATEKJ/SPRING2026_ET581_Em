

public class Employee {

    private String name;      // storing employee name (keeping it private like we learned)
    private double salary;    // storing salary

    public static int totalEmployees = 0;   // counts how many employees I create

    public Employee(String name, double salary) {
        this.name = name;         // setting name when object is made
        this.salary = salary;     // setting salary at start
        totalEmployees++;         // every time I create one, this goes up
    }

    public String getName() {
        return name;   // just returns the name
    }

    public double getSalary() {
        return salary; // returns salary
    }

    public void setSalary(double salary) {
        this.salary = salary;   // updates salary if needed
    }

    public void display() {
        System.out.println("Name: " + name);       // printing name
        System.out.println("Salary: " + salary);   // printing salary
    }

    public static void printTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees); // shows total count
    }
}