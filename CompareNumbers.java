import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        // Using ternary operator to check which is greater
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";

        // Output result
        System.out.println(result);

        input.close();
    }
}
