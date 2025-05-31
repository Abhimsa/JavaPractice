//package StringHandling;

public class StringDemo01 {

    public static void main(String[] args) {
    String str1 = "Java Strings ";                // string literal
    String str2 = new String(str1);               // using new keyword
    String str3 = new String("are easy to learn "); // direct new String
    char ch[] = {'S', 't', 'r' ,'i', 'n', 'g'};    // character array
    String str4 = new String(ch);                 // creating string from char array
    
    System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
    }
    }