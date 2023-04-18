import javax.xml.transform.SourceLocator;
import java.util.*;

public class Super{
    public static void main(String[] args) {
      Horse h = new Horse();  
      System.out.println(h.color);
    }
}

// Parent class creation
class Animal{
    String color;
    Animal() {
        System.out.println("Animal Constructor is called");
    }
}
// Child class with super keyword
class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("Horse constructor is called");
    }
}
