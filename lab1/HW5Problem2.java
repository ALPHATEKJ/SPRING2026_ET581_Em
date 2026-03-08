public class HW5Problem2 {

    public static void main(String[] args) {

        int[] nums = {3, 8, 5, 12, 7, 4};   // this is the original array given in the homework

        int evenCount = 0;   // counter for how many even numbers we find
        int oddCount = 0;   // counter for how many odd numbers we find

        for (int i = 0; i < nums.length; i++) {   // looping through the whole array

            if (nums[i] % 2 == 0) {   // checking if the number is even (remainder 0)
                evenCount++;   // increasing the even counter
            } else {
                oddCount++;   // otherwise it's odd so we increase odd counter
            }

        }

        int[] evenArray = new int[evenCount];   // creating array that will hold all the even numbers
        int[] oddArray = new int[oddCount];   // creating array that will hold all the odd numbers

        int evenIndex = 0;   // index used to place numbers into even array
        int oddIndex = 0;   // index used to place numbers into odd array

        for (int i = 0; i < nums.length; i++) {   // looping again to actually store numbers

            if (nums[i] % 2 == 0) {   // checking if number is even
                evenArray[evenIndex] = nums[i];   // putting the number into the even array
                evenIndex++;   // move to next position in even array
            } else {
                oddArray[oddIndex] = nums[i];   // putting the number into the odd array
                oddIndex++;   // move to next position in odd array
            }

        }

        System.out.println("Original array: [3, 8, 5, 12, 7, 4]");   // printing the original numbers

        System.out.println("Even number count: " + evenCount);   // showing how many evens we found
        System.out.println("Odd number count: " + oddCount);   // showing how many odds we found

        System.out.print("Even numbers: ");   // printing all even numbers
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.print("\nOdd numbers: ");   // printing all odd numbers
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}