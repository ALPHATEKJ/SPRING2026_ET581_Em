public class DivisibleBy7 {

    public static void main(String[] args) {

        listNumbersDivisibleBy7();                // prints all numbers divisible by 7

        int count = countNumbersDivisibleBy7();  // gets how many numbers worked
        System.out.println("Count: " + count);   // shows the total count

        int sum = sumNumbersDivisibleBy7();      // gets the sum of the numbers
        System.out.println("Sum: " + sum);       // shows the final sum
    }

    public static void listNumbersDivisibleBy7() {

        int i = 1;                               // start at 1 like the problem says

        while (i <= 100) {                       // keep looping until we hit 100
            if (i % 7 == 0) {                    // checks if number divides evenly by 7
                System.out.print(i + " ");       // prints the number when it does
            }
            i++;                                 // move to the next number
        }

        System.out.println();                    // moves output to a new line
    }

    public static int countNumbersDivisibleBy7() {

        int i = 1;                               // starting value
        int count = 0;                           // keeps track of how many numbers match

        while (i <= 100) {                       // loop from 1 to 100
            if (i % 7 == 0) {                    // if divisible by 7
                count++;                         // increase the count
            }
            i++;                                 // go to the next number
        }

        return count;                            // send count back to main
    }

    public static int sumNumbersDivisibleBy7() {

        int i = 1;                               // start at 1
        int sum = 0;                             // sum starts at 0 so we can add to it

        while (i <= 100) {                       // loop through all numbers
            if (i % 7 == 0) {                    // check divisibility again
                sum = sum + i;                   // add the number to the sum
            }
            i++;                                 // move forward in the loop
        }

        return sum;                              // return the final sum
    }
}