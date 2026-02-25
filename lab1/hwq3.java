   import java.util.Scanner;


public class hwq3 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);        // again this lets the user type input 

        System.out.print("Enter a word: ");
        String word = input.nextLine();                                 // stores what is typed 

        String result = "";                 // this will hold the new word 

        for (int i = 0; i < word.length(); i++) {    // goes through each letter
            char letter = word.charAt(i);               //  gets one letter at a time


            if (letter == 'e') {                // checks if the letter is e
                result = result + "*";     // here it rep;ace e with the * mark
            } else {
                result = result + letter;           // otherwise keep the same letter
            }
        }

        System.out.println(result);
    }
}

