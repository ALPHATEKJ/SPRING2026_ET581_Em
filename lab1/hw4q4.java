
import java.util.Scanner; // for input

public class hw4q4 {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner for numbers

        int count = 0; // keeps track of how many are positive

        for (int i = 1; i <= 6; i++) { // asks for 6 numbers
            System.out.print("Enter a number: ");
            int num = input.nextInt(); // gets the number

            if (num < 0) { // if number is negative
                continue; // skip it and move to next loop
            }

            if (num > 0) { // if number is positive
                count++; // increase count
            }
        }

        System.out.println(count + " positive numbers"); // print result
    }
}
