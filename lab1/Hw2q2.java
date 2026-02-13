public class Hw2q2 {
    

    
    public static int secondOccurrenceOfOne(String text) {                          // making the methoddddddddd!!!!!

      
        int first = text.indexOf("one");                                     // Just like the first question we used index and explained it. we are also using it here 
                                                                                // we are getting where the position of 'one' begins which is 0! becuase we start the count begining from "0 1 2 3" past the quotations
       
        int second = text.indexOf("one", first + 1);                           // so now we have given the variable 'first' to hold that information (0)
                                                                                    // and so here we are putting the word and then the starting position which is 0 and we added a + 1 so there for 0+1 = 1 
        return second;                                                                  //so now we search for the word past position 1.
    }

    public static void main(String[] args) {
                                                                                            // same thing here we call the method and put in the string 
       
        int output = secondOccurrenceOfOne("one two one two one");                                              // method returns 8 

        System.out.println(output);
    }





}
