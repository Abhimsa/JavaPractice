import java.util.Scanner;

public class LoginWhile {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String loginid = "AbhishekM";

String pwd = "98765432"; // Make sure to use the correct value

int count = 0;

// Prompting initial login

System.out.print("Enter login id: ");

String inputId = sc.nextLine();

System.out.print("Enter password: ");

String inputPwd = sc.nextLine();

while (inputId.equals(loginid) && inputPwd.equals(pwd)) {

System.out.println("You have logged in for " + ++count + " times");

System.out.println("Enter your login id and password again:");


inputId = sc.nextLine();

inputPwd = sc.nextLine();

}

System.out.println("Login failed. Exiting...");

sc.close();

}

}