package parent_child;

public class Parent {
    String s;
//    if user is creating parameterized constructor then compiler is not able to create default constructor on its own.
    public Parent(String s)
    {
        this.s = s;
    }
    void display() {
        System.out.println("I am from parent class");
    }
}
