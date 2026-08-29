// Take a character and check whether it’s uppercase, lowercase, a digit, or a special character
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.print("Uppercase");
        } else if (Character.isLowerCase(ch)) {
            System.out.print("Lowercase");
        } else if (Character.isDigit(ch)) {
            System.out.print("Digit");
        } else {
            System.out.print("Special Character");
        }
        sc.close();
    }
}
