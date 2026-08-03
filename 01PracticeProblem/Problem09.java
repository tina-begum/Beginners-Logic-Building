//Check if a number is perfect number
import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        boolean isPerfect = false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (originalNum == sum) {
            isPerfect = true;
            System.out.println("Is it a perfect number ? : " + isPerfect);
        } else {
            System.out.println("Is it a perfect number ? : " + isPerfect);
        }
        sc.close();
    }
}
