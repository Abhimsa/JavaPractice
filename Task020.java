public class Task020 {
    public static void main(String[] args) {
        // Initialize char array with your name
        char[] Name = {'A', 'b', 'h', 'i', 's', 'h', 'e', 'k'};
       
        // Print the array (prints as a string)
        System.out.println(Name);
       
        // Get the length of the array (number of letters)
        int n = Name.length;
        System.out.println("There are " + n + " letters in my name");
       
        // Traverse and print each letter with a space
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
    }
}