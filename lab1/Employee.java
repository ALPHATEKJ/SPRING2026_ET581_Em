public class Employee {

    private String name;      // this is the employee name, keeping it private
    private double salary;    // this stores the salary

    public static int totalEmployees = 0;   // counts how many employees were created

    public Employee(String name, double salary) {
        this.name = name;         // setting the name here
        this.salary = salary;     // setting the salary here
        totalEmployees++;         // every new object adds to the count
    }

    public String getName() {
        return name;   // returns the employee name
    }

    public double getSalary() {
        return salary; // returns the employee salary
    }

    public void setSalary(double salary) {
        this.salary = salary;   // updates the salary if needed
    }

    public void display() {
        System.out.println("Name: " + name);       // printing the name
        System.out.println("Salary: " + salary);   // printing the salary
    }

    public static void printTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees); // shows total employees
    }
}