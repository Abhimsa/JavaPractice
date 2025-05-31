import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Adding numbers
        int sum = num1 + num2;

        // Displaying result
        System.out.println("Output: " + sum);

        input.close();
    }
}
