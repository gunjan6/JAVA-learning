
public class abc {
    public static void main(String[] args) {
       Student pe = new Student(); 
       pe.name="gunjan";
    }
}


class Student {
    String name;
    int roll;

    Student() {
        // this.name = name;
        System.out.println("Constructor is called");
    }
}