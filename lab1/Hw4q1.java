 import java.util.Scanner;

public class Hw4q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //scanner for keyboard input

        System.out.print("Enter number 1: ");
        int largest = input.nextInt();                 // first number is the largest for now

        for (int i = 2; i <= 5; i++) {                  //loop runs for the remaining numbers
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();  // here it gets the next numbers to be inputed 

            if (num > largest) {     // checks if this number is bigger
                largest = num;              // if it is , it updates 
            }
        }

        System.out.println("The largest number is " + largest);  // here it will print 
    }
}                           







