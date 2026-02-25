public class hwq2 {
       public static void main(String[] args) {

        int sum = 0;            // the total 

        for (int i = 1; i <= 100; i++) {  // here we are looping from 1 to 100 
            if (i % 2 == 0) {                        // here we bring the modulo division and try to find if the number is even 
                sum = sum + i;                                  // if it is add it to the total 
            }
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}

