//Check if a number is perfect number
import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (originalNum == sum) {
            System.out.println("Is it a perfect number ? : " + true);
        } else {
            System.out.println("Is it a perfect number ? : " + false);
        }
        sc.close();
    }
}
