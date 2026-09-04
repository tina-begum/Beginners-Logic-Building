import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print fibonacci series upto n terms
        System.out.println("Enter number of terms of the series: ");
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
        System.out.println("\nSum of n number of series: " + (sum-1));
        sc.close();
    }
}
