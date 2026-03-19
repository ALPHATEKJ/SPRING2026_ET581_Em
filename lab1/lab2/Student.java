public class Student {
    String name; 
    int age; 
    Student( String name, int age) {
        this.name = name; 
        this.age = age; 

    }
    public void greet(Student other ) { //bob
        System.out.println("current student name; " + this.name +" other name: " + other.name); 
    }
    public static void main(String[] args){
        Student s1 = new Student("alice", 18);
        Student s2 = new Student("Bob" , 18 ); 

        s1.greet(s2); 
        s2.greet(s1); 
        s1.greet(s1); 



    }




}