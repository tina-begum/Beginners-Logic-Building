//Check whether the number is perfect square or not (without using square root function).
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPerfectSquare = checkPerfectSquare(num);
        System.out.print("Is the number a Perfect Square ? " + isPerfectSquare);
        sc.close();
    }

    public static boolean checkPerfectSquare(int num) {
        if (num < 0) {
            return false;
        } else if (num <= 1) {
            return true;
        } else {
            long start = 1;
            long end = num;
            while (start <= end) {
                long mid = start + ((end - start)/2);
                long square = mid * mid;
                if (square == num) {
                    return true;
                } else if (square < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        return false;
        }

    }
}
