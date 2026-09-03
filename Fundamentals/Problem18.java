import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        //Print the sum of all even numbers upto n
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        sum = 0;
        //Print the sum of all odd numbers up to n. 
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
