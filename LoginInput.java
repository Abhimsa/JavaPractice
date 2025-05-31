import java.util.Scanner;

public class LoginInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Pwd: ");
        String pwd = sc.nextLine();

        // Masking the password
        String maskedPwd = "*".repeat(pwd.length());

        // Displaying output
        System.out.println("\nHi ,");
        System.out.println("\tYour login id is " + id);
        System.out.println("And your pwd is " + maskedPwd);

        sc.close();
    }
}
