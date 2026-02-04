import java.util.Scanner;

public class HW1Q2 {
     public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int s1 = scan.nextInt();

        System.out.print("Enter score 2: ");
        int s2 = scan.nextInt();

        System.out.print("Enter score 3: ");
        int s3 = scan.nextInt();

        double avg = (s1 + s2 + s3) / 3.0;

        System.out.println("Average score: " + avg); 


}
}