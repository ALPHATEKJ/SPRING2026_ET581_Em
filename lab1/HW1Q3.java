import java.util.Scanner;                                               // again this is for user input 

public class HW1Q3 {
    
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a 4-digit integer: ");              // asking us the user to input a 4 digit number 
        int num = scan.nextInt();

        int d1 = num / 1000;                                            // getting the digits 
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        System.out.println("first digit: " + d1);
        System.out.println("second digit: " + d2);                  // printing each digits 
        System.out.println("third digit: " + d3);
        System.out.println("fourth digit: " + d4);
    }

}
