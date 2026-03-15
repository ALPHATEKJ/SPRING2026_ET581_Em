public class StringNestedLoopHomework {
    public static void reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");                  // splitting the sentence into words

        for (int i = 0; i < words.length; i++) {              // first loop goes through each word
            for (int j = words[i].length() - 1; j >= 0; j--) { // second loop goes backwards through the letters
                System.out.print(words[i].charAt(j));         // printing each character in reverse
            }
            System.out.println();                              // moving to the next line after each word
        }
    }

    public static void reverseWordOrder(String sentence) {
        String[] words = sentence.split(" ");                  // splitting the sentence into words first

        for (int i = words.length - 1; i >= 0; i--) {         // starting from the last word and going backwards
            System.out.println(words[i]);                      // printing one word per line
        }
    }

    public static void reverseLongWords(String sentence) {
        String[] words = sentence.split(" ");                  // breaking the sentence into words

        for (int i = 0; i < words.length; i++) {              // first loop checks each word
            if (words[i].length() > 3) {                      // only reversing words longer than 3 letters
                for (int j = words[i].length() - 1; j >= 0; j--) { // going backwards through that word
                    System.out.print(words[i].charAt(j));     // printing the reversed word
                }
            } else {
                System.out.print(words[i]);                   // if the word is short I leave it the same
            }

            if (i < words.length - 1) {                       // this just stops the extra space at the end
                System.out.print(" ");                        // adding a space between words
            }
        }

        System.out.println();                                  // moving down after the full sentence prints
    }

    public static void main(String[] args) {
        System.out.println("Question 3:");                     // little label so I know what is printing
        reverseEachWord("Hello World");                        // example from the homework

        System.out.println("Question 4:");                     // next part
        reverseWordOrder("Java is fun");                       // example from the homework

        System.out.println("Question 5:");                     // last part
        reverseLongWords("Java is very cool");                 // example from the homework
    }
}

