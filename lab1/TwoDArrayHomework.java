public class TwoDArrayHomework {

    public static void sumOfRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {                 // I am going row by row here
            int sum = 0;                                       // starting the sum at 0 for each row

            for (int j = 0; j < arr[i].length; j++) {          // now I go through each number in that row
                sum = sum + arr[i][j];                         // adding each number into the sum
            }

            System.out.println("Sum of row " + i + ": " + sum); // printing the total for that row
        }
    }

    public static void sumOfColumns(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {              // this time I start with the columns first
            int sum = 0;                                       // starting fresh for each column

            for (int i = 0; i < arr.length; i++) {             // now I move down the rows
                sum = sum + arr[i][j];                         // adding the numbers in the same column
            }

            System.out.println("Sum of column " + j + ": " + sum); // printing the total for that column
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},                                      // first row
            {5, 6, 7, 8},                                      // second row
            {9, 10, 11, 12}                                    // third row
        };

        sumOfRows(arr);                                        // calling the row method
        sumOfColumns(arr);                                     // calling the column method
    }
}


