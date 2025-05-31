import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        // Swapping
        int temp = a;
        a = b;
        b = temp;

        // Output after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a + "  b = " + b);

        input.close();
    }
}
