//Print Fibonacci Series upto n terms
import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }
        sc.close();
    }
}
