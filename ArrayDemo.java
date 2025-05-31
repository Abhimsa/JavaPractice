//package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u'};
        System.out.println(arr); // prints: aeiou

        String[] names = {"Meena", "Tina", "Veena", "heena"};
        System.out.println(names[0]);  // Meena
        names[1] = "Reena";            // Change Tina to Reena
        System.out.println(names[1]);  // Reena
        System.out.println(names.length); // 4
        //System.out.println(names[4]);  // Exception!
        System.out.println(names[-1]); //Exception!
    }
}