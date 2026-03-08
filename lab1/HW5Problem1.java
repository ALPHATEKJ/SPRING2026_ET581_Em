import java.util.Scanner;

public class HW5Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // making a Scanner so the user can type numbers

        System.out.print("Enter the number of elements: ");   // asking the user how many numbers they want to enter
        int n = input.nextInt();   // storing that number in variable n

        int[] numbers = new int[n];   // creating an array that will store the numbers the user enters

        int sum = 0;   // starting sum at 0 so we can add numbers to it later
        int min = 0;   // this will store the smallest number
        int max = 0;   // this will store the biggest number

        for (int i = 0; i < n; i++) {   // loop that runs n times so we can enter all the numbers

            System.out.print("Enter number: ");   // asking user to enter each number
            numbers[i] = input.nextInt();   // storing the number into the array

            sum = sum + numbers[i];   // adding the number to the total sum each time

            if (i == 0) {   // for the very first number we set min and max equal to it
                min = numbers[i];   // first number becomes starting minimum
                max = numbers[i];   // first number becomes starting maximum
            }

            if (numbers[i] < min) {   // checking if this number is smaller than the current minimum
                min = numbers[i];   // if yes then this becomes the new minimum
            }

            if (numbers[i] > max) {   // checking if this number is bigger than the current maximum
                max = numbers[i];   // if yes then this becomes the new maximum
            }
        }

        double average = (double) sum / n;   // calculating the average by dividing sum by how many numbers there are

        System.out.println("Sum = " + sum);   // printing the total sum
        System.out.println("Average = " + average);   // printing the average
        System.out.println("Minimum = " + min);   // printing the smallest number
        System.out.println("Maximum = " + max);   // printing the largest number
    }
}

