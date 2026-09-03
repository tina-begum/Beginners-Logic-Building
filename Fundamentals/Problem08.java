// Take a character and check if it is a vowel or consonant.
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A','E','I','O','U' -> System.out.print("Vowel");
            case 'a','e','i','o','u' -> System.out.print("Vowel");
            default -> System.out.print("Consonant");
        }
        sc.close();
    }
}
