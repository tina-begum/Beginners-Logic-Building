import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        //Print all even numbers between 1 and 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Print all odd numbers between 1 and 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        //Print numbers from 10 down to 1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //Print the table of a given number (n × 1 to n × 10).
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        //Print the sum of first n natural numbers
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first n natural numbers: " + sum);

        sc.close();
    }
}
