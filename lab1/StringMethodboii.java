public class StringMethodboii {
    
    public static int addnumber(int a,int b){




            return a+b; 
}
public static void printString(String x){
    System.out.println(x);
}

public static void main(String[] args){

String s1 ="12345";
String s2 = "abcde"; 

System.out.println(s1.length());
System.out.println(s2.length());

System.out.println(s1.equals(s1));
System.out.println(s2.equals(s2));

System.out.println("java".length());



System.out.println(s1.charAt(0));



// call method 
 int result = addnumber(1, 1); //2
 System.out.println("result is" + result );


 result = StringMethodboii.addnumber(1, 1); //2
 System.out.println("result is" + result );







}
}
