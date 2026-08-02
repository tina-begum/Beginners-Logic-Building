//Check if a number is pallindrome number
import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        boolean result = (originalNum == rev)? true:false;
        System.out.println("Is the number pallindrome ? :" + result);
        sc.close();
    }
}
