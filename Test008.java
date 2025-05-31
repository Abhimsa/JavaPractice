// Test008.java
public class Test008 {
    public static void main(String[] args) {
        Customer cobj = new Customer(); // Creating object
        cobj.accept();                  // Calling accept method
        cobj.display();                 // Calling display method
    }
}
// Customer.java
class Customer {
    void accept() {
        System.out.println("accept customer called");
    }

    void display() {
        System.out.println("display customer called");
    }
}


