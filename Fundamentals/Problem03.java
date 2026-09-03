// Check if a number is divisible by 5
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.print(num + " is divisible by 5.");
        } else {
            System.out.print(num + " is not divisible by 5.");
        }
        sc.close();
    }
}
