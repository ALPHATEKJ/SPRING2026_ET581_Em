import java.util.Scanner;

public class HW1Q3 {
    
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a 4-digit integer: ");
        int num = scan.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        System.out.println("first digit: " + d1);
        System.out.println("second digit: " + d2);
        System.out.println("third digit: " + d3);
        System.out.println("fourth digit: " + d4);
    }

}
