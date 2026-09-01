//Check if a number is a multiple of 7 or ends with 7.
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 7 == 0) {
            System.out.println("Multiple of 7");
        } else if (num % 10 == 7) {
            System.out.println("Ends with 7");
        }
        sc.close();
    }
}
