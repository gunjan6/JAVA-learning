 // Constructor with JAVA
public class Constr {
   public static void main(String[] args) {
      //Defining constructor 
    Student s1 = new Student();
        s1.name = "Tony";
        s1.roll = 5;
        s1.password ="abc";
    
    Student s2 = new Student(s1);
    s2.password = "xyz"; 
    }
}

class Student{
    String name ; 
    int roll;
    String password;

   //calling constructor
    Student(Student s1){
        this.name = s1.name; 
        this.roll = s1.roll;        
    }
   
    Student(String Name){
        name = Name;    
    }
   
    Student(){
        System.out.println("Constructor is called.....");
    }
}
