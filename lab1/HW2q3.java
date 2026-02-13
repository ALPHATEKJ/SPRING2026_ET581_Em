public class HW2q3 {
    


    public static boolean isBetweenAppleAndMango(String word) {                         // here we have a boolean which is true or false 

        if (word.compareToIgnoreCase("apple") > 0                                   // we are using the "comparetoignore()" it compares two words alphabetically 
                && word.compareToIgnoreCase("mango") < 0) {                             // here we use '><' we use this to find if the word comes before and after mango and apple 

            return true;                                                                        // the && its connecting the two conditions. Both must be true if not than false 
        } else {

            return false;
        }
    }

    public static void main(String[] args) {

        boolean output = isBetweenAppleAndMango("banana");
                                                                                            // then we call the method and boom output true 
        System.out.println(output);

         boolean result = isBetweenAppleAndMango("zebra");
        System.out.println(result);
    }
}






