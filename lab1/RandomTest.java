public class RandomTest {
    public static void mathRandomTest(){
        double randomDouble = Math. random();
        System.out.println(randomDouble);
        int randomInt = (int) (randomDouble * 10);
        System.out.println(randomInt); // [0 - 10)
        int randomIntuntilten = (int) (randomDouble * 11); 
        System.out.println(randomIntuntilten); // [0-10]


    }
public static void mathMaxTest(){
    int a = 5  , b = 6; 
    if ( a < b ) System.out.println("a < b");
    int min = Math.min(a,b); 
    System.out.println("min is : " + min);

}
    public static void main(String[] args) { 
        //mathRandomTest();
        RandomTest.mathMaxTest();
    }


}