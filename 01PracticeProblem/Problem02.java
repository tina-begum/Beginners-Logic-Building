// Take a character and check if it's vowel or consonant
import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A','E','I','O','U' -> System.out.print(ch + " is a vowel.");
            case 'a','e','i','o','u' -> System.out.print(ch + " is a vowel.");
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z' -> System.out.print(ch + " is a consonant.");
            case 'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z' -> System.out.print(ch + " is a consonant.");
            default -> System.out.print("Enter an alphabet.");
        }
        sc.close();
    }
}
