import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            sum +=  (int)(Math.pow((n % 10), 3));
            n /= 10;
        }
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is Armstrong number.");
        }
        sc.close();
    }
}
