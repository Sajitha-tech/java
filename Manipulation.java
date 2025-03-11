import java.util.Scanner;

public class Manipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
     
        
        int length = str.length();
        System.out.println("Length: " + length);
        
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);
        
        
        
        String c ="Hello"+ str ;
        System.out.println("Concatenated: " + c );
        
        if (str.length() >= 4) {
            String sub = str.substring(0, 4);
            System.out.println("Substring (first 4 chars): " + sub);
        }
        else {
            System.out.println("String is too short for a substring.");
        }
        
           
        scanner.close();
    }
}
