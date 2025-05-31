public class Calculator {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b; // Integer division
    }

    public static void main(String[] args) {
        int x = 10, y = 5;

        System.out.println("Main started");

        int sum = add(x, y);
        System.out.println("Sum of 2 numbers is " + sum);

        int diff = subtract(x, y);
        System.out.println("Diff of 2 numbers is " + diff);

        int product = multiply(x, y);
        System.out.println("Product of 2 numbers is " + product);

        int quotient = divide(x, y);
        System.out.println("Division of 2 numbers is " + quotient);

        System.out.println("Main ended");
    }
}
