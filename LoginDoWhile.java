import java.util.Scanner;

public class LoginDoWhile {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String loginid = "AbhishekM";

String pwd = "98765432"; // Use same as above

int count = 0;

String inputId, inputPwd;

do {

System.out.println("You have logged in for " + ++count + " times");

System.out.println("Enter your login id and password:");

inputId = sc.nextLine();

inputPwd = sc.nextLine();

} while (inputId.equals(loginid) && inputPwd.equals(pwd));

System.out.println("Login failed. Exiting...");

sc.close();

}

}