package parent_child;

public class Child extends Parent {
    String s;
//    in this case code is not showing an error because user can call the parameterized constructor like it override the call of default constructor
    public Child(String s) {
        super(s);
        this.s = s;
    }
    public static void main(String[] args) {
    }

    void display() {
        System.out.println(s);
        super.display();
        // super.methodName() is used to call the display method of parent class
    }
}
