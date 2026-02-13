public class Hw2q1 {
    
public static String substringFromApple(String text) {

                                                                                                   
        String Text = text.toLowerCase();                                     //  'tolowercase()' is used to make everything lowercase regardless if the input of the user is 'APPLE'

                                                                        
        int index = Text.indexOf("apple");                              // ;'indexof' basically means where does the word start. for us here is position 7. 
                                                                                    // we get the position starting from 0. 
                                                                                
        return text.substring(index);                                           //    we made the variable 'index' hold the position of where apple begins. 
    }                                                                                 // so we give it a "substring()" which is telling the system "start from this postion 7 to the end"
                                                                                            // so it says text.subtring(index) but you can also see it as text.subtring(7) 
    public static void main(String[] args) {

                                                                                                        
        String result = substringFromApple("I like Apple pie");                         // now we call the method 

        System.out.println(result);
    }                                                                           //then BOOM output: 'Apple pie' 
}








