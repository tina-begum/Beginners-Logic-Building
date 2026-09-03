import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print the factorial of a given number.
        int num = sc.nextInt();
        int product = 1;
        if (num < 0) {
            System.out.println("Enter positive number");
        } else if (num == 0) {
            System.out.println("Factorial:" + 1);
        } else {
            for (int i = 1; i <= num; i++) {
                product *= i;
            }
            System.out.println("Factorial: " + product);
        }
        sc.close();
    }
}
