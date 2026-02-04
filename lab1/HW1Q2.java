import java.util.Scanner;                           // this is used to recieve input from the user 

public class HW1Q2 {                                                        
     public static void main (String[] args){                           // we create thescanner object the we ask for first score 1 2 and 3 

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int s1 = scan.nextInt();

        System.out.print("Enter score 2: ");
        int s2 = scan.nextInt();

        System.out.print("Enter score 3: ");
        int s3 = scan.nextInt();

        double avg = (s1 + s2 + s3) / 3.0;                                      // then we try to get the average using 'double avg '

        System.out.println("Average score: " + avg);                            // while also having it print average score adding the + to concantanate 


}
}