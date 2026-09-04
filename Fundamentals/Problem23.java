import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check if a number is a perfect number. 
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (originalNumber == sum) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
        sc.close();
    }
}
