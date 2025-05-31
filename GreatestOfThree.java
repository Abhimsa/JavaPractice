import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        // Compare using if-else if
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 is greatest");
        } else {
            System.out.println("Two or more numbers are equal and greatest");
        }

        sc.close();
    }
}
