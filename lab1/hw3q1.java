public class hw3q1 {
      public static void main(String[] args) {

        listNumbersDivisibleBy7();

        int count = countNumbersDivisibleBy7();
        System.out.println("Count: " + count);

        int sum = sumNumbersDivisibleBy7();
        System.out.println("Sum: " + sum);
    }

    // Print numbers divisible by 7
    public static void listNumbersDivisibleBy7() {
        int number = 1;

        while (number <= 100) {
            if (number % 7 == 0) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();
    }

    // Count numbers divisible by 7
    public static int countNumbersDivisibleBy7() {
        int number = 1;
        int count = 0;

        while (number <= 100) {
            if (number % 7 == 0) {
                count++;
            }
            number++;
        }
        return count;
    }

    // Sum numbers divisible by 7
    public static int sumNumbersDivisibleBy7() {
        int number = 1;
        int sum = 0;

        while (number <= 100) {
            if (number % 7 == 0) {
                sum = sum + number;
            }
            number++;
        }
        return sum;
    }
}



